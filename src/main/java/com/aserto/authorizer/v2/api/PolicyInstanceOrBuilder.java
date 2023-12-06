// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/policy_instance.proto

// Protobuf Java Version: 3.25.1
package com.aserto.authorizer.v2.api;

public interface PolicyInstanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.api.PolicyInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * policy name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * policy name
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * label identifying the instance of the policy
   * </pre>
   *
   * <code>string instance_label = 2 [json_name = "instanceLabel"];</code>
   * @return The instanceLabel.
   */
  java.lang.String getInstanceLabel();
  /**
   * <pre>
   * label identifying the instance of the policy
   * </pre>
   *
   * <code>string instance_label = 2 [json_name = "instanceLabel"];</code>
   * @return The bytes for instanceLabel.
   */
  com.google.protobuf.ByteString
      getInstanceLabelBytes();
}
