package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

@Table(name = "use_car")
public class UseCar implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 申请人ID
     */
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * 联系电话
     */
    private Integer phone;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 部门负责人
     */
    @Column(name = "department_person")
    private Integer departmentPerson;

    /**
     * 申请时间
     */
    @Column(name = "apply_time")
    private LocalDateTime applyTime;

    /**
     * 车辆
     */
    private Integer cars;

    /**
     * 是否私事
     */
    @Column(name = "is_private")
    private Boolean isPrivate;

    /**
     * 办理事项
     */
    @Column(name = "handle_matter")
    private String handleMatter;

    /**
     * 办事地点
     */
    @Column(name = "handle_place")
    private String handlePlace;

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
     * 获取申请人ID
     *
     * @return workers_id - 申请人ID
     */
    public Integer getWorkersId() {
        return workersId;
    }

    /**
     * 设置申请人ID
     *
     * @param workersId 申请人ID
     */
    public void setWorkersId(Integer workersId) {
        this.workersId = workersId;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取部门负责人
     *
     * @return department_person - 部门负责人
     */
    public Integer getDepartmentPerson() {
        return departmentPerson;
    }

    /**
     * 设置部门负责人
     *
     * @param departmentPerson 部门负责人
     */
    public void setDepartmentPerson(Integer departmentPerson) {
        this.departmentPerson = departmentPerson;
    }

    /**
     * 获取申请时间
     *
     * @return apply_time - 申请时间
     */
    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    /**
     * 设置申请时间
     *
     * @param applyTime 申请时间
     */
    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * 获取车辆
     *
     * @return cars - 车辆
     */
    public Integer getCars() {
        return cars;
    }

    /**
     * 设置车辆
     *
     * @param cars 车辆
     */
    public void setCars(Integer cars) {
        this.cars = cars;
    }

    /**
     * 获取是否私事
     *
     * @return is_private - 是否私事
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * 设置是否私事
     *
     * @param isPrivate 是否私事
     */
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * 获取办理事项
     *
     * @return handle_matter - 办理事项
     */
    public String getHandleMatter() {
        return handleMatter;
    }

    /**
     * 设置办理事项
     *
     * @param handleMatter 办理事项
     */
    public void setHandleMatter(String handleMatter) {
        this.handleMatter = handleMatter == null ? null : handleMatter.trim();
    }

    /**
     * 获取办事地点
     *
     * @return handle_place - 办事地点
     */
    public String getHandlePlace() {
        return handlePlace;
    }

    /**
     * 设置办事地点
     *
     * @param handlePlace 办事地点
     */
    public void setHandlePlace(String handlePlace) {
        this.handlePlace = handlePlace == null ? null : handlePlace.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workersId=").append(workersId);
        sb.append(", phone=").append(phone);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", departmentPerson=").append(departmentPerson);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", cars=").append(cars);
        sb.append(", isPrivate=").append(isPrivate);
        sb.append(", handleMatter=").append(handleMatter);
        sb.append(", handlePlace=").append(handlePlace);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}