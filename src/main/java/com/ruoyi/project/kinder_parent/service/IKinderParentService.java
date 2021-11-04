package com.ruoyi.project.kinder_parent.service;

import java.util.List;
import com.ruoyi.project.kinder_parent.domain.KinderParent;

/**
 * 家长Service接口
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public interface IKinderParentService 
{
    /**
     * 查询家长
     * 
     * @param parentId 家长主键
     * @return 家长
     */
    public KinderParent selectKinderParentByParentId(Long parentId);

    /**
     * 查询家长列表
     * 
     * @param kinderParent 家长
     * @return 家长集合
     */
    public List<KinderParent> selectKinderParentList(KinderParent kinderParent);

    /**
     * 新增家长
     * 
     * @param kinderParent 家长
     * @return 结果
     */
    public int insertKinderParent(KinderParent kinderParent);

    /**
     * 修改家长
     * 
     * @param kinderParent 家长
     * @return 结果
     */
    public int updateKinderParent(KinderParent kinderParent);

    /**
     * 批量删除家长
     * 
     * @param parentIds 需要删除的家长主键集合
     * @return 结果
     */
    public int deleteKinderParentByParentIds(Long[] parentIds);

    /**
     * 删除家长信息
     * 
     * @param parentId 家长主键
     * @return 结果
     */
    public int deleteKinderParentByParentId(Long parentId);
}
