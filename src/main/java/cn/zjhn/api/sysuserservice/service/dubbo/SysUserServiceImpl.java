package cn.zjhn.api.sysuserservice.service.dubbo;

import cn.zjhn.common.entity.SysUser;
import cn.zjhn.common.service.SysUserService;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0")
public class SysUserServiceImpl implements SysUserService {


    @Override
    public void addUsers(SysUser user) {

    }
}
