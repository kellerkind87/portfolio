// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package name.abuchen.portfolio.model.protos;

public interface PSecurityPriceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:portfolioperformance.PSecurityPrice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * epoch day, based on the epoch 1970-01-01
   * </pre>
   *
   * <code>int64 date = 1;</code>
   * @return The date.
   */
  long getDate();

  /**
   * <code>int64 close = 2;</code>
   * @return The close.
   */
  long getClose();
}
