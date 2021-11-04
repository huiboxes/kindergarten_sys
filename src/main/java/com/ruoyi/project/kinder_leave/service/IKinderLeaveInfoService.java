package com.ruoyi.project.kinder_leave.service;

import java.util.List;
import com.ruoyi.project.kinder_leave.domain.KinderLeaveInfo;

/**
 * 请假信息Service接口
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public interface IKinderLeaveInfoService 
{
    /**
     * 查询请假信息
     * 
     * @param infoId 请假信息主键
     * @return 请假信息
     */
    public KinderLeaveInfo selectKinderLeaveInfoByInfoId(Long infoId);

    /**
     * 查询请假信息列表
     * 
     * @param kinderLeaveInfo 请假信息
     * @return 请假信息集合
     */
    public List<KinderLeaveInfo> selectKinderLeaveInfoList(KinderLeaveInfo kinderLeaveInfo);

    /**
     * 新增请假信息
     * 
     * @param kinderLeaveInfo 请假信息
     * @return 结果
     */
    public int insertKinderLeaveInfo(KinderLeaveInfo kinderLeaveInfo);

    /**
     * 修改请假信息
     * 
     * @param kinderLeaveInfo 请假信息
     * @return 结果
     */
    public int updateKinderLeaveInfo(KinderLeaveInfo kinderLeaveInfo);

    /**
     * 批量删除请假信息
     * 
     * @param infoIds 需要删除的请假信息主键集合
     * @return 结果
     */
    public int deleteKinderLeaveInfoByInfoIds(Long[] infoIds);

    /**
     * 删除请假信息信息
     * 
     * @param infoId 请假信息主键
     * @return 结果
     */
    public int deleteKinderLeaveInfoByInfoId(Long infoId);
}
