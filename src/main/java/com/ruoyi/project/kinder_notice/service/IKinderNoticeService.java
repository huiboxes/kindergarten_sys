package com.ruoyi.project.kinder_notice.service;

import java.util.List;
import com.ruoyi.project.kinder_notice.domain.KinderNotice;

/**
 * 公告Service接口
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
public interface IKinderNoticeService 
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
     * 批量删除公告
     * 
     * @param noticeIds 需要删除的公告主键集合
     * @return 结果
     */
    public int deleteKinderNoticeByNoticeIds(Long[] noticeIds);

    /**
     * 删除公告信息
     * 
     * @param noticeId 公告主键
     * @return 结果
     */
    public int deleteKinderNoticeByNoticeId(Long noticeId);
}
