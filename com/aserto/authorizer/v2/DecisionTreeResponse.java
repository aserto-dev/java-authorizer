// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

package com.aserto.authorizer.v2;

/**
 * Protobuf type {@code aserto.authorizer.v2.DecisionTreeResponse}
 */
public final class DecisionTreeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.authorizer.v2.DecisionTreeResponse)
    DecisionTreeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DecisionTreeResponse.newBuilder() to construct.
  private DecisionTreeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DecisionTreeResponse() {
    pathRoot_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DecisionTreeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_DecisionTreeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_DecisionTreeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.authorizer.v2.DecisionTreeResponse.class, com.aserto.authorizer.v2.DecisionTreeResponse.Builder.class);
  }

  public static final int PATH_ROOT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pathRoot_ = "";
  /**
   * <code>string path_root = 1 [json_name = "pathRoot"];</code>
   * @return The pathRoot.
   */
  @java.lang.Override
  public java.lang.String getPathRoot() {
    java.lang.Object ref = pathRoot_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pathRoot_ = s;
      return s;
    }
  }
  /**
   * <code>string path_root = 1 [json_name = "pathRoot"];</code>
   * @return The bytes for pathRoot.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathRootBytes() {
    java.lang.Object ref = pathRoot_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pathRoot_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PATH_FIELD_NUMBER = 3;
  private com.google.protobuf.Struct path_;
  /**
   * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
   * @return Whether the path field is set.
   */
  @java.lang.Override
  public boolean hasPath() {
    return path_ != null;
  }
  /**
   * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
   * @return The path.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getPath() {
    return path_ == null ? com.google.protobuf.Struct.getDefaultInstance() : path_;
  }
  /**
   * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getPathOrBuilder() {
    return path_ == null ? com.google.protobuf.Struct.getDefaultInstance() : path_;
  }

  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.DecisionTreeResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.authorizer.v2.DecisionTreeResponse prototype) {
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
   * Protobuf type {@code aserto.authorizer.v2.DecisionTreeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.authorizer.v2.DecisionTreeResponse)
      com.aserto.authorizer.v2.DecisionTreeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_DecisionTreeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_DecisionTreeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.authorizer.v2.DecisionTreeResponse.class, com.aserto.authorizer.v2.DecisionTreeResponse.Builder.class);
    }

    // Construct using com.aserto.authorizer.v2.DecisionTreeResponse.newBuilder()
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
      pathRoot_ = "";
      path_ = null;
      if (pathBuilder_ != null) {
        pathBuilder_.dispose();
        pathBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_DecisionTreeResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.DecisionTreeResponse getDefaultInstanceForType() {
      return com.aserto.authorizer.v2.DecisionTreeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.DecisionTreeResponse build() {
      com.aserto.authorizer.v2.DecisionTreeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.DecisionTreeResponse buildPartial() {
      com.aserto.authorizer.v2.DecisionTreeResponse result = new com.aserto.authorizer.v2.DecisionTreeResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.authorizer.v2.DecisionTreeResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pathRoot_ = pathRoot_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.path_ = pathBuilder_ == null
            ? path_
            : pathBuilder_.build();
      }
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

    private java.lang.Object pathRoot_ = "";
    /**
     * <code>string path_root = 1 [json_name = "pathRoot"];</code>
     * @return The pathRoot.
     */
    public java.lang.String getPathRoot() {
      java.lang.Object ref = pathRoot_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pathRoot_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string path_root = 1 [json_name = "pathRoot"];</code>
     * @return The bytes for pathRoot.
     */
    public com.google.protobuf.ByteString
        getPathRootBytes() {
      java.lang.Object ref = pathRoot_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pathRoot_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string path_root = 1 [json_name = "pathRoot"];</code>
     * @param value The pathRoot to set.
     * @return This builder for chaining.
     */
    public Builder setPathRoot(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pathRoot_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string path_root = 1 [json_name = "pathRoot"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPathRoot() {
      pathRoot_ = getDefaultInstance().getPathRoot();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string path_root = 1 [json_name = "pathRoot"];</code>
     * @param value The bytes for pathRoot to set.
     * @return This builder for chaining.
     */
    public Builder setPathRootBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pathRoot_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct path_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> pathBuilder_;
    /**
     * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
     * @return Whether the path field is set.
     */
    public boolean hasPath() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
     * @return The path.
     */
    public com.google.protobuf.Struct getPath() {
      if (pathBuilder_ == null) {
        return path_ == null ? com.google.protobuf.Struct.getDefaultInstance() : path_;
      } else {
        return pathBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
     */
    public Builder setPath(com.google.protobuf.Struct value) {
      if (pathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        path_ = value;
      } else {
        pathBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
     */
    public Builder setPath(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (pathBuilder_ == null) {
        path_ = builderForValue.build();
      } else {
        pathBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
     */
    public Builder mergePath(com.google.protobuf.Struct value) {
      if (pathBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          path_ != null &&
          path_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getPathBuilder().mergeFrom(value);
        } else {
          path_ = value;
        }
      } else {
        pathBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
     */
    public Builder clearPath() {
      bitField0_ = (bitField0_ & ~0x00000002);
      path_ = null;
      if (pathBuilder_ != null) {
        pathBuilder_.dispose();
        pathBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
     */
    public com.google.protobuf.Struct.Builder getPathBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPathFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
     */
    public com.google.protobuf.StructOrBuilder getPathOrBuilder() {
      if (pathBuilder_ != null) {
        return pathBuilder_.getMessageOrBuilder();
      } else {
        return path_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : path_;
      }
    }
    /**
     * <code>.google.protobuf.Struct path = 3 [json_name = "path"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getPathFieldBuilder() {
      if (pathBuilder_ == null) {
        pathBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getPath(),
                getParentForChildren(),
                isClean());
        path_ = null;
      }
      return pathBuilder_;
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


    // @@protoc_insertion_point(builder_scope:aserto.authorizer.v2.DecisionTreeResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.authorizer.v2.DecisionTreeResponse)
  private static final com.aserto.authorizer.v2.DecisionTreeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.authorizer.v2.DecisionTreeResponse();
  }

  public static com.aserto.authorizer.v2.DecisionTreeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DecisionTreeResponse>
      PARSER = new com.google.protobuf.AbstractParser<DecisionTreeResponse>() {
    @java.lang.Override
    public DecisionTreeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<DecisionTreeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DecisionTreeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.authorizer.v2.DecisionTreeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

