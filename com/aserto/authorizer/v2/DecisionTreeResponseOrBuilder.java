// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

package com.aserto.authorizer.v2;

public interface DecisionTreeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.DecisionTreeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string path_root = 1 [json_name = "pathRoot"];</code>
   * @return The pathRoot.
   */
  java.lang.String getPathRoot();
  /**
   * <code>string path_root = 1 [json_name = "pathRoot"];</code>
   * @return The bytes for pathRoot.
   */
  com.google.protobuf.ByteString
      getPathRootBytes();

  /**
   * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
   * @return Whether the path field is set.
   */
  boolean hasPath();
  /**
   * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
   * @return The path.
   */
  com.google.protobuf.Struct getPath();
  /**
   * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
   */
  com.google.protobuf.StructOrBuilder getPathOrBuilder();
}
