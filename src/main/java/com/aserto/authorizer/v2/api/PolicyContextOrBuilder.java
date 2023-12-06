// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/policy_context.proto

// Protobuf Java Version: 3.25.1
package com.aserto.authorizer.v2.api;

public interface PolicyContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.api.PolicyContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * policy path aka package name
   * </pre>
   *
   * <code>string path = 1 [json_name = "path"];</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * policy path aka package name
   * </pre>
   *
   * <code>string path = 1 [json_name = "path"];</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * list (1..N) of policy decisions (aka rules)
   * </pre>
   *
   * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
   * @return A list containing the decisions.
   */
  java.util.List<java.lang.String>
      getDecisionsList();
  /**
   * <pre>
   * list (1..N) of policy decisions (aka rules)
   * </pre>
   *
   * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
   * @return The count of decisions.
   */
  int getDecisionsCount();
  /**
   * <pre>
   * list (1..N) of policy decisions (aka rules)
   * </pre>
   *
   * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
   * @param index The index of the element to return.
   * @return The decisions at the given index.
   */
  java.lang.String getDecisions(int index);
  /**
   * <pre>
   * list (1..N) of policy decisions (aka rules)
   * </pre>
   *
   * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the decisions at the given index.
   */
  com.google.protobuf.ByteString
      getDecisionsBytes(int index);
}
