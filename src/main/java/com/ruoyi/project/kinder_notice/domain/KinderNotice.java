package com.ruoyi.project.kinder_notice.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 公告对象 kinder_notice
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public class KinderNotice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 公告编号 */
    private Long noticeId;

    /** 公告内容 */
    @Excel(name = "公告内容")
    private String content;

    /** 发件人编号 */
    @Excel(name = "发件人编号")
    private Long teacherId;

    /** 收件人编号 */
    @Excel(name = "收件人编号")
    private Long parentId;

    /** 状态（0正常 1停用） */
    private String status;

    public void setNoticeId(Long noticeId) 
    {
        this.noticeId = noticeId;
    }

    public Long getNoticeId() 
    {
        return noticeId;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
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
            .append("noticeId", getNoticeId())
            .append("content", getContent())
            .append("teacherId", getTeacherId())
            .append("parentId", getParentId())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
