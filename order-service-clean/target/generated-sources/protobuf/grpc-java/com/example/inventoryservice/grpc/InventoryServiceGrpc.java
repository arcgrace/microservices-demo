package com.example.inventoryservice.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: inventory.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventoryServiceGrpc {

  private InventoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "inventory.InventoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.inventoryservice.grpc.StockRequest,
      com.example.inventoryservice.grpc.StockResponse> getGetStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStock",
      requestType = com.example.inventoryservice.grpc.StockRequest.class,
      responseType = com.example.inventoryservice.grpc.StockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.inventoryservice.grpc.StockRequest,
      com.example.inventoryservice.grpc.StockResponse> getGetStockMethod() {
    io.grpc.MethodDescriptor<com.example.inventoryservice.grpc.StockRequest, com.example.inventoryservice.grpc.StockResponse> getGetStockMethod;
    if ((getGetStockMethod = InventoryServiceGrpc.getGetStockMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetStockMethod = InventoryServiceGrpc.getGetStockMethod) == null) {
          InventoryServiceGrpc.getGetStockMethod = getGetStockMethod =
              io.grpc.MethodDescriptor.<com.example.inventoryservice.grpc.StockRequest, com.example.inventoryservice.grpc.StockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.inventoryservice.grpc.StockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.inventoryservice.grpc.StockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("GetStock"))
              .build();
        }
      }
    }
    return getGetStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.inventoryservice.grpc.DeductStockRequest,
      com.example.inventoryservice.grpc.DeductStockResponse> getDeductStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeductStock",
      requestType = com.example.inventoryservice.grpc.DeductStockRequest.class,
      responseType = com.example.inventoryservice.grpc.DeductStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.inventoryservice.grpc.DeductStockRequest,
      com.example.inventoryservice.grpc.DeductStockResponse> getDeductStockMethod() {
    io.grpc.MethodDescriptor<com.example.inventoryservice.grpc.DeductStockRequest, com.example.inventoryservice.grpc.DeductStockResponse> getDeductStockMethod;
    if ((getDeductStockMethod = InventoryServiceGrpc.getDeductStockMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getDeductStockMethod = InventoryServiceGrpc.getDeductStockMethod) == null) {
          InventoryServiceGrpc.getDeductStockMethod = getDeductStockMethod =
              io.grpc.MethodDescriptor.<com.example.inventoryservice.grpc.DeductStockRequest, com.example.inventoryservice.grpc.DeductStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeductStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.inventoryservice.grpc.DeductStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.inventoryservice.grpc.DeductStockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("DeductStock"))
              .build();
        }
      }
    }
    return getDeductStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.inventoryservice.grpc.EmptyRequest,
      com.example.inventoryservice.grpc.StockListResponse> getGetAllStocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStocks",
      requestType = com.example.inventoryservice.grpc.EmptyRequest.class,
      responseType = com.example.inventoryservice.grpc.StockListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.inventoryservice.grpc.EmptyRequest,
      com.example.inventoryservice.grpc.StockListResponse> getGetAllStocksMethod() {
    io.grpc.MethodDescriptor<com.example.inventoryservice.grpc.EmptyRequest, com.example.inventoryservice.grpc.StockListResponse> getGetAllStocksMethod;
    if ((getGetAllStocksMethod = InventoryServiceGrpc.getGetAllStocksMethod) == null) {
      synchronized (InventoryServiceGrpc.class) {
        if ((getGetAllStocksMethod = InventoryServiceGrpc.getGetAllStocksMethod) == null) {
          InventoryServiceGrpc.getGetAllStocksMethod = getGetAllStocksMethod =
              io.grpc.MethodDescriptor.<com.example.inventoryservice.grpc.EmptyRequest, com.example.inventoryservice.grpc.StockListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllStocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.inventoryservice.grpc.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.inventoryservice.grpc.StockListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("GetAllStocks"))
              .build();
        }
      }
    }
    return getGetAllStocksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceStub>() {
        @java.lang.Override
        public InventoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceStub(channel, callOptions);
        }
      };
    return InventoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceBlockingStub>() {
        @java.lang.Override
        public InventoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceBlockingStub(channel, callOptions);
        }
      };
    return InventoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryServiceFutureStub>() {
        @java.lang.Override
        public InventoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryServiceFutureStub(channel, callOptions);
        }
      };
    return InventoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStock(com.example.inventoryservice.grpc.StockRequest request,
        io.grpc.stub.StreamObserver<com.example.inventoryservice.grpc.StockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStockMethod(), responseObserver);
    }

    /**
     */
    default void deductStock(com.example.inventoryservice.grpc.DeductStockRequest request,
        io.grpc.stub.StreamObserver<com.example.inventoryservice.grpc.DeductStockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeductStockMethod(), responseObserver);
    }

    /**
     */
    default void getAllStocks(com.example.inventoryservice.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.example.inventoryservice.grpc.StockListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStocksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InventoryService.
   */
  public static abstract class InventoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InventoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InventoryService.
   */
  public static final class InventoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InventoryServiceStub> {
    private InventoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStock(com.example.inventoryservice.grpc.StockRequest request,
        io.grpc.stub.StreamObserver<com.example.inventoryservice.grpc.StockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deductStock(com.example.inventoryservice.grpc.DeductStockRequest request,
        io.grpc.stub.StreamObserver<com.example.inventoryservice.grpc.DeductStockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeductStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllStocks(com.example.inventoryservice.grpc.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.example.inventoryservice.grpc.StockListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllStocksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InventoryService.
   */
  public static final class InventoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InventoryServiceBlockingStub> {
    private InventoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.inventoryservice.grpc.StockResponse getStock(com.example.inventoryservice.grpc.StockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.inventoryservice.grpc.DeductStockResponse deductStock(com.example.inventoryservice.grpc.DeductStockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeductStockMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.inventoryservice.grpc.StockListResponse getAllStocks(com.example.inventoryservice.grpc.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllStocksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InventoryService.
   */
  public static final class InventoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InventoryServiceFutureStub> {
    private InventoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.inventoryservice.grpc.StockResponse> getStock(
        com.example.inventoryservice.grpc.StockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.inventoryservice.grpc.DeductStockResponse> deductStock(
        com.example.inventoryservice.grpc.DeductStockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeductStockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.inventoryservice.grpc.StockListResponse> getAllStocks(
        com.example.inventoryservice.grpc.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllStocksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STOCK = 0;
  private static final int METHODID_DEDUCT_STOCK = 1;
  private static final int METHODID_GET_ALL_STOCKS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STOCK:
          serviceImpl.getStock((com.example.inventoryservice.grpc.StockRequest) request,
              (io.grpc.stub.StreamObserver<com.example.inventoryservice.grpc.StockResponse>) responseObserver);
          break;
        case METHODID_DEDUCT_STOCK:
          serviceImpl.deductStock((com.example.inventoryservice.grpc.DeductStockRequest) request,
              (io.grpc.stub.StreamObserver<com.example.inventoryservice.grpc.DeductStockResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_STOCKS:
          serviceImpl.getAllStocks((com.example.inventoryservice.grpc.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.example.inventoryservice.grpc.StockListResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetStockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.inventoryservice.grpc.StockRequest,
              com.example.inventoryservice.grpc.StockResponse>(
                service, METHODID_GET_STOCK)))
        .addMethod(
          getDeductStockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.inventoryservice.grpc.DeductStockRequest,
              com.example.inventoryservice.grpc.DeductStockResponse>(
                service, METHODID_DEDUCT_STOCK)))
        .addMethod(
          getGetAllStocksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.inventoryservice.grpc.EmptyRequest,
              com.example.inventoryservice.grpc.StockListResponse>(
                service, METHODID_GET_ALL_STOCKS)))
        .build();
  }

  private static abstract class InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.inventoryservice.grpc.Inventory.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryService");
    }
  }

  private static final class InventoryServiceFileDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier {
    InventoryServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryServiceMethodDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InventoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryServiceFileDescriptorSupplier())
              .addMethod(getGetStockMethod())
              .addMethod(getDeductStockMethod())
              .addMethod(getGetAllStocksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
