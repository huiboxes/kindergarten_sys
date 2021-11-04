package com.ruoyi.project.kinder_student.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 学生对象 kinder_student
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public class KinderStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学生ID */
    private Long studentId;

    /** 班级ID */
    @Excel(name = "班级ID")
    private Long claseId;

    /** 学号 */
    @Excel(name = "学号")
    private String studentNumber;

    /** 名字 */
    @Excel(name = "名字")
    private String studentName;

    /** 学生生日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "学生生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 用户性别（0男 1女 2未知） */
    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 状态（0正常 1停用） */
    private String status;

    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setClaseId(Long claseId) 
    {
        this.claseId = claseId;
    }

    public Long getClaseId() 
    {
        return claseId;
    }
    public void setStudentNumber(String studentNumber) 
    {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() 
    {
        return studentNumber;
    }
    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public String getStudentName() 
    {
        return studentName;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
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
            .append("studentId", getStudentId())
            .append("claseId", getClaseId())
            .append("studentNumber", getStudentNumber())
            .append("studentName", getStudentName())
            .append("birthday", getBirthday())
            .append("sex", getSex())
            .append("address", getAddress())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
