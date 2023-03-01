// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/policy_context.proto

package com.aserto.authorizer.v2.api;

/**
 * Protobuf type {@code aserto.authorizer.v2.api.PolicyContext}
 */
public final class PolicyContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.authorizer.v2.api.PolicyContext)
    PolicyContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicyContext.newBuilder() to construct.
  private PolicyContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyContext() {
    path_ = "";
    decisions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PolicyContext();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.authorizer.v2.api.PolicyContextProto.internal_static_aserto_authorizer_v2_api_PolicyContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.authorizer.v2.api.PolicyContextProto.internal_static_aserto_authorizer_v2_api_PolicyContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.authorizer.v2.api.PolicyContext.class, com.aserto.authorizer.v2.api.PolicyContext.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object path_ = "";
  /**
   * <pre>
   * policy path aka package name
   * </pre>
   *
   * <code>string path = 1 [json_name = "path"];</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * policy path aka package name
   * </pre>
   *
   * <code>string path = 1 [json_name = "path"];</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DECISIONS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList decisions_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * list (1..N) of policy decisions (aka rules)
   * </pre>
   *
   * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
   * @return A list containing the decisions.
   */
  public com.google.protobuf.ProtocolStringList
      getDecisionsList() {
    return decisions_;
  }
  /**
   * <pre>
   * list (1..N) of policy decisions (aka rules)
   * </pre>
   *
   * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
   * @return The count of decisions.
   */
  public int getDecisionsCount() {
    return decisions_.size();
  }
  /**
   * <pre>
   * list (1..N) of policy decisions (aka rules)
   * </pre>
   *
   * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
   * @param index The index of the element to return.
   * @return The decisions at the given index.
   */
  public java.lang.String getDecisions(int index) {
    return decisions_.get(index);
  }
  /**
   * <pre>
   * list (1..N) of policy decisions (aka rules)
   * </pre>
   *
   * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the decisions at the given index.
   */
  public com.google.protobuf.ByteString
      getDecisionsBytes(int index) {
    return decisions_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    for (int i = 0; i < decisions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, decisions_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(path_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < decisions_.size(); i++) {
        dataSize += computeStringSizeNoTag(decisions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDecisionsList().size();
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
    if (!(obj instanceof com.aserto.authorizer.v2.api.PolicyContext)) {
      return super.equals(obj);
    }
    com.aserto.authorizer.v2.api.PolicyContext other = (com.aserto.authorizer.v2.api.PolicyContext) obj;

    if (!getPath()
        .equals(other.getPath())) return false;
    if (!getDecisionsList()
        .equals(other.getDecisionsList())) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    if (getDecisionsCount() > 0) {
      hash = (37 * hash) + DECISIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDecisionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.api.PolicyContext parseFrom(
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
  public static Builder newBuilder(com.aserto.authorizer.v2.api.PolicyContext prototype) {
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
   * Protobuf type {@code aserto.authorizer.v2.api.PolicyContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.authorizer.v2.api.PolicyContext)
      com.aserto.authorizer.v2.api.PolicyContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.authorizer.v2.api.PolicyContextProto.internal_static_aserto_authorizer_v2_api_PolicyContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.authorizer.v2.api.PolicyContextProto.internal_static_aserto_authorizer_v2_api_PolicyContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.authorizer.v2.api.PolicyContext.class, com.aserto.authorizer.v2.api.PolicyContext.Builder.class);
    }

    // Construct using com.aserto.authorizer.v2.api.PolicyContext.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      path_ = "";
      decisions_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.authorizer.v2.api.PolicyContextProto.internal_static_aserto_authorizer_v2_api_PolicyContext_descriptor;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.api.PolicyContext getDefaultInstanceForType() {
      return com.aserto.authorizer.v2.api.PolicyContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.api.PolicyContext build() {
      com.aserto.authorizer.v2.api.PolicyContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.api.PolicyContext buildPartial() {
      com.aserto.authorizer.v2.api.PolicyContext result = new com.aserto.authorizer.v2.api.PolicyContext(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.authorizer.v2.api.PolicyContext result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.path_ = path_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        decisions_.makeImmutable();
        result.decisions_ = decisions_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aserto.authorizer.v2.api.PolicyContext) {
        return mergeFrom((com.aserto.authorizer.v2.api.PolicyContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.authorizer.v2.api.PolicyContext other) {
      if (other == com.aserto.authorizer.v2.api.PolicyContext.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.decisions_.isEmpty()) {
        if (decisions_.isEmpty()) {
          decisions_ = other.decisions_;
          bitField0_ |= 0x00000002;
        } else {
          ensureDecisionsIsMutable();
          decisions_.addAll(other.decisions_);
        }
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
              path_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureDecisionsIsMutable();
              decisions_.add(s);
              break;
            } // case 18
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

    private java.lang.Object path_ = "";
    /**
     * <pre>
     * policy path aka package name
     * </pre>
     *
     * <code>string path = 1 [json_name = "path"];</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * policy path aka package name
     * </pre>
     *
     * <code>string path = 1 [json_name = "path"];</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * policy path aka package name
     * </pre>
     *
     * <code>string path = 1 [json_name = "path"];</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * policy path aka package name
     * </pre>
     *
     * <code>string path = 1 [json_name = "path"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      path_ = getDefaultInstance().getPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * policy path aka package name
     * </pre>
     *
     * <code>string path = 1 [json_name = "path"];</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      path_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList decisions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDecisionsIsMutable() {
      if (!decisions_.isModifiable()) {
        decisions_ = new com.google.protobuf.LazyStringArrayList(decisions_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * list (1..N) of policy decisions (aka rules)
     * </pre>
     *
     * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
     * @return A list containing the decisions.
     */
    public com.google.protobuf.ProtocolStringList
        getDecisionsList() {
      decisions_.makeImmutable();
      return decisions_;
    }
    /**
     * <pre>
     * list (1..N) of policy decisions (aka rules)
     * </pre>
     *
     * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
     * @return The count of decisions.
     */
    public int getDecisionsCount() {
      return decisions_.size();
    }
    /**
     * <pre>
     * list (1..N) of policy decisions (aka rules)
     * </pre>
     *
     * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
     * @param index The index of the element to return.
     * @return The decisions at the given index.
     */
    public java.lang.String getDecisions(int index) {
      return decisions_.get(index);
    }
    /**
     * <pre>
     * list (1..N) of policy decisions (aka rules)
     * </pre>
     *
     * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the decisions at the given index.
     */
    public com.google.protobuf.ByteString
        getDecisionsBytes(int index) {
      return decisions_.getByteString(index);
    }
    /**
     * <pre>
     * list (1..N) of policy decisions (aka rules)
     * </pre>
     *
     * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
     * @param index The index to set the value at.
     * @param value The decisions to set.
     * @return This builder for chaining.
     */
    public Builder setDecisions(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDecisionsIsMutable();
      decisions_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list (1..N) of policy decisions (aka rules)
     * </pre>
     *
     * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
     * @param value The decisions to add.
     * @return This builder for chaining.
     */
    public Builder addDecisions(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDecisionsIsMutable();
      decisions_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list (1..N) of policy decisions (aka rules)
     * </pre>
     *
     * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
     * @param values The decisions to add.
     * @return This builder for chaining.
     */
    public Builder addAllDecisions(
        java.lang.Iterable<java.lang.String> values) {
      ensureDecisionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, decisions_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list (1..N) of policy decisions (aka rules)
     * </pre>
     *
     * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDecisions() {
      decisions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list (1..N) of policy decisions (aka rules)
     * </pre>
     *
     * <code>repeated string decisions = 2 [json_name = "decisions"];</code>
     * @param value The bytes of the decisions to add.
     * @return This builder for chaining.
     */
    public Builder addDecisionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDecisionsIsMutable();
      decisions_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:aserto.authorizer.v2.api.PolicyContext)
  }

  // @@protoc_insertion_point(class_scope:aserto.authorizer.v2.api.PolicyContext)
  private static final com.aserto.authorizer.v2.api.PolicyContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.authorizer.v2.api.PolicyContext();
  }

  public static com.aserto.authorizer.v2.api.PolicyContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyContext>
      PARSER = new com.google.protobuf.AbstractParser<PolicyContext>() {
    @java.lang.Override
    public PolicyContext parsePartialFrom(
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

  public static com.google.protobuf.Parser<PolicyContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.authorizer.v2.api.PolicyContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
