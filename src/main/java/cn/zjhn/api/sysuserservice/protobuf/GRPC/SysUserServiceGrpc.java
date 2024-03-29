package cn.zjhn.api.sysuserservice.protobuf.GRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: sysuserservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SysUserServiceGrpc {

  private SysUserServiceGrpc() {}

  public static final String SERVICE_NAME = "SysUserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<UserServiceProto.AddRequest,
      UserServiceProto.AddResponse> getAddUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUsers",
      requestType = UserServiceProto.AddRequest.class,
      responseType = UserServiceProto.AddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserServiceProto.AddRequest,
      UserServiceProto.AddResponse> getAddUsersMethod() {
    io.grpc.MethodDescriptor<UserServiceProto.AddRequest, UserServiceProto.AddResponse> getAddUsersMethod;
    if ((getAddUsersMethod = SysUserServiceGrpc.getAddUsersMethod) == null) {
      synchronized (SysUserServiceGrpc.class) {
        if ((getAddUsersMethod = SysUserServiceGrpc.getAddUsersMethod) == null) {
          SysUserServiceGrpc.getAddUsersMethod = getAddUsersMethod =
              io.grpc.MethodDescriptor.<UserServiceProto.AddRequest, UserServiceProto.AddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceProto.AddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceProto.AddResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SysUserServiceMethodDescriptorSupplier("addUsers"))
              .build();
        }
      }
    }
    return getAddUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserServiceProto.selectUserListRequest,
      UserServiceProto.streamselectUserListResponse> getStreamselectUserListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamselectUserList",
      requestType = UserServiceProto.selectUserListRequest.class,
      responseType = UserServiceProto.streamselectUserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<UserServiceProto.selectUserListRequest,
      UserServiceProto.streamselectUserListResponse> getStreamselectUserListMethod() {
    io.grpc.MethodDescriptor<UserServiceProto.selectUserListRequest, UserServiceProto.streamselectUserListResponse> getStreamselectUserListMethod;
    if ((getStreamselectUserListMethod = SysUserServiceGrpc.getStreamselectUserListMethod) == null) {
      synchronized (SysUserServiceGrpc.class) {
        if ((getStreamselectUserListMethod = SysUserServiceGrpc.getStreamselectUserListMethod) == null) {
          SysUserServiceGrpc.getStreamselectUserListMethod = getStreamselectUserListMethod =
              io.grpc.MethodDescriptor.<UserServiceProto.selectUserListRequest, UserServiceProto.streamselectUserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamselectUserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceProto.selectUserListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceProto.streamselectUserListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SysUserServiceMethodDescriptorSupplier("streamselectUserList"))
              .build();
        }
      }
    }
    return getStreamselectUserListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UserServiceProto.selectUserListRequest,
      UserServiceProto.selectUserListResponse> getSelectUserListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "selectUserList",
      requestType = UserServiceProto.selectUserListRequest.class,
      responseType = UserServiceProto.selectUserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<UserServiceProto.selectUserListRequest,
      UserServiceProto.selectUserListResponse> getSelectUserListMethod() {
    io.grpc.MethodDescriptor<UserServiceProto.selectUserListRequest, UserServiceProto.selectUserListResponse> getSelectUserListMethod;
    if ((getSelectUserListMethod = SysUserServiceGrpc.getSelectUserListMethod) == null) {
      synchronized (SysUserServiceGrpc.class) {
        if ((getSelectUserListMethod = SysUserServiceGrpc.getSelectUserListMethod) == null) {
          SysUserServiceGrpc.getSelectUserListMethod = getSelectUserListMethod =
              io.grpc.MethodDescriptor.<UserServiceProto.selectUserListRequest, UserServiceProto.selectUserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "selectUserList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceProto.selectUserListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UserServiceProto.selectUserListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SysUserServiceMethodDescriptorSupplier("selectUserList"))
              .build();
        }
      }
    }
    return getSelectUserListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SysUserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SysUserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SysUserServiceStub>() {
        @Override
        public SysUserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SysUserServiceStub(channel, callOptions);
        }
      };
    return SysUserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SysUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SysUserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SysUserServiceBlockingStub>() {
        @Override
        public SysUserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SysUserServiceBlockingStub(channel, callOptions);
        }
      };
    return SysUserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SysUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SysUserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SysUserServiceFutureStub>() {
        @Override
        public SysUserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SysUserServiceFutureStub(channel, callOptions);
        }
      };
    return SysUserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SysUserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUsers(UserServiceProto.AddRequest request,
        io.grpc.stub.StreamObserver<UserServiceProto.AddResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUsersMethod(), responseObserver);
    }

    /**
     */
    public void streamselectUserList(UserServiceProto.selectUserListRequest request,
        io.grpc.stub.StreamObserver<UserServiceProto.streamselectUserListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamselectUserListMethod(), responseObserver);
    }

    /**
     */
    public void selectUserList(UserServiceProto.selectUserListRequest request,
        io.grpc.stub.StreamObserver<UserServiceProto.selectUserListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectUserListMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserServiceProto.AddRequest,
                UserServiceProto.AddResponse>(
                  this, METHODID_ADD_USERS)))
          .addMethod(
            getStreamselectUserListMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                UserServiceProto.selectUserListRequest,
                UserServiceProto.streamselectUserListResponse>(
                  this, METHODID_STREAMSELECT_USER_LIST)))
          .addMethod(
            getSelectUserListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                UserServiceProto.selectUserListRequest,
                UserServiceProto.selectUserListResponse>(
                  this, METHODID_SELECT_USER_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class SysUserServiceStub extends io.grpc.stub.AbstractAsyncStub<SysUserServiceStub> {
    private SysUserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SysUserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SysUserServiceStub(channel, callOptions);
    }

    /**
     */
    public void addUsers(UserServiceProto.AddRequest request,
        io.grpc.stub.StreamObserver<UserServiceProto.AddResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamselectUserList(UserServiceProto.selectUserListRequest request,
        io.grpc.stub.StreamObserver<UserServiceProto.streamselectUserListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamselectUserListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void selectUserList(UserServiceProto.selectUserListRequest request,
        io.grpc.stub.StreamObserver<UserServiceProto.selectUserListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectUserListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SysUserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SysUserServiceBlockingStub> {
    private SysUserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SysUserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SysUserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public UserServiceProto.AddResponse addUsers(UserServiceProto.AddRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<UserServiceProto.streamselectUserListResponse> streamselectUserList(
        UserServiceProto.selectUserListRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamselectUserListMethod(), getCallOptions(), request);
    }

    /**
     */
    public UserServiceProto.selectUserListResponse selectUserList(UserServiceProto.selectUserListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectUserListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SysUserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SysUserServiceFutureStub> {
    private SysUserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SysUserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SysUserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserServiceProto.AddResponse> addUsers(
        UserServiceProto.AddRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserServiceProto.selectUserListResponse> selectUserList(
        UserServiceProto.selectUserListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectUserListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USERS = 0;
  private static final int METHODID_STREAMSELECT_USER_LIST = 1;
  private static final int METHODID_SELECT_USER_LIST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SysUserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SysUserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USERS:
          serviceImpl.addUsers((UserServiceProto.AddRequest) request,
              (io.grpc.stub.StreamObserver<UserServiceProto.AddResponse>) responseObserver);
          break;
        case METHODID_STREAMSELECT_USER_LIST:
          serviceImpl.streamselectUserList((UserServiceProto.selectUserListRequest) request,
              (io.grpc.stub.StreamObserver<UserServiceProto.streamselectUserListResponse>) responseObserver);
          break;
        case METHODID_SELECT_USER_LIST:
          serviceImpl.selectUserList((UserServiceProto.selectUserListRequest) request,
              (io.grpc.stub.StreamObserver<UserServiceProto.selectUserListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SysUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SysUserServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return UserServiceProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SysUserService");
    }
  }

  private static final class SysUserServiceFileDescriptorSupplier
      extends SysUserServiceBaseDescriptorSupplier {
    SysUserServiceFileDescriptorSupplier() {}
  }

  private static final class SysUserServiceMethodDescriptorSupplier
      extends SysUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SysUserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SysUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SysUserServiceFileDescriptorSupplier())
              .addMethod(getAddUsersMethod())
              .addMethod(getStreamselectUserListMethod())
              .addMethod(getSelectUserListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
