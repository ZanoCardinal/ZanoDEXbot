// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PushDataV3ApiWrapper.proto

// Protobuf Java Version: 3.25.6
package com.mxc.push.common.protobuf;

public interface PushDataV3ApiWrapperOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PushDataV3ApiWrapper)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   * 频道
   * </pre>
   *
   * <code>string channel = 1;</code>
   * @return The channel.
   */
  java.lang.String getChannel();
  /**
   * <pre>
   **
   * 频道
   * </pre>
   *
   * <code>string channel = 1;</code>
   * @return The bytes for channel.
   */
  com.google.protobuf.ByteString
      getChannelBytes();

  /**
   * <code>.PublicDealsV3Api publicDeals = 301;</code>
   * @return Whether the publicDeals field is set.
   */
  boolean hasPublicDeals();
  /**
   * <code>.PublicDealsV3Api publicDeals = 301;</code>
   * @return The publicDeals.
   */
  com.mxc.push.common.protobuf.PublicDealsV3Api getPublicDeals();
  /**
   * <code>.PublicDealsV3Api publicDeals = 301;</code>
   */
  com.mxc.push.common.protobuf.PublicDealsV3ApiOrBuilder getPublicDealsOrBuilder();

  /**
   * <code>.PublicIncreaseDepthsV3Api publicIncreaseDepths = 302;</code>
   * @return Whether the publicIncreaseDepths field is set.
   */
  boolean hasPublicIncreaseDepths();
  /**
   * <code>.PublicIncreaseDepthsV3Api publicIncreaseDepths = 302;</code>
   * @return The publicIncreaseDepths.
   */
  com.mxc.push.common.protobuf.PublicIncreaseDepthsV3Api getPublicIncreaseDepths();
  /**
   * <code>.PublicIncreaseDepthsV3Api publicIncreaseDepths = 302;</code>
   */
  com.mxc.push.common.protobuf.PublicIncreaseDepthsV3ApiOrBuilder getPublicIncreaseDepthsOrBuilder();

  /**
   * <code>.PublicLimitDepthsV3Api publicLimitDepths = 303;</code>
   * @return Whether the publicLimitDepths field is set.
   */
  boolean hasPublicLimitDepths();
  /**
   * <code>.PublicLimitDepthsV3Api publicLimitDepths = 303;</code>
   * @return The publicLimitDepths.
   */
  com.mxc.push.common.protobuf.PublicLimitDepthsV3Api getPublicLimitDepths();
  /**
   * <code>.PublicLimitDepthsV3Api publicLimitDepths = 303;</code>
   */
  com.mxc.push.common.protobuf.PublicLimitDepthsV3ApiOrBuilder getPublicLimitDepthsOrBuilder();

  /**
   * <code>.PrivateOrdersV3Api privateOrders = 304;</code>
   * @return Whether the privateOrders field is set.
   */
  boolean hasPrivateOrders();
  /**
   * <code>.PrivateOrdersV3Api privateOrders = 304;</code>
   * @return The privateOrders.
   */
  com.mxc.push.common.protobuf.PrivateOrdersV3Api getPrivateOrders();
  /**
   * <code>.PrivateOrdersV3Api privateOrders = 304;</code>
   */
  com.mxc.push.common.protobuf.PrivateOrdersV3ApiOrBuilder getPrivateOrdersOrBuilder();

  /**
   * <code>.PublicBookTickerV3Api publicBookTicker = 305;</code>
   * @return Whether the publicBookTicker field is set.
   */
  boolean hasPublicBookTicker();
  /**
   * <code>.PublicBookTickerV3Api publicBookTicker = 305;</code>
   * @return The publicBookTicker.
   */
  com.mxc.push.common.protobuf.PublicBookTickerV3Api getPublicBookTicker();
  /**
   * <code>.PublicBookTickerV3Api publicBookTicker = 305;</code>
   */
  com.mxc.push.common.protobuf.PublicBookTickerV3ApiOrBuilder getPublicBookTickerOrBuilder();

  /**
   * <code>.PrivateDealsV3Api privateDeals = 306;</code>
   * @return Whether the privateDeals field is set.
   */
  boolean hasPrivateDeals();
  /**
   * <code>.PrivateDealsV3Api privateDeals = 306;</code>
   * @return The privateDeals.
   */
  com.mxc.push.common.protobuf.PrivateDealsV3Api getPrivateDeals();
  /**
   * <code>.PrivateDealsV3Api privateDeals = 306;</code>
   */
  com.mxc.push.common.protobuf.PrivateDealsV3ApiOrBuilder getPrivateDealsOrBuilder();

  /**
   * <code>.PrivateAccountV3Api privateAccount = 307;</code>
   * @return Whether the privateAccount field is set.
   */
  boolean hasPrivateAccount();
  /**
   * <code>.PrivateAccountV3Api privateAccount = 307;</code>
   * @return The privateAccount.
   */
  com.mxc.push.common.protobuf.PrivateAccountV3Api getPrivateAccount();
  /**
   * <code>.PrivateAccountV3Api privateAccount = 307;</code>
   */
  com.mxc.push.common.protobuf.PrivateAccountV3ApiOrBuilder getPrivateAccountOrBuilder();

  /**
   * <code>.PublicSpotKlineV3Api publicSpotKline = 308;</code>
   * @return Whether the publicSpotKline field is set.
   */
  boolean hasPublicSpotKline();
  /**
   * <code>.PublicSpotKlineV3Api publicSpotKline = 308;</code>
   * @return The publicSpotKline.
   */
  com.mxc.push.common.protobuf.PublicSpotKlineV3Api getPublicSpotKline();
  /**
   * <code>.PublicSpotKlineV3Api publicSpotKline = 308;</code>
   */
  com.mxc.push.common.protobuf.PublicSpotKlineV3ApiOrBuilder getPublicSpotKlineOrBuilder();

  /**
   * <code>.PublicMiniTickerV3Api publicMiniTicker = 309;</code>
   * @return Whether the publicMiniTicker field is set.
   */
  boolean hasPublicMiniTicker();
  /**
   * <code>.PublicMiniTickerV3Api publicMiniTicker = 309;</code>
   * @return The publicMiniTicker.
   */
  com.mxc.push.common.protobuf.PublicMiniTickerV3Api getPublicMiniTicker();
  /**
   * <code>.PublicMiniTickerV3Api publicMiniTicker = 309;</code>
   */
  com.mxc.push.common.protobuf.PublicMiniTickerV3ApiOrBuilder getPublicMiniTickerOrBuilder();

  /**
   * <code>.PublicMiniTickersV3Api publicMiniTickers = 310;</code>
   * @return Whether the publicMiniTickers field is set.
   */
  boolean hasPublicMiniTickers();
  /**
   * <code>.PublicMiniTickersV3Api publicMiniTickers = 310;</code>
   * @return The publicMiniTickers.
   */
  com.mxc.push.common.protobuf.PublicMiniTickersV3Api getPublicMiniTickers();
  /**
   * <code>.PublicMiniTickersV3Api publicMiniTickers = 310;</code>
   */
  com.mxc.push.common.protobuf.PublicMiniTickersV3ApiOrBuilder getPublicMiniTickersOrBuilder();

  /**
   * <code>.PublicBookTickerBatchV3Api publicBookTickerBatch = 311;</code>
   * @return Whether the publicBookTickerBatch field is set.
   */
  boolean hasPublicBookTickerBatch();
  /**
   * <code>.PublicBookTickerBatchV3Api publicBookTickerBatch = 311;</code>
   * @return The publicBookTickerBatch.
   */
  com.mxc.push.common.protobuf.PublicBookTickerBatchV3Api getPublicBookTickerBatch();
  /**
   * <code>.PublicBookTickerBatchV3Api publicBookTickerBatch = 311;</code>
   */
  com.mxc.push.common.protobuf.PublicBookTickerBatchV3ApiOrBuilder getPublicBookTickerBatchOrBuilder();

  /**
   * <code>.PublicIncreaseDepthsBatchV3Api publicIncreaseDepthsBatch = 312;</code>
   * @return Whether the publicIncreaseDepthsBatch field is set.
   */
  boolean hasPublicIncreaseDepthsBatch();
  /**
   * <code>.PublicIncreaseDepthsBatchV3Api publicIncreaseDepthsBatch = 312;</code>
   * @return The publicIncreaseDepthsBatch.
   */
  com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3Api getPublicIncreaseDepthsBatch();
  /**
   * <code>.PublicIncreaseDepthsBatchV3Api publicIncreaseDepthsBatch = 312;</code>
   */
  com.mxc.push.common.protobuf.PublicIncreaseDepthsBatchV3ApiOrBuilder getPublicIncreaseDepthsBatchOrBuilder();

  /**
   * <code>.PublicAggreDepthsV3Api publicAggreDepths = 313;</code>
   * @return Whether the publicAggreDepths field is set.
   */
  boolean hasPublicAggreDepths();
  /**
   * <code>.PublicAggreDepthsV3Api publicAggreDepths = 313;</code>
   * @return The publicAggreDepths.
   */
  com.mxc.push.common.protobuf.PublicAggreDepthsV3Api getPublicAggreDepths();
  /**
   * <code>.PublicAggreDepthsV3Api publicAggreDepths = 313;</code>
   */
  com.mxc.push.common.protobuf.PublicAggreDepthsV3ApiOrBuilder getPublicAggreDepthsOrBuilder();

  /**
   * <code>.PublicAggreDealsV3Api publicAggreDeals = 314;</code>
   * @return Whether the publicAggreDeals field is set.
   */
  boolean hasPublicAggreDeals();
  /**
   * <code>.PublicAggreDealsV3Api publicAggreDeals = 314;</code>
   * @return The publicAggreDeals.
   */
  com.mxc.push.common.protobuf.PublicAggreDealsV3Api getPublicAggreDeals();
  /**
   * <code>.PublicAggreDealsV3Api publicAggreDeals = 314;</code>
   */
  com.mxc.push.common.protobuf.PublicAggreDealsV3ApiOrBuilder getPublicAggreDealsOrBuilder();

  /**
   * <code>.PublicAggreBookTickerV3Api publicAggreBookTicker = 315;</code>
   * @return Whether the publicAggreBookTicker field is set.
   */
  boolean hasPublicAggreBookTicker();
  /**
   * <code>.PublicAggreBookTickerV3Api publicAggreBookTicker = 315;</code>
   * @return The publicAggreBookTicker.
   */
  com.mxc.push.common.protobuf.PublicAggreBookTickerV3Api getPublicAggreBookTicker();
  /**
   * <code>.PublicAggreBookTickerV3Api publicAggreBookTicker = 315;</code>
   */
  com.mxc.push.common.protobuf.PublicAggreBookTickerV3ApiOrBuilder getPublicAggreBookTickerOrBuilder();

  /**
   * <pre>
   **
   * 交易对
   * </pre>
   *
   * <code>optional string symbol = 3;</code>
   * @return Whether the symbol field is set.
   */
  boolean hasSymbol();
  /**
   * <pre>
   **
   * 交易对
   * </pre>
   *
   * <code>optional string symbol = 3;</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <pre>
   **
   * 交易对
   * </pre>
   *
   * <code>optional string symbol = 3;</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <pre>
   **
   * 交易对ID
   * </pre>
   *
   * <code>optional string symbolId = 4;</code>
   * @return Whether the symbolId field is set.
   */
  boolean hasSymbolId();
  /**
   * <pre>
   **
   * 交易对ID
   * </pre>
   *
   * <code>optional string symbolId = 4;</code>
   * @return The symbolId.
   */
  java.lang.String getSymbolId();
  /**
   * <pre>
   **
   * 交易对ID
   * </pre>
   *
   * <code>optional string symbolId = 4;</code>
   * @return The bytes for symbolId.
   */
  com.google.protobuf.ByteString
      getSymbolIdBytes();

  /**
   * <pre>
   **
   * 消息生成时间
   * </pre>
   *
   * <code>optional int64 createTime = 5;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   **
   * 消息生成时间
   * </pre>
   *
   * <code>optional int64 createTime = 5;</code>
   * @return The createTime.
   */
  long getCreateTime();

  /**
   * <pre>
   **
   * 消息推送时间
   * </pre>
   *
   * <code>optional int64 sendTime = 6;</code>
   * @return Whether the sendTime field is set.
   */
  boolean hasSendTime();
  /**
   * <pre>
   **
   * 消息推送时间
   * </pre>
   *
   * <code>optional int64 sendTime = 6;</code>
   * @return The sendTime.
   */
  long getSendTime();

  com.mxc.push.common.protobuf.PushDataV3ApiWrapper.BodyCase getBodyCase();
}
