// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/identity_context.proto

package com.aserto.authorizer.v2.api;

/**
 * <pre>
 * Identity types, describes the payload type of the identity field inside the IdentityContext message.
 * </pre>
 *
 * Protobuf enum {@code aserto.authorizer.v2.api.IdentityType}
 */
public enum IdentityType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unknown, value not set, requests will fail with identity type not set error.
   * </pre>
   *
   * <code>IDENTITY_TYPE_UNKNOWN = 0;</code>
   */
  IDENTITY_TYPE_UNKNOWN(0),
  /**
   * <pre>
   * None, no explicit identity context set, equals anonymous.
   * </pre>
   *
   * <code>IDENTITY_TYPE_NONE = 1;</code>
   */
  IDENTITY_TYPE_NONE(1),
  /**
   * <pre>
   * Sub(ject), identity field contains an oAUTH subject.
   * </pre>
   *
   * <code>IDENTITY_TYPE_SUB = 2;</code>
   */
  IDENTITY_TYPE_SUB(2),
  /**
   * <pre>
   * JWT, identity field contains a JWT access token.
   * </pre>
   *
   * <code>IDENTITY_TYPE_JWT = 3;</code>
   */
  IDENTITY_TYPE_JWT(3),
  /**
   * <pre>
   * Manual, propagates thw identity field as-is, without validation, into the input object.
   * </pre>
   *
   * <code>IDENTITY_TYPE_MANUAL = 4;</code>
   */
  IDENTITY_TYPE_MANUAL(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unknown, value not set, requests will fail with identity type not set error.
   * </pre>
   *
   * <code>IDENTITY_TYPE_UNKNOWN = 0;</code>
   */
  public static final int IDENTITY_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * None, no explicit identity context set, equals anonymous.
   * </pre>
   *
   * <code>IDENTITY_TYPE_NONE = 1;</code>
   */
  public static final int IDENTITY_TYPE_NONE_VALUE = 1;
  /**
   * <pre>
   * Sub(ject), identity field contains an oAUTH subject.
   * </pre>
   *
   * <code>IDENTITY_TYPE_SUB = 2;</code>
   */
  public static final int IDENTITY_TYPE_SUB_VALUE = 2;
  /**
   * <pre>
   * JWT, identity field contains a JWT access token.
   * </pre>
   *
   * <code>IDENTITY_TYPE_JWT = 3;</code>
   */
  public static final int IDENTITY_TYPE_JWT_VALUE = 3;
  /**
   * <pre>
   * Manual, propagates thw identity field as-is, without validation, into the input object.
   * </pre>
   *
   * <code>IDENTITY_TYPE_MANUAL = 4;</code>
   */
  public static final int IDENTITY_TYPE_MANUAL_VALUE = 4;


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
  public static IdentityType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IdentityType forNumber(int value) {
    switch (value) {
      case 0: return IDENTITY_TYPE_UNKNOWN;
      case 1: return IDENTITY_TYPE_NONE;
      case 2: return IDENTITY_TYPE_SUB;
      case 3: return IDENTITY_TYPE_JWT;
      case 4: return IDENTITY_TYPE_MANUAL;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IdentityType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IdentityType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IdentityType>() {
          public IdentityType findValueByNumber(int number) {
            return IdentityType.forNumber(number);
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
    return com.aserto.authorizer.v2.api.IdentityContextProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final IdentityType[] VALUES = values();

  public static IdentityType valueOf(
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

  private IdentityType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aserto.authorizer.v2.api.IdentityType)
}

