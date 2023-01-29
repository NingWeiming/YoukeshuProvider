package cn.zjhn.common.util;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserPagedRequestParam {

    @ApiModelProperty(value = "页码", required = true)
    private Integer page; //= Constant.DEFAULT_PAGE;


    @ApiModelProperty(value = "单页容量", required = true)
    private Integer pageSize;// = Constant.DEFAULT_PAGESIZE;

    //查询框中输入的条件参数
    @ApiModelProperty(value = "工号/姓名/手机号/籍贯")
    private String queryparam;

    //点击部门树的部门参数
    @ApiModelProperty(value = "部门")
    private String deptid;

//    @ApiModelProperty(value = "真实姓名")
//    private String realname;
//
//    @ApiModelProperty(value = "手机号码")
//    private String phone;
//
//    @ApiModelProperty(value = "籍贯")
//    private String nativePlace;
//
//    @ApiModelProperty(value = "部门id")
//    private String depId;

//    @ApiModelProperty(value = "角色id")
//    private String roleId;
}
