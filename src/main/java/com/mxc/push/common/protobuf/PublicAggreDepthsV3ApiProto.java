// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PublicAggreDepthsV3Api.proto

// Protobuf Java Version: 3.25.6
package com.mxc.push.common.protobuf;

public final class PublicAggreDepthsV3ApiProto {
  private PublicAggreDepthsV3ApiProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PublicAggreDepthsV3Api_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PublicAggreDepthsV3Api_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PublicAggreDepthV3ApiItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PublicAggreDepthV3ApiItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034PublicAggreDepthsV3Api.proto\"\247\001\n\026Publi" +
      "cAggreDepthsV3Api\022(\n\004asks\030\001 \003(\0132\032.Public" +
      "AggreDepthV3ApiItem\022(\n\004bids\030\002 \003(\0132\032.Publ" +
      "icAggreDepthV3ApiItem\022\021\n\teventType\030\003 \001(\t" +
      "\022\023\n\013fromVersion\030\004 \001(\t\022\021\n\ttoVersion\030\005 \001(\t" +
      "\"<\n\031PublicAggreDepthV3ApiItem\022\r\n\005price\030\001" +
      " \001(\t\022\020\n\010quantity\030\002 \001(\tB?\n\034com.mxc.push.c" +
      "ommon.protobufB\033PublicAggreDepthsV3ApiPr" +
      "otoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PublicAggreDepthsV3Api_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PublicAggreDepthsV3Api_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PublicAggreDepthsV3Api_descriptor,
        new java.lang.String[] { "Asks", "Bids", "EventType", "FromVersion", "ToVersion", });
    internal_static_PublicAggreDepthV3ApiItem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PublicAggreDepthV3ApiItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PublicAggreDepthV3ApiItem_descriptor,
        new java.lang.String[] { "Price", "Quantity", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
