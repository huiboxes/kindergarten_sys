package com.ruoyi.project.kinder_teacher.service;

import java.util.List;
import com.ruoyi.project.kinder_teacher.domain.KinderTeacher;
import com.ruoyi.project.system.domain.SysUser;

/**
 * 老师Service接口
 * 
 * @author huibox
 * @date 2021-11-04
 */
public interface IKinderTeacherService 
{
    /**
     * 查询老师
     * 
     * @param teacherId 老师主键
     * @return 老师
     */
    public KinderTeacher selectKinderTeacherByTeacherId(Long teacherId);

    /**
     * 查询老师列表
     * 
     * @param kinderTeacher 老师
     * @return 老师集合
     */
    public List<KinderTeacher> selectKinderTeacherList(KinderTeacher kinderTeacher);

    /**
     * 新增老师
     * 
     * @param kinderTeacher 老师
     * @return 结果
     */
    public int insertKinderTeacher(KinderTeacher kinderTeacher);

    /**
     * 修改老师
     * 
     * @param kinderTeacher 老师
     * @return 结果
     */
    public int updateKinderTeacher(KinderTeacher kinderTeacher);

    /**
     * 批量删除老师
     * 
     * @param teacherIds 需要删除的老师主键集合
     * @return 结果
     */
    public int deleteKinderTeacherByTeacherIds(Long[] teacherIds);

    /**
     * 删除老师信息
     * 
     * @param teacherId 老师主键
     * @return 结果
     */
    public int deleteKinderTeacherByTeacherId(Long teacherId);
    /**
     * 修改老师状态
     *
     * @param kinderTeacher 老师信息
     * @return 结果
     */
    public int updateKinderTeacherStatus(KinderTeacher kinderTeacher);
}
