package com.aserto.authorizer.v2;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: aserto/authorizer/v2/authorizer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthorizerGrpc {

  private AuthorizerGrpc() {}

  public static final String SERVICE_NAME = "aserto.authorizer.v2.Authorizer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aserto.authorizer.v2.DecisionTreeRequest,
      com.aserto.authorizer.v2.DecisionTreeResponse> getDecisionTreeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecisionTree",
      requestType = com.aserto.authorizer.v2.DecisionTreeRequest.class,
      responseType = com.aserto.authorizer.v2.DecisionTreeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.authorizer.v2.DecisionTreeRequest,
      com.aserto.authorizer.v2.DecisionTreeResponse> getDecisionTreeMethod() {
    io.grpc.MethodDescriptor<com.aserto.authorizer.v2.DecisionTreeRequest, com.aserto.authorizer.v2.DecisionTreeResponse> getDecisionTreeMethod;
    if ((getDecisionTreeMethod = AuthorizerGrpc.getDecisionTreeMethod) == null) {
      synchronized (AuthorizerGrpc.class) {
        if ((getDecisionTreeMethod = AuthorizerGrpc.getDecisionTreeMethod) == null) {
          AuthorizerGrpc.getDecisionTreeMethod = getDecisionTreeMethod =
              io.grpc.MethodDescriptor.<com.aserto.authorizer.v2.DecisionTreeRequest, com.aserto.authorizer.v2.DecisionTreeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DecisionTree"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.DecisionTreeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.DecisionTreeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizerMethodDescriptorSupplier("DecisionTree"))
              .build();
        }
      }
    }
    return getDecisionTreeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.authorizer.v2.IsRequest,
      com.aserto.authorizer.v2.IsResponse> getIsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Is",
      requestType = com.aserto.authorizer.v2.IsRequest.class,
      responseType = com.aserto.authorizer.v2.IsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.authorizer.v2.IsRequest,
      com.aserto.authorizer.v2.IsResponse> getIsMethod() {
    io.grpc.MethodDescriptor<com.aserto.authorizer.v2.IsRequest, com.aserto.authorizer.v2.IsResponse> getIsMethod;
    if ((getIsMethod = AuthorizerGrpc.getIsMethod) == null) {
      synchronized (AuthorizerGrpc.class) {
        if ((getIsMethod = AuthorizerGrpc.getIsMethod) == null) {
          AuthorizerGrpc.getIsMethod = getIsMethod =
              io.grpc.MethodDescriptor.<com.aserto.authorizer.v2.IsRequest, com.aserto.authorizer.v2.IsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Is"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.IsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.IsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizerMethodDescriptorSupplier("Is"))
              .build();
        }
      }
    }
    return getIsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.authorizer.v2.QueryRequest,
      com.aserto.authorizer.v2.QueryResponse> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = com.aserto.authorizer.v2.QueryRequest.class,
      responseType = com.aserto.authorizer.v2.QueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.authorizer.v2.QueryRequest,
      com.aserto.authorizer.v2.QueryResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<com.aserto.authorizer.v2.QueryRequest, com.aserto.authorizer.v2.QueryResponse> getQueryMethod;
    if ((getQueryMethod = AuthorizerGrpc.getQueryMethod) == null) {
      synchronized (AuthorizerGrpc.class) {
        if ((getQueryMethod = AuthorizerGrpc.getQueryMethod) == null) {
          AuthorizerGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<com.aserto.authorizer.v2.QueryRequest, com.aserto.authorizer.v2.QueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.QueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.QueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizerMethodDescriptorSupplier("Query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.authorizer.v2.CompileRequest,
      com.aserto.authorizer.v2.CompileResponse> getCompileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Compile",
      requestType = com.aserto.authorizer.v2.CompileRequest.class,
      responseType = com.aserto.authorizer.v2.CompileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.authorizer.v2.CompileRequest,
      com.aserto.authorizer.v2.CompileResponse> getCompileMethod() {
    io.grpc.MethodDescriptor<com.aserto.authorizer.v2.CompileRequest, com.aserto.authorizer.v2.CompileResponse> getCompileMethod;
    if ((getCompileMethod = AuthorizerGrpc.getCompileMethod) == null) {
      synchronized (AuthorizerGrpc.class) {
        if ((getCompileMethod = AuthorizerGrpc.getCompileMethod) == null) {
          AuthorizerGrpc.getCompileMethod = getCompileMethod =
              io.grpc.MethodDescriptor.<com.aserto.authorizer.v2.CompileRequest, com.aserto.authorizer.v2.CompileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Compile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.CompileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.CompileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizerMethodDescriptorSupplier("Compile"))
              .build();
        }
      }
    }
    return getCompileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.authorizer.v2.ListPoliciesRequest,
      com.aserto.authorizer.v2.ListPoliciesResponse> getListPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPolicies",
      requestType = com.aserto.authorizer.v2.ListPoliciesRequest.class,
      responseType = com.aserto.authorizer.v2.ListPoliciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.authorizer.v2.ListPoliciesRequest,
      com.aserto.authorizer.v2.ListPoliciesResponse> getListPoliciesMethod() {
    io.grpc.MethodDescriptor<com.aserto.authorizer.v2.ListPoliciesRequest, com.aserto.authorizer.v2.ListPoliciesResponse> getListPoliciesMethod;
    if ((getListPoliciesMethod = AuthorizerGrpc.getListPoliciesMethod) == null) {
      synchronized (AuthorizerGrpc.class) {
        if ((getListPoliciesMethod = AuthorizerGrpc.getListPoliciesMethod) == null) {
          AuthorizerGrpc.getListPoliciesMethod = getListPoliciesMethod =
              io.grpc.MethodDescriptor.<com.aserto.authorizer.v2.ListPoliciesRequest, com.aserto.authorizer.v2.ListPoliciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.ListPoliciesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.ListPoliciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizerMethodDescriptorSupplier("ListPolicies"))
              .build();
        }
      }
    }
    return getListPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.authorizer.v2.GetPolicyRequest,
      com.aserto.authorizer.v2.GetPolicyResponse> getGetPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPolicy",
      requestType = com.aserto.authorizer.v2.GetPolicyRequest.class,
      responseType = com.aserto.authorizer.v2.GetPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.authorizer.v2.GetPolicyRequest,
      com.aserto.authorizer.v2.GetPolicyResponse> getGetPolicyMethod() {
    io.grpc.MethodDescriptor<com.aserto.authorizer.v2.GetPolicyRequest, com.aserto.authorizer.v2.GetPolicyResponse> getGetPolicyMethod;
    if ((getGetPolicyMethod = AuthorizerGrpc.getGetPolicyMethod) == null) {
      synchronized (AuthorizerGrpc.class) {
        if ((getGetPolicyMethod = AuthorizerGrpc.getGetPolicyMethod) == null) {
          AuthorizerGrpc.getGetPolicyMethod = getGetPolicyMethod =
              io.grpc.MethodDescriptor.<com.aserto.authorizer.v2.GetPolicyRequest, com.aserto.authorizer.v2.GetPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.GetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.GetPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizerMethodDescriptorSupplier("GetPolicy"))
              .build();
        }
      }
    }
    return getGetPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aserto.authorizer.v2.InfoRequest,
      com.aserto.authorizer.v2.InfoResponse> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = com.aserto.authorizer.v2.InfoRequest.class,
      responseType = com.aserto.authorizer.v2.InfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aserto.authorizer.v2.InfoRequest,
      com.aserto.authorizer.v2.InfoResponse> getInfoMethod() {
    io.grpc.MethodDescriptor<com.aserto.authorizer.v2.InfoRequest, com.aserto.authorizer.v2.InfoResponse> getInfoMethod;
    if ((getInfoMethod = AuthorizerGrpc.getInfoMethod) == null) {
      synchronized (AuthorizerGrpc.class) {
        if ((getInfoMethod = AuthorizerGrpc.getInfoMethod) == null) {
          AuthorizerGrpc.getInfoMethod = getInfoMethod =
              io.grpc.MethodDescriptor.<com.aserto.authorizer.v2.InfoRequest, com.aserto.authorizer.v2.InfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.InfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aserto.authorizer.v2.InfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthorizerMethodDescriptorSupplier("Info"))
              .build();
        }
      }
    }
    return getInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthorizerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorizerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorizerStub>() {
        @java.lang.Override
        public AuthorizerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorizerStub(channel, callOptions);
        }
      };
    return AuthorizerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthorizerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorizerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorizerBlockingStub>() {
        @java.lang.Override
        public AuthorizerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorizerBlockingStub(channel, callOptions);
        }
      };
    return AuthorizerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthorizerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthorizerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthorizerFutureStub>() {
        @java.lang.Override
        public AuthorizerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthorizerFutureStub(channel, callOptions);
        }
      };
    return AuthorizerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void decisionTree(com.aserto.authorizer.v2.DecisionTreeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.DecisionTreeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecisionTreeMethod(), responseObserver);
    }

    /**
     */
    default void is(com.aserto.authorizer.v2.IsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.IsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsMethod(), responseObserver);
    }

    /**
     */
    default void query(com.aserto.authorizer.v2.QueryRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.QueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     */
    default void compile(com.aserto.authorizer.v2.CompileRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.CompileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompileMethod(), responseObserver);
    }

    /**
     */
    default void listPolicies(com.aserto.authorizer.v2.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPoliciesMethod(), responseObserver);
    }

    /**
     */
    default void getPolicy(com.aserto.authorizer.v2.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.GetPolicyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPolicyMethod(), responseObserver);
    }

    /**
     */
    default void info(com.aserto.authorizer.v2.InfoRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.InfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Authorizer.
   */
  public static abstract class AuthorizerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthorizerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Authorizer.
   */
  public static final class AuthorizerStub
      extends io.grpc.stub.AbstractAsyncStub<AuthorizerStub> {
    private AuthorizerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorizerStub(channel, callOptions);
    }

    /**
     */
    public void decisionTree(com.aserto.authorizer.v2.DecisionTreeRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.DecisionTreeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDecisionTreeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void is(com.aserto.authorizer.v2.IsRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.IsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void query(com.aserto.authorizer.v2.QueryRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.QueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void compile(com.aserto.authorizer.v2.CompileRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.CompileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPolicies(com.aserto.authorizer.v2.ListPoliciesRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.ListPoliciesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPolicy(com.aserto.authorizer.v2.GetPolicyRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.GetPolicyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void info(com.aserto.authorizer.v2.InfoRequest request,
        io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.InfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Authorizer.
   */
  public static final class AuthorizerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthorizerBlockingStub> {
    private AuthorizerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorizerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aserto.authorizer.v2.DecisionTreeResponse decisionTree(com.aserto.authorizer.v2.DecisionTreeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDecisionTreeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.authorizer.v2.IsResponse is(com.aserto.authorizer.v2.IsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.authorizer.v2.QueryResponse query(com.aserto.authorizer.v2.QueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.authorizer.v2.CompileResponse compile(com.aserto.authorizer.v2.CompileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.authorizer.v2.ListPoliciesResponse listPolicies(com.aserto.authorizer.v2.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPoliciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.authorizer.v2.GetPolicyResponse getPolicy(com.aserto.authorizer.v2.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aserto.authorizer.v2.InfoResponse info(com.aserto.authorizer.v2.InfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Authorizer.
   */
  public static final class AuthorizerFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthorizerFutureStub> {
    private AuthorizerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthorizerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthorizerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.authorizer.v2.DecisionTreeResponse> decisionTree(
        com.aserto.authorizer.v2.DecisionTreeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDecisionTreeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.authorizer.v2.IsResponse> is(
        com.aserto.authorizer.v2.IsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.authorizer.v2.QueryResponse> query(
        com.aserto.authorizer.v2.QueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.authorizer.v2.CompileResponse> compile(
        com.aserto.authorizer.v2.CompileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.authorizer.v2.ListPoliciesResponse> listPolicies(
        com.aserto.authorizer.v2.ListPoliciesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPoliciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.authorizer.v2.GetPolicyResponse> getPolicy(
        com.aserto.authorizer.v2.GetPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aserto.authorizer.v2.InfoResponse> info(
        com.aserto.authorizer.v2.InfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DECISION_TREE = 0;
  private static final int METHODID_IS = 1;
  private static final int METHODID_QUERY = 2;
  private static final int METHODID_COMPILE = 3;
  private static final int METHODID_LIST_POLICIES = 4;
  private static final int METHODID_GET_POLICY = 5;
  private static final int METHODID_INFO = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DECISION_TREE:
          serviceImpl.decisionTree((com.aserto.authorizer.v2.DecisionTreeRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.DecisionTreeResponse>) responseObserver);
          break;
        case METHODID_IS:
          serviceImpl.is((com.aserto.authorizer.v2.IsRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.IsResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((com.aserto.authorizer.v2.QueryRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.QueryResponse>) responseObserver);
          break;
        case METHODID_COMPILE:
          serviceImpl.compile((com.aserto.authorizer.v2.CompileRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.CompileResponse>) responseObserver);
          break;
        case METHODID_LIST_POLICIES:
          serviceImpl.listPolicies((com.aserto.authorizer.v2.ListPoliciesRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.ListPoliciesResponse>) responseObserver);
          break;
        case METHODID_GET_POLICY:
          serviceImpl.getPolicy((com.aserto.authorizer.v2.GetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.GetPolicyResponse>) responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info((com.aserto.authorizer.v2.InfoRequest) request,
              (io.grpc.stub.StreamObserver<com.aserto.authorizer.v2.InfoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getDecisionTreeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.authorizer.v2.DecisionTreeRequest,
              com.aserto.authorizer.v2.DecisionTreeResponse>(
                service, METHODID_DECISION_TREE)))
        .addMethod(
          getIsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.authorizer.v2.IsRequest,
              com.aserto.authorizer.v2.IsResponse>(
                service, METHODID_IS)))
        .addMethod(
          getQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.authorizer.v2.QueryRequest,
              com.aserto.authorizer.v2.QueryResponse>(
                service, METHODID_QUERY)))
        .addMethod(
          getCompileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.authorizer.v2.CompileRequest,
              com.aserto.authorizer.v2.CompileResponse>(
                service, METHODID_COMPILE)))
        .addMethod(
          getListPoliciesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.authorizer.v2.ListPoliciesRequest,
              com.aserto.authorizer.v2.ListPoliciesResponse>(
                service, METHODID_LIST_POLICIES)))
        .addMethod(
          getGetPolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.authorizer.v2.GetPolicyRequest,
              com.aserto.authorizer.v2.GetPolicyResponse>(
                service, METHODID_GET_POLICY)))
        .addMethod(
          getInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.aserto.authorizer.v2.InfoRequest,
              com.aserto.authorizer.v2.InfoResponse>(
                service, METHODID_INFO)))
        .build();
  }

  private static abstract class AuthorizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthorizerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aserto.authorizer.v2.AuthorizerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Authorizer");
    }
  }

  private static final class AuthorizerFileDescriptorSupplier
      extends AuthorizerBaseDescriptorSupplier {
    AuthorizerFileDescriptorSupplier() {}
  }

  private static final class AuthorizerMethodDescriptorSupplier
      extends AuthorizerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthorizerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthorizerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthorizerFileDescriptorSupplier())
              .addMethod(getDecisionTreeMethod())
              .addMethod(getIsMethod())
              .addMethod(getQueryMethod())
              .addMethod(getCompileMethod())
              .addMethod(getListPoliciesMethod())
              .addMethod(getGetPolicyMethod())
              .addMethod(getInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
