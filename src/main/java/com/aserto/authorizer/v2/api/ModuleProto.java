// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/module.proto

// Protobuf Java Version: 3.25.0
package com.aserto.authorizer.v2.api;

public final class ModuleProto {
  private ModuleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_api_Module_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_api_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%aserto/authorizer/v2/api/module.proto\022" +
      "\030aserto.authorizer.v2.api\032\034google/protob" +
      "uf/struct.proto\"\354\001\n\006Module\022\023\n\002id\030\001 \001(\tH\000" +
      "R\002id\210\001\001\022\025\n\003raw\030\002 \001(\tH\001R\003raw\210\001\001\022&\n\014packag" +
      "e_path\030\003 \001(\tH\002R\013packagePath\210\001\001\022-\n\003ast\030\004 " +
      "\001(\0132\026.google.protobuf.ValueH\003R\003ast\210\001\001\022&\n" +
      "\014package_root\030\005 \001(\tH\004R\013packageRoot\210\001\001B\005\n" +
      "\003_idB\006\n\004_rawB\017\n\r_package_pathB\006\n\004_astB\017\n" +
      "\r_package_rootB\361\001\n\034com.aserto.authorizer" +
      ".v2.apiB\013ModuleProtoP\001Z@github.com/asert" +
      "o-dev/go-authorizer/aserto/authorizer/v2" +
      "/api;api\242\002\004AAVA\252\002\030Aserto.Authorizer.V2.A" +
      "pi\312\002\030Aserto\\Authorizer\\V2\\Api\342\002$Aserto\\A" +
      "uthorizer\\V2\\Api\\GPBMetadata\352\002\033Aserto::A" +
      "uthorizer::V2::Apib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_aserto_authorizer_v2_api_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_authorizer_v2_api_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_api_Module_descriptor,
        new java.lang.String[] { "Id", "Raw", "PackagePath", "Ast", "PackageRoot", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
