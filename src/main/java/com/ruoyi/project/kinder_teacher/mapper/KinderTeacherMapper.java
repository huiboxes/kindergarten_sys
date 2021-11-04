package com.ruoyi.project.kinder_teacher.mapper;

import java.util.List;
import com.ruoyi.project.kinder_teacher.domain.KinderTeacher;

/**
 * 老师Mapper接口
 * 
 * @author huibox
 * @date 2021-11-04
 */
public interface KinderTeacherMapper 
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
     * 删除老师
     * 
     * @param teacherId 老师主键
     * @return 结果
     */
    public int deleteKinderTeacherByTeacherId(Long teacherId);

    /**
     * 批量删除老师
     * 
     * @param teacherIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKinderTeacherByTeacherIds(Long[] teacherIds);
}
