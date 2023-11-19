// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/api/decision_logs.proto

// Protobuf Java Version: 3.25.0
package com.aserto.authorizer.v2.api;

public interface DecisionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aserto.authorizer.v2.api.Decision)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique id, replay a decision starting with this, also useful to de-dup
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * unique id, replay a decision starting with this, also useful to de-dup
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * UTC time when the decision was made
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp"];</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * UTC time when the decision was made
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * UTC time when the decision was made
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 2 [json_name = "timestamp"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * Policy path used in decision
   * </pre>
   *
   * <code>string path = 3 [json_name = "path"];</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Policy path used in decision
   * </pre>
   *
   * <code>string path = 3 [json_name = "path"];</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * info about user for whom the decision as made
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.DecisionUser user = 4 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <pre>
   * info about user for whom the decision as made
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.DecisionUser user = 4 [json_name = "user"];</code>
   * @return The user.
   */
  com.aserto.authorizer.v2.api.DecisionUser getUser();
  /**
   * <pre>
   * info about user for whom the decision as made
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.DecisionUser user = 4 [json_name = "user"];</code>
   */
  com.aserto.authorizer.v2.api.DecisionUserOrBuilder getUserOrBuilder();

  /**
   * <pre>
   * info about policy used for the decision    
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.DecisionPolicy policy = 5 [json_name = "policy"];</code>
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   * <pre>
   * info about policy used for the decision    
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.DecisionPolicy policy = 5 [json_name = "policy"];</code>
   * @return The policy.
   */
  com.aserto.authorizer.v2.api.DecisionPolicy getPolicy();
  /**
   * <pre>
   * info about policy used for the decision    
   * </pre>
   *
   * <code>.aserto.authorizer.v2.api.DecisionPolicy policy = 5 [json_name = "policy"];</code>
   */
  com.aserto.authorizer.v2.api.DecisionPolicyOrBuilder getPolicyOrBuilder();

  /**
   * <pre>
   * outcome of the decisions specified in the policy context
   * </pre>
   *
   * <code>map&lt;string, bool&gt; outcomes = 6 [json_name = "outcomes"];</code>
   */
  int getOutcomesCount();
  /**
   * <pre>
   * outcome of the decisions specified in the policy context
   * </pre>
   *
   * <code>map&lt;string, bool&gt; outcomes = 6 [json_name = "outcomes"];</code>
   */
  boolean containsOutcomes(
      java.lang.String key);
  /**
   * Use {@link #getOutcomesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Boolean>
  getOutcomes();
  /**
   * <pre>
   * outcome of the decisions specified in the policy context
   * </pre>
   *
   * <code>map&lt;string, bool&gt; outcomes = 6 [json_name = "outcomes"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Boolean>
  getOutcomesMap();
  /**
   * <pre>
   * outcome of the decisions specified in the policy context
   * </pre>
   *
   * <code>map&lt;string, bool&gt; outcomes = 6 [json_name = "outcomes"];</code>
   */
  boolean getOutcomesOrDefault(
      java.lang.String key,
      boolean defaultValue);
  /**
   * <pre>
   * outcome of the decisions specified in the policy context
   * </pre>
   *
   * <code>map&lt;string, bool&gt; outcomes = 6 [json_name = "outcomes"];</code>
   */
  boolean getOutcomesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * the resource context used in a decision
   * </pre>
   *
   * <code>.google.protobuf.Struct resource = 7 [json_name = "resource"];</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <pre>
   * the resource context used in a decision
   * </pre>
   *
   * <code>.google.protobuf.Struct resource = 7 [json_name = "resource"];</code>
   * @return The resource.
   */
  com.google.protobuf.Struct getResource();
  /**
   * <pre>
   * the resource context used in a decision
   * </pre>
   *
   * <code>.google.protobuf.Struct resource = 7 [json_name = "resource"];</code>
   */
  com.google.protobuf.StructOrBuilder getResourceOrBuilder();

  /**
   * <pre>
   * annotations that may be added to a decision    
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8 [json_name = "annotations"];</code>
   */
  int getAnnotationsCount();
  /**
   * <pre>
   * annotations that may be added to a decision    
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8 [json_name = "annotations"];</code>
   */
  boolean containsAnnotations(
      java.lang.String key);
  /**
   * Use {@link #getAnnotationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotations();
  /**
   * <pre>
   * annotations that may be added to a decision    
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8 [json_name = "annotations"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAnnotationsMap();
  /**
   * <pre>
   * annotations that may be added to a decision    
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8 [json_name = "annotations"];</code>
   */
  /* nullable */
java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * annotations that may be added to a decision    
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 8 [json_name = "annotations"];</code>
   */
  java.lang.String getAnnotationsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * id of the tenant that generated the decision
   * </pre>
   *
   * <code>optional string tenant_id = 9 [json_name = "tenantId"];</code>
   * @return Whether the tenantId field is set.
   */
  boolean hasTenantId();
  /**
   * <pre>
   * id of the tenant that generated the decision
   * </pre>
   *
   * <code>optional string tenant_id = 9 [json_name = "tenantId"];</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <pre>
   * id of the tenant that generated the decision
   * </pre>
   *
   * <code>optional string tenant_id = 9 [json_name = "tenantId"];</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();
}
