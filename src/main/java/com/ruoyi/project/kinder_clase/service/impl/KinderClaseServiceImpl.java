package com.ruoyi.project.kinder_clase.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.kinder_clase.mapper.KinderClaseMapper;
import com.ruoyi.project.kinder_clase.domain.KinderClase;
import com.ruoyi.project.kinder_clase.service.IKinderClaseService;

/**
 * 班级Service业务层处理
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@Service
public class KinderClaseServiceImpl implements IKinderClaseService 
{
    @Autowired
    private KinderClaseMapper kinderClaseMapper;

    /**
     * 查询班级
     * 
     * @param claseId 班级主键
     * @return 班级
     */
    @Override
    public KinderClase selectKinderClaseByClaseId(Long claseId)
    {
        return kinderClaseMapper.selectKinderClaseByClaseId(claseId);
    }

    /**
     * 查询班级列表
     * 
     * @param kinderClase 班级
     * @return 班级
     */
    @Override
    public List<KinderClase> selectKinderClaseList(KinderClase kinderClase)
    {
        return kinderClaseMapper.selectKinderClaseList(kinderClase);
    }

    /**
     * 新增班级
     * 
     * @param kinderClase 班级
     * @return 结果
     */
    @Override
    public int insertKinderClase(KinderClase kinderClase)
    {
        kinderClase.setCreateTime(DateUtils.getNowDate());
        return kinderClaseMapper.insertKinderClase(kinderClase);
    }

    /**
     * 修改班级
     * 
     * @param kinderClase 班级
     * @return 结果
     */
    @Override
    public int updateKinderClase(KinderClase kinderClase)
    {
        kinderClase.setUpdateTime(DateUtils.getNowDate());
        return kinderClaseMapper.updateKinderClase(kinderClase);
    }

    /**
     * 批量删除班级
     * 
     * @param claseIds 需要删除的班级主键
     * @return 结果
     */
    @Override
    public int deleteKinderClaseByClaseIds(Long[] claseIds)
    {
        return kinderClaseMapper.deleteKinderClaseByClaseIds(claseIds);
    }

    /**
     * 删除班级信息
     * 
     * @param claseId 班级主键
     * @return 结果
     */
    @Override
    public int deleteKinderClaseByClaseId(Long claseId)
    {
        return kinderClaseMapper.deleteKinderClaseByClaseId(claseId);
    }
}
