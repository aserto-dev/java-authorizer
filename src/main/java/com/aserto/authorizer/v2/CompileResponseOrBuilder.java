// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.authorizer.v2;

public interface CompileResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.CompileResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Struct result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.google.protobuf.Struct result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.google.protobuf.Struct getResult();
  /**
   * <code>.google.protobuf.Struct result = 1 [json_name = "result"];</code>
   */
  com.google.protobuf.StructOrBuilder getResultOrBuilder();

  /**
   * <code>.google.protobuf.Struct metrics = 2 [json_name = "metrics"];</code>
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();
  /**
   * <code>.google.protobuf.Struct metrics = 2 [json_name = "metrics"];</code>
   * @return The metrics.
   */
  com.google.protobuf.Struct getMetrics();
  /**
   * <code>.google.protobuf.Struct metrics = 2 [json_name = "metrics"];</code>
   */
  com.google.protobuf.StructOrBuilder getMetricsOrBuilder();

  /**
   * <code>repeated .google.protobuf.Struct trace = 3 [json_name = "trace"];</code>
   */
  java.util.List<com.google.protobuf.Struct> 
      getTraceList();
  /**
   * <code>repeated .google.protobuf.Struct trace = 3 [json_name = "trace"];</code>
   */
  com.google.protobuf.Struct getTrace(int index);
  /**
   * <code>repeated .google.protobuf.Struct trace = 3 [json_name = "trace"];</code>
   */
  int getTraceCount();
  /**
   * <code>repeated .google.protobuf.Struct trace = 3 [json_name = "trace"];</code>
   */
  java.util.List<? extends com.google.protobuf.StructOrBuilder> 
      getTraceOrBuilderList();
  /**
   * <code>repeated .google.protobuf.Struct trace = 3 [json_name = "trace"];</code>
   */
  com.google.protobuf.StructOrBuilder getTraceOrBuilder(
      int index);

  /**
   * <code>repeated string trace_summary = 4 [json_name = "traceSummary"];</code>
   * @return A list containing the traceSummary.
   */
  java.util.List<java.lang.String>
      getTraceSummaryList();
  /**
   * <code>repeated string trace_summary = 4 [json_name = "traceSummary"];</code>
   * @return The count of traceSummary.
   */
  int getTraceSummaryCount();
  /**
   * <code>repeated string trace_summary = 4 [json_name = "traceSummary"];</code>
   * @param index The index of the element to return.
   * @return The traceSummary at the given index.
   */
  java.lang.String getTraceSummary(int index);
  /**
   * <code>repeated string trace_summary = 4 [json_name = "traceSummary"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the traceSummary at the given index.
   */
  com.google.protobuf.ByteString
      getTraceSummaryBytes(int index);
}
