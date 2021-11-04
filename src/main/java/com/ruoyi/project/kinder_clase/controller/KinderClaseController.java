package com.ruoyi.project.kinder_clase.controller;

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
import com.ruoyi.project.kinder_clase.domain.KinderClase;
import com.ruoyi.project.kinder_clase.service.IKinderClaseService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 班级Controller
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@RestController
@RequestMapping("/kinder_clase/clase")
public class KinderClaseController extends BaseController
{
    @Autowired
    private IKinderClaseService kinderClaseService;

    /**
     * 查询班级列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_clase:clase:list')")
    @GetMapping("/list")
    public TableDataInfo list(KinderClase kinderClase)
    {
        startPage();
        List<KinderClase> list = kinderClaseService.selectKinderClaseList(kinderClase);
        return getDataTable(list);
    }

    /**
     * 导出班级列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_clase:clase:export')")
    @Log(title = "班级", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(KinderClase kinderClase)
    {
        List<KinderClase> list = kinderClaseService.selectKinderClaseList(kinderClase);
        ExcelUtil<KinderClase> util = new ExcelUtil<KinderClase>(KinderClase.class);
        return util.exportExcel(list, "班级数据");
    }

    /**
     * 获取班级详细信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_clase:clase:query')")
    @GetMapping(value = "/{claseId}")
    public AjaxResult getInfo(@PathVariable("claseId") Long claseId)
    {
        return AjaxResult.success(kinderClaseService.selectKinderClaseByClaseId(claseId));
    }

    /**
     * 新增班级
     */
    @PreAuthorize("@ss.hasPermi('kinder_clase:clase:add')")
    @Log(title = "班级", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KinderClase kinderClase)
    {
        return toAjax(kinderClaseService.insertKinderClase(kinderClase));
    }

    /**
     * 修改班级
     */
    @PreAuthorize("@ss.hasPermi('kinder_clase:clase:edit')")
    @Log(title = "班级", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KinderClase kinderClase)
    {
        return toAjax(kinderClaseService.updateKinderClase(kinderClase));
    }

    /**
     * 删除班级
     */
    @PreAuthorize("@ss.hasPermi('kinder_clase:clase:remove')")
    @Log(title = "班级", businessType = BusinessType.DELETE)
	@DeleteMapping("/{claseIds}")
    public AjaxResult remove(@PathVariable Long[] claseIds)
    {
        return toAjax(kinderClaseService.deleteKinderClaseByClaseIds(claseIds));
    }
}
