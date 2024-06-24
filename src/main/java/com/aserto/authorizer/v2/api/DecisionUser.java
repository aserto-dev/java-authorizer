// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/decision_logs.proto

// Protobuf Java Version: 3.25.3
package com.aserto.authorizer.v2.api;

/**
 * <pre>
 * information about a user on behalf of whom a decision was made
 * </pre>
 *
 * Protobuf type {@code aserto.authorizer.v2.api.DecisionUser}
 */
public final class DecisionUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.authorizer.v2.api.DecisionUser)
    DecisionUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DecisionUser.newBuilder() to construct.
  private DecisionUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DecisionUser() {
    id_ = "";
    email_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DecisionUser();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.authorizer.v2.api.DecisionLogsProto.internal_static_aserto_authorizer_v2_api_DecisionUser_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.authorizer.v2.api.DecisionLogsProto.internal_static_aserto_authorizer_v2_api_DecisionUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.authorizer.v2.api.DecisionUser.class, com.aserto.authorizer.v2.api.DecisionUser.Builder.class);
  }

  private int bitField0_;
  public static final int CONTEXT_FIELD_NUMBER = 1;
  private com.aserto.authorizer.v2.api.IdentityContext context_;
  /**
   * <pre>
   * identity context used in the decision
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
   * @return Whether the context field is set.
   */
  @java.lang.Override
  public boolean hasContext() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * identity context used in the decision
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
   * @return The context.
   */
  @java.lang.Override
  public com.aserto.authorizer.v2.api.IdentityContext getContext() {
    return context_ == null ? com.aserto.authorizer.v2.api.IdentityContext.getDefaultInstance() : context_;
  }
  /**
   * <pre>
   * identity context used in the decision
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
   */
  @java.lang.Override
  public com.aserto.authorizer.v2.api.IdentityContextOrBuilder getContextOrBuilder() {
    return context_ == null ? com.aserto.authorizer.v2.api.IdentityContext.getDefaultInstance() : context_;
  }

  public static final int ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <pre>
   * id of the user the identity resolved to    
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * id of the user the identity resolved to    
   * </pre>
   *
   * <code>string id = 2 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object email_ = "";
  /**
   * <pre>
   * convinience human-readable identifier
   * </pre>
   *
   * <code>string email = 3 [json_name = "email"];</code>
   * @return The email.
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      email_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * convinience human-readable identifier
   * </pre>
   *
   * <code>string email = 3 [json_name = "email"];</code>
   * @return The bytes for email.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    java.lang.Object ref = email_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      email_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getContext());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, email_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContext());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(email_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, email_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.aserto.authorizer.v2.api.DecisionUser)) {
      return super.equals(obj);
    }
    com.aserto.authorizer.v2.api.DecisionUser other = (com.aserto.authorizer.v2.api.DecisionUser) obj;

    if (hasContext() != other.hasContext()) return false;
    if (hasContext()) {
      if (!getContext()
          .equals(other.getContext())) return false;
    }
    if (!getId()
        .equals(other.getId())) return false;
    if (!getEmail()
        .equals(other.getEmail())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasContext()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getContext().hashCode();
    }
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + EMAIL_FIELD_NUMBER;
    hash = (53 * hash) + getEmail().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.authorizer.v2.api.DecisionUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.authorizer.v2.api.DecisionUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.api.DecisionUser parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.aserto.authorizer.v2.api.DecisionUser prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * information about a user on behalf of whom a decision was made
   * </pre>
   *
   * Protobuf type {@code aserto.authorizer.v2.api.DecisionUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.authorizer.v2.api.DecisionUser)
      com.aserto.authorizer.v2.api.DecisionUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.authorizer.v2.api.DecisionLogsProto.internal_static_aserto_authorizer_v2_api_DecisionUser_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.authorizer.v2.api.DecisionLogsProto.internal_static_aserto_authorizer_v2_api_DecisionUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.authorizer.v2.api.DecisionUser.class, com.aserto.authorizer.v2.api.DecisionUser.Builder.class);
    }

    // Construct using com.aserto.authorizer.v2.api.DecisionUser.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getContextFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      context_ = null;
      if (contextBuilder_ != null) {
        contextBuilder_.dispose();
        contextBuilder_ = null;
      }
      id_ = "";
      email_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.authorizer.v2.api.DecisionLogsProto.internal_static_aserto_authorizer_v2_api_DecisionUser_descriptor;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.api.DecisionUser getDefaultInstanceForType() {
      return com.aserto.authorizer.v2.api.DecisionUser.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.api.DecisionUser build() {
      com.aserto.authorizer.v2.api.DecisionUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.api.DecisionUser buildPartial() {
      com.aserto.authorizer.v2.api.DecisionUser result = new com.aserto.authorizer.v2.api.DecisionUser(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.authorizer.v2.api.DecisionUser result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.context_ = contextBuilder_ == null
            ? context_
            : contextBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.email_ = email_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aserto.authorizer.v2.api.DecisionUser) {
        return mergeFrom((com.aserto.authorizer.v2.api.DecisionUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.authorizer.v2.api.DecisionUser other) {
      if (other == com.aserto.authorizer.v2.api.DecisionUser.getDefaultInstance()) return this;
      if (other.hasContext()) {
        mergeContext(other.getContext());
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getEmail().isEmpty()) {
        email_ = other.email_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getContextFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              email_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.aserto.authorizer.v2.api.IdentityContext context_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.authorizer.v2.api.IdentityContext, com.aserto.authorizer.v2.api.IdentityContext.Builder, com.aserto.authorizer.v2.api.IdentityContextOrBuilder> contextBuilder_;
    /**
     * <pre>
     * identity context used in the decision
     * </pre>
     *
     * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
     * @return Whether the context field is set.
     */
    public boolean hasContext() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * identity context used in the decision
     * </pre>
     *
     * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
     * @return The context.
     */
    public com.aserto.authorizer.v2.api.IdentityContext getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? com.aserto.authorizer.v2.api.IdentityContext.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * identity context used in the decision
     * </pre>
     *
     * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
     */
    public Builder setContext(com.aserto.authorizer.v2.api.IdentityContext value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
      } else {
        contextBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identity context used in the decision
     * </pre>
     *
     * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
     */
    public Builder setContext(
        com.aserto.authorizer.v2.api.IdentityContext.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identity context used in the decision
     * </pre>
     *
     * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
     */
    public Builder mergeContext(com.aserto.authorizer.v2.api.IdentityContext value) {
      if (contextBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          context_ != null &&
          context_ != com.aserto.authorizer.v2.api.IdentityContext.getDefaultInstance()) {
          getContextBuilder().mergeFrom(value);
        } else {
          context_ = value;
        }
      } else {
        contextBuilder_.mergeFrom(value);
      }
      if (context_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * identity context used in the decision
     * </pre>
     *
     * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
     */
    public Builder clearContext() {
      bitField0_ = (bitField0_ & ~0x00000001);
      context_ = null;
      if (contextBuilder_ != null) {
        contextBuilder_.dispose();
        contextBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * identity context used in the decision
     * </pre>
     *
     * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
     */
    public com.aserto.authorizer.v2.api.IdentityContext.Builder getContextBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * identity context used in the decision
     * </pre>
     *
     * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
     */
    public com.aserto.authorizer.v2.api.IdentityContextOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ?
            com.aserto.authorizer.v2.api.IdentityContext.getDefaultInstance() : context_;
      }
    }
    /**
     * <pre>
     * identity context used in the decision
     * </pre>
     *
     * <code>.aserto.authorizer.v2.api.IdentityContext context = 1 [json_name = "context"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.aserto.authorizer.v2.api.IdentityContext, com.aserto.authorizer.v2.api.IdentityContext.Builder, com.aserto.authorizer.v2.api.IdentityContextOrBuilder> 
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.aserto.authorizer.v2.api.IdentityContext, com.aserto.authorizer.v2.api.IdentityContext.Builder, com.aserto.authorizer.v2.api.IdentityContextOrBuilder>(
                getContext(),
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      return contextBuilder_;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * id of the user the identity resolved to    
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * id of the user the identity resolved to    
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * id of the user the identity resolved to    
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id of the user the identity resolved to    
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * id of the user the identity resolved to    
     * </pre>
     *
     * <code>string id = 2 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object email_ = "";
    /**
     * <pre>
     * convinience human-readable identifier
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
     * @return The email.
     */
    public java.lang.String getEmail() {
      java.lang.Object ref = email_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        email_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * convinience human-readable identifier
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
     * @return The bytes for email.
     */
    public com.google.protobuf.ByteString
        getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * convinience human-readable identifier
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      email_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * convinience human-readable identifier
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      email_ = getDefaultInstance().getEmail();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * convinience human-readable identifier
     * </pre>
     *
     * <code>string email = 3 [json_name = "email"];</code>
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      email_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:aserto.authorizer.v2.api.DecisionUser)
  }

  // @@protoc_insertion_point(class_scope:aserto.authorizer.v2.api.DecisionUser)
  private static final com.aserto.authorizer.v2.api.DecisionUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.authorizer.v2.api.DecisionUser();
  }

  public static com.aserto.authorizer.v2.api.DecisionUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DecisionUser>
      PARSER = new com.google.protobuf.AbstractParser<DecisionUser>() {
    @java.lang.Override
    public DecisionUser parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DecisionUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DecisionUser> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.authorizer.v2.api.DecisionUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

