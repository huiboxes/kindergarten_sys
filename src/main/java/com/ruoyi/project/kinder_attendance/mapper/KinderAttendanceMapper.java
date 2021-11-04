package com.ruoyi.project.kinder_attendance.mapper;

import java.util.List;
import com.ruoyi.project.kinder_attendance.domain.KinderAttendance;

/**
 * 出勤Mapper接口
 * 
 * @author huibox
 * @date 2021-11-04
 */
public interface KinderAttendanceMapper 
{
    /**
     * 查询出勤
     * 
     * @param attendanceId 出勤主键
     * @return 出勤
     */
    public KinderAttendance selectKinderAttendanceByAttendanceId(Long attendanceId);

    /**
     * 查询出勤列表
     * 
     * @param kinderAttendance 出勤
     * @return 出勤集合
     */
    public List<KinderAttendance> selectKinderAttendanceList(KinderAttendance kinderAttendance);

    /**
     * 新增出勤
     * 
     * @param kinderAttendance 出勤
     * @return 结果
     */
    public int insertKinderAttendance(KinderAttendance kinderAttendance);

    /**
     * 修改出勤
     * 
     * @param kinderAttendance 出勤
     * @return 结果
     */
    public int updateKinderAttendance(KinderAttendance kinderAttendance);

    /**
     * 删除出勤
     * 
     * @param attendanceId 出勤主键
     * @return 结果
     */
    public int deleteKinderAttendanceByAttendanceId(Long attendanceId);

    /**
     * 批量删除出勤
     * 
     * @param attendanceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKinderAttendanceByAttendanceIds(Long[] attendanceIds);
}
