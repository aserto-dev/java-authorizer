// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: aserto/authorizer/v2/authorizer.proto
// Protobuf Java Version: 4.27.1

package com.aserto.authorizer.v2;

/**
 * Protobuf enum {@code aserto.authorizer.v2.PathSeparator}
 */
public enum PathSeparator
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Value not set.
   * </pre>
   *
   * <code>PATH_SEPARATOR_UNKNOWN = 0;</code>
   */
  PATH_SEPARATOR_UNKNOWN(0),
  /**
   * <pre>
   * Dot "." path separator
   * </pre>
   *
   * <code>PATH_SEPARATOR_DOT = 1;</code>
   */
  PATH_SEPARATOR_DOT(1),
  /**
   * <pre>
   * Slash "/" path separtor
   * </pre>
   *
   * <code>PATH_SEPARATOR_SLASH = 2;</code>
   */
  PATH_SEPARATOR_SLASH(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 1,
      /* suffix= */ "",
      PathSeparator.class.getName());
  }
  /**
   * <pre>
   * Value not set.
   * </pre>
   *
   * <code>PATH_SEPARATOR_UNKNOWN = 0;</code>
   */
  public static final int PATH_SEPARATOR_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * Dot "." path separator
   * </pre>
   *
   * <code>PATH_SEPARATOR_DOT = 1;</code>
   */
  public static final int PATH_SEPARATOR_DOT_VALUE = 1;
  /**
   * <pre>
   * Slash "/" path separtor
   * </pre>
   *
   * <code>PATH_SEPARATOR_SLASH = 2;</code>
   */
  public static final int PATH_SEPARATOR_SLASH_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PathSeparator valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PathSeparator forNumber(int value) {
    switch (value) {
      case 0: return PATH_SEPARATOR_UNKNOWN;
      case 1: return PATH_SEPARATOR_DOT;
      case 2: return PATH_SEPARATOR_SLASH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PathSeparator>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PathSeparator> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PathSeparator>() {
          public PathSeparator findValueByNumber(int number) {
            return PathSeparator.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.aserto.authorizer.v2.AuthorizerProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final PathSeparator[] VALUES = values();

  public static PathSeparator valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PathSeparator(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aserto.authorizer.v2.PathSeparator)
}

