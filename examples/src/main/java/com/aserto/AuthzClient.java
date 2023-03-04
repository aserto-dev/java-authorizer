package com.aserto;

import com.aserto.authorizer.v2.*;
import com.aserto.authorizer.v2.api.IdentityContext;
import com.aserto.authorizer.v2.api.IdentityType;
import com.aserto.authorizer.v2.api.PolicyContext;
import com.aserto.authorizer.v2.api.PolicyInstance;
import com.google.protobuf.Struct;
import io.github.cdimascio.dotenv.Dotenv;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.MetadataUtils;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;
import io.github.cdimascio.dotenv.DotenvException;

public class AuthzClient {
    private String policyName;
    private String policyLabel;
    private static String authorizerAddress;
    private static Integer authorizerPort;
    private static String tenantId;
    public static String authorizerApiKey;

    private AuthorizerGrpc.AuthorizerBlockingStub authzClient;

    public AuthzClient() throws SSLException, DotenvException, NumberFormatException {
        Dotenv dotenv = Dotenv.load();
        
        policyName = dotenv.get("ASERTO_POLICY_INSTANCE_NAME", "todo");
        policyLabel = dotenv.get("ASERTO_POLICY_INSTANCE_LABEL", "todo");
        tenantId = dotenv.get("ASERTO_TENANT_ID", "");
        authorizerApiKey = dotenv.get("ASERTO_AUTHORIZER_API_KEY", "");

        String[] authorizerService = dotenv.get("ASERTO_AUTHORIZER_SERVICE_URL").split(":");
        authorizerAddress = authorizerService[0];
        authorizerPort = Integer.parseInt(authorizerService[1]);

        authzClient = buildAuthzClient();
    }

    public void listPolicies() {
        System.out.println("<--------------- list policies call --------------->");
        ListPoliciesRequest.Builder policyBuilder = ListPoliciesRequest.newBuilder();

        PolicyInstance policy = getPolicy(policyName, policyLabel);
        policyBuilder.setPolicyInstance(policy);

        ListPoliciesRequest listPoliciesRequest = policyBuilder.build();
        ListPoliciesResponse response = authzClient.listPolicies(listPoliciesRequest);

        System.out.printf(response.toString());
    }

    public void query() {
        System.out.println("<--------------- query call --------------->");
        QueryRequest.Builder queryRequestBuilder = QueryRequest.newBuilder();
        queryRequestBuilder.setQuery("x = input\n" +
                                     "y = data");

        PolicyInstance policy = getPolicy(policyName, policyLabel);
        queryRequestBuilder.setPolicyInstance(policy);

        Struct.Builder structBuilder = Struct.newBuilder();
        structBuilder.putFields("id", com.google.protobuf.Value.newBuilder().setStringValue("123").build());
        queryRequestBuilder.setResourceContext(structBuilder);

        QueryRequest queryRequest = queryRequestBuilder.build();
        QueryResponse queryResponse = authzClient.query(queryRequest);

        System.out.println(queryResponse.toString());
    }

    public void is() {
        System.out.println("<--------------- is call --------------->");
        IsRequest.Builder isBuilder = IsRequest.newBuilder();

        IdentityContext.Builder identityContextBuilder =  IdentityContext.newBuilder();
        identityContextBuilder.setIdentity("rick@the-citadel.com");
        identityContextBuilder.setType(IdentityType.IDENTITY_TYPE_SUB);


        PolicyContext.Builder policyContextBuilder = PolicyContext.newBuilder();
        policyContextBuilder.setPath("todoApp.DELETE.todos.__id");
        policyContextBuilder.addDecisions( "allowed");


        isBuilder.setIdentityContext(identityContextBuilder.build());
        isBuilder.setPolicyContext(policyContextBuilder.build());

        PolicyInstance policy = getPolicy(policyName, policyLabel);
        isBuilder.setPolicyInstance(policy);

        IsResponse isReponse = authzClient.is(isBuilder.build());
        System.out.println(isReponse.getDecisions(0).getIs());
    }

    private AuthorizerGrpc.AuthorizerBlockingStub buildAuthzClient() throws SSLException {
        Metadata metadata = new Metadata();
        Metadata.Key<String> asertoTenantId = Metadata.Key.of("aserto-tenant-id", Metadata.ASCII_STRING_MARSHALLER);
        Metadata.Key<String> authorization = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
        metadata.put(asertoTenantId, tenantId);
        metadata.put(authorization, "basic " + authorizerApiKey);

        ManagedChannel channel = NettyChannelBuilder
                .forAddress(authorizerAddress, authorizerPort)
                .intercept(MetadataUtils.newAttachHeadersInterceptor(metadata))
                .sslContext(GrpcSslContexts.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build())
                .build();

        AuthorizerGrpc.AuthorizerBlockingStub client = AuthorizerGrpc.newBlockingStub(channel);

        return client;
    }

    private PolicyInstance getPolicy(String name, String label) {
        PolicyInstance.Builder policyInstance = PolicyInstance.newBuilder();
        policyInstance.setName(name);
        policyInstance.setInstanceLabel(label);

        return policyInstance.build();
    }
}