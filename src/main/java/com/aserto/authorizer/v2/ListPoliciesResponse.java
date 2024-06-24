// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.authorizer.v2;

/**
 * Protobuf type {@code aserto.authorizer.v2.ListPoliciesResponse}
 */
public final class ListPoliciesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.authorizer.v2.ListPoliciesResponse)
    ListPoliciesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPoliciesResponse.newBuilder() to construct.
  private ListPoliciesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPoliciesResponse() {
    result_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPoliciesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_ListPoliciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_ListPoliciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.authorizer.v2.ListPoliciesResponse.class, com.aserto.authorizer.v2.ListPoliciesResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aserto.authorizer.v2.api.Module> result_;
  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aserto.authorizer.v2.api.Module> getResultList() {
    return result_;
  }
  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aserto.authorizer.v2.api.ModuleOrBuilder> 
      getResultOrBuilderList() {
    return result_;
  }
  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  @java.lang.Override
  public int getResultCount() {
    return result_.size();
  }
  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  @java.lang.Override
  public com.aserto.authorizer.v2.api.Module getResult(int index) {
    return result_.get(index);
  }
  /**
   * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
   */
  @java.lang.Override
  public com.aserto.authorizer.v2.api.ModuleOrBuilder getResultOrBuilder(
      int index) {
    return result_.get(index);
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
    for (int i = 0; i < result_.size(); i++) {
      output.writeMessage(1, result_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < result_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, result_.get(i));
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
    if (!(obj instanceof com.aserto.authorizer.v2.ListPoliciesResponse)) {
      return super.equals(obj);
    }
    com.aserto.authorizer.v2.ListPoliciesResponse other = (com.aserto.authorizer.v2.ListPoliciesResponse) obj;

    if (!getResultList()
        .equals(other.getResultList())) return false;
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
    if (getResultCount() > 0) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResultList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.authorizer.v2.ListPoliciesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.authorizer.v2.ListPoliciesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.ListPoliciesResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.authorizer.v2.ListPoliciesResponse prototype) {
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
   * Protobuf type {@code aserto.authorizer.v2.ListPoliciesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.authorizer.v2.ListPoliciesResponse)
      com.aserto.authorizer.v2.ListPoliciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_ListPoliciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_ListPoliciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.authorizer.v2.ListPoliciesResponse.class, com.aserto.authorizer.v2.ListPoliciesResponse.Builder.class);
    }

    // Construct using com.aserto.authorizer.v2.ListPoliciesResponse.newBuilder()
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
      if (resultBuilder_ == null) {
        result_ = java.util.Collections.emptyList();
      } else {
        result_ = null;
        resultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_ListPoliciesResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.ListPoliciesResponse getDefaultInstanceForType() {
      return com.aserto.authorizer.v2.ListPoliciesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.ListPoliciesResponse build() {
      com.aserto.authorizer.v2.ListPoliciesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.ListPoliciesResponse buildPartial() {
      com.aserto.authorizer.v2.ListPoliciesResponse result = new com.aserto.authorizer.v2.ListPoliciesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aserto.authorizer.v2.ListPoliciesResponse result) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          result_ = java.util.Collections.unmodifiableList(result_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
    }

    private void buildPartial0(com.aserto.authorizer.v2.ListPoliciesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.aserto.authorizer.v2.ListPoliciesResponse) {
        return mergeFrom((com.aserto.authorizer.v2.ListPoliciesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.authorizer.v2.ListPoliciesResponse other) {
      if (other == com.aserto.authorizer.v2.ListPoliciesResponse.getDefaultInstance()) return this;
      if (resultBuilder_ == null) {
        if (!other.result_.isEmpty()) {
          if (result_.isEmpty()) {
            result_ = other.result_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultIsMutable();
            result_.addAll(other.result_);
          }
          onChanged();
        }
      } else {
        if (!other.result_.isEmpty()) {
          if (resultBuilder_.isEmpty()) {
            resultBuilder_.dispose();
            resultBuilder_ = null;
            result_ = other.result_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultFieldBuilder() : null;
          } else {
            resultBuilder_.addAllMessages(other.result_);
          }
        }
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
              com.aserto.authorizer.v2.api.Module m =
                  input.readMessage(
                      com.aserto.authorizer.v2.api.Module.parser(),
                      extensionRegistry);
              if (resultBuilder_ == null) {
                ensureResultIsMutable();
                result_.add(m);
              } else {
                resultBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.aserto.authorizer.v2.api.Module> result_ =
      java.util.Collections.emptyList();
    private void ensureResultIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        result_ = new java.util.ArrayList<com.aserto.authorizer.v2.api.Module>(result_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.authorizer.v2.api.Module, com.aserto.authorizer.v2.api.Module.Builder, com.aserto.authorizer.v2.api.ModuleOrBuilder> resultBuilder_;

    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public java.util.List<com.aserto.authorizer.v2.api.Module> getResultList() {
      if (resultBuilder_ == null) {
        return java.util.Collections.unmodifiableList(result_);
      } else {
        return resultBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public int getResultCount() {
      if (resultBuilder_ == null) {
        return result_.size();
      } else {
        return resultBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public com.aserto.authorizer.v2.api.Module getResult(int index) {
      if (resultBuilder_ == null) {
        return result_.get(index);
      } else {
        return resultBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(
        int index, com.aserto.authorizer.v2.api.Module value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.set(index, value);
        onChanged();
      } else {
        resultBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public Builder setResult(
        int index, com.aserto.authorizer.v2.api.Module.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public Builder addResult(com.aserto.authorizer.v2.api.Module value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.add(value);
        onChanged();
      } else {
        resultBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public Builder addResult(
        int index, com.aserto.authorizer.v2.api.Module value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.add(index, value);
        onChanged();
      } else {
        resultBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public Builder addResult(
        com.aserto.authorizer.v2.api.Module.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.add(builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public Builder addResult(
        int index, com.aserto.authorizer.v2.api.Module.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public Builder addAllResult(
        java.lang.Iterable<? extends com.aserto.authorizer.v2.api.Module> values) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, result_);
        onChanged();
      } else {
        resultBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public Builder removeResult(int index) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.remove(index);
        onChanged();
      } else {
        resultBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public com.aserto.authorizer.v2.api.Module.Builder getResultBuilder(
        int index) {
      return getResultFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public com.aserto.authorizer.v2.api.ModuleOrBuilder getResultOrBuilder(
        int index) {
      if (resultBuilder_ == null) {
        return result_.get(index);  } else {
        return resultBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public java.util.List<? extends com.aserto.authorizer.v2.api.ModuleOrBuilder> 
         getResultOrBuilderList() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(result_);
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public com.aserto.authorizer.v2.api.Module.Builder addResultBuilder() {
      return getResultFieldBuilder().addBuilder(
          com.aserto.authorizer.v2.api.Module.getDefaultInstance());
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public com.aserto.authorizer.v2.api.Module.Builder addResultBuilder(
        int index) {
      return getResultFieldBuilder().addBuilder(
          index, com.aserto.authorizer.v2.api.Module.getDefaultInstance());
    }
    /**
     * <code>repeated .aserto.authorizer.v2.api.Module result = 1 [json_name = "result"];</code>
     */
    public java.util.List<com.aserto.authorizer.v2.api.Module.Builder> 
         getResultBuilderList() {
      return getResultFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.authorizer.v2.api.Module, com.aserto.authorizer.v2.api.Module.Builder, com.aserto.authorizer.v2.api.ModuleOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aserto.authorizer.v2.api.Module, com.aserto.authorizer.v2.api.Module.Builder, com.aserto.authorizer.v2.api.ModuleOrBuilder>(
                result_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.authorizer.v2.ListPoliciesResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.authorizer.v2.ListPoliciesResponse)
  private static final com.aserto.authorizer.v2.ListPoliciesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.authorizer.v2.ListPoliciesResponse();
  }

  public static com.aserto.authorizer.v2.ListPoliciesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPoliciesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPoliciesResponse>() {
    @java.lang.Override
    public ListPoliciesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPoliciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPoliciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.authorizer.v2.ListPoliciesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

