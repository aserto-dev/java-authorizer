// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.authorizer.v2;

public interface ListPoliciesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.ListPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  java.util.List<com.aserto.authorizer.v2.api.Module> 
      getResultList();
  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  com.aserto.authorizer.v2.api.Module getResult(int index);
  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  int getResultCount();
  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  java.util.List<? extends com.aserto.authorizer.v2.api.ModuleOrBuilder> 
      getResultOrBuilderList();
  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  com.aserto.authorizer.v2.api.ModuleOrBuilder getResultOrBuilder(
      int index);
}
