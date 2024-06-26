// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.authorizer.v2;

public interface QueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.QueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string query = 1 [json_name = "query"];</code>
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   * <code>string query = 1 [json_name = "query"];</code>
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <code>string input = 2 [json_name = "input"];</code>
   * @return The input.
   */
  java.lang.String getInput();
  /**
   * <code>string input = 2 [json_name = "input"];</code>
   * @return The bytes for input.
   */
  com.google.protobuf.ByteString
      getInputBytes();

  /**
   * <code>optional .aserto.authorizer.v2.QueryOptions options = 3 [json_name = "options"];</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .aserto.authorizer.v2.QueryOptions options = 3 [json_name = "options"];</code>
   * @return The options.
   */
  com.aserto.authorizer.v2.QueryOptions getOptions();
  /**
   * <code>optional .aserto.authorizer.v2.QueryOptions options = 3 [json_name = "options"];</code>
   */
  com.aserto.authorizer.v2.QueryOptionsOrBuilder getOptionsOrBuilder();

  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyContext policy_context = 4 [json_name = "policyContext"];</code>
   * @return Whether the policyContext field is set.
   */
  boolean hasPolicyContext();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyContext policy_context = 4 [json_name = "policyContext"];</code>
   * @return The policyContext.
   */
  com.aserto.authorizer.v2.api.PolicyContext getPolicyContext();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyContext policy_context = 4 [json_name = "policyContext"];</code>
   */
  com.aserto.authorizer.v2.api.PolicyContextOrBuilder getPolicyContextOrBuilder();

  /**
   * <code>optional .aserto.authorizer.v2.api.IdentityContext identity_context = 5 [json_name = "identityContext"];</code>
   * @return Whether the identityContext field is set.
   */
  boolean hasIdentityContext();
  /**
   * <code>optional .aserto.authorizer.v2.api.IdentityContext identity_context = 5 [json_name = "identityContext"];</code>
   * @return The identityContext.
   */
  com.aserto.authorizer.v2.api.IdentityContext getIdentityContext();
  /**
   * <code>optional .aserto.authorizer.v2.api.IdentityContext identity_context = 5 [json_name = "identityContext"];</code>
   */
  com.aserto.authorizer.v2.api.IdentityContextOrBuilder getIdentityContextOrBuilder();

  /**
   * <code>optional .google.protobuf.Struct resource_context = 6 [json_name = "resourceContext"];</code>
   * @return Whether the resourceContext field is set.
   */
  boolean hasResourceContext();
  /**
   * <code>optional .google.protobuf.Struct resource_context = 6 [json_name = "resourceContext"];</code>
   * @return The resourceContext.
   */
  com.google.protobuf.Struct getResourceContext();
  /**
   * <code>optional .google.protobuf.Struct resource_context = 6 [json_name = "resourceContext"];</code>
   */
  com.google.protobuf.StructOrBuilder getResourceContextOrBuilder();

  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 7 [json_name = "policyInstance"];</code>
   * @return Whether the policyInstance field is set.
   */
  boolean hasPolicyInstance();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 7 [json_name = "policyInstance"];</code>
   * @return The policyInstance.
   */
  com.aserto.authorizer.v2.api.PolicyInstance getPolicyInstance();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 7 [json_name = "policyInstance"];</code>
   */
  com.aserto.authorizer.v2.api.PolicyInstanceOrBuilder getPolicyInstanceOrBuilder();
}
