// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/policy_context.proto

// Protobuf Java Version: 3.25.3
package com.aserto.authorizer.v2.api;

public final class PolicyContextProto {
  private PolicyContextProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_api_PolicyContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_api_PolicyContext_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-aserto/authorizer/v2/api/policy_contex" +
      "t.proto\022\030aserto.authorizer.v2.api\"A\n\rPol" +
      "icyContext\022\022\n\004path\030\001 \001(\tR\004path\022\034\n\tdecisi" +
      "ons\030\002 \003(\tR\tdecisionsB\370\001\n\034com.aserto.auth" +
      "orizer.v2.apiB\022PolicyContextProtoP\001Z@git" +
      "hub.com/aserto-dev/go-authorizer/aserto/" +
      "authorizer/v2/api;api\242\002\004AAVA\252\002\030Aserto.Au" +
      "thorizer.V2.Api\312\002\030Aserto\\Authorizer\\V2\\A" +
      "pi\342\002$Aserto\\Authorizer\\V2\\Api\\GPBMetadat" +
      "a\352\002\033Aserto::Authorizer::V2::Apib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_aserto_authorizer_v2_api_PolicyContext_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_authorizer_v2_api_PolicyContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_api_PolicyContext_descriptor,
        new java.lang.String[] { "Path", "Decisions", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
