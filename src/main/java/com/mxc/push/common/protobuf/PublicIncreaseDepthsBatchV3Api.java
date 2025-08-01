// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PublicIncreaseDepthsBatchV3Api.proto

// Protobuf Java Version: 3.25.6
package com.mxc.push.common.protobuf;

/**
 * Protobuf type {@code PublicIncreaseDepthsBatchV3Api}
 */
public final class PublicIncreaseDepthsBatchV3Api extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PublicIncreaseDepthsBatchV3Api)
    PublicIncreaseDepthsBatchV3ApiOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublicIncreaseDepthsBatchV3Api.newBuilder() to construct.
  private PublicIncreaseDepthsBatchV3Api(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublicIncreaseDepthsBatchV3Api() {
    items_ = java.util.Collections.emptyList();
    eventType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublicIncreaseDepthsBatchV3Api();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3ApiProto.internal_static_PublicIncreaseDepthsBatchV3Api_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3ApiProto.internal_static_PublicIncreaseDepthsBatchV3Api_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api.class, com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api> items_;
  /**
   * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.mxc.push.common.protobuf.PublicIncreaseDepthsV3ApiOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
   */
  @java.lang.Override
  public com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
   */
  @java.lang.Override
  public com.mxc.push.common.protobuf.PublicIncreaseDepthsV3ApiOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  public static final int EVENTTYPE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object eventType_ = "";
  /**
   * <code>string eventType = 2;</code>
   * @return The eventType.
   */
  @java.lang.Override
  public java.lang.String getEventType() {
    java.lang.Object ref = eventType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventType_ = s;
      return s;
    }
  }
  /**
   * <code>string eventType = 2;</code>
   * @return The bytes for eventType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventTypeBytes() {
    java.lang.Object ref = eventType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(1, items_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, eventType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, items_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, eventType_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api)) {
      return super.equals(obj);
    }
    com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api other = (com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api) obj;

    if (!getItemsList()
        .equals(other.getItemsList())) return false;
    if (!getEventType()
        .equals(other.getEventType())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (37 * hash) + EVENTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEventType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code PublicIncreaseDepthsBatchV3Api}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PublicIncreaseDepthsBatchV3Api)
      com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3ApiOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3ApiProto.internal_static_PublicIncreaseDepthsBatchV3Api_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3ApiProto.internal_static_PublicIncreaseDepthsBatchV3Api_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api.class, com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api.Builder.class);
    }

    // Construct using com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
      } else {
        items_ = null;
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      eventType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3ApiProto.internal_static_PublicIncreaseDepthsBatchV3Api_descriptor;
    }

    @java.lang.Override
    public com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api getDefaultInstanceForType() {
      return com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api.getDefaultInstance();
    }

    @java.lang.Override
    public com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api build() {
      com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api buildPartial() {
      com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api result = new com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api result) {
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
    }

    private void buildPartial0(com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventType_ = eventType_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api) {
        return mergeFrom((com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api other) {
      if (other == com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api.getDefaultInstance()) return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      if (!other.getEventType().isEmpty()) {
        eventType_ = other.eventType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api m =
                  input.readMessage(
                      com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.parser(),
                      extensionRegistry);
              if (itemsBuilder_ == null) {
                ensureItemsIsMutable();
                items_.add(m);
              } else {
                itemsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              eventType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3ApiOrBuilder> itemsBuilder_;

    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public java.util.List<com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public Builder setItems(
        int index, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public Builder setItems(
        int index, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public Builder addItems(com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public Builder addItems(
        int index, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public Builder addItems(
        com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public Builder addItems(
        int index, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public com.mxc.push.common.protobuf.PublicIncreaseDepthsV3ApiOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public java.util.List<? extends com.mxc.push.common.protobuf.PublicIncreaseDepthsV3ApiOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.getDefaultInstance());
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.getDefaultInstance());
    }
    /**
     * <code>repeated .PublicIncreaseDepthsV3Api items = 1;</code>
     */
    public java.util.List<com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3ApiOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api.Builder, com.mxc.push.common.protobuf.PublicIncreaseDepthsV3ApiOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }

    private java.lang.Object eventType_ = "";
    /**
     * <code>string eventType = 2;</code>
     * @return The eventType.
     */
    public java.lang.String getEventType() {
      java.lang.Object ref = eventType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string eventType = 2;</code>
     * @return The bytes for eventType.
     */
    public com.google.protobuf.ByteString
        getEventTypeBytes() {
      java.lang.Object ref = eventType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string eventType = 2;</code>
     * @param value The eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      eventType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string eventType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventType() {
      eventType_ = getDefaultInstance().getEventType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string eventType = 2;</code>
     * @param value The bytes for eventType to set.
     * @return This builder for chaining.
     */
    public Builder setEventTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      eventType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:PublicIncreaseDepthsBatchV3Api)
  }

  // @@protoc_insertion_point(class_scope:PublicIncreaseDepthsBatchV3Api)
  private static final com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api();
  }

  public static com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicIncreaseDepthsBatchV3Api>
      PARSER = new com.google.protobuf.AbstractParser<PublicIncreaseDepthsBatchV3Api>() {
    @java.lang.Override
    public PublicIncreaseDepthsBatchV3Api parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PublicIncreaseDepthsBatchV3Api> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicIncreaseDepthsBatchV3Api> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

