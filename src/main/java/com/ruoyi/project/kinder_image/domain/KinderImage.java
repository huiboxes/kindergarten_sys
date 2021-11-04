package com.ruoyi.project.kinder_image.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 照片墙对象 kinder_image
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public class KinderImage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 图片编号 */
    private Long imageId;

    /** 教师编号 */
    @Excel(name = "教师编号")
    private Long teacherId;

    /** 班级编号 */
    @Excel(name = "班级编号")
    private Long claseId;

    /** 头像地址 */
    @Excel(name = "头像地址")
    private String imgSrc;

    /** 状态（0正常 1停用） */
    private String status;

    public void setImageId(Long imageId) 
    {
        this.imageId = imageId;
    }

    public Long getImageId() 
    {
        return imageId;
    }
    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setClaseId(Long claseId) 
    {
        this.claseId = claseId;
    }

    public Long getClaseId() 
    {
        return claseId;
    }
    public void setImgSrc(String imgSrc) 
    {
        this.imgSrc = imgSrc;
    }

    public String getImgSrc() 
    {
        return imgSrc;
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
            .append("imageId", getImageId())
            .append("teacherId", getTeacherId())
            .append("claseId", getClaseId())
            .append("imgSrc", getImgSrc())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
