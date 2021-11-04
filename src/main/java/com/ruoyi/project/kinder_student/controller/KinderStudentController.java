package com.ruoyi.project.kinder_student.controller;

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
import com.ruoyi.project.kinder_student.domain.KinderStudent;
import com.ruoyi.project.kinder_student.service.IKinderStudentService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 学生Controller
 * 
 * @author huiboxes
 * @date 2021-11-04
 */
@RestController
@RequestMapping("/kinder_student/student")
public class KinderStudentController extends BaseController
{
    @Autowired
    private IKinderStudentService kinderStudentService;

    /**
     * 查询学生列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_student:student:list')")
    @GetMapping("/list")
    public TableDataInfo list(KinderStudent kinderStudent)
    {
        startPage();
        List<KinderStudent> list = kinderStudentService.selectKinderStudentList(kinderStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_student:student:export')")
    @Log(title = "学生", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(KinderStudent kinderStudent)
    {
        List<KinderStudent> list = kinderStudentService.selectKinderStudentList(kinderStudent);
        ExcelUtil<KinderStudent> util = new ExcelUtil<KinderStudent>(KinderStudent.class);
        return util.exportExcel(list, "学生数据");
    }

    /**
     * 获取学生详细信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_student:student:query')")
    @GetMapping(value = "/{studentId}")
    public AjaxResult getInfo(@PathVariable("studentId") Long studentId)
    {
        return AjaxResult.success(kinderStudentService.selectKinderStudentByStudentId(studentId));
    }

    /**
     * 新增学生
     */
    @PreAuthorize("@ss.hasPermi('kinder_student:student:add')")
    @Log(title = "学生", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KinderStudent kinderStudent)
    {
        return toAjax(kinderStudentService.insertKinderStudent(kinderStudent));
    }

    /**
     * 修改学生
     */
    @PreAuthorize("@ss.hasPermi('kinder_student:student:edit')")
    @Log(title = "学生", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KinderStudent kinderStudent)
    {
        return toAjax(kinderStudentService.updateKinderStudent(kinderStudent));
    }

    /**
     * 删除学生
     */
    @PreAuthorize("@ss.hasPermi('kinder_student:student:remove')")
    @Log(title = "学生", businessType = BusinessType.DELETE)
	@DeleteMapping("/{studentIds}")
    public AjaxResult remove(@PathVariable Long[] studentIds)
    {
        return toAjax(kinderStudentService.deleteKinderStudentByStudentIds(studentIds));
    }
}
