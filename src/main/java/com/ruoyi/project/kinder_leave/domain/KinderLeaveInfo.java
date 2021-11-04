package com.ruoyi.project.kinder_leave.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 请假信息对象 kinder_leave_info
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public class KinderLeaveInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 假条编号 */
    private Long infoId;

    /** 请假时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "请假时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date leaveTime;

    /** 请假原因 */
    @Excel(name = "请假原因")
    private String reasons;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setInfoId(Long infoId) 
    {
        this.infoId = infoId;
    }

    public Long getInfoId() 
    {
        return infoId;
    }
    public void setLeaveTime(Date leaveTime) 
    {
        this.leaveTime = leaveTime;
    }

    public Date getLeaveTime() 
    {
        return leaveTime;
    }
    public void setReasons(String reasons) 
    {
        this.reasons = reasons;
    }

    public String getReasons() 
    {
        return reasons;
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
            .append("infoId", getInfoId())
            .append("leaveTime", getLeaveTime())
            .append("reasons", getReasons())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
