package com.ruoyi.project.kinder_teacher.service.impl;

import java.util.List;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.spring.SpringUtils;
import com.ruoyi.project.system.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.kinder_teacher.mapper.KinderTeacherMapper;
import com.ruoyi.project.kinder_teacher.domain.KinderTeacher;
import com.ruoyi.project.kinder_teacher.service.IKinderTeacherService;

/**
 * 老师Service业务层处理
 * 
 * @author huibox
 * @date 2021-11-04
 */
@Service
public class KinderTeacherServiceImpl implements IKinderTeacherService 
{
    @Autowired
    private KinderTeacherMapper kinderTeacherMapper;

    /**
     * 查询老师
     * 
     * @param teacherId 老师主键
     * @return 老师
     */
    @Override
    public KinderTeacher selectKinderTeacherByTeacherId(Long teacherId)
    {
        return kinderTeacherMapper.selectKinderTeacherByTeacherId(teacherId);
    }

    /**
     * 查询老师列表
     * 
     * @param kinderTeacher 老师
     * @return 老师
     */
    @Override
    public List<KinderTeacher> selectKinderTeacherList(KinderTeacher kinderTeacher)
    {
        return kinderTeacherMapper.selectKinderTeacherList(kinderTeacher);
    }

    /**
     * 新增老师
     * 
     * @param kinderTeacher 老师
     * @return 结果
     */
    @Override
    public int insertKinderTeacher(KinderTeacher kinderTeacher)
    {
        kinderTeacher.setCreateTime(DateUtils.getNowDate());
        return kinderTeacherMapper.insertKinderTeacher(kinderTeacher);
    }

    /**
     * 修改老师
     * 
     * @param kinderTeacher 老师
     * @return 结果
     */
    @Override
    public int updateKinderTeacher(KinderTeacher kinderTeacher)
    {
        kinderTeacher.setUpdateTime(DateUtils.getNowDate());
        return kinderTeacherMapper.updateKinderTeacher(kinderTeacher);
    }

    /**
     * 批量删除老师
     * 
     * @param teacherIds 需要删除的老师主键
     * @return 结果
     */
    @Override
    public int deleteKinderTeacherByTeacherIds(Long[] teacherIds)
    {
        return kinderTeacherMapper.deleteKinderTeacherByTeacherIds(teacherIds);
    }

    /**
     * 删除老师信息
     * 
     * @param teacherId 老师主键
     * @return 结果
     */
    @Override
    public int deleteKinderTeacherByTeacherId(Long teacherId)
    {
        return kinderTeacherMapper.deleteKinderTeacherByTeacherId(teacherId);
    }

    /**
     * 修改老师状态
     *
     * @param kinderTeacher 老师信息
     * @return 结果
     */
    @Override
    public int updateKinderTeacherStatus(KinderTeacher kinderTeacher)
    {
        return kinderTeacherMapper.updateKinderTeacher(kinderTeacher);
    }

}
