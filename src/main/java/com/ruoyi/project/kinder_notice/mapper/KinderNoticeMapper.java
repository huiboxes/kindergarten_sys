package com.ruoyi.project.kinder_notice.mapper;

import java.util.List;
import com.ruoyi.project.kinder_notice.domain.KinderNotice;

/**
 * 公告Mapper接口
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public interface KinderNoticeMapper 
{
    /**
     * 查询公告
     * 
     * @param noticeId 公告主键
     * @return 公告
     */
    public KinderNotice selectKinderNoticeByNoticeId(Long noticeId);

    /**
     * 查询公告列表
     * 
     * @param kinderNotice 公告
     * @return 公告集合
     */
    public List<KinderNotice> selectKinderNoticeList(KinderNotice kinderNotice);

    /**
     * 新增公告
     * 
     * @param kinderNotice 公告
     * @return 结果
     */
    public int insertKinderNotice(KinderNotice kinderNotice);

    /**
     * 修改公告
     * 
     * @param kinderNotice 公告
     * @return 结果
     */
    public int updateKinderNotice(KinderNotice kinderNotice);

    /**
     * 删除公告
     * 
     * @param noticeId 公告主键
     * @return 结果
     */
    public int deleteKinderNoticeByNoticeId(Long noticeId);

    /**
     * 批量删除公告
     * 
     * @param noticeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteKinderNoticeByNoticeIds(Long[] noticeIds);
}
