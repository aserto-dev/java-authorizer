// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

package com.aserto.authorizer.v2;

public interface ListPoliciesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.ListPoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <code>.google.protobuf.FieldMask field_mask = 1 [json_name = "fieldMask"];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 2 [json_name = "policyInstance"];</code>
   * @return Whether the policyInstance field is set.
   */
  boolean hasPolicyInstance();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 2 [json_name = "policyInstance"];</code>
   * @return The policyInstance.
   */
  com.aserto.authorizer.v2.api.PolicyInstance getPolicyInstance();
  /**
   * <code>optional .aserto.authorizer.v2.api.PolicyInstance policy_instance = 2 [json_name = "policyInstance"];</code>
   */
  com.aserto.authorizer.v2.api.PolicyInstanceOrBuilder getPolicyInstanceOrBuilder();
}
