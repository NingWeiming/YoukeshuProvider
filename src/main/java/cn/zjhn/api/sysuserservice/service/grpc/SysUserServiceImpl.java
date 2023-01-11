package cn.zjhn.api.sysuserservice.service.grpc;

import cn.zjhn.api.sysuserservice.protobuf.SysUserServiceGrpc;
import cn.zjhn.api.sysuserservice.protobuf.UserServiceProto;
import cn.zjhn.common.entity.SysUser;
import cn.zjhn.common.mapper.SysUserMapper;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class SysUserServiceImpl extends SysUserServiceGrpc.SysUserServiceImplBase  {

    @Autowired
    SysUserMapper sysUserMapper;
    @Override
    public void addUsers(UserServiceProto.AddRequest request, StreamObserver<UserServiceProto.AddResponse> responseObserver) {
        SysUser user = new SysUser();
        user.setName(request.getName());
        user.setUserName(request.getUserName());
        int row = sysUserMapper.insert(user);;
        //构建响应体
        UserServiceProto.AddResponse reply = UserServiceProto.AddResponse.newBuilder().setRow(row).build();
        //将响应返回
        responseObserver.onNext(reply);
        //向客户端发送处理后的结果
        responseObserver.onCompleted();
    }


}
