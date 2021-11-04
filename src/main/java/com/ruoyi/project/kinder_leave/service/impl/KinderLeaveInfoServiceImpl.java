package com.ruoyi.project.kinder_leave.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.kinder_leave.mapper.KinderLeaveInfoMapper;
import com.ruoyi.project.kinder_leave.domain.KinderLeaveInfo;
import com.ruoyi.project.kinder_leave.service.IKinderLeaveInfoService;

/**
 * 请假信息Service业务层处理
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@Service
public class KinderLeaveInfoServiceImpl implements IKinderLeaveInfoService 
{
    @Autowired
    private KinderLeaveInfoMapper kinderLeaveInfoMapper;

    /**
     * 查询请假信息
     * 
     * @param infoId 请假信息主键
     * @return 请假信息
     */
    @Override
    public KinderLeaveInfo selectKinderLeaveInfoByInfoId(Long infoId)
    {
        return kinderLeaveInfoMapper.selectKinderLeaveInfoByInfoId(infoId);
    }

    /**
     * 查询请假信息列表
     * 
     * @param kinderLeaveInfo 请假信息
     * @return 请假信息
     */
    @Override
    public List<KinderLeaveInfo> selectKinderLeaveInfoList(KinderLeaveInfo kinderLeaveInfo)
    {
        return kinderLeaveInfoMapper.selectKinderLeaveInfoList(kinderLeaveInfo);
    }

    /**
     * 新增请假信息
     * 
     * @param kinderLeaveInfo 请假信息
     * @return 结果
     */
    @Override
    public int insertKinderLeaveInfo(KinderLeaveInfo kinderLeaveInfo)
    {
        kinderLeaveInfo.setCreateTime(DateUtils.getNowDate());
        return kinderLeaveInfoMapper.insertKinderLeaveInfo(kinderLeaveInfo);
    }

    /**
     * 修改请假信息
     * 
     * @param kinderLeaveInfo 请假信息
     * @return 结果
     */
    @Override
    public int updateKinderLeaveInfo(KinderLeaveInfo kinderLeaveInfo)
    {
        kinderLeaveInfo.setUpdateTime(DateUtils.getNowDate());
        return kinderLeaveInfoMapper.updateKinderLeaveInfo(kinderLeaveInfo);
    }

    /**
     * 批量删除请假信息
     * 
     * @param infoIds 需要删除的请假信息主键
     * @return 结果
     */
    @Override
    public int deleteKinderLeaveInfoByInfoIds(Long[] infoIds)
    {
        return kinderLeaveInfoMapper.deleteKinderLeaveInfoByInfoIds(infoIds);
    }

    /**
     * 删除请假信息信息
     * 
     * @param infoId 请假信息主键
     * @return 结果
     */
    @Override
    public int deleteKinderLeaveInfoByInfoId(Long infoId)
    {
        return kinderLeaveInfoMapper.deleteKinderLeaveInfoByInfoId(infoId);
    }
}
