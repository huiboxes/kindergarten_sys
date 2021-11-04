package com.ruoyi.project.kinder_leave.controller;

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
import com.ruoyi.project.kinder_leave.domain.KinderLeaveInfo;
import com.ruoyi.project.kinder_leave.service.IKinderLeaveInfoService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 请假信息Controller
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@RestController
@RequestMapping("/kinder_leave/leaveinfo")
public class KinderLeaveInfoController extends BaseController
{
    @Autowired
    private IKinderLeaveInfoService kinderLeaveInfoService;

    /**
     * 查询请假信息列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_leave:leaveinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(KinderLeaveInfo kinderLeaveInfo)
    {
        startPage();
        List<KinderLeaveInfo> list = kinderLeaveInfoService.selectKinderLeaveInfoList(kinderLeaveInfo);
        return getDataTable(list);
    }

    /**
     * 导出请假信息列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_leave:leaveinfo:export')")
    @Log(title = "请假信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(KinderLeaveInfo kinderLeaveInfo)
    {
        List<KinderLeaveInfo> list = kinderLeaveInfoService.selectKinderLeaveInfoList(kinderLeaveInfo);
        ExcelUtil<KinderLeaveInfo> util = new ExcelUtil<KinderLeaveInfo>(KinderLeaveInfo.class);
        return util.exportExcel(list, "请假信息数据");
    }

    /**
     * 获取请假信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_leave:leaveinfo:query')")
    @GetMapping(value = "/{infoId}")
    public AjaxResult getInfo(@PathVariable("infoId") Long infoId)
    {
        return AjaxResult.success(kinderLeaveInfoService.selectKinderLeaveInfoByInfoId(infoId));
    }

    /**
     * 新增请假信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_leave:leaveinfo:add')")
    @Log(title = "请假信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KinderLeaveInfo kinderLeaveInfo)
    {
        return toAjax(kinderLeaveInfoService.insertKinderLeaveInfo(kinderLeaveInfo));
    }

    /**
     * 修改请假信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_leave:leaveinfo:edit')")
    @Log(title = "请假信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KinderLeaveInfo kinderLeaveInfo)
    {
        return toAjax(kinderLeaveInfoService.updateKinderLeaveInfo(kinderLeaveInfo));
    }

    /**
     * 删除请假信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_leave:leaveinfo:remove')")
    @Log(title = "请假信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{infoIds}")
    public AjaxResult remove(@PathVariable Long[] infoIds)
    {
        return toAjax(kinderLeaveInfoService.deleteKinderLeaveInfoByInfoIds(infoIds));
    }
}
