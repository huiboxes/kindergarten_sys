package com.ruoyi.project.kinder_teacher.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.project.system.domain.SysRole;
import com.ruoyi.project.system.domain.SysUser;
import com.ruoyi.project.system.service.ISysPostService;
import com.ruoyi.project.system.service.ISysRoleService;
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
import com.ruoyi.project.kinder_teacher.domain.KinderTeacher;
import com.ruoyi.project.kinder_teacher.service.IKinderTeacherService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 老师Controller
 * 
 * @author huibox
 * @date 2021-11-04
 */
@RestController
@RequestMapping("/kinder_teacher/teacher")
public class KinderTeacherController extends BaseController
{
    @Autowired
    private IKinderTeacherService kinderTeacherService;

    @Autowired
    private ISysRoleService roleService;

    @Autowired
    private ISysPostService postService;

    /**
     * 查询老师列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_teacher:teacher:list')")
    @GetMapping("/list")
    public TableDataInfo list(KinderTeacher kinderTeacher)
    {
        startPage();
        List<KinderTeacher> list = kinderTeacherService.selectKinderTeacherList(kinderTeacher);
        return getDataTable(list);
    }

    /**
     * 导出老师列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_teacher:teacher:export')")
    @Log(title = "老师", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(KinderTeacher kinderTeacher)
    {
        List<KinderTeacher> list = kinderTeacherService.selectKinderTeacherList(kinderTeacher);
        ExcelUtil<KinderTeacher> util = new ExcelUtil<KinderTeacher>(KinderTeacher.class);
        return util.exportExcel(list, "老师数据");
    }

    /**
     * 根据老师编号获取详细信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_teacher:teacher:query')")
    @GetMapping(value = { "/", "/{teacherId}" })
    public AjaxResult getInfo(@PathVariable(value = "teacherId", required = false) Long teacherId)
    {
        AjaxResult ajax = AjaxResult.success();
        List<SysRole> roles = roleService.selectRoleAll();
        ajax.put("roles", SysUser.isAdmin(teacherId) ? roles : roles.stream().filter(r -> !r.isAdmin()).collect(Collectors.toList()));
        ajax.put("posts", postService.selectPostAll());
        if (StringUtils.isNotNull(teacherId))
        {
            ajax.put(AjaxResult.DATA_TAG, kinderTeacherService.selectKinderTeacherByTeacherId(teacherId));
            ajax.put("postIds", postService.selectPostListByUserId(teacherId));
            ajax.put("roleIds", roleService.selectRoleListByUserId(teacherId));
        }
        return ajax;
    }


    /**
     * 新增老师
     */
    @PreAuthorize("@ss.hasPermi('kinder_teacher:teacher:add')")
    @Log(title = "老师", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KinderTeacher kinderTeacher)
    {
        return toAjax(kinderTeacherService.insertKinderTeacher(kinderTeacher));
    }

    /**
     * 修改老师
     */
    @PreAuthorize("@ss.hasPermi('kinder_teacher:teacher:edit')")
    @Log(title = "老师", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KinderTeacher kinderTeacher)
    {
        return toAjax(kinderTeacherService.updateKinderTeacher(kinderTeacher));
    }

    /**
     * 删除老师
     */
    @PreAuthorize("@ss.hasPermi('kinder_teacher:teacher:remove')")
    @Log(title = "老师", businessType = BusinessType.DELETE)
	@DeleteMapping("/{teacherIds}")
    public AjaxResult remove(@PathVariable Long[] teacherIds)
    {
        return toAjax(kinderTeacherService.deleteKinderTeacherByTeacherIds(teacherIds));
    }

    /**
     * 状态修改
     */
    @PreAuthorize("@ss.hasPermi('kinder_teacher:teacher:edit')")
    @Log(title = "老师", businessType = BusinessType.UPDATE)
    @PutMapping("/changeStatus")
    public AjaxResult changeStatus(@RequestBody KinderTeacher kinderTeacher)
    {
        kinderTeacher.setUpdateBy(getUsername());
        return toAjax(kinderTeacherService.updateKinderTeacherStatus(kinderTeacher));
    }
}
