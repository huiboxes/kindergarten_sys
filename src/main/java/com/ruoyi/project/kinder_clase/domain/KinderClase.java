package com.ruoyi.project.kinder_clase.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 班级对象 kinder_clase
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public class KinderClase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班级ID */
    private Long claseId;

    /** 班主任编号 */
    @Excel(name = "班主任编号")
    private Long teacherId;

    /** 助教工号 */
    @Excel(name = "助教工号")
    private Long taId;

    /** 班级名字 */
    @Excel(name = "班级名字")
    private String claseName;

    /** 班级类型 */
    @Excel(name = "班级类型")
    private String claseType;

    /** 状态（0正常 1停用） */
    private String status;

    public void setClaseId(Long claseId) 
    {
        this.claseId = claseId;
    }

    public Long getClaseId() 
    {
        return claseId;
    }
    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setTaId(Long taId) 
    {
        this.taId = taId;
    }

    public Long getTaId() 
    {
        return taId;
    }
    public void setClaseName(String claseName) 
    {
        this.claseName = claseName;
    }

    public String getClaseName() 
    {
        return claseName;
    }
    public void setClaseType(String claseType) 
    {
        this.claseType = claseType;
    }

    public String getClaseType() 
    {
        return claseType;
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
            .append("claseId", getClaseId())
            .append("teacherId", getTeacherId())
            .append("taId", getTaId())
            .append("claseName", getClaseName())
            .append("claseType", getClaseType())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
