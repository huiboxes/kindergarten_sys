package com.ruoyi.project.kinder_parent.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 家长对象 kinder_parent
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public class KinderParent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 家长编号 */
    private Long parentId;

    /** 学生编号 */
    @Excel(name = "学生编号")
    private Long studentId;

    /** 家长姓名 */
    @Excel(name = "家长姓名")
    private String parentName;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phonenumber;

    /** 与学生关系 */
    @Excel(name = "与学生关系")
    private String relationship;

    /** 家长邮箱 */
    @Excel(name = "家长邮箱")
    private String email;

    /** 状态（0正常 1停用） */
    private String status;

    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setParentName(String parentName) 
    {
        this.parentName = parentName;
    }

    public String getParentName() 
    {
        return parentName;
    }
    public void setPhonenumber(String phonenumber) 
    {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() 
    {
        return phonenumber;
    }
    public void setRelationship(String relationship) 
    {
        this.relationship = relationship;
    }

    public String getRelationship() 
    {
        return relationship;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("parentId", getParentId())
            .append("studentId", getStudentId())
            .append("parentName", getParentName())
            .append("phonenumber", getPhonenumber())
            .append("relationship", getRelationship())
            .append("email", getEmail())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
