// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/identity_context.proto

// Protobuf Java Version: 3.25.1
package com.aserto.authorizer.v2.api;

public final class IdentityContextProto {
  private IdentityContextProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_api_IdentityContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_api_IdentityContext_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/aserto/authorizer/v2/api/identity_cont" +
      "ext.proto\022\030aserto.authorizer.v2.api\"i\n\017I" +
      "dentityContext\022\032\n\010identity\030\001 \001(\tR\010identi" +
      "ty\022:\n\004type\030\002 \001(\0162&.aserto.authorizer.v2." +
      "api.IdentityTypeR\004type*\211\001\n\014IdentityType\022" +
      "\031\n\025IDENTITY_TYPE_UNKNOWN\020\000\022\026\n\022IDENTITY_T" +
      "YPE_NONE\020\001\022\025\n\021IDENTITY_TYPE_SUB\020\002\022\025\n\021IDE" +
      "NTITY_TYPE_JWT\020\003\022\030\n\024IDENTITY_TYPE_MANUAL" +
      "\020\004B\372\001\n\034com.aserto.authorizer.v2.apiB\024Ide" +
      "ntityContextProtoP\001Z@github.com/aserto-d" +
      "ev/go-authorizer/aserto/authorizer/v2/ap" +
      "i;api\242\002\004AAVA\252\002\030Aserto.Authorizer.V2.Api\312" +
      "\002\030Aserto\\Authorizer\\V2\\Api\342\002$Aserto\\Auth" +
      "orizer\\V2\\Api\\GPBMetadata\352\002\033Aserto::Auth" +
      "orizer::V2::Apib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_aserto_authorizer_v2_api_IdentityContext_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_authorizer_v2_api_IdentityContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_api_IdentityContext_descriptor,
        new java.lang.String[] { "Identity", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
