package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "wa_attendence_statistics")
public class WaAttendenceStatistics implements Serializable {
    /**
     * 考勤ID
     */
    @Id
    @Column(name = "attendence_id")
    private Integer attendenceId;

    /**
     * 职工ID
     */
    @Id
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 正常出勤
     */
    private BigDecimal normal;

    /**
     * 外地出差
     */
    @Column(name = "business_travel")
    private BigDecimal businessTravel;

    /**
     * 带薪休假
     */
    @Column(name = "paid_vacation")
    private BigDecimal paidVacation;

    /**
     * 病假
     */
    @Column(name = "sick_leave")
    private BigDecimal sickLeave;

    /**
     * 事假
     */
    @Column(name = "compassionate_leave")
    private BigDecimal compassionateLeave;

    /**
     * 存休
     */
    private BigDecimal hugn;

    /**
     * 补休
     */
    @Column(name = "take_some_time_off")
    private BigDecimal takeSomeTimeOff;

    /**
     * 双薪
     */
    @Column(name = "double_salary")
    private BigDecimal doubleSalary;

    /**
     * 旷工
     */
    private BigDecimal absenteeism;

    /**
     * 早退
     */
    @Column(name = "leave_early")
    private BigDecimal leaveEarly;

    /**
     * 迟到
     */
    private BigDecimal late;

    /**
     * 加班
     */
    private BigDecimal overtime;

    /**
     * 车补
     */
    @Column(name = "car_allowance")
    private BigDecimal carAllowance;

    private static final long serialVersionUID = 1L;

    /**
     * 获取考勤ID
     *
     * @return attendence_id - 考勤ID
     */
    public Integer getAttendenceId() {
        return attendenceId;
    }

    /**
     * 设置考勤ID
     *
     * @param attendenceId 考勤ID
     */
    public void setAttendenceId(Integer attendenceId) {
        this.attendenceId = attendenceId;
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
     * 获取正常出勤
     *
     * @return normal - 正常出勤
     */
    public BigDecimal getNormal() {
        return normal;
    }

    /**
     * 设置正常出勤
     *
     * @param normal 正常出勤
     */
    public void setNormal(BigDecimal normal) {
        this.normal = normal;
    }

    /**
     * 获取外地出差
     *
     * @return business_travel - 外地出差
     */
    public BigDecimal getBusinessTravel() {
        return businessTravel;
    }

    /**
     * 设置外地出差
     *
     * @param businessTravel 外地出差
     */
    public void setBusinessTravel(BigDecimal businessTravel) {
        this.businessTravel = businessTravel;
    }

    /**
     * 获取带薪休假
     *
     * @return paid_vacation - 带薪休假
     */
    public BigDecimal getPaidVacation() {
        return paidVacation;
    }

    /**
     * 设置带薪休假
     *
     * @param paidVacation 带薪休假
     */
    public void setPaidVacation(BigDecimal paidVacation) {
        this.paidVacation = paidVacation;
    }

    /**
     * 获取病假
     *
     * @return sick_leave - 病假
     */
    public BigDecimal getSickLeave() {
        return sickLeave;
    }

    /**
     * 设置病假
     *
     * @param sickLeave 病假
     */
    public void setSickLeave(BigDecimal sickLeave) {
        this.sickLeave = sickLeave;
    }

    /**
     * 获取事假
     *
     * @return compassionate_leave - 事假
     */
    public BigDecimal getCompassionateLeave() {
        return compassionateLeave;
    }

    /**
     * 设置事假
     *
     * @param compassionateLeave 事假
     */
    public void setCompassionateLeave(BigDecimal compassionateLeave) {
        this.compassionateLeave = compassionateLeave;
    }

    /**
     * 获取存休
     *
     * @return hugn - 存休
     */
    public BigDecimal getHugn() {
        return hugn;
    }

    /**
     * 设置存休
     *
     * @param hugn 存休
     */
    public void setHugn(BigDecimal hugn) {
        this.hugn = hugn;
    }

    /**
     * 获取补休
     *
     * @return take_some_time_off - 补休
     */
    public BigDecimal getTakeSomeTimeOff() {
        return takeSomeTimeOff;
    }

    /**
     * 设置补休
     *
     * @param takeSomeTimeOff 补休
     */
    public void setTakeSomeTimeOff(BigDecimal takeSomeTimeOff) {
        this.takeSomeTimeOff = takeSomeTimeOff;
    }

    /**
     * 获取双薪
     *
     * @return double_salary - 双薪
     */
    public BigDecimal getDoubleSalary() {
        return doubleSalary;
    }

    /**
     * 设置双薪
     *
     * @param doubleSalary 双薪
     */
    public void setDoubleSalary(BigDecimal doubleSalary) {
        this.doubleSalary = doubleSalary;
    }

    /**
     * 获取旷工
     *
     * @return absenteeism - 旷工
     */
    public BigDecimal getAbsenteeism() {
        return absenteeism;
    }

    /**
     * 设置旷工
     *
     * @param absenteeism 旷工
     */
    public void setAbsenteeism(BigDecimal absenteeism) {
        this.absenteeism = absenteeism;
    }

    /**
     * 获取早退
     *
     * @return leave_early - 早退
     */
    public BigDecimal getLeaveEarly() {
        return leaveEarly;
    }

    /**
     * 设置早退
     *
     * @param leaveEarly 早退
     */
    public void setLeaveEarly(BigDecimal leaveEarly) {
        this.leaveEarly = leaveEarly;
    }

    /**
     * 获取迟到
     *
     * @return late - 迟到
     */
    public BigDecimal getLate() {
        return late;
    }

    /**
     * 设置迟到
     *
     * @param late 迟到
     */
    public void setLate(BigDecimal late) {
        this.late = late;
    }

    /**
     * 获取加班
     *
     * @return overtime - 加班
     */
    public BigDecimal getOvertime() {
        return overtime;
    }

    /**
     * 设置加班
     *
     * @param overtime 加班
     */
    public void setOvertime(BigDecimal overtime) {
        this.overtime = overtime;
    }

    /**
     * 获取车补
     *
     * @return car_allowance - 车补
     */
    public BigDecimal getCarAllowance() {
        return carAllowance;
    }

    /**
     * 设置车补
     *
     * @param carAllowance 车补
     */
    public void setCarAllowance(BigDecimal carAllowance) {
        this.carAllowance = carAllowance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attendenceId=").append(attendenceId);
        sb.append(", workersId=").append(workersId);
        sb.append(", id=").append(id);
        sb.append(", normal=").append(normal);
        sb.append(", businessTravel=").append(businessTravel);
        sb.append(", paidVacation=").append(paidVacation);
        sb.append(", sickLeave=").append(sickLeave);
        sb.append(", compassionateLeave=").append(compassionateLeave);
        sb.append(", hugn=").append(hugn);
        sb.append(", takeSomeTimeOff=").append(takeSomeTimeOff);
        sb.append(", doubleSalary=").append(doubleSalary);
        sb.append(", absenteeism=").append(absenteeism);
        sb.append(", leaveEarly=").append(leaveEarly);
        sb.append(", late=").append(late);
        sb.append(", overtime=").append(overtime);
        sb.append(", carAllowance=").append(carAllowance);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}