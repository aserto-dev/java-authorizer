// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/identity_context.proto

package com.aserto.authorizer.v2.api;

public interface IdentityContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.api.IdentityContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string identity = 1 [json_name = "identity"];</code>
   * @return The identity.
   */
  java.lang.String getIdentity();
  /**
   * <code>string identity = 1 [json_name = "identity"];</code>
   * @return The bytes for identity.
   */
  com.google.protobuf.ByteString
      getIdentityBytes();

  /**
   * <code>.aserto.authorizer.v2.api.IdentityType type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.aserto.authorizer.v2.api.IdentityType type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  com.aserto.authorizer.v2.api.IdentityType getType();
}