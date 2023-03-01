// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoc-gen-openapiv2/options/openapiv2.proto

package com.grpc.gateway.protoc_gen_openapiv2.options;

public interface OperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.gateway.protoc_gen_openapiv2.options.Operation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of tags for API documentation control. Tags can be used for logical
   * grouping of operations by resources or any other qualifier.
   * </pre>
   *
   * <code>repeated string tags = 1 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   * A list of tags for API documentation control. Tags can be used for logical
   * grouping of operations by resources or any other qualifier.
   * </pre>
   *
   * <code>repeated string tags = 1 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <pre>
   * A list of tags for API documentation control. Tags can be used for logical
   * grouping of operations by resources or any other qualifier.
   * </pre>
   *
   * <code>repeated string tags = 1 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   * A list of tags for API documentation control. Tags can be used for logical
   * grouping of operations by resources or any other qualifier.
   * </pre>
   *
   * <code>repeated string tags = 1 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <pre>
   * A short summary of what the operation does. For maximum readability in the
   * swagger-ui, this field SHOULD be less than 120 characters.
   * </pre>
   *
   * <code>string summary = 2 [json_name = "summary"];</code>
   * @return The summary.
   */
  java.lang.String getSummary();
  /**
   * <pre>
   * A short summary of what the operation does. For maximum readability in the
   * swagger-ui, this field SHOULD be less than 120 characters.
   * </pre>
   *
   * <code>string summary = 2 [json_name = "summary"];</code>
   * @return The bytes for summary.
   */
  com.google.protobuf.ByteString
      getSummaryBytes();

  /**
   * <pre>
   * A verbose explanation of the operation behavior. GFM syntax can be used for
   * rich text representation.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A verbose explanation of the operation behavior. GFM syntax can be used for
   * rich text representation.
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Additional external documentation for this operation.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentation external_docs = 4 [json_name = "externalDocs"];</code>
   * @return Whether the externalDocs field is set.
   */
  boolean hasExternalDocs();
  /**
   * <pre>
   * Additional external documentation for this operation.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentation external_docs = 4 [json_name = "externalDocs"];</code>
   * @return The externalDocs.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentation getExternalDocs();
  /**
   * <pre>
   * Additional external documentation for this operation.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentation external_docs = 4 [json_name = "externalDocs"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.ExternalDocumentationOrBuilder getExternalDocsOrBuilder();

  /**
   * <pre>
   * Unique string used to identify the operation. The id MUST be unique among
   * all operations described in the API. Tools and libraries MAY use the
   * operationId to uniquely identify an operation, therefore, it is recommended
   * to follow common programming naming conventions.
   * </pre>
   *
   * <code>string operation_id = 5 [json_name = "operationId"];</code>
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   * <pre>
   * Unique string used to identify the operation. The id MUST be unique among
   * all operations described in the API. Tools and libraries MAY use the
   * operationId to uniquely identify an operation, therefore, it is recommended
   * to follow common programming naming conventions.
   * </pre>
   *
   * <code>string operation_id = 5 [json_name = "operationId"];</code>
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <pre>
   * A list of MIME types the operation can consume. This overrides the consumes
   * definition at the OpenAPI Object. An empty value MAY be used to clear the
   * global definition. Value MUST be as described under Mime Types.
   * </pre>
   *
   * <code>repeated string consumes = 6 [json_name = "consumes"];</code>
   * @return A list containing the consumes.
   */
  java.util.List<java.lang.String>
      getConsumesList();
  /**
   * <pre>
   * A list of MIME types the operation can consume. This overrides the consumes
   * definition at the OpenAPI Object. An empty value MAY be used to clear the
   * global definition. Value MUST be as described under Mime Types.
   * </pre>
   *
   * <code>repeated string consumes = 6 [json_name = "consumes"];</code>
   * @return The count of consumes.
   */
  int getConsumesCount();
  /**
   * <pre>
   * A list of MIME types the operation can consume. This overrides the consumes
   * definition at the OpenAPI Object. An empty value MAY be used to clear the
   * global definition. Value MUST be as described under Mime Types.
   * </pre>
   *
   * <code>repeated string consumes = 6 [json_name = "consumes"];</code>
   * @param index The index of the element to return.
   * @return The consumes at the given index.
   */
  java.lang.String getConsumes(int index);
  /**
   * <pre>
   * A list of MIME types the operation can consume. This overrides the consumes
   * definition at the OpenAPI Object. An empty value MAY be used to clear the
   * global definition. Value MUST be as described under Mime Types.
   * </pre>
   *
   * <code>repeated string consumes = 6 [json_name = "consumes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the consumes at the given index.
   */
  com.google.protobuf.ByteString
      getConsumesBytes(int index);

  /**
   * <pre>
   * A list of MIME types the operation can produce. This overrides the produces
   * definition at the OpenAPI Object. An empty value MAY be used to clear the
   * global definition. Value MUST be as described under Mime Types.
   * </pre>
   *
   * <code>repeated string produces = 7 [json_name = "produces"];</code>
   * @return A list containing the produces.
   */
  java.util.List<java.lang.String>
      getProducesList();
  /**
   * <pre>
   * A list of MIME types the operation can produce. This overrides the produces
   * definition at the OpenAPI Object. An empty value MAY be used to clear the
   * global definition. Value MUST be as described under Mime Types.
   * </pre>
   *
   * <code>repeated string produces = 7 [json_name = "produces"];</code>
   * @return The count of produces.
   */
  int getProducesCount();
  /**
   * <pre>
   * A list of MIME types the operation can produce. This overrides the produces
   * definition at the OpenAPI Object. An empty value MAY be used to clear the
   * global definition. Value MUST be as described under Mime Types.
   * </pre>
   *
   * <code>repeated string produces = 7 [json_name = "produces"];</code>
   * @param index The index of the element to return.
   * @return The produces at the given index.
   */
  java.lang.String getProduces(int index);
  /**
   * <pre>
   * A list of MIME types the operation can produce. This overrides the produces
   * definition at the OpenAPI Object. An empty value MAY be used to clear the
   * global definition. Value MUST be as described under Mime Types.
   * </pre>
   *
   * <code>repeated string produces = 7 [json_name = "produces"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the produces at the given index.
   */
  com.google.protobuf.ByteString
      getProducesBytes(int index);

  /**
   * <pre>
   * The list of possible responses as they are returned from executing this
   * operation.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 9 [json_name = "responses"];</code>
   */
  int getResponsesCount();
  /**
   * <pre>
   * The list of possible responses as they are returned from executing this
   * operation.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 9 [json_name = "responses"];</code>
   */
  boolean containsResponses(
      java.lang.String key);
  /**
   * Use {@link #getResponsesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.grpc.gateway.protoc_gen_openapiv2.options.Response>
  getResponses();
  /**
   * <pre>
   * The list of possible responses as they are returned from executing this
   * operation.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 9 [json_name = "responses"];</code>
   */
  java.util.Map<java.lang.String, com.grpc.gateway.protoc_gen_openapiv2.options.Response>
  getResponsesMap();
  /**
   * <pre>
   * The list of possible responses as they are returned from executing this
   * operation.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 9 [json_name = "responses"];</code>
   */
  /* nullable */
com.grpc.gateway.protoc_gen_openapiv2.options.Response getResponsesOrDefault(
      java.lang.String key,
      /* nullable */
com.grpc.gateway.protoc_gen_openapiv2.options.Response defaultValue);
  /**
   * <pre>
   * The list of possible responses as they are returned from executing this
   * operation.
   * </pre>
   *
   * <code>map&lt;string, .grpc.gateway.protoc_gen_openapiv2.options.Response&gt; responses = 9 [json_name = "responses"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.Response getResponsesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The transfer protocol for the operation. Values MUST be from the list:
   * "http", "https", "ws", "wss". The value overrides the OpenAPI Object
   * schemes definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 10 [json_name = "schemes"];</code>
   * @return A list containing the schemes.
   */
  java.util.List<com.grpc.gateway.protoc_gen_openapiv2.options.Scheme> getSchemesList();
  /**
   * <pre>
   * The transfer protocol for the operation. Values MUST be from the list:
   * "http", "https", "ws", "wss". The value overrides the OpenAPI Object
   * schemes definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 10 [json_name = "schemes"];</code>
   * @return The count of schemes.
   */
  int getSchemesCount();
  /**
   * <pre>
   * The transfer protocol for the operation. Values MUST be from the list:
   * "http", "https", "ws", "wss". The value overrides the OpenAPI Object
   * schemes definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 10 [json_name = "schemes"];</code>
   * @param index The index of the element to return.
   * @return The schemes at the given index.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.Scheme getSchemes(int index);
  /**
   * <pre>
   * The transfer protocol for the operation. Values MUST be from the list:
   * "http", "https", "ws", "wss". The value overrides the OpenAPI Object
   * schemes definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 10 [json_name = "schemes"];</code>
   * @return A list containing the enum numeric values on the wire for schemes.
   */
  java.util.List<java.lang.Integer>
  getSchemesValueList();
  /**
   * <pre>
   * The transfer protocol for the operation. Values MUST be from the list:
   * "http", "https", "ws", "wss". The value overrides the OpenAPI Object
   * schemes definition.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.Scheme schemes = 10 [json_name = "schemes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of schemes at the given index.
   */
  int getSchemesValue(int index);

  /**
   * <pre>
   * Declares this operation to be deprecated. Usage of the declared operation
   * should be refrained. Default value is false.
   * </pre>
   *
   * <code>bool deprecated = 11 [json_name = "deprecated"];</code>
   * @return The deprecated.
   */
  boolean getDeprecated();

  /**
   * <pre>
   * A declaration of which security schemes are applied for this operation. The
   * list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements). This
   * definition overrides any declared top-level security. To remove a top-level
   * security declaration, an empty array can be used.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  java.util.List<com.grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement> 
      getSecurityList();
  /**
   * <pre>
   * A declaration of which security schemes are applied for this operation. The
   * list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements). This
   * definition overrides any declared top-level security. To remove a top-level
   * security declaration, an empty array can be used.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement getSecurity(int index);
  /**
   * <pre>
   * A declaration of which security schemes are applied for this operation. The
   * list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements). This
   * definition overrides any declared top-level security. To remove a top-level
   * security declaration, an empty array can be used.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  int getSecurityCount();
  /**
   * <pre>
   * A declaration of which security schemes are applied for this operation. The
   * list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements). This
   * definition overrides any declared top-level security. To remove a top-level
   * security declaration, an empty array can be used.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  java.util.List<? extends com.grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementOrBuilder> 
      getSecurityOrBuilderList();
  /**
   * <pre>
   * A declaration of which security schemes are applied for this operation. The
   * list of values describes alternative security schemes that can be used
   * (that is, there is a logical OR between the security requirements). This
   * definition overrides any declared top-level security. To remove a top-level
   * security declaration, an empty array can be used.
   * </pre>
   *
   * <code>repeated .grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirement security = 12 [json_name = "security"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.SecurityRequirementOrBuilder getSecurityOrBuilder(
      int index);

  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 13 [json_name = "extensions"];</code>
   */
  int getExtensionsCount();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 13 [json_name = "extensions"];</code>
   */
  boolean containsExtensions(
      java.lang.String key);
  /**
   * Use {@link #getExtensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensions();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 13 [json_name = "extensions"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getExtensionsMap();
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 13 [json_name = "extensions"];</code>
   */
  /* nullable */
com.google.protobuf.Value getExtensionsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <pre>
   * Custom properties that start with "x-" such as "x-foo" used to describe
   * extra functionality that is not covered by the standard OpenAPI Specification.
   * See: https://swagger.io/docs/specification/2-0/swagger-extensions/
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; extensions = 13 [json_name = "extensions"];</code>
   */
  com.google.protobuf.Value getExtensionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Custom parameters such as HTTP request headers.
   * See: https://swagger.io/docs/specification/2-0/describing-parameters/
   * and https://swagger.io/specification/v2/#parameter-object.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Parameters parameters = 14 [json_name = "parameters"];</code>
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   * <pre>
   * Custom parameters such as HTTP request headers.
   * See: https://swagger.io/docs/specification/2-0/describing-parameters/
   * and https://swagger.io/specification/v2/#parameter-object.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Parameters parameters = 14 [json_name = "parameters"];</code>
   * @return The parameters.
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.Parameters getParameters();
  /**
   * <pre>
   * Custom parameters such as HTTP request headers.
   * See: https://swagger.io/docs/specification/2-0/describing-parameters/
   * and https://swagger.io/specification/v2/#parameter-object.
   * </pre>
   *
   * <code>.grpc.gateway.protoc_gen_openapiv2.options.Parameters parameters = 14 [json_name = "parameters"];</code>
   */
  com.grpc.gateway.protoc_gen_openapiv2.options.ParametersOrBuilder getParametersOrBuilder();
}
