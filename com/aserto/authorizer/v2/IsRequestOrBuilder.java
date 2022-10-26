// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

package com.aserto.authorizer.v2;

public interface IsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.IsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.aserto.authorizer.v2.api.PolicyContext policy_context = 1 [json_name = "policyContext"];</code>
   * @return Whether the policyContext field is set.
   */
  boolean hasPolicyContext();
  /**
   * <code>.aserto.authorizer.v2.api.PolicyContext policy_context = 1 [json_name = "policyContext"];</code>
   * @return The policyContext.
   */
  com.aserto.authorizer.v2.api.PolicyContext getPolicyContext();
  /**
   * <code>.aserto.authorizer.v2.api.PolicyContext policy_context = 1 [json_name = "policyContext"];</code>
   */
  com.aserto.authorizer.v2.api.PolicyContextOrBuilder getPolicyContextOrBuilder();

  /**
   * <code>.aserto.authorizer.v2.api.IdentityContext identity_context = 2 [json_name = "identityContext"];</code>
   * @return Whether the identityContext field is set.
   */
  boolean hasIdentityContext();
  /**
   * <code>.aserto.authorizer.v2.api.IdentityContext identity_context = 2 [json_name = "identityContext"];</code>
   * @return The identityContext.
   */
  com.aserto.authorizer.v2.api.IdentityContext getIdentityContext();
  /**
   * <code>.aserto.authorizer.v2.api.IdentityContext identity_context = 2 [json_name = "identityContext"];</code>
   */
  com.aserto.authorizer.v2.api.IdentityContextOrBuilder getIdentityContextOrBuilder();

  /**
   * <code>.google.protobuf.Struct resource_context = 3 [json_name = "resourceContext"];</code>
   * @return Whether the resourceContext field is set.
   */
  boolean hasResourceContext();
  /**
   * <code>.google.protobuf.Struct resource_context = 3 [json_name = "resourceContext"];</code>
   * @return The resourceContext.
   */
  com.google.protobuf.Struct getResourceContext();
  /**
   * <code>.google.protobuf.Struct resource_context = 3 [json_name = "resourceContext"];</code>
   */
  com.google.protobuf.StructOrBuilder getResourceContextOrBuilder();

  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 4 [json_name = "policyInstance"];</code>
   * @return Whether the policyInstance field is set.
   */
  boolean hasPolicyInstance();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 4 [json_name = "policyInstance"];</code>
   * @return The policyInstance.
   */
  com.aserto.authorizer.v2.api.PolicyInstance getPolicyInstance();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 4 [json_name = "policyInstance"];</code>
   */
  com.aserto.authorizer.v2.api.PolicyInstanceOrBuilder getPolicyInstanceOrBuilder();
}
