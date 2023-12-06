// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

// Protobuf Java Version: 3.25.1
package com.aserto.authorizer.v2;

/**
 * Protobuf enum {@code aserto.authorizer.v2.TraceLevel}
 */
public enum TraceLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Value not set.
   * </pre>
   *
   * <code>TRACE_LEVEL_UNKNOWN = 0;</code>
   */
  TRACE_LEVEL_UNKNOWN(0),
  /**
   * <pre>
   * ExplainOffV1   ExplainModeV1 = "off"
   * </pre>
   *
   * <code>TRACE_LEVEL_OFF = 1;</code>
   */
  TRACE_LEVEL_OFF(1),
  /**
   * <pre>
   * ExplainFullV1  ExplainModeV1 = "full"
   * </pre>
   *
   * <code>TRACE_LEVEL_FULL = 2;</code>
   */
  TRACE_LEVEL_FULL(2),
  /**
   * <pre>
   * ExplainNotesV1 ExplainModeV1 = "notes"
   * </pre>
   *
   * <code>TRACE_LEVEL_NOTES = 3;</code>
   */
  TRACE_LEVEL_NOTES(3),
  /**
   * <pre>
   * ExplainFailsV1 ExplainModeV1 = "fails"
   * </pre>
   *
   * <code>TRACE_LEVEL_FAILS = 4;</code>
   */
  TRACE_LEVEL_FAILS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Value not set.
   * </pre>
   *
   * <code>TRACE_LEVEL_UNKNOWN = 0;</code>
   */
  public static final int TRACE_LEVEL_UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * ExplainOffV1   ExplainModeV1 = "off"
   * </pre>
   *
   * <code>TRACE_LEVEL_OFF = 1;</code>
   */
  public static final int TRACE_LEVEL_OFF_VALUE = 1;
  /**
   * <pre>
   * ExplainFullV1  ExplainModeV1 = "full"
   * </pre>
   *
   * <code>TRACE_LEVEL_FULL = 2;</code>
   */
  public static final int TRACE_LEVEL_FULL_VALUE = 2;
  /**
   * <pre>
   * ExplainNotesV1 ExplainModeV1 = "notes"
   * </pre>
   *
   * <code>TRACE_LEVEL_NOTES = 3;</code>
   */
  public static final int TRACE_LEVEL_NOTES_VALUE = 3;
  /**
   * <pre>
   * ExplainFailsV1 ExplainModeV1 = "fails"
   * </pre>
   *
   * <code>TRACE_LEVEL_FAILS = 4;</code>
   */
  public static final int TRACE_LEVEL_FAILS_VALUE = 4;


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
  public static TraceLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TraceLevel forNumber(int value) {
    switch (value) {
      case 0: return TRACE_LEVEL_UNKNOWN;
      case 1: return TRACE_LEVEL_OFF;
      case 2: return TRACE_LEVEL_FULL;
      case 3: return TRACE_LEVEL_NOTES;
      case 4: return TRACE_LEVEL_FAILS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TraceLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TraceLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TraceLevel>() {
          public TraceLevel findValueByNumber(int number) {
            return TraceLevel.forNumber(number);
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
    return com.aserto.authorizer.v2.AuthorizerProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final TraceLevel[] VALUES = values();

  public static TraceLevel valueOf(
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

  private TraceLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:aserto.authorizer.v2.TraceLevel)
}

