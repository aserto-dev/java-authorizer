// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/authorizer/v2/authorizer.proto
// Protobuf Java Version: 4.27.1

package com.aserto.authorizer.v2;

public interface CompileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.CompileRequest)
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
   * <code>repeated string unknowns = 3 [json_name = "unknowns"];</code>
   * @return A list containing the unknowns.
   */
  java.util.List<java.lang.String>
      getUnknownsList();
  /**
   * <code>repeated string unknowns = 3 [json_name = "unknowns"];</code>
   * @return The count of unknowns.
   */
  int getUnknownsCount();
  /**
   * <code>repeated string unknowns = 3 [json_name = "unknowns"];</code>
   * @param index The index of the element to return.
   * @return The unknowns at the given index.
   */
  java.lang.String getUnknowns(int index);
  /**
   * <code>repeated string unknowns = 3 [json_name = "unknowns"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the unknowns at the given index.
   */
  com.google.protobuf.ByteString
      getUnknownsBytes(int index);

  /**
   * <code>repeated string disable_inlining = 4 [json_name = "disableInlining"];</code>
   * @return A list containing the disableInlining.
   */
  java.util.List<java.lang.String>
      getDisableInliningList();
  /**
   * <code>repeated string disable_inlining = 4 [json_name = "disableInlining"];</code>
   * @return The count of disableInlining.
   */
  int getDisableInliningCount();
  /**
   * <code>repeated string disable_inlining = 4 [json_name = "disableInlining"];</code>
   * @param index The index of the element to return.
   * @return The disableInlining at the given index.
   */
  java.lang.String getDisableInlining(int index);
  /**
   * <code>repeated string disable_inlining = 4 [json_name = "disableInlining"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the disableInlining at the given index.
   */
  com.google.protobuf.ByteString
      getDisableInliningBytes(int index);

  /**
   * <code>optional .aserto.authorizer.v2.QueryOptions options = 5 [json_name = "options"];</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .aserto.authorizer.v2.QueryOptions options = 5 [json_name = "options"];</code>
   * @return The options.
   */
  com.aserto.authorizer.v2.QueryOptions getOptions();
  /**
   * <code>optional .aserto.authorizer.v2.QueryOptions options = 5 [json_name = "options"];</code>
   */
  com.aserto.authorizer.v2.QueryOptionsOrBuilder getOptionsOrBuilder();

  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyContext policy_context = 6 [json_name = "policyContext"];</code>
   * @return Whether the policyContext field is set.
   */
  boolean hasPolicyContext();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyContext policy_context = 6 [json_name = "policyContext"];</code>
   * @return The policyContext.
   */
  com.aserto.authorizer.v2.api.PolicyContext getPolicyContext();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyContext policy_context = 6 [json_name = "policyContext"];</code>
   */
  com.aserto.authorizer.v2.api.PolicyContextOrBuilder getPolicyContextOrBuilder();

  /**
   * <code>optional .aserto.authorizer.v2.api.IdentityContext identity_context = 7 [json_name = "identityContext"];</code>
   * @return Whether the identityContext field is set.
   */
  boolean hasIdentityContext();
  /**
   * <code>optional .aserto.authorizer.v2.api.IdentityContext identity_context = 7 [json_name = "identityContext"];</code>
   * @return The identityContext.
   */
  com.aserto.authorizer.v2.api.IdentityContext getIdentityContext();
  /**
   * <code>optional .aserto.authorizer.v2.api.IdentityContext identity_context = 7 [json_name = "identityContext"];</code>
   */
  com.aserto.authorizer.v2.api.IdentityContextOrBuilder getIdentityContextOrBuilder();

  /**
   * <code>optional .google.protobuf.Struct resource_context = 8 [json_name = "resourceContext"];</code>
   * @return Whether the resourceContext field is set.
   */
  boolean hasResourceContext();
  /**
   * <code>optional .google.protobuf.Struct resource_context = 8 [json_name = "resourceContext"];</code>
   * @return The resourceContext.
   */
  com.google.protobuf.Struct getResourceContext();
  /**
   * <code>optional .google.protobuf.Struct resource_context = 8 [json_name = "resourceContext"];</code>
   */
  com.google.protobuf.StructOrBuilder getResourceContextOrBuilder();

  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 9 [json_name = "policyInstance"];</code>
   * @return Whether the policyInstance field is set.
   */
  boolean hasPolicyInstance();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 9 [json_name = "policyInstance"];</code>
   * @return The policyInstance.
   */
  com.aserto.authorizer.v2.api.PolicyInstance getPolicyInstance();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 9 [json_name = "policyInstance"];</code>
   */
  com.aserto.authorizer.v2.api.PolicyInstanceOrBuilder getPolicyInstanceOrBuilder();
}
