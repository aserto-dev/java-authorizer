package com.aserto;

import com.aserto.authorizer.v2.*;
import com.aserto.authorizer.v2.api.IdentityContext;
import com.aserto.authorizer.v2.api.IdentityType;
import com.aserto.authorizer.v2.api.PolicyContext;
import com.aserto.authorizer.v2.api.PolicyInstance;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.MetadataUtils;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;


public class Example {
    // switch between hosted authorizer and topaz
    private static boolean IS_HOSTED_AUTHORIZER = true;
    private static final String POLICY_NAME = "policy-peoplefinder-rbac";
    private static final String POLICY_LABEL = "policy-peoplefinder-rbac";

    // For hosted authorizer
    private static final String AUTHORIZER_ADDRESS = "authorizer.prod.aserto.com";
    private static final Integer AUTHORIZER_PORT = 8443;
    private static final String TENANT_ID = "my-tenant-id";
    public static final String AUTHORIZER_API_KEY = "my-authorizer-api-key";

    // For local topaz connected to a hosted directory
    private static final String TOPAZ_AUTHORIZER_ADDRESS = "localhost";
    private static final Integer TOPAZ_AUTHORIZER_PORT = 8282;

    public static void main(String[] args) throws SSLException {
        AuthorizerGrpc.AuthorizerBlockingStub authzClient;
        authzClient = IS_HOSTED_AUTHORIZER ? buildHostedAuthzClient() : buildTopazAuthzClient();

        listPolicies(authzClient);
        query(authzClient);
        is(authzClient);
    }


    // Build hosted authorizer client
    public static AuthorizerGrpc.AuthorizerBlockingStub buildHostedAuthzClient() throws SSLException {
        Metadata metadata = new Metadata();
        Metadata.Key<String> asertoTenantId = Metadata.Key.of("aserto-tenant-id", Metadata.ASCII_STRING_MARSHALLER);
        Metadata.Key<String> authorization = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
        metadata.put(asertoTenantId, TENANT_ID);
        metadata.put(authorization, "basic " + AUTHORIZER_API_KEY);

        ManagedChannel channel = NettyChannelBuilder
                .forAddress(AUTHORIZER_ADDRESS,AUTHORIZER_PORT)
                .intercept(MetadataUtils.newAttachHeadersInterceptor(metadata))
                .sslContext(GrpcSslContexts.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build())
                .build();

        AuthorizerGrpc.AuthorizerBlockingStub client = AuthorizerGrpc.newBlockingStub(channel);

        return client;
    }

    // build topaz client
    public static AuthorizerGrpc.AuthorizerBlockingStub buildTopazAuthzClient() throws SSLException {
        ManagedChannel channel = NettyChannelBuilder
                .forAddress(TOPAZ_AUTHORIZER_ADDRESS,TOPAZ_AUTHORIZER_PORT)
                .sslContext(GrpcSslContexts.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build())
                .build();

        AuthorizerGrpc.AuthorizerBlockingStub client = AuthorizerGrpc.newBlockingStub(channel);

        return client;
    }

    public static void listPolicies(AuthorizerGrpc.AuthorizerBlockingStub authzClient) {
        System.out.println("<--------------- list policies call --------------->");
        ListPoliciesRequest.Builder policyBuilder = ListPoliciesRequest.newBuilder();

        if (IS_HOSTED_AUTHORIZER) {
            PolicyInstance policy = getPolicy(POLICY_NAME, POLICY_LABEL);
            policyBuilder.setPolicyInstance(policy);
        }

        ListPoliciesRequest listPoliciesRequest = policyBuilder.build();
        ListPoliciesResponse response = authzClient.listPolicies(listPoliciesRequest);

        System.out.printf(response.toString());
    }

    private static PolicyInstance getPolicy(String name, String label) {
        PolicyInstance.Builder policyInstance = PolicyInstance.newBuilder();
        policyInstance.setName(name);
        policyInstance.setInstanceLabel(label);

        return policyInstance.build();
    }

    public static void query(AuthorizerGrpc.AuthorizerBlockingStub authzClient) {
        System.out.println("<--------------- query call --------------->");
        QueryRequest.Builder queryRequestBuilder = QueryRequest.newBuilder();
        queryRequestBuilder.setQuery("x = data");

        if (IS_HOSTED_AUTHORIZER) {
            PolicyInstance policy = getPolicy(POLICY_NAME, POLICY_LABEL);
            queryRequestBuilder.setPolicyInstance(policy);
        }

        QueryRequest queryRequest = queryRequestBuilder.build();
        QueryResponse queryResponse = authzClient.query(queryRequest);

        System.out.println(queryResponse.toString());
    }

    public static void is(AuthorizerGrpc.AuthorizerBlockingStub authzClient) {
        System.out.println("<--------------- is call --------------->");
        IsRequest.Builder isBuilder = IsRequest.newBuilder();

        IdentityContext.Builder identityContextBuilder =  IdentityContext.newBuilder();
        identityContextBuilder.setIdentity("euang@acmecorp.com");
        identityContextBuilder.setType(IdentityType.IDENTITY_TYPE_SUB);


        PolicyContext.Builder policyContextBuilder = PolicyContext.newBuilder();
        policyContextBuilder.setPath("peoplefinder.GET.api.users.__id");
        policyContextBuilder.addDecisions( "allowed");


        isBuilder.setIdentityContext(identityContextBuilder.build());
        isBuilder.setPolicyContext(policyContextBuilder.build());

        if (IS_HOSTED_AUTHORIZER) {
            PolicyInstance policy = getPolicy(POLICY_NAME, POLICY_LABEL);
            isBuilder.setPolicyInstance(policy);
        }

        IsResponse isReponse = authzClient.is(isBuilder.build());
        System.out.println(isReponse.getDecisions(0).getIs());
    }
}