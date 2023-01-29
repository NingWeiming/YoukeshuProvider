package cn.zjhn.api.sysuserservice.service.grpc;

import cn.zjhn.api.sysuserservice.protobuf.GRPC.UserServiceProto;
import cn.zjhn.api.sysuserservice.protobuf.GRPC.SysUserServiceGrpc;
import cn.zjhn.common.entity.SysUser;
import cn.zjhn.common.mapper.SysUserMapper;
import cn.zjhn.common.util.UserPagedRequestParam;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@GrpcService
public class SysUserServiceImpl extends SysUserServiceGrpc.SysUserServiceImplBase  {
    @Autowired
    SysUserMapper sysUserMapper;
    @Override
    public void selectUserList(UserServiceProto.selectUserListRequest request, StreamObserver<UserServiceProto.selectUserListResponse> responseObserver) {
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
            //未完待续

            //set基本类型,userBuilder的set方法内容不能为null，“”是可以的
//            userBuilder.setId(u.getId()).setUsername(u.getUserName()).setName(u.getName()).setDeptid(u.getDeptId())
//                    .setPhone(u.getPhone()).setIdentityCard(u.getIdentityCard()).setIdentityCardAddress(u.getIdentityCardAddress()).setNation(u.getNation()).setNativePlace(u.getNativePlace())
//                    .setSex(u.getSex()).setIsAttendance(u.getIsAttendance()).setTitles(u.getTitles()).setEeState(u.getEeState()).setRegisteredResidence(u.getRegisteredResidence())
//                    .setPoliticalOutlook(u.getPoliticalOutlook()).setAddress(u.getAddress()).setEmergencyContact(u.getEmergencyContact()).setMaritalStatus(u.getMaritalStatus())
//                    .setContactRelationship(u.getContactRelationship()).setBankCard(u.getBankCard()).setContactNumber(u.getContactNumber()).setEducation(u.getEducation())
//                    .setAcademicDegree(u.getAcademicDegree()).setGraduationSchool(u.getGraduationSchool()).setMajor(u.getMajor()).setMailbox(u.getMailbox()).setRemark(u.getRemark()).build();
//
//            //set自定义date类型
//            UserServiceProto.date.Builder dateBuilder = UserServiceProto.date.newBuilder();
//            userBuilder.setBirthday(setDate(dateBuilder,u.getBirthday())).setEntryTime(setDate(dateBuilder,u.getEntryTime())).setContractCommencement(setDate(dateBuilder,u.getContractCommencement()))
//                    .setContractEnd(setDate(dateBuilder,u.getContractEnd())).setTrialStart(setDate(dateBuilder,u.getTrialStart())).setTrialEnd(setDate(dateBuilder,u.getTrialEnd()))
//                    .setTerminationTime(setDate(dateBuilder,u.getTerminationTime())).setCreateTime(setDate(dateBuilder,u.getCreateTime())).build();
//            System.out.println("-----------------02");
            users.add(userBuilder.build());
        }
        System.out.println(Arrays.toString(users.toArray()));
        UserServiceProto.selectUserListResponse reply = UserServiceProto.selectUserListResponse.newBuilder().addAllUser(users).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }




    @Override
    public void addUsers(UserServiceProto.AddRequest request, StreamObserver<UserServiceProto.AddResponse> responseObserver) {
        SysUser user = new SysUser();
        user.setName(request.getUser().getName()).setUserName(request.getUser().getUsername());
        //System.out.println("id为"+user.getId()+"工号为"+user.getName());
        int row = sysUserMapper.insert(user);;
        //构建响应体
        UserServiceProto.AddResponse reply = UserServiceProto.AddResponse.newBuilder().setRow(row).build();
        //将响应返回
        responseObserver.onNext(reply);
        //向客户端发送处理后的结果
        responseObserver.onCompleted();
    }






    //将服务端查询到的日期类结果赋值给proto的日期类
    public UserServiceProto.date.Builder setDate( UserServiceProto.date.Builder dateBuilder,Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        dateBuilder.setY(c.get(c.YEAR)).setM(c.get(c.MONTH)).setD(c.get(c.DATE)).build();
        return dateBuilder;
    }
}