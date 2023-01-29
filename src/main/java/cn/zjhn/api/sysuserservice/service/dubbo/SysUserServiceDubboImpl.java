package cn.zjhn.api.sysuserservice.service.dubbo;

import cn.zjhn.api.sysuserservice.protobuf.GRPC.UserServiceProto;
import cn.zjhn.api.sysuserservice.protobuf.dubbo.selectUserListRequest;
import cn.zjhn.api.sysuserservice.protobuf.dubbo.selectUserListResponse;
import cn.zjhn.common.entity.SysUser;
import cn.zjhn.common.mapper.SysUserMapper;

import cn.zjhn.common.util.UserPagedRequestParam;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.grpc.stub.StreamObserver;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DubboService(version = "1.0")
public class SysUserServiceDubboImpl extends api.sysuserservice.protobuf.dubbo.SysUserServiceGrpc.SysUserServiceImplBase {


    @Override
    public void selectUserList(selectUserListRequest request, StreamObserver<selectUserListResponse> responseObserver) {
        UserPagedRequestParam body = new UserPagedRequestParam();
        body.setPage(request.getPage()).setPageSize(request.getPagesize()).setQueryparam(request.getBody());
        System.out.println("-------------->参数为"+body.getQueryparam()+"     当前页为"+body.getPage());
        //真正的调用
        Page<SysUser> pages = sysUserMapper.selectByParm(new Page<>(body.getPage(),body.getPageSize()),body);

        List<UserServiceProto.SysUsers> users = new ArrayList<>();
        List<SysUser> list = pages.getRecords();

        for(SysUser u : list){

            UserServiceProto.SysUsers.Builder userBuilder = UserServiceProto.SysUsers.newBuilder();

            if(u.getId()!=null){
                userBuilder.setId(u.getId());
            }
            if(u.getUserName()!=null){
                userBuilder.setUsername(u.getUserName());
            }
            if(u.getName()!=null){
                userBuilder.setName(u.getName());
            }
            if(u.getDeptId()!=null){
                userBuilder.setDeptid(u.getDeptId());
            }

            users.add(userBuilder.build());
        }
        System.out.println(Arrays.toString(users.toArray()));
        UserServiceProto.selectUserListResponse reply = UserServiceProto.selectUserListResponse.newBuilder().addAllUser(users).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Autowired
    SysUserMapper sysUserMapper;


    @Override
    public void addUsers(SysUser user) {

    }
}
