package com.ruoyi.project.kinder_parent.mapper;

import java.util.List;
import com.ruoyi.project.kinder_parent.domain.KinderParent;

/**
 * 家长Mapper接口
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public interface KinderParentMapper 
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
     * 删除家长
     * 
     * @param parentId 家长主键
     * @return 结果
     */
    public int deleteKinderParentByParentId(Long parentId);

    /**
     * 批量删除家长
     * 
     * @param parentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKinderParentByParentIds(Long[] parentIds);
}
