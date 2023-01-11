package cn.zjhn.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName sys_user
 */
@Data
public class SysUser implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 工号
     */

    @TableField("user_name")
    private String userName;

    /**
     * 姓名
     */
    private String name;

    /**
     * 部门id
     */
    @TableField("dept_id")
    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptname;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 身份证
     */
    private String identityCard;

    /**
     * 身份证地址
     */
    private String identityCardAddress;

    /**
     * 民族
     */
    private String nation;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 性别
     */
    private Boolean sex;

    /**
     * 参与考勤
     */
    private Boolean isAttendance;

    /**
     * 职称
     */
    private String titles;

    /**
     * 职工状态
     */
    private Integer eeState;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 户籍
     */
    private String registeredResidence;

    /**
     * 政治面貌
     */
    private String politicalOutlook;

    /**
     * 住址
     */
    private String address;

    /**
     * 紧急联系人
     */
    private String emergencyContact;

    /**
     * 婚姻状况
     */
    private Boolean maritalStatus;

    /**
     * 联系人关系
     */
    private String contactRelationship;

    /**
     * 银行卡
     */
    private String bankCard;

    /**
     * 联系电话
     */
    private Integer contactNumber;

    /**
     * 学历
     */
    private String education;

    /**
     * 学位
     */
    private String academicDegree;

    /**
     * 毕业学校
     */
    private String graduationSchool;

    /**
     * 专业
     */
    private String major;

    /**
     * 邮箱
     */
    private String mailbox;

    /**
     * 入职时间
     */
    private Date entryTime;

    /**
     * 合同开始
     */
    private Date contractCommencement;

    /**
     * 合同结束
     */
    private Date contractEnd;

    /**
     * 使用开始
     */
    private Date trialStart;

    /**
     * 使用结束
     */
    private Date trialEnd;

    /**
     * 离职时间
     */
    private Date terminationTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUser other = (SysUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getDeptname() == null ? other.getDeptname() == null : this.getDeptname().equals(other.getDeptname()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getIdentityCard() == null ? other.getIdentityCard() == null : this.getIdentityCard().equals(other.getIdentityCard()))
            && (this.getIdentityCardAddress() == null ? other.getIdentityCardAddress() == null : this.getIdentityCardAddress().equals(other.getIdentityCardAddress()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getNativePlace() == null ? other.getNativePlace() == null : this.getNativePlace().equals(other.getNativePlace()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getIsAttendance() == null ? other.getIsAttendance() == null : this.getIsAttendance().equals(other.getIsAttendance()))
            && (this.getTitles() == null ? other.getTitles() == null : this.getTitles().equals(other.getTitles()))
            && (this.getEeState() == null ? other.getEeState() == null : this.getEeState().equals(other.getEeState()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getRegisteredResidence() == null ? other.getRegisteredResidence() == null : this.getRegisteredResidence().equals(other.getRegisteredResidence()))
            && (this.getPoliticalOutlook() == null ? other.getPoliticalOutlook() == null : this.getPoliticalOutlook().equals(other.getPoliticalOutlook()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getEmergencyContact() == null ? other.getEmergencyContact() == null : this.getEmergencyContact().equals(other.getEmergencyContact()))
            && (this.getMaritalStatus() == null ? other.getMaritalStatus() == null : this.getMaritalStatus().equals(other.getMaritalStatus()))
            && (this.getContactRelationship() == null ? other.getContactRelationship() == null : this.getContactRelationship().equals(other.getContactRelationship()))
            && (this.getBankCard() == null ? other.getBankCard() == null : this.getBankCard().equals(other.getBankCard()))
            && (this.getContactNumber() == null ? other.getContactNumber() == null : this.getContactNumber().equals(other.getContactNumber()))
            && (this.getEducation() == null ? other.getEducation() == null : this.getEducation().equals(other.getEducation()))
            && (this.getAcademicDegree() == null ? other.getAcademicDegree() == null : this.getAcademicDegree().equals(other.getAcademicDegree()))
            && (this.getGraduationSchool() == null ? other.getGraduationSchool() == null : this.getGraduationSchool().equals(other.getGraduationSchool()))
            && (this.getMajor() == null ? other.getMajor() == null : this.getMajor().equals(other.getMajor()))
            && (this.getMailbox() == null ? other.getMailbox() == null : this.getMailbox().equals(other.getMailbox()))
            && (this.getEntryTime() == null ? other.getEntryTime() == null : this.getEntryTime().equals(other.getEntryTime()))
            && (this.getContractCommencement() == null ? other.getContractCommencement() == null : this.getContractCommencement().equals(other.getContractCommencement()))
            && (this.getContractEnd() == null ? other.getContractEnd() == null : this.getContractEnd().equals(other.getContractEnd()))
            && (this.getTrialStart() == null ? other.getTrialStart() == null : this.getTrialStart().equals(other.getTrialStart()))
            && (this.getTrialEnd() == null ? other.getTrialEnd() == null : this.getTrialEnd().equals(other.getTrialEnd()))
            && (this.getTerminationTime() == null ? other.getTerminationTime() == null : this.getTerminationTime().equals(other.getTerminationTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getDeptname() == null) ? 0 : getDeptname().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getIdentityCard() == null) ? 0 : getIdentityCard().hashCode());
        result = prime * result + ((getIdentityCardAddress() == null) ? 0 : getIdentityCardAddress().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getNativePlace() == null) ? 0 : getNativePlace().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getIsAttendance() == null) ? 0 : getIsAttendance().hashCode());
        result = prime * result + ((getTitles() == null) ? 0 : getTitles().hashCode());
        result = prime * result + ((getEeState() == null) ? 0 : getEeState().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getRegisteredResidence() == null) ? 0 : getRegisteredResidence().hashCode());
        result = prime * result + ((getPoliticalOutlook() == null) ? 0 : getPoliticalOutlook().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getEmergencyContact() == null) ? 0 : getEmergencyContact().hashCode());
        result = prime * result + ((getMaritalStatus() == null) ? 0 : getMaritalStatus().hashCode());
        result = prime * result + ((getContactRelationship() == null) ? 0 : getContactRelationship().hashCode());
        result = prime * result + ((getBankCard() == null) ? 0 : getBankCard().hashCode());
        result = prime * result + ((getContactNumber() == null) ? 0 : getContactNumber().hashCode());
        result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
        result = prime * result + ((getAcademicDegree() == null) ? 0 : getAcademicDegree().hashCode());
        result = prime * result + ((getGraduationSchool() == null) ? 0 : getGraduationSchool().hashCode());
        result = prime * result + ((getMajor() == null) ? 0 : getMajor().hashCode());
        result = prime * result + ((getMailbox() == null) ? 0 : getMailbox().hashCode());
        result = prime * result + ((getEntryTime() == null) ? 0 : getEntryTime().hashCode());
        result = prime * result + ((getContractCommencement() == null) ? 0 : getContractCommencement().hashCode());
        result = prime * result + ((getContractEnd() == null) ? 0 : getContractEnd().hashCode());
        result = prime * result + ((getTrialStart() == null) ? 0 : getTrialStart().hashCode());
        result = prime * result + ((getTrialEnd() == null) ? 0 : getTrialEnd().hashCode());
        result = prime * result + ((getTerminationTime() == null) ? 0 : getTerminationTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", name=").append(name);
        sb.append(", deptId=").append(deptId);
        sb.append(", deptname=").append(deptname);
        sb.append(", phone=").append(phone);
        sb.append(", identityCard=").append(identityCard);
        sb.append(", identityCardAddress=").append(identityCardAddress);
        sb.append(", nation=").append(nation);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", sex=").append(sex);
        sb.append(", isAttendance=").append(isAttendance);
        sb.append(", titles=").append(titles);
        sb.append(", eeState=").append(eeState);
        sb.append(", birthday=").append(birthday);
        sb.append(", registeredResidence=").append(registeredResidence);
        sb.append(", politicalOutlook=").append(politicalOutlook);
        sb.append(", address=").append(address);
        sb.append(", emergencyContact=").append(emergencyContact);
        sb.append(", maritalStatus=").append(maritalStatus);
        sb.append(", contactRelationship=").append(contactRelationship);
        sb.append(", bankCard=").append(bankCard);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", education=").append(education);
        sb.append(", academicDegree=").append(academicDegree);
        sb.append(", graduationSchool=").append(graduationSchool);
        sb.append(", major=").append(major);
        sb.append(", mailbox=").append(mailbox);
        sb.append(", entryTime=").append(entryTime);
        sb.append(", contractCommencement=").append(contractCommencement);
        sb.append(", contractEnd=").append(contractEnd);
        sb.append(", trialStart=").append(trialStart);
        sb.append(", trialEnd=").append(trialEnd);
        sb.append(", terminationTime=").append(terminationTime);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}