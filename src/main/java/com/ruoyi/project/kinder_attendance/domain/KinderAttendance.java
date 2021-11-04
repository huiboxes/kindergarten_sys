package com.ruoyi.project.kinder_attendance.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 出勤对象 kinder_attendance
 * 
 * @author huibox
 * @date 2021-11-04
 */
public class KinderAttendance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录编号 */
    private Long attendanceId;

    /** 入园时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入园时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inTime;

    /** 离园时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "离园时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date outTime;

    /** 假条编号 */
    @Excel(name = "假条编号")
    private Long infoId;

    /** 学生ID */
    @Excel(name = "学生ID")
    private Long studentId;

    /** 推送信息 */
    @Excel(name = "推送信息")
    private String content;

    /** 状态（0正常 1停用） */
    private String status;

    public void setAttendanceId(Long attendanceId) 
    {
        this.attendanceId = attendanceId;
    }

    public Long getAttendanceId() 
    {
        return attendanceId;
    }
    public void setInTime(Date inTime) 
    {
        this.inTime = inTime;
    }

    public Date getInTime() 
    {
        return inTime;
    }
    public void setOutTime(Date outTime) 
    {
        this.outTime = outTime;
    }

    public Date getOutTime() 
    {
        return outTime;
    }
    public void setInfoId(Long infoId) 
    {
        this.infoId = infoId;
    }

    public Long getInfoId() 
    {
        return infoId;
    }
    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
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
            .append("attendanceId", getAttendanceId())
            .append("inTime", getInTime())
            .append("outTime", getOutTime())
            .append("infoId", getInfoId())
            .append("studentId", getStudentId())
            .append("content", getContent())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
