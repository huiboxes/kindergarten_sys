package com.ruoyi.project.kinder_attendance.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.kinder_attendance.mapper.KinderAttendanceMapper;
import com.ruoyi.project.kinder_attendance.domain.KinderAttendance;
import com.ruoyi.project.kinder_attendance.service.IKinderAttendanceService;

/**
 * 出勤Service业务层处理
 * 
 * @author huibox
 * @date 2021-11-04
 */
@Service
public class KinderAttendanceServiceImpl implements IKinderAttendanceService 
{
    @Autowired
    private KinderAttendanceMapper kinderAttendanceMapper;

    /**
     * 查询出勤
     * 
     * @param attendanceId 出勤主键
     * @return 出勤
     */
    @Override
    public KinderAttendance selectKinderAttendanceByAttendanceId(Long attendanceId)
    {
        return kinderAttendanceMapper.selectKinderAttendanceByAttendanceId(attendanceId);
    }

    /**
     * 查询出勤列表
     * 
     * @param kinderAttendance 出勤
     * @return 出勤
     */
    @Override
    public List<KinderAttendance> selectKinderAttendanceList(KinderAttendance kinderAttendance)
    {
        return kinderAttendanceMapper.selectKinderAttendanceList(kinderAttendance);
    }

    /**
     * 新增出勤
     * 
     * @param kinderAttendance 出勤
     * @return 结果
     */
    @Override
    public int insertKinderAttendance(KinderAttendance kinderAttendance)
    {
        kinderAttendance.setCreateTime(DateUtils.getNowDate());
        return kinderAttendanceMapper.insertKinderAttendance(kinderAttendance);
    }

    /**
     * 修改出勤
     * 
     * @param kinderAttendance 出勤
     * @return 结果
     */
    @Override
    public int updateKinderAttendance(KinderAttendance kinderAttendance)
    {
        kinderAttendance.setUpdateTime(DateUtils.getNowDate());
        return kinderAttendanceMapper.updateKinderAttendance(kinderAttendance);
    }

    /**
     * 批量删除出勤
     * 
     * @param attendanceIds 需要删除的出勤主键
     * @return 结果
     */
    @Override
    public int deleteKinderAttendanceByAttendanceIds(Long[] attendanceIds)
    {
        return kinderAttendanceMapper.deleteKinderAttendanceByAttendanceIds(attendanceIds);
    }

    /**
     * 删除出勤信息
     * 
     * @param attendanceId 出勤主键
     * @return 结果
     */
    @Override
    public int deleteKinderAttendanceByAttendanceId(Long attendanceId)
    {
        return kinderAttendanceMapper.deleteKinderAttendanceByAttendanceId(attendanceId);
    }
}
