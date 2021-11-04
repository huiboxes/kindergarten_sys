package com.ruoyi.project.kinder_image.mapper;

import java.util.List;
import com.ruoyi.project.kinder_image.domain.KinderImage;

/**
 * 照片墙Mapper接口
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public interface KinderImageMapper 
{
    /**
     * 查询照片墙
     * 
     * @param imageId 照片墙主键
     * @return 照片墙
     */
    public KinderImage selectKinderImageByImageId(Long imageId);

    /**
     * 查询照片墙列表
     * 
     * @param kinderImage 照片墙
     * @return 照片墙集合
     */
    public List<KinderImage> selectKinderImageList(KinderImage kinderImage);

    /**
     * 新增照片墙
     * 
     * @param kinderImage 照片墙
     * @return 结果
     */
    public int insertKinderImage(KinderImage kinderImage);

    /**
     * 修改照片墙
     * 
     * @param kinderImage 照片墙
     * @return 结果
     */
    public int updateKinderImage(KinderImage kinderImage);

    /**
     * 删除照片墙
     * 
     * @param imageId 照片墙主键
     * @return 结果
     */
    public int deleteKinderImageByImageId(Long imageId);

    /**
     * 批量删除照片墙
     * 
     * @param imageIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKinderImageByImageIds(Long[] imageIds);
}
