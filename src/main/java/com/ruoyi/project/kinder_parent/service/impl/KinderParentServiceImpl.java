package com.ruoyi.project.kinder_parent.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.kinder_parent.mapper.KinderParentMapper;
import com.ruoyi.project.kinder_parent.domain.KinderParent;
import com.ruoyi.project.kinder_parent.service.IKinderParentService;

/**
 * 家长Service业务层处理
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@Service
public class KinderParentServiceImpl implements IKinderParentService 
{
    @Autowired
    private KinderParentMapper kinderParentMapper;

    /**
     * 查询家长
     * 
     * @param parentId 家长主键
     * @return 家长
     */
    @Override
    public KinderParent selectKinderParentByParentId(Long parentId)
    {
        return kinderParentMapper.selectKinderParentByParentId(parentId);
    }

    /**
     * 查询家长列表
     * 
     * @param kinderParent 家长
     * @return 家长
     */
    @Override
    public List<KinderParent> selectKinderParentList(KinderParent kinderParent)
    {
        return kinderParentMapper.selectKinderParentList(kinderParent);
    }

    /**
     * 新增家长
     * 
     * @param kinderParent 家长
     * @return 结果
     */
    @Override
    public int insertKinderParent(KinderParent kinderParent)
    {
        kinderParent.setCreateTime(DateUtils.getNowDate());
        return kinderParentMapper.insertKinderParent(kinderParent);
    }

    /**
     * 修改家长
     * 
     * @param kinderParent 家长
     * @return 结果
     */
    @Override
    public int updateKinderParent(KinderParent kinderParent)
    {
        kinderParent.setUpdateTime(DateUtils.getNowDate());
        return kinderParentMapper.updateKinderParent(kinderParent);
    }

    /**
     * 批量删除家长
     * 
     * @param parentIds 需要删除的家长主键
     * @return 结果
     */
    @Override
    public int deleteKinderParentByParentIds(Long[] parentIds)
    {
        return kinderParentMapper.deleteKinderParentByParentIds(parentIds);
    }

    /**
     * 删除家长信息
     * 
     * @param parentId 家长主键
     * @return 结果
     */
    @Override
    public int deleteKinderParentByParentId(Long parentId)
    {
        return kinderParentMapper.deleteKinderParentByParentId(parentId);
    }
}
