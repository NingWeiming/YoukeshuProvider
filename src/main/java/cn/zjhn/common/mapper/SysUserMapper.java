package cn.zjhn.common.mapper;


import cn.zjhn.common.entity.SysUser;
import cn.zjhn.common.util.UserPagedRequestParam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
* @author Administrator
* @description 针对表【employee_information】的数据库操作Mapper
* @createDate 2022-12-05 16:24:51
* @Entity generator.domain.EmployeeInformation
*/


public interface SysUserMapper extends BaseMapper<SysUser> {

    Page<SysUser> selectByParm(Page<SysUser> tPage, @Param("body") UserPagedRequestParam body);

//    SysUser checkUserNameUnique(String userName);
//
//    SysUser checkUserPhoneUnique(String userPhone);
//
//
//    SysUser checkUserEmail(String mailbox);
//
//    int removeById(Long[] userids)
//
//    int updateUser(SysUser user);
}




