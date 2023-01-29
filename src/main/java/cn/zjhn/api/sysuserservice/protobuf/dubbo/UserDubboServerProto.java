// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sysuserservice.proto

package cn.zjhn.api.sysuserservice.protobuf.dubbo;

public final class UserDubboServerProto {
  private UserDubboServerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_selectUserListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_selectUserListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_selectUserListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_selectUserListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamselectUserListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamselectUserListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SysUsers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SysUsers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_date_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_date_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024sysuserservice.proto\"%\n\nAddRequest\022\027\n\004" +
      "user\030\001 \001(\0132\t.SysUsers\"\032\n\013AddResponse\022\013\n\003" +
      "row\030\001 \001(\005\"E\n\025selectUserListRequest\022\014\n\004pa" +
      "ge\030\001 \001(\005\022\020\n\010pagesize\030\002 \001(\005\022\014\n\004body\030\003 \001(\t" +
      "\"N\n\026selectUserListResponse\022\027\n\004user\030\001 \003(\013" +
      "2\t.SysUsers\022\r\n\005total\030\002 \001(\005\022\014\n\004page\030\003 \001(\005" +
      "\"T\n\034streamselectUserListResponse\022\027\n\004user" +
      "\030\001 \003(\0132\t.SysUsers\022\r\n\005total\030\002 \001(\005\022\014\n\004page" +
      "\030\003 \001(\005\"\210\006\n\010SysUsers\022\n\n\002id\030\001 \001(\003\022\020\n\010usern" +
      "ame\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\016\n\006deptid\030\004 \001(\005\022" +
      "\r\n\005phone\030\005 \001(\t\022\024\n\014identityCard\030\006 \001(\t\022\033\n\023" +
      "identityCardAddress\030\007 \001(\t\022\016\n\006nation\030\010 \001(" +
      "\t\022\023\n\013nativePlace\030\t \001(\t\022\013\n\003sex\030\n \001(\010\022\024\n\014i" +
      "sAttendance\030\013 \001(\010\022\016\n\006titles\030\014 \001(\t\022\017\n\007eeS" +
      "tate\030\r \001(\005\022\027\n\010birthday\030\016 \001(\0132\005.date\022\033\n\023r" +
      "egisteredResidence\030\017 \001(\t\022\030\n\020politicalOut" +
      "look\030\020 \001(\t\022\017\n\007address\030\021 \001(\t\022\030\n\020emergency" +
      "Contact\030\022 \001(\t\022\025\n\rmaritalStatus\030\023 \001(\010\022\033\n\023" +
      "contactRelationship\030\024 \001(\t\022\020\n\010bankCard\030\025 " +
      "\001(\t\022\025\n\rcontactNumber\030\026 \001(\005\022\021\n\teducation\030" +
      "\027 \001(\t\022\026\n\016academicDegree\030\030 \001(\t\022\030\n\020graduat" +
      "ionSchool\030\031 \001(\t\022\r\n\005major\030\032 \001(\t\022\017\n\007mailbo" +
      "x\030\033 \001(\t\022\030\n\tentryTime\030\034 \001(\0132\005.date\022#\n\024con" +
      "tractCommencement\030\035 \001(\0132\005.date\022\032\n\013contra" +
      "ctEnd\030\036 \001(\0132\005.date\022\031\n\ntrialStart\030\037 \001(\0132\005" +
      ".date\022\027\n\010trialEnd\030  \001(\0132\005.date\022\036\n\017termin" +
      "ationTime\030! \001(\0132\005.date\022\016\n\006remark\030\" \001(\t\022\031" +
      "\n\ncreateTime\030# \001(\0132\005.date\"\'\n\004date\022\t\n\001y\030\001" +
      " \001(\005\022\t\n\001m\030\002 \001(\005\022\t\n\001d\030\003 \001(\0052\321\001\n\016SysUserSe" +
      "rvice\022\'\n\010addUsers\022\013.AddRequest\032\014.AddResp" +
      "onse\"\000\022Q\n\024streamselectUserList\022\026.selectU" +
      "serListRequest\032\035.streamselectUserListRes" +
      "ponse\"\0000\001\022C\n\016selectUserList\022\026.selectUser" +
      "ListRequest\032\027.selectUserListResponse\"\000B!" +
      "\n\007cn.zjhnB\024UserDubboServerProtoP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AddRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AddRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_AddResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AddResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddResponse_descriptor,
        new java.lang.String[] { "Row", });
    internal_static_selectUserListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_selectUserListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_selectUserListRequest_descriptor,
        new java.lang.String[] { "Page", "Pagesize", "Body", });
    internal_static_selectUserListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_selectUserListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_selectUserListResponse_descriptor,
        new java.lang.String[] { "User", "Total", "Page", });
    internal_static_streamselectUserListResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_streamselectUserListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamselectUserListResponse_descriptor,
        new java.lang.String[] { "User", "Total", "Page", });
    internal_static_SysUsers_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SysUsers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SysUsers_descriptor,
        new java.lang.String[] { "Id", "Username", "Name", "Deptid", "Phone", "IdentityCard", "IdentityCardAddress", "Nation", "NativePlace", "Sex", "IsAttendance", "Titles", "EeState", "Birthday", "RegisteredResidence", "PoliticalOutlook", "Address", "EmergencyContact", "MaritalStatus", "ContactRelationship", "BankCard", "ContactNumber", "Education", "AcademicDegree", "GraduationSchool", "Major", "Mailbox", "EntryTime", "ContractCommencement", "ContractEnd", "TrialStart", "TrialEnd", "TerminationTime", "Remark", "CreateTime", });
    internal_static_date_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_date_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_date_descriptor,
        new java.lang.String[] { "Y", "M", "D", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
