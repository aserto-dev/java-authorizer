// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: aserto/authorizer/v2/authorizer.proto

// Protobuf Java Version: 3.25.3
package com.aserto.authorizer.v2;

public final class AuthorizerProto {
  private AuthorizerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_InfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_InfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_InfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_InfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_GetPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_GetPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_GetPolicyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_GetPolicyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_ListPoliciesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_ListPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_ListPoliciesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_ListPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_DecisionTreeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_DecisionTreeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_DecisionTreeOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_DecisionTreeOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_DecisionTreeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_DecisionTreeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_IsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_IsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_Decision_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_Decision_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_IsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_IsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_QueryOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_QueryOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_QueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_QueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_CompileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_CompileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_CompileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_CompileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_aserto_authorizer_v2_QueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_aserto_authorizer_v2_QueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%aserto/authorizer/v2/authorizer.proto\022" +
      "\024aserto.authorizer.v2\032\034google/api/annota" +
      "tions.proto\032.protoc-gen-openapiv2/option" +
      "s/annotations.proto\032\034google/protobuf/str" +
      "uct.proto\032 google/protobuf/field_mask.pr" +
      "oto\032/aserto/authorizer/v2/api/identity_c" +
      "ontext.proto\032-aserto/authorizer/v2/api/p" +
      "olicy_context.proto\032%aserto/authorizer/v" +
      "2/api/module.proto\032.aserto/authorizer/v2" +
      "/api/policy_instance.proto\"\r\n\013InfoReques" +
      "t\"x\n\014InfoResponse\022\030\n\007version\030\001 \001(\tR\007vers" +
      "ion\022\026\n\006commit\030\002 \001(\tR\006commit\022\022\n\004date\030\003 \001(" +
      "\tR\004date\022\016\n\002os\030\004 \001(\tR\002os\022\022\n\004arch\030\005 \001(\tR\004a" +
      "rch\"\311\001\n\020GetPolicyRequest\022\016\n\002id\030\001 \001(\tR\002id" +
      "\0229\n\nfield_mask\030\002 \001(\0132\032.google.protobuf.F" +
      "ieldMaskR\tfieldMask\022V\n\017policy_instance\030\003" +
      " \001(\0132(.aserto.authorizer.v2.api.PolicyIn" +
      "stanceH\000R\016policyInstance\210\001\001B\022\n\020_policy_i" +
      "nstance\"M\n\021GetPolicyResponse\0228\n\006result\030\001" +
      " \001(\0132 .aserto.authorizer.v2.api.ModuleR\006" +
      "result\"\274\001\n\023ListPoliciesRequest\0229\n\nfield_" +
      "mask\030\001 \001(\0132\032.google.protobuf.FieldMaskR\t" +
      "fieldMask\022V\n\017policy_instance\030\002 \001(\0132(.ase" +
      "rto.authorizer.v2.api.PolicyInstanceH\000R\016" +
      "policyInstance\210\001\001B\022\n\020_policy_instance\"P\n" +
      "\024ListPoliciesResponse\0228\n\006result\030\001 \003(\0132 ." +
      "aserto.authorizer.v2.api.ModuleR\006result\"" +
      "\260\003\n\023DecisionTreeRequest\022N\n\016policy_contex" +
      "t\030\001 \001(\0132\'.aserto.authorizer.v2.api.Polic" +
      "yContextR\rpolicyContext\022T\n\020identity_cont" +
      "ext\030\002 \001(\0132).aserto.authorizer.v2.api.Ide" +
      "ntityContextR\017identityContext\022C\n\007options" +
      "\030\003 \001(\0132).aserto.authorizer.v2.DecisionTr" +
      "eeOptionsR\007options\022B\n\020resource_context\030\004" +
      " \001(\0132\027.google.protobuf.StructR\017resourceC" +
      "ontext\022V\n\017policy_instance\030\005 \001(\0132(.aserto" +
      ".authorizer.v2.api.PolicyInstanceH\000R\016pol" +
      "icyInstance\210\001\001B\022\n\020_policy_instance\"g\n\023De" +
      "cisionTreeOptions\022J\n\016path_separator\030\001 \001(" +
      "\0162#.aserto.authorizer.v2.PathSeparatorR\r" +
      "pathSeparatorJ\004\010\002\020\003\"f\n\024DecisionTreeRespo" +
      "nse\022\033\n\tpath_root\030\001 \001(\tR\010pathRoot\022+\n\004path" +
      "\030\003 \001(\0132\027.google.protobuf.StructR\004pathJ\004\010" +
      "\002\020\003\"\341\002\n\tIsRequest\022N\n\016policy_context\030\001 \001(" +
      "\0132\'.aserto.authorizer.v2.api.PolicyConte" +
      "xtR\rpolicyContext\022T\n\020identity_context\030\002 " +
      "\001(\0132).aserto.authorizer.v2.api.IdentityC" +
      "ontextR\017identityContext\022B\n\020resource_cont" +
      "ext\030\003 \001(\0132\027.google.protobuf.StructR\017reso" +
      "urceContext\022V\n\017policy_instance\030\004 \001(\0132(.a" +
      "serto.authorizer.v2.api.PolicyInstanceH\000" +
      "R\016policyInstance\210\001\001B\022\n\020_policy_instance\"" +
      "6\n\010Decision\022\032\n\010decision\030\001 \001(\tR\010decision\022" +
      "\016\n\002is\030\002 \001(\010R\002is\"J\n\nIsResponse\022<\n\tdecisio" +
      "ns\030\001 \003(\0132\036.aserto.authorizer.v2.Decision" +
      "R\tdecisions\"\245\001\n\014QueryOptions\022\030\n\007metrics\030" +
      "\001 \001(\010R\007metrics\022\036\n\ninstrument\030\002 \001(\010R\ninst" +
      "rument\0226\n\005trace\030\003 \001(\0162 .aserto.authorize" +
      "r.v2.TraceLevelR\005trace\022#\n\rtrace_summary\030" +
      "\004 \001(\010R\014traceSummary\"\253\004\n\014QueryRequest\022\024\n\005" +
      "query\030\001 \001(\tR\005query\022\024\n\005input\030\002 \001(\tR\005input" +
      "\022A\n\007options\030\003 \001(\0132\".aserto.authorizer.v2" +
      ".QueryOptionsH\000R\007options\210\001\001\022S\n\016policy_co" +
      "ntext\030\004 \001(\0132\'.aserto.authorizer.v2.api.P" +
      "olicyContextH\001R\rpolicyContext\210\001\001\022Y\n\020iden" +
      "tity_context\030\005 \001(\0132).aserto.authorizer.v" +
      "2.api.IdentityContextH\002R\017identityContext" +
      "\210\001\001\022G\n\020resource_context\030\006 \001(\0132\027.google.p" +
      "rotobuf.StructH\003R\017resourceContext\210\001\001\022V\n\017" +
      "policy_instance\030\007 \001(\0132(.aserto.authorize" +
      "r.v2.api.PolicyInstanceH\004R\016policyInstanc" +
      "e\210\001\001B\n\n\010_optionsB\021\n\017_policy_contextB\023\n\021_" +
      "identity_contextB\023\n\021_resource_contextB\022\n" +
      "\020_policy_instance\"\364\004\n\016CompileRequest\022\024\n\005" +
      "query\030\001 \001(\tR\005query\022\024\n\005input\030\002 \001(\tR\005input" +
      "\022\032\n\010unknowns\030\003 \003(\tR\010unknowns\022)\n\020disable_" +
      "inlining\030\004 \003(\tR\017disableInlining\022A\n\007optio" +
      "ns\030\005 \001(\0132\".aserto.authorizer.v2.QueryOpt" +
      "ionsH\000R\007options\210\001\001\022S\n\016policy_context\030\006 \001" +
      "(\0132\'.aserto.authorizer.v2.api.PolicyCont" +
      "extH\001R\rpolicyContext\210\001\001\022Y\n\020identity_cont" +
      "ext\030\007 \001(\0132).aserto.authorizer.v2.api.Ide" +
      "ntityContextH\002R\017identityContext\210\001\001\022G\n\020re" +
      "source_context\030\010 \001(\0132\027.google.protobuf.S" +
      "tructH\003R\017resourceContext\210\001\001\022V\n\017policy_in" +
      "stance\030\t \001(\0132(.aserto.authorizer.v2.api." +
      "PolicyInstanceH\004R\016policyInstance\210\001\001B\n\n\010_" +
      "optionsB\021\n\017_policy_contextB\023\n\021_identity_" +
      "contextB\023\n\021_resource_contextB\022\n\020_policy_" +
      "instance\"\311\001\n\017CompileResponse\022/\n\006result\030\001" +
      " \001(\0132\027.google.protobuf.StructR\006result\0221\n" +
      "\007metrics\030\002 \001(\0132\027.google.protobuf.StructR" +
      "\007metrics\022-\n\005trace\030\003 \003(\0132\027.google.protobu" +
      "f.StructR\005trace\022#\n\rtrace_summary\030\004 \003(\tR\014" +
      "traceSummary\"\313\001\n\rQueryResponse\0223\n\010respon" +
      "se\030\001 \001(\0132\027.google.protobuf.StructR\010respo" +
      "nse\0221\n\007metrics\030\002 \001(\0132\027.google.protobuf.S" +
      "tructR\007metrics\022-\n\005trace\030\003 \003(\0132\027.google.p" +
      "rotobuf.StructR\005trace\022#\n\rtrace_summary\030\004" +
      " \003(\tR\014traceSummary*]\n\rPathSeparator\022\032\n\026P" +
      "ATH_SEPARATOR_UNKNOWN\020\000\022\026\n\022PATH_SEPARATO" +
      "R_DOT\020\001\022\030\n\024PATH_SEPARATOR_SLASH\020\002*~\n\nTra" +
      "ceLevel\022\027\n\023TRACE_LEVEL_UNKNOWN\020\000\022\023\n\017TRAC" +
      "E_LEVEL_OFF\020\001\022\024\n\020TRACE_LEVEL_FULL\020\002\022\025\n\021T" +
      "RACE_LEVEL_NOTES\020\003\022\025\n\021TRACE_LEVEL_FAILS\020" +
      "\0042\357\r\n\nAuthorizer\022\237\002\n\014DecisionTree\022).aser" +
      "to.authorizer.v2.DecisionTreeRequest\032*.a" +
      "serto.authorizer.v2.DecisionTreeResponse" +
      "\"\267\001\222A\216\001\n\nAuthorizer\022\rDecision tree\0321Retu" +
      "rns decision tree for given identity con" +
      "text.*\030authorizer.decision_treeb$\n\024\n\020Aut" +
      "horizerAPIKey\022\000\n\014\n\010TenantID\022\000\202\323\344\223\002\037\"\032/ap" +
      "i/v2/authz/decisiontree:\001*\022\235\002\n\002Is\022\037.aser" +
      "to.authorizer.v2.IsRequest\032 .aserto.auth" +
      "orizer.v2.IsResponse\"\323\001\222A\264\001\n\nAuthorizer\022" +
      "\017Is (authorized)\032`Determines if identity" +
      " context is authorized to access the res" +
      "ource guarded by the given policy.*\rauth" +
      "orizer.isb$\n\024\n\020AuthorizerAPIKey\022\000\n\014\n\010Ten" +
      "antID\022\000\202\323\344\223\002\025\"\020/api/v2/authz/is:\001*\022\365\001\n\005Q" +
      "uery\022\".aserto.authorizer.v2.QueryRequest" +
      "\032#.aserto.authorizer.v2.QueryResponse\"\242\001" +
      "\222A\200\001\n\nAuthorizer\022\005Query\0323Executes a rego" +
      " query on the loaded policy runtime.*\020au" +
      "thorizer.queryb$\n\024\n\020AuthorizerAPIKey\022\000\n\014" +
      "\n\010TenantID\022\000\202\323\344\223\002\030\"\023/api/v2/authz/query:" +
      "\001*\022\204\002\n\007Compile\022$.aserto.authorizer.v2.Co" +
      "mpileRequest\032%.aserto.authorizer.v2.Comp" +
      "ileResponse\"\253\001\222A\207\001\n\nAuthorizer\022\007Compile\032" +
      "6Executes a partial query on the loaded " +
      "policy runtime.*\022authorizer.compileb$\n\024\n" +
      "\020AuthorizerAPIKey\022\000\n\014\n\010TenantID\022\000\202\323\344\223\002\032\"" +
      "\025/api/v2/authz/compile:\001*\022\200\002\n\014ListPolici" +
      "es\022).aserto.authorizer.v2.ListPoliciesRe" +
      "quest\032*.aserto.authorizer.v2.ListPolicie" +
      "sResponse\"\230\001\222A}\n\006Policy\022\rList Policies\032/" +
      "Lists the policy modules for the policy " +
      "bundle.*\rpolicies.listb$\n\024\n\020AuthorizerAP" +
      "IKey\022\000\n\014\n\010TenantID\022\000\202\323\344\223\002\022\022\020/api/v2/poli" +
      "cies\022\376\001\n\tGetPolicy\022&.aserto.authorizer.v" +
      "2.GetPolicyRequest\032\'.aserto.authorizer.v" +
      "2.GetPolicyResponse\"\237\001\222Az\n\006Policy\022\nGet P" +
      "olicy\0320Gets the policy modules for the g" +
      "iven module Id.*\014policies.getb$\n\024\n\020Autho" +
      "rizerAPIKey\022\000\n\014\n\010TenantID\022\000\202\323\344\223\002\034\022\032/api/" +
      "v2/policies/{id=*/**}\022\233\001\n\004Info\022!.aserto." +
      "authorizer.v2.InfoRequest\032\".aserto.autho" +
      "rizer.v2.InfoResponse\"L\222A5\n\004Info\022\004Info\032\033" +
      "Return version information.*\010info.getb\000\202" +
      "\323\344\223\002\016\022\014/api/v2/infoB\202\003\n\030com.aserto.autho" +
      "rizer.v2B\017AuthorizerProtoP\001ZCgithub.com/" +
      "aserto-dev/go-authorizer/aserto/authoriz" +
      "er/v2;authorizer\242\002\003AAX\252\002\024Aserto.Authoriz" +
      "er.V2\312\002\024Aserto\\Authorizer\\V2\342\002 Aserto\\Au" +
      "thorizer\\V2\\GPBMetadata\352\002\026Aserto::Author" +
      "izer::V2\222A\234\001*\001\0022\020application/json:\020appli" +
      "cation/jsonZM\n\'\n\020AuthorizerAPIKey\022\023\010\002\032\ra" +
      "uthorization \002\n\"\n\010TenantID\022\026\010\002\032\020aserto-t" +
      "enant-id \002b$\n\024\n\020AuthorizerAPIKey\022\000\n\014\n\010Te" +
      "nantID\022\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.aserto.authorizer.v2.api.IdentityContextProto.getDescriptor(),
          com.aserto.authorizer.v2.api.PolicyContextProto.getDescriptor(),
          com.aserto.authorizer.v2.api.ModuleProto.getDescriptor(),
          com.aserto.authorizer.v2.api.PolicyInstanceProto.getDescriptor(),
        });
    internal_static_aserto_authorizer_v2_InfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_aserto_authorizer_v2_InfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_InfoRequest_descriptor,
        new java.lang.String[] { });
    internal_static_aserto_authorizer_v2_InfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_aserto_authorizer_v2_InfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_InfoResponse_descriptor,
        new java.lang.String[] { "Version", "Commit", "Date", "Os", "Arch", });
    internal_static_aserto_authorizer_v2_GetPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_aserto_authorizer_v2_GetPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_GetPolicyRequest_descriptor,
        new java.lang.String[] { "Id", "FieldMask", "PolicyInstance", });
    internal_static_aserto_authorizer_v2_GetPolicyResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_aserto_authorizer_v2_GetPolicyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_GetPolicyResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_authorizer_v2_ListPoliciesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_aserto_authorizer_v2_ListPoliciesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_ListPoliciesRequest_descriptor,
        new java.lang.String[] { "FieldMask", "PolicyInstance", });
    internal_static_aserto_authorizer_v2_ListPoliciesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_aserto_authorizer_v2_ListPoliciesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_ListPoliciesResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_aserto_authorizer_v2_DecisionTreeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_aserto_authorizer_v2_DecisionTreeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_DecisionTreeRequest_descriptor,
        new java.lang.String[] { "PolicyContext", "IdentityContext", "Options", "ResourceContext", "PolicyInstance", });
    internal_static_aserto_authorizer_v2_DecisionTreeOptions_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_aserto_authorizer_v2_DecisionTreeOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_DecisionTreeOptions_descriptor,
        new java.lang.String[] { "PathSeparator", });
    internal_static_aserto_authorizer_v2_DecisionTreeResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_aserto_authorizer_v2_DecisionTreeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_DecisionTreeResponse_descriptor,
        new java.lang.String[] { "PathRoot", "Path", });
    internal_static_aserto_authorizer_v2_IsRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_aserto_authorizer_v2_IsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_IsRequest_descriptor,
        new java.lang.String[] { "PolicyContext", "IdentityContext", "ResourceContext", "PolicyInstance", });
    internal_static_aserto_authorizer_v2_Decision_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_aserto_authorizer_v2_Decision_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_Decision_descriptor,
        new java.lang.String[] { "Decision", "Is", });
    internal_static_aserto_authorizer_v2_IsResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_aserto_authorizer_v2_IsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_IsResponse_descriptor,
        new java.lang.String[] { "Decisions", });
    internal_static_aserto_authorizer_v2_QueryOptions_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_aserto_authorizer_v2_QueryOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_QueryOptions_descriptor,
        new java.lang.String[] { "Metrics", "Instrument", "Trace", "TraceSummary", });
    internal_static_aserto_authorizer_v2_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_aserto_authorizer_v2_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_QueryRequest_descriptor,
        new java.lang.String[] { "Query", "Input", "Options", "PolicyContext", "IdentityContext", "ResourceContext", "PolicyInstance", });
    internal_static_aserto_authorizer_v2_CompileRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_aserto_authorizer_v2_CompileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_CompileRequest_descriptor,
        new java.lang.String[] { "Query", "Input", "Unknowns", "DisableInlining", "Options", "PolicyContext", "IdentityContext", "ResourceContext", "PolicyInstance", });
    internal_static_aserto_authorizer_v2_CompileResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_aserto_authorizer_v2_CompileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_CompileResponse_descriptor,
        new java.lang.String[] { "Result", "Metrics", "Trace", "TraceSummary", });
    internal_static_aserto_authorizer_v2_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_aserto_authorizer_v2_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_aserto_authorizer_v2_QueryResponse_descriptor,
        new java.lang.String[] { "Response", "Metrics", "Trace", "TraceSummary", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Operation);
    registry.add(com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.openapiv2Swagger);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.grpc.gateway.protoc_gen_openapiv2.options.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.aserto.authorizer.v2.api.IdentityContextProto.getDescriptor();
    com.aserto.authorizer.v2.api.PolicyContextProto.getDescriptor();
    com.aserto.authorizer.v2.api.ModuleProto.getDescriptor();
    com.aserto.authorizer.v2.api.PolicyInstanceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
