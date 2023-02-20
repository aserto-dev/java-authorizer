// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

package com.aserto.authorizer.v2;

/**
 * Protobuf type {@code aserto.authorizer.v2.IsResponse}
 */
public final class IsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.authorizer.v2.IsResponse)
    IsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IsResponse.newBuilder() to construct.
  private IsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IsResponse() {
    decisions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_IsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_IsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.authorizer.v2.IsResponse.class, com.aserto.authorizer.v2.IsResponse.Builder.class);
  }

  public static final int DECISIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.aserto.authorizer.v2.Decision> decisions_;
  /**
   * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.aserto.authorizer.v2.Decision> getDecisionsList() {
    return decisions_;
  }
  /**
   * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.aserto.authorizer.v2.DecisionOrBuilder> 
      getDecisionsOrBuilderList() {
    return decisions_;
  }
  /**
   * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
   */
  @java.lang.Override
  public int getDecisionsCount() {
    return decisions_.size();
  }
  /**
   * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
   */
  @java.lang.Override
  public com.aserto.authorizer.v2.Decision getDecisions(int index) {
    return decisions_.get(index);
  }
  /**
   * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
   */
  @java.lang.Override
  public com.aserto.authorizer.v2.DecisionOrBuilder getDecisionsOrBuilder(
      int index) {
    return decisions_.get(index);
  }

  public static com.aserto.authorizer.v2.IsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.IsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.IsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.IsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.IsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.IsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.IsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.IsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.IsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.IsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.IsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.IsResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.authorizer.v2.IsResponse prototype) {
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
   * Protobuf type {@code aserto.authorizer.v2.IsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.authorizer.v2.IsResponse)
      com.aserto.authorizer.v2.IsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_IsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_IsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.authorizer.v2.IsResponse.class, com.aserto.authorizer.v2.IsResponse.Builder.class);
    }

    // Construct using com.aserto.authorizer.v2.IsResponse.newBuilder()
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
      if (decisionsBuilder_ == null) {
        decisions_ = java.util.Collections.emptyList();
      } else {
        decisions_ = null;
        decisionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_IsResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.IsResponse getDefaultInstanceForType() {
      return com.aserto.authorizer.v2.IsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.IsResponse build() {
      com.aserto.authorizer.v2.IsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.IsResponse buildPartial() {
      com.aserto.authorizer.v2.IsResponse result = new com.aserto.authorizer.v2.IsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.aserto.authorizer.v2.IsResponse result) {
      if (decisionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          decisions_ = java.util.Collections.unmodifiableList(decisions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.decisions_ = decisions_;
      } else {
        result.decisions_ = decisionsBuilder_.build();
      }
    }

    private void buildPartial0(com.aserto.authorizer.v2.IsResponse result) {
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
    private int bitField0_;

    private java.util.List<com.aserto.authorizer.v2.Decision> decisions_ =
      java.util.Collections.emptyList();
    private void ensureDecisionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        decisions_ = new java.util.ArrayList<com.aserto.authorizer.v2.Decision>(decisions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.authorizer.v2.Decision, com.aserto.authorizer.v2.Decision.Builder, com.aserto.authorizer.v2.DecisionOrBuilder> decisionsBuilder_;

    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public java.util.List<com.aserto.authorizer.v2.Decision> getDecisionsList() {
      if (decisionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(decisions_);
      } else {
        return decisionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public int getDecisionsCount() {
      if (decisionsBuilder_ == null) {
        return decisions_.size();
      } else {
        return decisionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public com.aserto.authorizer.v2.Decision getDecisions(int index) {
      if (decisionsBuilder_ == null) {
        return decisions_.get(index);
      } else {
        return decisionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public Builder setDecisions(
        int index, com.aserto.authorizer.v2.Decision value) {
      if (decisionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDecisionsIsMutable();
        decisions_.set(index, value);
        onChanged();
      } else {
        decisionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public Builder setDecisions(
        int index, com.aserto.authorizer.v2.Decision.Builder builderForValue) {
      if (decisionsBuilder_ == null) {
        ensureDecisionsIsMutable();
        decisions_.set(index, builderForValue.build());
        onChanged();
      } else {
        decisionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public Builder addDecisions(com.aserto.authorizer.v2.Decision value) {
      if (decisionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDecisionsIsMutable();
        decisions_.add(value);
        onChanged();
      } else {
        decisionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public Builder addDecisions(
        int index, com.aserto.authorizer.v2.Decision value) {
      if (decisionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDecisionsIsMutable();
        decisions_.add(index, value);
        onChanged();
      } else {
        decisionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public Builder addDecisions(
        com.aserto.authorizer.v2.Decision.Builder builderForValue) {
      if (decisionsBuilder_ == null) {
        ensureDecisionsIsMutable();
        decisions_.add(builderForValue.build());
        onChanged();
      } else {
        decisionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public Builder addDecisions(
        int index, com.aserto.authorizer.v2.Decision.Builder builderForValue) {
      if (decisionsBuilder_ == null) {
        ensureDecisionsIsMutable();
        decisions_.add(index, builderForValue.build());
        onChanged();
      } else {
        decisionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public Builder addAllDecisions(
        java.lang.Iterable<? extends com.aserto.authorizer.v2.Decision> values) {
      if (decisionsBuilder_ == null) {
        ensureDecisionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, decisions_);
        onChanged();
      } else {
        decisionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public Builder clearDecisions() {
      if (decisionsBuilder_ == null) {
        decisions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        decisionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public Builder removeDecisions(int index) {
      if (decisionsBuilder_ == null) {
        ensureDecisionsIsMutable();
        decisions_.remove(index);
        onChanged();
      } else {
        decisionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public com.aserto.authorizer.v2.Decision.Builder getDecisionsBuilder(
        int index) {
      return getDecisionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public com.aserto.authorizer.v2.DecisionOrBuilder getDecisionsOrBuilder(
        int index) {
      if (decisionsBuilder_ == null) {
        return decisions_.get(index);  } else {
        return decisionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public java.util.List<? extends com.aserto.authorizer.v2.DecisionOrBuilder> 
         getDecisionsOrBuilderList() {
      if (decisionsBuilder_ != null) {
        return decisionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(decisions_);
      }
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public com.aserto.authorizer.v2.Decision.Builder addDecisionsBuilder() {
      return getDecisionsFieldBuilder().addBuilder(
          com.aserto.authorizer.v2.Decision.getDefaultInstance());
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public com.aserto.authorizer.v2.Decision.Builder addDecisionsBuilder(
        int index) {
      return getDecisionsFieldBuilder().addBuilder(
          index, com.aserto.authorizer.v2.Decision.getDefaultInstance());
    }
    /**
     * <code>repeated .aserto.authorizer.v2.Decision decisions = 1 [json_name = "decisions"];</code>
     */
    public java.util.List<com.aserto.authorizer.v2.Decision.Builder> 
         getDecisionsBuilderList() {
      return getDecisionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.aserto.authorizer.v2.Decision, com.aserto.authorizer.v2.Decision.Builder, com.aserto.authorizer.v2.DecisionOrBuilder> 
        getDecisionsFieldBuilder() {
      if (decisionsBuilder_ == null) {
        decisionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.aserto.authorizer.v2.Decision, com.aserto.authorizer.v2.Decision.Builder, com.aserto.authorizer.v2.DecisionOrBuilder>(
                decisions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        decisions_ = null;
      }
      return decisionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.authorizer.v2.IsResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.authorizer.v2.IsResponse)
  private static final com.aserto.authorizer.v2.IsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.authorizer.v2.IsResponse();
  }

  public static com.aserto.authorizer.v2.IsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IsResponse>
      PARSER = new com.google.protobuf.AbstractParser<IsResponse>() {
    @java.lang.Override
    public IsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<IsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.authorizer.v2.IsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

