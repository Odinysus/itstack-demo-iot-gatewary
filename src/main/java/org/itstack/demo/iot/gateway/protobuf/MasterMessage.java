// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MasterMessage.proto

package org.itstack.demo.iot.gateway.protobuf;

public final class MasterMessage {
  private MasterMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_itstack_demo_iot_gateway_protobuf_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_itstack_demo_iot_gateway_protobuf_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MasterMessage.proto\022%org.itstack.demo." +
      "iot.gateway.protobuf\"Z\n\007Message\022\n\n\002ip\030\002 " +
      "\001(\t\022\014\n\004port\030\003 \001(\t\022\022\n\nprotocolId\030\004 \001(\t\022\017\n" +
      "\007content\030\005 \001(\t\022\020\n\010property\030\006 \001(\tB8\n%org." +
      "itstack.demo.iot.gateway.protobufB\rMaste" +
      "rMessageP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_itstack_demo_iot_gateway_protobuf_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_itstack_demo_iot_gateway_protobuf_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_itstack_demo_iot_gateway_protobuf_Message_descriptor,
        new java.lang.String[] { "Ip", "Port", "ProtocolId", "Content", "Property", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}