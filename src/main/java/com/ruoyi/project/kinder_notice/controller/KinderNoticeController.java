package com.ruoyi.project.kinder_notice.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.kinder_notice.domain.KinderNotice;
import com.ruoyi.project.kinder_notice.service.IKinderNoticeService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 公告Controller
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@RestController
@RequestMapping("/kinder_notice/notice")
public class KinderNoticeController extends BaseController
{
    @Autowired
    private IKinderNoticeService kinderNoticeService;

    /**
     * 查询公告列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_notice:notice:list')")
    @GetMapping("/list")
    public TableDataInfo list(KinderNotice kinderNotice)
    {
        startPage();
        List<KinderNotice> list = kinderNoticeService.selectKinderNoticeList(kinderNotice);
        return getDataTable(list);
    }

    /**
     * 导出公告列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_notice:notice:export')")
    @Log(title = "公告", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(KinderNotice kinderNotice)
    {
        List<KinderNotice> list = kinderNoticeService.selectKinderNoticeList(kinderNotice);
        ExcelUtil<KinderNotice> util = new ExcelUtil<KinderNotice>(KinderNotice.class);
        return util.exportExcel(list, "公告数据");
    }

    /**
     * 获取公告详细信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_notice:notice:query')")
    @GetMapping(value = "/{noticeId}")
    public AjaxResult getInfo(@PathVariable("noticeId") Long noticeId)
    {
        return AjaxResult.success(kinderNoticeService.selectKinderNoticeByNoticeId(noticeId));
    }

    /**
     * 新增公告
     */
    @PreAuthorize("@ss.hasPermi('kinder_notice:notice:add')")
    @Log(title = "公告", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KinderNotice kinderNotice)
    {
        return toAjax(kinderNoticeService.insertKinderNotice(kinderNotice));
    }

    /**
     * 修改公告
     */
    @PreAuthorize("@ss.hasPermi('kinder_notice:notice:edit')")
    @Log(title = "公告", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KinderNotice kinderNotice)
    {
        return toAjax(kinderNoticeService.updateKinderNotice(kinderNotice));
    }

    /**
     * 删除公告
     */
    @PreAuthorize("@ss.hasPermi('kinder_notice:notice:remove')")
    @Log(title = "公告", businessType = BusinessType.DELETE)
	@DeleteMapping("/{noticeIds}")
    public AjaxResult remove(@PathVariable Long[] noticeIds)
    {
        return toAjax(kinderNoticeService.deleteKinderNoticeByNoticeIds(noticeIds));
    }
}
