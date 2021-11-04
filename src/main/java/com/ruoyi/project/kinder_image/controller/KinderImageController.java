package com.ruoyi.project.kinder_image.controller;

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
import com.ruoyi.project.kinder_image.domain.KinderImage;
import com.ruoyi.project.kinder_image.service.IKinderImageService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 照片墙Controller
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@RestController
@RequestMapping("/kinder_image/image")
public class KinderImageController extends BaseController
{
    @Autowired
    private IKinderImageService kinderImageService;

    /**
     * 查询照片墙列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_image:image:list')")
    @GetMapping("/list")
    public TableDataInfo list(KinderImage kinderImage)
    {
        startPage();
        List<KinderImage> list = kinderImageService.selectKinderImageList(kinderImage);
        return getDataTable(list);
    }

    /**
     * 导出照片墙列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_image:image:export')")
    @Log(title = "照片墙", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(KinderImage kinderImage)
    {
        List<KinderImage> list = kinderImageService.selectKinderImageList(kinderImage);
        ExcelUtil<KinderImage> util = new ExcelUtil<KinderImage>(KinderImage.class);
        return util.exportExcel(list, "照片墙数据");
    }

    /**
     * 获取照片墙详细信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_image:image:query')")
    @GetMapping(value = "/{imageId}")
    public AjaxResult getInfo(@PathVariable("imageId") Long imageId)
    {
        return AjaxResult.success(kinderImageService.selectKinderImageByImageId(imageId));
    }

    /**
     * 新增照片墙
     */
    @PreAuthorize("@ss.hasPermi('kinder_image:image:add')")
    @Log(title = "照片墙", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KinderImage kinderImage)
    {
        return toAjax(kinderImageService.insertKinderImage(kinderImage));
    }

    /**
     * 修改照片墙
     */
    @PreAuthorize("@ss.hasPermi('kinder_image:image:edit')")
    @Log(title = "照片墙", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KinderImage kinderImage)
    {
        return toAjax(kinderImageService.updateKinderImage(kinderImage));
    }

    /**
     * 删除照片墙
     */
    @PreAuthorize("@ss.hasPermi('kinder_image:image:remove')")
    @Log(title = "照片墙", businessType = BusinessType.DELETE)
	@DeleteMapping("/{imageIds}")
    public AjaxResult remove(@PathVariable Long[] imageIds)
    {
        return toAjax(kinderImageService.deleteKinderImageByImageIds(imageIds));
    }
}
