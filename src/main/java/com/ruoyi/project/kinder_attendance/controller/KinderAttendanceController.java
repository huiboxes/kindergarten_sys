package com.ruoyi.project.kinder_attendance.controller;

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
import com.ruoyi.project.kinder_attendance.domain.KinderAttendance;
import com.ruoyi.project.kinder_attendance.service.IKinderAttendanceService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 出勤Controller
 * 
 * @author huibox
 * @date 2021-11-04
 */
@RestController
@RequestMapping("/kinder_attendance/attendance")
public class KinderAttendanceController extends BaseController
{
    @Autowired
    private IKinderAttendanceService kinderAttendanceService;

    /**
     * 查询出勤列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_attendance:attendance:list')")
    @GetMapping("/list")
    public TableDataInfo list(KinderAttendance kinderAttendance)
    {
        startPage();
        List<KinderAttendance> list = kinderAttendanceService.selectKinderAttendanceList(kinderAttendance);
        return getDataTable(list);
    }

    /**
     * 导出出勤列表
     */
    @PreAuthorize("@ss.hasPermi('kinder_attendance:attendance:export')")
    @Log(title = "出勤", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(KinderAttendance kinderAttendance)
    {
        List<KinderAttendance> list = kinderAttendanceService.selectKinderAttendanceList(kinderAttendance);
        ExcelUtil<KinderAttendance> util = new ExcelUtil<KinderAttendance>(KinderAttendance.class);
        return util.exportExcel(list, "出勤数据");
    }

    /**
     * 获取出勤详细信息
     */
    @PreAuthorize("@ss.hasPermi('kinder_attendance:attendance:query')")
    @GetMapping(value = "/{attendanceId}")
    public AjaxResult getInfo(@PathVariable("attendanceId") Long attendanceId)
    {
        return AjaxResult.success(kinderAttendanceService.selectKinderAttendanceByAttendanceId(attendanceId));
    }

    /**
     * 新增出勤
     */
    @PreAuthorize("@ss.hasPermi('kinder_attendance:attendance:add')")
    @Log(title = "出勤", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody KinderAttendance kinderAttendance)
    {
        return toAjax(kinderAttendanceService.insertKinderAttendance(kinderAttendance));
    }

    /**
     * 修改出勤
     */
    @PreAuthorize("@ss.hasPermi('kinder_attendance:attendance:edit')")
    @Log(title = "出勤", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody KinderAttendance kinderAttendance)
    {
        return toAjax(kinderAttendanceService.updateKinderAttendance(kinderAttendance));
    }

    /**
     * 删除出勤
     */
    @PreAuthorize("@ss.hasPermi('kinder_attendance:attendance:remove')")
    @Log(title = "出勤", businessType = BusinessType.DELETE)
	@DeleteMapping("/{attendanceIds}")
    public AjaxResult remove(@PathVariable Long[] attendanceIds)
    {
        return toAjax(kinderAttendanceService.deleteKinderAttendanceByAttendanceIds(attendanceIds));
    }
}
