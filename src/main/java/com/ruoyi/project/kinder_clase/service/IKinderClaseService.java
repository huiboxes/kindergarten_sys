package com.ruoyi.project.kinder_clase.service;

import java.util.List;
import com.ruoyi.project.kinder_clase.domain.KinderClase;

/**
 * 班级Service接口
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public interface IKinderClaseService 
{
    /**
     * 查询班级
     * 
     * @param claseId 班级主键
     * @return 班级
     */
    public KinderClase selectKinderClaseByClaseId(Long claseId);

    /**
     * 查询班级列表
     * 
     * @param kinderClase 班级
     * @return 班级集合
     */
    public List<KinderClase> selectKinderClaseList(KinderClase kinderClase);

    /**
     * 新增班级
     * 
     * @param kinderClase 班级
     * @return 结果
     */
    public int insertKinderClase(KinderClase kinderClase);

    /**
     * 修改班级
     * 
     * @param kinderClase 班级
     * @return 结果
     */
    public int updateKinderClase(KinderClase kinderClase);

    /**
     * 批量删除班级
     * 
     * @param claseIds 需要删除的班级主键集合
     * @return 结果
     */
    public int deleteKinderClaseByClaseIds(Long[] claseIds);

    /**
     * 删除班级信息
     * 
     * @param claseId 班级主键
     * @return 结果
     */
    public int deleteKinderClaseByClaseId(Long claseId);
}
