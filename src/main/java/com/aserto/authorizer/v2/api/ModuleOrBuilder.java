// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/module.proto

package com.aserto.authorizer.v2.api;

public interface ModuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.api.Module)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string id = 1 [json_name = "id"];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>optional string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>optional string raw = 2 [json_name = "raw"];</code>
   * @return Whether the raw field is set.
   */
  boolean hasRaw();
  /**
   * <code>optional string raw = 2 [json_name = "raw"];</code>
   * @return The raw.
   */
  java.lang.String getRaw();
  /**
   * <code>optional string raw = 2 [json_name = "raw"];</code>
   * @return The bytes for raw.
   */
  com.google.protobuf.ByteString
      getRawBytes();

  /**
   * <code>optional string package_path = 3 [json_name = "packagePath"];</code>
   * @return Whether the packagePath field is set.
   */
  boolean hasPackagePath();
  /**
   * <code>optional string package_path = 3 [json_name = "packagePath"];</code>
   * @return The packagePath.
   */
  java.lang.String getPackagePath();
  /**
   * <code>optional string package_path = 3 [json_name = "packagePath"];</code>
   * @return The bytes for packagePath.
   */
  com.google.protobuf.ByteString
      getPackagePathBytes();

  /**
   * <code>optional .google.protobuf.Value ast = 4 [json_name = "ast"];</code>
   * @return Whether the ast field is set.
   */
  boolean hasAst();
  /**
   * <code>optional .google.protobuf.Value ast = 4 [json_name = "ast"];</code>
   * @return The ast.
   */
  com.google.protobuf.Value getAst();
  /**
   * <code>optional .google.protobuf.Value ast = 4 [json_name = "ast"];</code>
   */
  com.google.protobuf.ValueOrBuilder getAstOrBuilder();

  /**
   * <code>optional string package_root = 5 [json_name = "packageRoot"];</code>
   * @return Whether the packageRoot field is set.
   */
  boolean hasPackageRoot();
  /**
   * <code>optional string package_root = 5 [json_name = "packageRoot"];</code>
   * @return The packageRoot.
   */
  java.lang.String getPackageRoot();
  /**
   * <code>optional string package_root = 5 [json_name = "packageRoot"];</code>
   * @return The bytes for packageRoot.
   */
  com.google.protobuf.ByteString
      getPackageRootBytes();
}