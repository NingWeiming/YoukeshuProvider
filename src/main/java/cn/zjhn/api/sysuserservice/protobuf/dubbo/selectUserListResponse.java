// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sysuserservice.proto

package cn.zjhn.api.sysuserservice.protobuf.dubbo;

/**
 * Protobuf type {@code selectUserListResponse}
 */
public final class selectUserListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:selectUserListResponse)
    selectUserListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use selectUserListResponse.newBuilder() to construct.
  private selectUserListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private selectUserListResponse() {
    user_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new selectUserListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.zjhn.UserDubboServerProto.internal_static_selectUserListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.zjhn.UserDubboServerProto.internal_static_selectUserListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.zjhn.selectUserListResponse.class, cn.zjhn.selectUserListResponse.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private java.util.List<cn.zjhn.SysUsers> user_;
  /**
   * <code>repeated .SysUsers user = 1;</code>
   */
  @java.lang.Override
  public java.util.List<cn.zjhn.SysUsers> getUserList() {
    return user_;
  }
  /**
   * <code>repeated .SysUsers user = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends cn.zjhn.SysUsersOrBuilder> 
      getUserOrBuilderList() {
    return user_;
  }
  /**
   * <code>repeated .SysUsers user = 1;</code>
   */
  @java.lang.Override
  public int getUserCount() {
    return user_.size();
  }
  /**
   * <code>repeated .SysUsers user = 1;</code>
   */
  @java.lang.Override
  public cn.zjhn.SysUsers getUser(int index) {
    return user_.get(index);
  }
  /**
   * <code>repeated .SysUsers user = 1;</code>
   */
  @java.lang.Override
  public cn.zjhn.SysUsersOrBuilder getUserOrBuilder(
      int index) {
    return user_.get(index);
  }

  public static final int TOTAL_FIELD_NUMBER = 2;
  private int total_;
  /**
   * <code>int32 total = 2;</code>
   * @return The total.
   */
  @java.lang.Override
  public int getTotal() {
    return total_;
  }

  public static final int PAGE_FIELD_NUMBER = 3;
  private int page_;
  /**
   * <code>int32 page = 3;</code>
   * @return The page.
   */
  @java.lang.Override
  public int getPage() {
    return page_;
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
    for (int i = 0; i < user_.size(); i++) {
      output.writeMessage(1, user_.get(i));
    }
    if (total_ != 0) {
      output.writeInt32(2, total_);
    }
    if (page_ != 0) {
      output.writeInt32(3, page_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < user_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, user_.get(i));
    }
    if (total_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, total_);
    }
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, page_);
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
    if (!(obj instanceof cn.zjhn.selectUserListResponse)) {
      return super.equals(obj);
    }
    cn.zjhn.selectUserListResponse other = (cn.zjhn.selectUserListResponse) obj;

    if (!getUserList()
        .equals(other.getUserList())) return false;
    if (getTotal()
        != other.getTotal()) return false;
    if (getPage()
        != other.getPage()) return false;
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
    if (getUserCount() > 0) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUserList().hashCode();
    }
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + getTotal();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.zjhn.selectUserListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.zjhn.selectUserListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.zjhn.selectUserListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.zjhn.selectUserListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.zjhn.selectUserListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.zjhn.selectUserListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.zjhn.selectUserListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.zjhn.selectUserListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.zjhn.selectUserListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.zjhn.selectUserListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.zjhn.selectUserListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.zjhn.selectUserListResponse parseFrom(
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
  public static Builder newBuilder(cn.zjhn.selectUserListResponse prototype) {
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
   * Protobuf type {@code selectUserListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:selectUserListResponse)
      cn.zjhn.selectUserListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.zjhn.UserDubboServerProto.internal_static_selectUserListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.zjhn.UserDubboServerProto.internal_static_selectUserListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.zjhn.selectUserListResponse.class, cn.zjhn.selectUserListResponse.Builder.class);
    }

    // Construct using cn.zjhn.selectUserListResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
      } else {
        user_ = null;
        userBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      total_ = 0;

      page_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.zjhn.UserDubboServerProto.internal_static_selectUserListResponse_descriptor;
    }

    @java.lang.Override
    public cn.zjhn.selectUserListResponse getDefaultInstanceForType() {
      return cn.zjhn.selectUserListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cn.zjhn.selectUserListResponse build() {
      cn.zjhn.selectUserListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn.zjhn.selectUserListResponse buildPartial() {
      cn.zjhn.selectUserListResponse result = new cn.zjhn.selectUserListResponse(this);
      int from_bitField0_ = bitField0_;
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          user_ = java.util.Collections.unmodifiableList(user_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      result.total_ = total_;
      result.page_ = page_;
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
      if (other instanceof cn.zjhn.selectUserListResponse) {
        return mergeFrom((cn.zjhn.selectUserListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.zjhn.selectUserListResponse other) {
      if (other == cn.zjhn.selectUserListResponse.getDefaultInstance()) return this;
      if (userBuilder_ == null) {
        if (!other.user_.isEmpty()) {
          if (user_.isEmpty()) {
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserIsMutable();
            user_.addAll(other.user_);
          }
          onChanged();
        }
      } else {
        if (!other.user_.isEmpty()) {
          if (userBuilder_.isEmpty()) {
            userBuilder_.dispose();
            userBuilder_ = null;
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserFieldBuilder() : null;
          } else {
            userBuilder_.addAllMessages(other.user_);
          }
        }
      }
      if (other.getTotal() != 0) {
        setTotal(other.getTotal());
      }
      if (other.getPage() != 0) {
        setPage(other.getPage());
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
              cn.zjhn.SysUsers m =
                  input.readMessage(
                      cn.zjhn.SysUsers.parser(),
                      extensionRegistry);
              if (userBuilder_ == null) {
                ensureUserIsMutable();
                user_.add(m);
              } else {
                userBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              total_ = input.readInt32();

              break;
            } // case 16
            case 24: {
              page_ = input.readInt32();

              break;
            } // case 24
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

    private java.util.List<cn.zjhn.SysUsers> user_ =
      java.util.Collections.emptyList();
    private void ensureUserIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        user_ = new java.util.ArrayList<cn.zjhn.SysUsers>(user_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.zjhn.SysUsers, cn.zjhn.SysUsers.Builder, cn.zjhn.SysUsersOrBuilder> userBuilder_;

    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public java.util.List<cn.zjhn.SysUsers> getUserList() {
      if (userBuilder_ == null) {
        return java.util.Collections.unmodifiableList(user_);
      } else {
        return userBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public int getUserCount() {
      if (userBuilder_ == null) {
        return user_.size();
      } else {
        return userBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public cn.zjhn.SysUsers getUser(int index) {
      if (userBuilder_ == null) {
        return user_.get(index);
      } else {
        return userBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public Builder setUser(
        int index, cn.zjhn.SysUsers value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.set(index, value);
        onChanged();
      } else {
        userBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public Builder setUser(
        int index, cn.zjhn.SysUsers.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.set(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public Builder addUser(cn.zjhn.SysUsers value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(value);
        onChanged();
      } else {
        userBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public Builder addUser(
        int index, cn.zjhn.SysUsers value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(index, value);
        onChanged();
      } else {
        userBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public Builder addUser(
        cn.zjhn.SysUsers.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public Builder addUser(
        int index, cn.zjhn.SysUsers.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public Builder addAllUser(
        java.lang.Iterable<? extends cn.zjhn.SysUsers> values) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, user_);
        onChanged();
      } else {
        userBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public Builder removeUser(int index) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.remove(index);
        onChanged();
      } else {
        userBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public cn.zjhn.SysUsers.Builder getUserBuilder(
        int index) {
      return getUserFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public cn.zjhn.SysUsersOrBuilder getUserOrBuilder(
        int index) {
      if (userBuilder_ == null) {
        return user_.get(index);  } else {
        return userBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public java.util.List<? extends cn.zjhn.SysUsersOrBuilder> 
         getUserOrBuilderList() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(user_);
      }
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public cn.zjhn.SysUsers.Builder addUserBuilder() {
      return getUserFieldBuilder().addBuilder(
          cn.zjhn.SysUsers.getDefaultInstance());
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public cn.zjhn.SysUsers.Builder addUserBuilder(
        int index) {
      return getUserFieldBuilder().addBuilder(
          index, cn.zjhn.SysUsers.getDefaultInstance());
    }
    /**
     * <code>repeated .SysUsers user = 1;</code>
     */
    public java.util.List<cn.zjhn.SysUsers.Builder> 
         getUserBuilderList() {
      return getUserFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn.zjhn.SysUsers, cn.zjhn.SysUsers.Builder, cn.zjhn.SysUsersOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cn.zjhn.SysUsers, cn.zjhn.SysUsers.Builder, cn.zjhn.SysUsersOrBuilder>(
                user_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private int total_ ;
    /**
     * <code>int32 total = 2;</code>
     * @return The total.
     */
    @java.lang.Override
    public int getTotal() {
      return total_;
    }
    /**
     * <code>int32 total = 2;</code>
     * @param value The total to set.
     * @return This builder for chaining.
     */
    public Builder setTotal(int value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 total = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotal() {
      
      total_ = 0;
      onChanged();
      return this;
    }

    private int page_ ;
    /**
     * <code>int32 page = 3;</code>
     * @return The page.
     */
    @java.lang.Override
    public int getPage() {
      return page_;
    }
    /**
     * <code>int32 page = 3;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      
      page_ = 0;
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


    // @@protoc_insertion_point(builder_scope:selectUserListResponse)
  }

  // @@protoc_insertion_point(class_scope:selectUserListResponse)
  private static final cn.zjhn.selectUserListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.zjhn.selectUserListResponse();
  }

  public static cn.zjhn.selectUserListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<selectUserListResponse>
      PARSER = new com.google.protobuf.AbstractParser<selectUserListResponse>() {
    @java.lang.Override
    public selectUserListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<selectUserListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<selectUserListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn.zjhn.selectUserListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

