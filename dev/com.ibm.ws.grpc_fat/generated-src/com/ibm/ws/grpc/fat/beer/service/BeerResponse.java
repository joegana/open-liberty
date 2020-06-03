// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Beer.proto

package com.ibm.ws.grpc.fat.beer.service;

/**
 * <pre>
 * The response to adding or deleting a beer
 * </pre>
 *
 * Protobuf type {@code beer.BeerResponse}
 */
public  final class BeerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:beer.BeerResponse)
    BeerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BeerResponse.newBuilder() to construct.
  private BeerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BeerResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BeerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BeerResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            done_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_BeerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_BeerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibm.ws.grpc.fat.beer.service.BeerResponse.class, com.ibm.ws.grpc.fat.beer.service.BeerResponse.Builder.class);
  }

  public static final int DONE_FIELD_NUMBER = 1;
  private boolean done_;
  /**
   * <code>bool done = 1;</code>
   * @return The done.
   */
  public boolean getDone() {
    return done_;
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
    if (done_ != false) {
      output.writeBool(1, done_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (done_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, done_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.ibm.ws.grpc.fat.beer.service.BeerResponse)) {
      return super.equals(obj);
    }
    com.ibm.ws.grpc.fat.beer.service.BeerResponse other = (com.ibm.ws.grpc.fat.beer.service.BeerResponse) obj;

    if (getDone()
        != other.getDone()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDone());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse parseFrom(
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
  public static Builder newBuilder(com.ibm.ws.grpc.fat.beer.service.BeerResponse prototype) {
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
   * <pre>
   * The response to adding or deleting a beer
   * </pre>
   *
   * Protobuf type {@code beer.BeerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:beer.BeerResponse)
      com.ibm.ws.grpc.fat.beer.service.BeerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_BeerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_BeerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibm.ws.grpc.fat.beer.service.BeerResponse.class, com.ibm.ws.grpc.fat.beer.service.BeerResponse.Builder.class);
    }

    // Construct using com.ibm.ws.grpc.fat.beer.service.BeerResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      done_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibm.ws.grpc.fat.beer.service.BeerProto.internal_static_beer_BeerResponse_descriptor;
    }

    @java.lang.Override
    public com.ibm.ws.grpc.fat.beer.service.BeerResponse getDefaultInstanceForType() {
      return com.ibm.ws.grpc.fat.beer.service.BeerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibm.ws.grpc.fat.beer.service.BeerResponse build() {
      com.ibm.ws.grpc.fat.beer.service.BeerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibm.ws.grpc.fat.beer.service.BeerResponse buildPartial() {
      com.ibm.ws.grpc.fat.beer.service.BeerResponse result = new com.ibm.ws.grpc.fat.beer.service.BeerResponse(this);
      result.done_ = done_;
      onBuilt();
      return result;
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
      if (other instanceof com.ibm.ws.grpc.fat.beer.service.BeerResponse) {
        return mergeFrom((com.ibm.ws.grpc.fat.beer.service.BeerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibm.ws.grpc.fat.beer.service.BeerResponse other) {
      if (other == com.ibm.ws.grpc.fat.beer.service.BeerResponse.getDefaultInstance()) return this;
      if (other.getDone() != false) {
        setDone(other.getDone());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.ibm.ws.grpc.fat.beer.service.BeerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ibm.ws.grpc.fat.beer.service.BeerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean done_ ;
    /**
     * <code>bool done = 1;</code>
     * @return The done.
     */
    public boolean getDone() {
      return done_;
    }
    /**
     * <code>bool done = 1;</code>
     * @param value The done to set.
     * @return This builder for chaining.
     */
    public Builder setDone(boolean value) {
      
      done_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool done = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDone() {
      
      done_ = false;
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


    // @@protoc_insertion_point(builder_scope:beer.BeerResponse)
  }

  // @@protoc_insertion_point(class_scope:beer.BeerResponse)
  private static final com.ibm.ws.grpc.fat.beer.service.BeerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibm.ws.grpc.fat.beer.service.BeerResponse();
  }

  public static com.ibm.ws.grpc.fat.beer.service.BeerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BeerResponse>
      PARSER = new com.google.protobuf.AbstractParser<BeerResponse>() {
    @java.lang.Override
    public BeerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BeerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BeerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BeerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibm.ws.grpc.fat.beer.service.BeerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

