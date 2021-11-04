package com.ruoyi.project.kinder_student.mapper;

import java.util.List;
import com.ruoyi.project.kinder_student.domain.KinderStudent;

/**
 * 学生Mapper接口
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public interface KinderStudentMapper 
{
    /**
     * 查询学生
     * 
     * @param studentId 学生主键
     * @return 学生
     */
    public KinderStudent selectKinderStudentByStudentId(Long studentId);

    /**
     * 查询学生列表
     * 
     * @param kinderStudent 学生
     * @return 学生集合
     */
    public List<KinderStudent> selectKinderStudentList(KinderStudent kinderStudent);

    /**
     * 新增学生
     * 
     * @param kinderStudent 学生
     * @return 结果
     */
    public int insertKinderStudent(KinderStudent kinderStudent);

    /**
     * 修改学生
     * 
     * @param kinderStudent 学生
     * @return 结果
     */
    public int updateKinderStudent(KinderStudent kinderStudent);

    /**
     * 删除学生
     * 
     * @param studentId 学生主键
     * @return 结果
     */
    public int deleteKinderStudentByStudentId(Long studentId);

    /**
     * 批量删除学生
     * 
     * @param studentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKinderStudentByStudentIds(Long[] studentIds);
}
