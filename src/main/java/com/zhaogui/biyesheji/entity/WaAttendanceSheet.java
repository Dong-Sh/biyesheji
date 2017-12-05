package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.*;

@Table(name = "wa_attendance_sheet")
public class WaAttendanceSheet implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 考勤员ID
     */
    @Column(name = "attendance_workers_id")
    private Integer attendanceWorkersId;

    /**
     * 部门ID
     */
    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * 主管领导签字
     */
    @Column(name = "executive_opinion")
    private Integer executiveOpinion;

    /**
     * 合计
     */
    private BigDecimal total;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 备注
     */
    private String remarks;

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
     * 获取考勤员ID
     *
     * @return attendance_workers_id - 考勤员ID
     */
    public Integer getAttendanceWorkersId() {
        return attendanceWorkersId;
    }

    /**
     * 设置考勤员ID
     *
     * @param attendanceWorkersId 考勤员ID
     */
    public void setAttendanceWorkersId(Integer attendanceWorkersId) {
        this.attendanceWorkersId = attendanceWorkersId;
    }

    /**
     * 获取部门ID
     *
     * @return department_id - 部门ID
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门ID
     *
     * @param departmentId 部门ID
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取主管领导签字
     *
     * @return executive_opinion - 主管领导签字
     */
    public Integer getExecutiveOpinion() {
        return executiveOpinion;
    }

    /**
     * 设置主管领导签字
     *
     * @param executiveOpinion 主管领导签字
     */
    public void setExecutiveOpinion(Integer executiveOpinion) {
        this.executiveOpinion = executiveOpinion;
    }

    /**
     * 获取合计
     *
     * @return total - 合计
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * 设置合计
     *
     * @param total 合计
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
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
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", attendanceWorkersId=").append(attendanceWorkersId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", executiveOpinion=").append(executiveOpinion);
        sb.append(", total=").append(total);
        sb.append(", createTime=").append(createTime);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}