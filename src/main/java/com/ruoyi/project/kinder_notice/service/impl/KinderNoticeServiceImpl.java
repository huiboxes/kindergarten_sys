package com.ruoyi.project.kinder_notice.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.kinder_notice.mapper.KinderNoticeMapper;
import com.ruoyi.project.kinder_notice.domain.KinderNotice;
import com.ruoyi.project.kinder_notice.service.IKinderNoticeService;

/**
 * 公告Service业务层处理
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@Service
public class KinderNoticeServiceImpl implements IKinderNoticeService 
{
    @Autowired
    private KinderNoticeMapper kinderNoticeMapper;

    /**
     * 查询公告
     * 
     * @param noticeId 公告主键
     * @return 公告
     */
    @Override
    public KinderNotice selectKinderNoticeByNoticeId(Long noticeId)
    {
        return kinderNoticeMapper.selectKinderNoticeByNoticeId(noticeId);
    }

    /**
     * 查询公告列表
     * 
     * @param kinderNotice 公告
     * @return 公告
     */
    @Override
    public List<KinderNotice> selectKinderNoticeList(KinderNotice kinderNotice)
    {
        return kinderNoticeMapper.selectKinderNoticeList(kinderNotice);
    }

    /**
     * 新增公告
     * 
     * @param kinderNotice 公告
     * @return 结果
     */
    @Override
    public int insertKinderNotice(KinderNotice kinderNotice)
    {
        kinderNotice.setCreateTime(DateUtils.getNowDate());
        return kinderNoticeMapper.insertKinderNotice(kinderNotice);
    }

    /**
     * 修改公告
     * 
     * @param kinderNotice 公告
     * @return 结果
     */
    @Override
    public int updateKinderNotice(KinderNotice kinderNotice)
    {
        kinderNotice.setUpdateTime(DateUtils.getNowDate());
        return kinderNoticeMapper.updateKinderNotice(kinderNotice);
    }

    /**
     * 批量删除公告
     * 
     * @param noticeIds 需要删除的公告主键
     * @return 结果
     */
    @Override
    public int deleteKinderNoticeByNoticeIds(Long[] noticeIds)
    {
        return kinderNoticeMapper.deleteKinderNoticeByNoticeIds(noticeIds);
    }

    /**
     * 删除公告信息
     * 
     * @param noticeId 公告主键
     * @return 结果
     */
    @Override
    public int deleteKinderNoticeByNoticeId(Long noticeId)
    {
        return kinderNoticeMapper.deleteKinderNoticeByNoticeId(noticeId);
    }
}
