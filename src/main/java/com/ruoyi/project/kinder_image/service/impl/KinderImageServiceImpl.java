package com.ruoyi.project.kinder_image.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.kinder_image.mapper.KinderImageMapper;
import com.ruoyi.project.kinder_image.domain.KinderImage;
import com.ruoyi.project.kinder_image.service.IKinderImageService;

/**
 * 照片墙Service业务层处理
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@Service
public class KinderImageServiceImpl implements IKinderImageService 
{
    @Autowired
    private KinderImageMapper kinderImageMapper;

    /**
     * 查询照片墙
     * 
     * @param imageId 照片墙主键
     * @return 照片墙
     */
    @Override
    public KinderImage selectKinderImageByImageId(Long imageId)
    {
        return kinderImageMapper.selectKinderImageByImageId(imageId);
    }

    /**
     * 查询照片墙列表
     * 
     * @param kinderImage 照片墙
     * @return 照片墙
     */
    @Override
    public List<KinderImage> selectKinderImageList(KinderImage kinderImage)
    {
        return kinderImageMapper.selectKinderImageList(kinderImage);
    }

    /**
     * 新增照片墙
     * 
     * @param kinderImage 照片墙
     * @return 结果
     */
    @Override
    public int insertKinderImage(KinderImage kinderImage)
    {
        kinderImage.setCreateTime(DateUtils.getNowDate());
        return kinderImageMapper.insertKinderImage(kinderImage);
    }

    /**
     * 修改照片墙
     * 
     * @param kinderImage 照片墙
     * @return 结果
     */
    @Override
    public int updateKinderImage(KinderImage kinderImage)
    {
        kinderImage.setUpdateTime(DateUtils.getNowDate());
        return kinderImageMapper.updateKinderImage(kinderImage);
    }

    /**
     * 批量删除照片墙
     * 
     * @param imageIds 需要删除的照片墙主键
     * @return 结果
     */
    @Override
    public int deleteKinderImageByImageIds(Long[] imageIds)
    {
        return kinderImageMapper.deleteKinderImageByImageIds(imageIds);
    }

    /**
     * 删除照片墙信息
     * 
     * @param imageId 照片墙主键
     * @return 结果
     */
    @Override
    public int deleteKinderImageByImageId(Long imageId)
    {
        return kinderImageMapper.deleteKinderImageByImageId(imageId);
    }
}
