// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PublicBookTickerV3Api.proto

// Protobuf Java Version: 3.25.6
package com.mxc.push.common.protobuf;

/**
 * Protobuf type {@code PublicBookTickerV3Api}
 */
public final class PublicBookTickerV3Api extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PublicBookTickerV3Api)
    PublicBookTickerV3ApiOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PublicBookTickerV3Api.newBuilder() to construct.
  private PublicBookTickerV3Api(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PublicBookTickerV3Api() {
    bidPrice_ = "";
    bidQuantity_ = "";
    askPrice_ = "";
    askQuantity_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PublicBookTickerV3Api();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mxc.push.common.protobuf.PublicBookTickerV3ApiProto.internal_static_PublicBookTickerV3Api_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mxc.push.common.protobuf.PublicBookTickerV3ApiProto.internal_static_PublicBookTickerV3Api_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mxc.push.common.protobuf.PublicBookTickerV3Api.class, com.mxc.push.common.protobuf.PublicBookTickerV3Api.Builder.class);
  }

  public static final int BIDPRICE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bidPrice_ = "";
  /**
   * <code>string bidPrice = 1;</code>
   * @return The bidPrice.
   */
  @java.lang.Override
  public java.lang.String getBidPrice() {
    java.lang.Object ref = bidPrice_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bidPrice_ = s;
      return s;
    }
  }
  /**
   * <code>string bidPrice = 1;</code>
   * @return The bytes for bidPrice.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBidPriceBytes() {
    java.lang.Object ref = bidPrice_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bidPrice_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BIDQUANTITY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object bidQuantity_ = "";
  /**
   * <code>string bidQuantity = 2;</code>
   * @return The bidQuantity.
   */
  @java.lang.Override
  public java.lang.String getBidQuantity() {
    java.lang.Object ref = bidQuantity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bidQuantity_ = s;
      return s;
    }
  }
  /**
   * <code>string bidQuantity = 2;</code>
   * @return The bytes for bidQuantity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBidQuantityBytes() {
    java.lang.Object ref = bidQuantity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bidQuantity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASKPRICE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object askPrice_ = "";
  /**
   * <code>string askPrice = 3;</code>
   * @return The askPrice.
   */
  @java.lang.Override
  public java.lang.String getAskPrice() {
    java.lang.Object ref = askPrice_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      askPrice_ = s;
      return s;
    }
  }
  /**
   * <code>string askPrice = 3;</code>
   * @return The bytes for askPrice.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAskPriceBytes() {
    java.lang.Object ref = askPrice_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      askPrice_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASKQUANTITY_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object askQuantity_ = "";
  /**
   * <code>string askQuantity = 4;</code>
   * @return The askQuantity.
   */
  @java.lang.Override
  public java.lang.String getAskQuantity() {
    java.lang.Object ref = askQuantity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      askQuantity_ = s;
      return s;
    }
  }
  /**
   * <code>string askQuantity = 4;</code>
   * @return The bytes for askQuantity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAskQuantityBytes() {
    java.lang.Object ref = askQuantity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      askQuantity_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bidPrice_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, bidPrice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bidQuantity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bidQuantity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(askPrice_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, askPrice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(askQuantity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, askQuantity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bidPrice_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, bidPrice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bidQuantity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bidQuantity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(askPrice_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, askPrice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(askQuantity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, askQuantity_);
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
    if (!(obj instanceof com.mxc.push.common.protobuf.PublicBookTickerV3Api)) {
      return super.equals(obj);
    }
    com.mxc.push.common.protobuf.PublicBookTickerV3Api other = (com.mxc.push.common.protobuf.PublicBookTickerV3Api) obj;

    if (!getBidPrice()
        .equals(other.getBidPrice())) return false;
    if (!getBidQuantity()
        .equals(other.getBidQuantity())) return false;
    if (!getAskPrice()
        .equals(other.getAskPrice())) return false;
    if (!getAskQuantity()
        .equals(other.getAskQuantity())) return false;
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
    hash = (37 * hash) + BIDPRICE_FIELD_NUMBER;
    hash = (53 * hash) + getBidPrice().hashCode();
    hash = (37 * hash) + BIDQUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getBidQuantity().hashCode();
    hash = (37 * hash) + ASKPRICE_FIELD_NUMBER;
    hash = (53 * hash) + getAskPrice().hashCode();
    hash = (37 * hash) + ASKQUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getAskQuantity().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api parseFrom(
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
  public static Builder newBuilder(com.mxc.push.common.protobuf.PublicBookTickerV3Api prototype) {
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
   * Protobuf type {@code PublicBookTickerV3Api}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PublicBookTickerV3Api)
      com.mxc.push.common.protobuf.PublicBookTickerV3ApiOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mxc.push.common.protobuf.PublicBookTickerV3ApiProto.internal_static_PublicBookTickerV3Api_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mxc.push.common.protobuf.PublicBookTickerV3ApiProto.internal_static_PublicBookTickerV3Api_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mxc.push.common.protobuf.PublicBookTickerV3Api.class, com.mxc.push.common.protobuf.PublicBookTickerV3Api.Builder.class);
    }

    // Construct using com.mxc.push.common.protobuf.PublicBookTickerV3Api.newBuilder()
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
      bidPrice_ = "";
      bidQuantity_ = "";
      askPrice_ = "";
      askQuantity_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mxc.push.common.protobuf.PublicBookTickerV3ApiProto.internal_static_PublicBookTickerV3Api_descriptor;
    }

    @java.lang.Override
    public com.mxc.push.common.protobuf.PublicBookTickerV3Api getDefaultInstanceForType() {
      return com.mxc.push.common.protobuf.PublicBookTickerV3Api.getDefaultInstance();
    }

    @java.lang.Override
    public com.mxc.push.common.protobuf.PublicBookTickerV3Api build() {
      com.mxc.push.common.protobuf.PublicBookTickerV3Api result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mxc.push.common.protobuf.PublicBookTickerV3Api buildPartial() {
      com.mxc.push.common.protobuf.PublicBookTickerV3Api result = new com.mxc.push.common.protobuf.PublicBookTickerV3Api(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.mxc.push.common.protobuf.PublicBookTickerV3Api result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bidPrice_ = bidPrice_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bidQuantity_ = bidQuantity_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.askPrice_ = askPrice_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.askQuantity_ = askQuantity_;
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
      if (other instanceof com.mxc.push.common.protobuf.PublicBookTickerV3Api) {
        return mergeFrom((com.mxc.push.common.protobuf.PublicBookTickerV3Api)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mxc.push.common.protobuf.PublicBookTickerV3Api other) {
      if (other == com.mxc.push.common.protobuf.PublicBookTickerV3Api.getDefaultInstance()) return this;
      if (!other.getBidPrice().isEmpty()) {
        bidPrice_ = other.bidPrice_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBidQuantity().isEmpty()) {
        bidQuantity_ = other.bidQuantity_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAskPrice().isEmpty()) {
        askPrice_ = other.askPrice_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getAskQuantity().isEmpty()) {
        askQuantity_ = other.askQuantity_;
        bitField0_ |= 0x00000008;
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
              bidPrice_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              bidQuantity_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              askPrice_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              askQuantity_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object bidPrice_ = "";
    /**
     * <code>string bidPrice = 1;</code>
     * @return The bidPrice.
     */
    public java.lang.String getBidPrice() {
      java.lang.Object ref = bidPrice_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bidPrice_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bidPrice = 1;</code>
     * @return The bytes for bidPrice.
     */
    public com.google.protobuf.ByteString
        getBidPriceBytes() {
      java.lang.Object ref = bidPrice_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bidPrice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bidPrice = 1;</code>
     * @param value The bidPrice to set.
     * @return This builder for chaining.
     */
    public Builder setBidPrice(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bidPrice_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string bidPrice = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBidPrice() {
      bidPrice_ = getDefaultInstance().getBidPrice();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string bidPrice = 1;</code>
     * @param value The bytes for bidPrice to set.
     * @return This builder for chaining.
     */
    public Builder setBidPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bidPrice_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object bidQuantity_ = "";
    /**
     * <code>string bidQuantity = 2;</code>
     * @return The bidQuantity.
     */
    public java.lang.String getBidQuantity() {
      java.lang.Object ref = bidQuantity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bidQuantity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string bidQuantity = 2;</code>
     * @return The bytes for bidQuantity.
     */
    public com.google.protobuf.ByteString
        getBidQuantityBytes() {
      java.lang.Object ref = bidQuantity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bidQuantity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string bidQuantity = 2;</code>
     * @param value The bidQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setBidQuantity(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      bidQuantity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string bidQuantity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBidQuantity() {
      bidQuantity_ = getDefaultInstance().getBidQuantity();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string bidQuantity = 2;</code>
     * @param value The bytes for bidQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setBidQuantityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      bidQuantity_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object askPrice_ = "";
    /**
     * <code>string askPrice = 3;</code>
     * @return The askPrice.
     */
    public java.lang.String getAskPrice() {
      java.lang.Object ref = askPrice_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        askPrice_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string askPrice = 3;</code>
     * @return The bytes for askPrice.
     */
    public com.google.protobuf.ByteString
        getAskPriceBytes() {
      java.lang.Object ref = askPrice_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        askPrice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string askPrice = 3;</code>
     * @param value The askPrice to set.
     * @return This builder for chaining.
     */
    public Builder setAskPrice(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      askPrice_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string askPrice = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAskPrice() {
      askPrice_ = getDefaultInstance().getAskPrice();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string askPrice = 3;</code>
     * @param value The bytes for askPrice to set.
     * @return This builder for chaining.
     */
    public Builder setAskPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      askPrice_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object askQuantity_ = "";
    /**
     * <code>string askQuantity = 4;</code>
     * @return The askQuantity.
     */
    public java.lang.String getAskQuantity() {
      java.lang.Object ref = askQuantity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        askQuantity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string askQuantity = 4;</code>
     * @return The bytes for askQuantity.
     */
    public com.google.protobuf.ByteString
        getAskQuantityBytes() {
      java.lang.Object ref = askQuantity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        askQuantity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string askQuantity = 4;</code>
     * @param value The askQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setAskQuantity(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      askQuantity_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string askQuantity = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAskQuantity() {
      askQuantity_ = getDefaultInstance().getAskQuantity();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string askQuantity = 4;</code>
     * @param value The bytes for askQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setAskQuantityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      askQuantity_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:PublicBookTickerV3Api)
  }

  // @@protoc_insertion_point(class_scope:PublicBookTickerV3Api)
  private static final com.mxc.push.common.protobuf.PublicBookTickerV3Api DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mxc.push.common.protobuf.PublicBookTickerV3Api();
  }

  public static com.mxc.push.common.protobuf.PublicBookTickerV3Api getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PublicBookTickerV3Api>
      PARSER = new com.google.protobuf.AbstractParser<PublicBookTickerV3Api>() {
    @java.lang.Override
    public PublicBookTickerV3Api parsePartialFrom(
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

  public static com.google.protobuf.Parser<PublicBookTickerV3Api> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PublicBookTickerV3Api> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mxc.push.common.protobuf.PublicBookTickerV3Api getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

