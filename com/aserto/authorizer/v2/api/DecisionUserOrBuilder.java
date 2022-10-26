// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/decision_logs.proto

package com.aserto.authorizer.v2.api;

public interface DecisionUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.api.DecisionUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * identity context used in the decision
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <pre>
   * identity context used in the decision
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
   * @return The context.
   */
  com.aserto.authorizer.v2.api.IdentityContext getContext();
  /**
   * <pre>
   * identity context used in the decision
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
   */
  com.aserto.authorizer.v2.api.IdentityContextOrBuilder getContextOrBuilder();

  /**
   * <pre>
   * id of the user the identity resolved to    
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * id of the user the identity resolved to    
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * convinience human-readable identifier
   * </pre>
   *
   * <code>string email = 3 [json_name = "email"];</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <pre>
   * convinience human-readable identifier
   * </pre>
   *
   * <code>string email = 3 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();
}
