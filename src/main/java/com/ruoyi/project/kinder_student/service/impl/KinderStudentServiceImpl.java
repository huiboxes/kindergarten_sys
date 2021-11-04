package com.ruoyi.project.kinder_student.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.kinder_student.mapper.KinderStudentMapper;
import com.ruoyi.project.kinder_student.domain.KinderStudent;
import com.ruoyi.project.kinder_student.service.IKinderStudentService;

/**
 * 学生Service业务层处理
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@Service
public class KinderStudentServiceImpl implements IKinderStudentService 
{
    @Autowired
    private KinderStudentMapper kinderStudentMapper;

    /**
     * 查询学生
     * 
     * @param studentId 学生主键
     * @return 学生
     */
    @Override
    public KinderStudent selectKinderStudentByStudentId(Long studentId)
    {
        return kinderStudentMapper.selectKinderStudentByStudentId(studentId);
    }

    /**
     * 查询学生列表
     * 
     * @param kinderStudent 学生
     * @return 学生
     */
    @Override
    public List<KinderStudent> selectKinderStudentList(KinderStudent kinderStudent)
    {
        return kinderStudentMapper.selectKinderStudentList(kinderStudent);
    }

    /**
     * 新增学生
     * 
     * @param kinderStudent 学生
     * @return 结果
     */
    @Override
    public int insertKinderStudent(KinderStudent kinderStudent)
    {
        kinderStudent.setCreateTime(DateUtils.getNowDate());
        return kinderStudentMapper.insertKinderStudent(kinderStudent);
    }

    /**
     * 修改学生
     * 
     * @param kinderStudent 学生
     * @return 结果
     */
    @Override
    public int updateKinderStudent(KinderStudent kinderStudent)
    {
        kinderStudent.setUpdateTime(DateUtils.getNowDate());
        return kinderStudentMapper.updateKinderStudent(kinderStudent);
    }

    /**
     * 批量删除学生
     * 
     * @param studentIds 需要删除的学生主键
     * @return 结果
     */
    @Override
    public int deleteKinderStudentByStudentIds(Long[] studentIds)
    {
        return kinderStudentMapper.deleteKinderStudentByStudentIds(studentIds);
    }

    /**
     * 删除学生信息
     * 
     * @param studentId 学生主键
     * @return 结果
     */
    @Override
    public int deleteKinderStudentByStudentId(Long studentId)
    {
        return kinderStudentMapper.deleteKinderStudentByStudentId(studentId);
    }
}
