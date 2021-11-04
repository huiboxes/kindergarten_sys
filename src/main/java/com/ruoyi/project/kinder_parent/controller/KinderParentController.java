package com.ruoyi.project.kinder_parent.controller;

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
import com.ruoyi.project.kinder_parent.domain.KinderParent;
import com.ruoyi.project.kinder_parent.service.IKinderParentService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 家长Controller
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@RestController
@RequestMapping("/kinder_parent/parent")
public class KinderParentController extends BaseController
{
    @Autowired
    private IKinderParentService kinderParentService;

    /**
     * 查询家长列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_parent:parent:list')")
    @GetMapping("/list")
    public TableDataInfo list(KinderParent kinderParent)
    {
        startPage();
        List<KinderParent> list = kinderParentService.selectKinderParentList(kinderParent);
        return getDataTable(list);
    }

    /**
     * 导出家长列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_parent:parent:export')")
    @Log(title = "家长", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(KinderParent kinderParent)
    {
        List<KinderParent> list = kinderParentService.selectKinderParentList(kinderParent);
        ExcelUtil<KinderParent> util = new ExcelUtil<KinderParent>(KinderParent.class);
        return util.exportExcel(list, "家长数据");
    }

    /**
     * 获取家长详细信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_parent:parent:query')")
    @GetMapping(value = "/{parentId}")
    public AjaxResult getInfo(@PathVariable("parentId") Long parentId)
    {
        return AjaxResult.success(kinderParentService.selectKinderParentByParentId(parentId));
    }

    /**
     * 新增家长
     */
    @PreAuthorize("@ss.hasPermi('kinder_parent:parent:add')")
    @Log(title = "家长", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KinderParent kinderParent)
    {
        return toAjax(kinderParentService.insertKinderParent(kinderParent));
    }

    /**
     * 修改家长
     */
    @PreAuthorize("@ss.hasPermi('kinder_parent:parent:edit')")
    @Log(title = "家长", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KinderParent kinderParent)
    {
        return toAjax(kinderParentService.updateKinderParent(kinderParent));
    }

    /**
     * 删除家长
     */
    @PreAuthorize("@ss.hasPermi('kinder_parent:parent:remove')")
    @Log(title = "家长", businessType = BusinessType.DELETE)
	@DeleteMapping("/{parentIds}")
    public AjaxResult remove(@PathVariable Long[] parentIds)
    {
        return toAjax(kinderParentService.deleteKinderParentByParentIds(parentIds));
    }
}
