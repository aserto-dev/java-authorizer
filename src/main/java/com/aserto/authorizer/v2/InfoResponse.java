// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

package com.aserto.authorizer.v2;

/**
 * Protobuf type {@code aserto.authorizer.v2.InfoResponse}
 */
public final class InfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aserto.authorizer.v2.InfoResponse)
    InfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InfoResponse.newBuilder() to construct.
  private InfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InfoResponse() {
    version_ = "";
    commit_ = "";
    date_ = "";
    os_ = "";
    arch_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InfoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_InfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_InfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.aserto.authorizer.v2.InfoResponse.class, com.aserto.authorizer.v2.InfoResponse.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   * <code>string version = 1 [json_name = "version"];</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <code>string version = 1 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMIT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object commit_ = "";
  /**
   * <code>string commit = 2 [json_name = "commit"];</code>
   * @return The commit.
   */
  @java.lang.Override
  public java.lang.String getCommit() {
    java.lang.Object ref = commit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      commit_ = s;
      return s;
    }
  }
  /**
   * <code>string commit = 2 [json_name = "commit"];</code>
   * @return The bytes for commit.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommitBytes() {
    java.lang.Object ref = commit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      commit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object date_ = "";
  /**
   * <code>string date = 3 [json_name = "date"];</code>
   * @return The date.
   */
  @java.lang.Override
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 3 [json_name = "date"];</code>
   * @return The bytes for date.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object os_ = "";
  /**
   * <code>string os = 4 [json_name = "os"];</code>
   * @return The os.
   */
  @java.lang.Override
  public java.lang.String getOs() {
    java.lang.Object ref = os_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      os_ = s;
      return s;
    }
  }
  /**
   * <code>string os = 4 [json_name = "os"];</code>
   * @return The bytes for os.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOsBytes() {
    java.lang.Object ref = os_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      os_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARCH_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object arch_ = "";
  /**
   * <code>string arch = 5 [json_name = "arch"];</code>
   * @return The arch.
   */
  @java.lang.Override
  public java.lang.String getArch() {
    java.lang.Object ref = arch_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arch_ = s;
      return s;
    }
  }
  /**
   * <code>string arch = 5 [json_name = "arch"];</code>
   * @return The bytes for arch.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArchBytes() {
    java.lang.Object ref = arch_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      arch_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commit_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, commit_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, date_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(os_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, os_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(arch_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, arch_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(commit_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, commit_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(date_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, date_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(os_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, os_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(arch_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, arch_);
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
    if (!(obj instanceof com.aserto.authorizer.v2.InfoResponse)) {
      return super.equals(obj);
    }
    com.aserto.authorizer.v2.InfoResponse other = (com.aserto.authorizer.v2.InfoResponse) obj;

    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (!getCommit()
        .equals(other.getCommit())) return false;
    if (!getDate()
        .equals(other.getDate())) return false;
    if (!getOs()
        .equals(other.getOs())) return false;
    if (!getArch()
        .equals(other.getArch())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + COMMIT_FIELD_NUMBER;
    hash = (53 * hash) + getCommit().hashCode();
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (37 * hash) + OS_FIELD_NUMBER;
    hash = (53 * hash) + getOs().hashCode();
    hash = (37 * hash) + ARCH_FIELD_NUMBER;
    hash = (53 * hash) + getArch().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.aserto.authorizer.v2.InfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.InfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.InfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.InfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.InfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.aserto.authorizer.v2.InfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.InfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.InfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.aserto.authorizer.v2.InfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.aserto.authorizer.v2.InfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.aserto.authorizer.v2.InfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.aserto.authorizer.v2.InfoResponse parseFrom(
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
  public static Builder newBuilder(com.aserto.authorizer.v2.InfoResponse prototype) {
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
   * Protobuf type {@code aserto.authorizer.v2.InfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aserto.authorizer.v2.InfoResponse)
      com.aserto.authorizer.v2.InfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_InfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_InfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.aserto.authorizer.v2.InfoResponse.class, com.aserto.authorizer.v2.InfoResponse.Builder.class);
    }

    // Construct using com.aserto.authorizer.v2.InfoResponse.newBuilder()
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
      version_ = "";
      commit_ = "";
      date_ = "";
      os_ = "";
      arch_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.aserto.authorizer.v2.AuthorizerProto.internal_static_aserto_authorizer_v2_InfoResponse_descriptor;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.InfoResponse getDefaultInstanceForType() {
      return com.aserto.authorizer.v2.InfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.InfoResponse build() {
      com.aserto.authorizer.v2.InfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.aserto.authorizer.v2.InfoResponse buildPartial() {
      com.aserto.authorizer.v2.InfoResponse result = new com.aserto.authorizer.v2.InfoResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.aserto.authorizer.v2.InfoResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.commit_ = commit_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.date_ = date_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.os_ = os_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.arch_ = arch_;
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
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.aserto.authorizer.v2.InfoResponse) {
        return mergeFrom((com.aserto.authorizer.v2.InfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.aserto.authorizer.v2.InfoResponse other) {
      if (other == com.aserto.authorizer.v2.InfoResponse.getDefaultInstance()) return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCommit().isEmpty()) {
        commit_ = other.commit_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getOs().isEmpty()) {
        os_ = other.os_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getArch().isEmpty()) {
        arch_ = other.arch_;
        bitField0_ |= 0x00000010;
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
              version_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              commit_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              date_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              os_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              arch_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object version_ = "";
    /**
     * <code>string version = 1 [json_name = "version"];</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version = 1 [json_name = "version"];</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version = 1 [json_name = "version"];</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string version = 1 [json_name = "version"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string version = 1 [json_name = "version"];</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object commit_ = "";
    /**
     * <code>string commit = 2 [json_name = "commit"];</code>
     * @return The commit.
     */
    public java.lang.String getCommit() {
      java.lang.Object ref = commit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        commit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string commit = 2 [json_name = "commit"];</code>
     * @return The bytes for commit.
     */
    public com.google.protobuf.ByteString
        getCommitBytes() {
      java.lang.Object ref = commit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        commit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string commit = 2 [json_name = "commit"];</code>
     * @param value The commit to set.
     * @return This builder for chaining.
     */
    public Builder setCommit(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      commit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string commit = 2 [json_name = "commit"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCommit() {
      commit_ = getDefaultInstance().getCommit();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string commit = 2 [json_name = "commit"];</code>
     * @param value The bytes for commit to set.
     * @return This builder for chaining.
     */
    public Builder setCommitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      commit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 3 [json_name = "date"];</code>
     * @return The date.
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 3 [json_name = "date"];</code>
     * @return The bytes for date.
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 3 [json_name = "date"];</code>
     * @param value The date to set.
     * @return This builder for chaining.
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      date_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 3 [json_name = "date"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDate() {
      date_ = getDefaultInstance().getDate();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string date = 3 [json_name = "date"];</code>
     * @param value The bytes for date to set.
     * @return This builder for chaining.
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      date_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object os_ = "";
    /**
     * <code>string os = 4 [json_name = "os"];</code>
     * @return The os.
     */
    public java.lang.String getOs() {
      java.lang.Object ref = os_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        os_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string os = 4 [json_name = "os"];</code>
     * @return The bytes for os.
     */
    public com.google.protobuf.ByteString
        getOsBytes() {
      java.lang.Object ref = os_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        os_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string os = 4 [json_name = "os"];</code>
     * @param value The os to set.
     * @return This builder for chaining.
     */
    public Builder setOs(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      os_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string os = 4 [json_name = "os"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOs() {
      os_ = getDefaultInstance().getOs();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string os = 4 [json_name = "os"];</code>
     * @param value The bytes for os to set.
     * @return This builder for chaining.
     */
    public Builder setOsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      os_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object arch_ = "";
    /**
     * <code>string arch = 5 [json_name = "arch"];</code>
     * @return The arch.
     */
    public java.lang.String getArch() {
      java.lang.Object ref = arch_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arch_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string arch = 5 [json_name = "arch"];</code>
     * @return The bytes for arch.
     */
    public com.google.protobuf.ByteString
        getArchBytes() {
      java.lang.Object ref = arch_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        arch_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string arch = 5 [json_name = "arch"];</code>
     * @param value The arch to set.
     * @return This builder for chaining.
     */
    public Builder setArch(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      arch_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string arch = 5 [json_name = "arch"];</code>
     * @return This builder for chaining.
     */
    public Builder clearArch() {
      arch_ = getDefaultInstance().getArch();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string arch = 5 [json_name = "arch"];</code>
     * @param value The bytes for arch to set.
     * @return This builder for chaining.
     */
    public Builder setArchBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      arch_ = value;
      bitField0_ |= 0x00000010;
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


    // @@protoc_insertion_point(builder_scope:aserto.authorizer.v2.InfoResponse)
  }

  // @@protoc_insertion_point(class_scope:aserto.authorizer.v2.InfoResponse)
  private static final com.aserto.authorizer.v2.InfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.aserto.authorizer.v2.InfoResponse();
  }

  public static com.aserto.authorizer.v2.InfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<InfoResponse>() {
    @java.lang.Override
    public InfoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<InfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.aserto.authorizer.v2.InfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

