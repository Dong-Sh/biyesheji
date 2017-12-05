package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wa_leave_table")
public class WaLeaveTable implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 职工ID
     */
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * 请假类型
     */
    @Column(name = "leave_type")
    private String leaveType;

    /**
     * 请假开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 请假结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 合计
     */
    @Column(name = "total_time")
    private BigDecimal totalTime;

    /**
     * 部门负责人意见
     */
    @Column(name = "manager_id")
    private Integer managerId;

    /**
     * 考勤员意见
     */
    @Column(name = "attendance_clerk_id")
    private Integer attendanceClerkId;

    /**
     * 总经理意见
     */
    @Column(name = "general_manager")
    private Integer generalManager;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @Column(name = "edit_tiem")
    private Date editTiem;

    /**
     * 请假原因
     */
    private String reason;

    private static final long serialVersionUID = 1L;

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取职工ID
     *
     * @return workers_id - 职工ID
     */
    public Integer getWorkersId() {
        return workersId;
    }

    /**
     * 设置职工ID
     *
     * @param workersId 职工ID
     */
    public void setWorkersId(Integer workersId) {
        this.workersId = workersId;
    }

    /**
     * 获取请假类型
     *
     * @return leave_type - 请假类型
     */
    public String getLeaveType() {
        return leaveType;
    }

    /**
     * 设置请假类型
     *
     * @param leaveType 请假类型
     */
    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType == null ? null : leaveType.trim();
    }

    /**
     * 获取请假开始时间
     *
     * @return start_time - 请假开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置请假开始时间
     *
     * @param startTime 请假开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取请假结束时间
     *
     * @return end_time - 请假结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置请假结束时间
     *
     * @param endTime 请假结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取合计
     *
     * @return total_time - 合计
     */
    public BigDecimal getTotalTime() {
        return totalTime;
    }

    /**
     * 设置合计
     *
     * @param totalTime 合计
     */
    public void setTotalTime(BigDecimal totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * 获取部门负责人意见
     *
     * @return manager_id - 部门负责人意见
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * 设置部门负责人意见
     *
     * @param managerId 部门负责人意见
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * 获取考勤员意见
     *
     * @return attendance_clerk_id - 考勤员意见
     */
    public Integer getAttendanceClerkId() {
        return attendanceClerkId;
    }

    /**
     * 设置考勤员意见
     *
     * @param attendanceClerkId 考勤员意见
     */
    public void setAttendanceClerkId(Integer attendanceClerkId) {
        this.attendanceClerkId = attendanceClerkId;
    }

    /**
     * 获取总经理意见
     *
     * @return general_manager - 总经理意见
     */
    public Integer getGeneralManager() {
        return generalManager;
    }

    /**
     * 设置总经理意见
     *
     * @param generalManager 总经理意见
     */
    public void setGeneralManager(Integer generalManager) {
        this.generalManager = generalManager;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return edit_tiem - 修改时间
     */
    public Date getEditTiem() {
        return editTiem;
    }

    /**
     * 设置修改时间
     *
     * @param editTiem 修改时间
     */
    public void setEditTiem(Date editTiem) {
        this.editTiem = editTiem;
    }

    /**
     * 获取请假原因
     *
     * @return reason - 请假原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置请假原因
     *
     * @param reason 请假原因
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workersId=").append(workersId);
        sb.append(", leaveType=").append(leaveType);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", totalTime=").append(totalTime);
        sb.append(", managerId=").append(managerId);
        sb.append(", attendanceClerkId=").append(attendanceClerkId);
        sb.append(", generalManager=").append(generalManager);
        sb.append(", createTime=").append(createTime);
        sb.append(", editTiem=").append(editTiem);
        sb.append(", reason=").append(reason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}