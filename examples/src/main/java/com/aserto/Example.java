package org.example;

import com.aserto.authorizer.v2.*;
import com.aserto.authorizer.v2.api.IdentityContext;
import com.aserto.authorizer.v2.api.IdentityType;
import com.aserto.authorizer.v2.api.PolicyContext;
import io.grpc.ManagedChannel;
import io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.NettyChannelBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;

import javax.net.ssl.SSLException;

public class Example {
    public static void main(String[] args) throws SSLException {
        AuthorizerGrpc.AuthorizerBlockingStub authzClient = buildAuthzClient();
        listPolicies(authzClient);
        query(authzClient);
        is(authzClient);
    }

    public static AuthorizerGrpc.AuthorizerBlockingStub buildAuthzClient() throws SSLException {
        ManagedChannel channel = NettyChannelBuilder
                .forAddress("localhost",8282)
                .sslContext(GrpcSslContexts.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build())
                .build();

        AuthorizerGrpc.AuthorizerBlockingStub client = AuthorizerGrpc.newBlockingStub(channel);

        return client;
    }

    public static void listPolicies(AuthorizerGrpc.AuthorizerBlockingStub authzClient) {
        ListPoliciesRequest.Builder policyBuilder = ListPoliciesRequest.newBuilder();
        ListPoliciesRequest listPoliciesRequest = policyBuilder.build();
        ListPoliciesResponse response = authzClient.listPolicies(listPoliciesRequest);

        System.out.printf(response.toString());
    }

    public static void query(AuthorizerGrpc.AuthorizerBlockingStub authzClient) {
        QueryRequest.Builder queryRequestBuilder = QueryRequest.newBuilder();
        queryRequestBuilder.setQuery("x = data");
        QueryRequest queryRequest = queryRequestBuilder.build();
        QueryResponse queryResponse = authzClient.query(queryRequest);

        System.out.println(queryResponse.toString());
    }

    public static void is(AuthorizerGrpc.AuthorizerBlockingStub authzClient) {
        IsRequest.Builder isBuilder = IsRequest.newBuilder();

        IdentityContext.Builder identityContextBuilder =  IdentityContext.newBuilder();
        identityContextBuilder.setIdentity("euang@acmecorp.com");
        identityContextBuilder.setType(IdentityType.IDENTITY_TYPE_SUB);


        PolicyContext.Builder policyContextBuilder = PolicyContext.newBuilder();
        policyContextBuilder.setPath("peoplefinder.GET.api.users.__id");
        policyContextBuilder.addDecisions( "allowed");


        isBuilder.setIdentityContext(identityContextBuilder.build());
        isBuilder.setPolicyContext(policyContextBuilder.build());

        IsResponse isReponse = authzClient.is(isBuilder.build());
        System.out.println(isReponse.getDecisions(0).getIs());
    }
}