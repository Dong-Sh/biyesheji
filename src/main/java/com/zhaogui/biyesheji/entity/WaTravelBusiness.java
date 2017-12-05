package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wa_travel_business")
public class WaTravelBusiness implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 出差地点
     */
    private String place;

    /**
     * 出发时间
     */
    @Column(name = "departure_time")
    private Date departureTime;

    /**
     * 预计返回时间
     */
    @Column(name = "return_time")
    private Date returnTime;

    /**
     * 部门主管意见
     */
    @Column(name = "manager_opinion")
    private Integer managerOpinion;

    /**
     * 考勤员意见
     */
    @Column(name = "attendance_clerk_opinion")
    private Integer attendanceClerkOpinion;

    /**
     * 人力资源中心意见
     */
    @Column(name = "human_resource_opinion")
    private Integer humanResourceOpinion;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 申请人Id
     */
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * 出差事由
     */
    private String reason;

    /**
     * 备注
     */
    private String comment;

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
     * 获取出差地点
     *
     * @return place - 出差地点
     */
    public String getPlace() {
        return place;
    }

    /**
     * 设置出差地点
     *
     * @param place 出差地点
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * 获取出发时间
     *
     * @return departure_time - 出发时间
     */
    public Date getDepartureTime() {
        return departureTime;
    }

    /**
     * 设置出发时间
     *
     * @param departureTime 出发时间
     */
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 获取预计返回时间
     *
     * @return return_time - 预计返回时间
     */
    public Date getReturnTime() {
        return returnTime;
    }

    /**
     * 设置预计返回时间
     *
     * @param returnTime 预计返回时间
     */
    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * 获取部门主管意见
     *
     * @return manager_opinion - 部门主管意见
     */
    public Integer getManagerOpinion() {
        return managerOpinion;
    }

    /**
     * 设置部门主管意见
     *
     * @param managerOpinion 部门主管意见
     */
    public void setManagerOpinion(Integer managerOpinion) {
        this.managerOpinion = managerOpinion;
    }

    /**
     * 获取考勤员意见
     *
     * @return attendance_clerk_opinion - 考勤员意见
     */
    public Integer getAttendanceClerkOpinion() {
        return attendanceClerkOpinion;
    }

    /**
     * 设置考勤员意见
     *
     * @param attendanceClerkOpinion 考勤员意见
     */
    public void setAttendanceClerkOpinion(Integer attendanceClerkOpinion) {
        this.attendanceClerkOpinion = attendanceClerkOpinion;
    }

    /**
     * 获取人力资源中心意见
     *
     * @return human_resource_opinion - 人力资源中心意见
     */
    public Integer getHumanResourceOpinion() {
        return humanResourceOpinion;
    }

    /**
     * 设置人力资源中心意见
     *
     * @param humanResourceOpinion 人力资源中心意见
     */
    public void setHumanResourceOpinion(Integer humanResourceOpinion) {
        this.humanResourceOpinion = humanResourceOpinion;
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
     * 获取申请人Id
     *
     * @return workers_id - 申请人Id
     */
    public Integer getWorkersId() {
        return workersId;
    }

    /**
     * 设置申请人Id
     *
     * @param workersId 申请人Id
     */
    public void setWorkersId(Integer workersId) {
        this.workersId = workersId;
    }

    /**
     * 获取出差事由
     *
     * @return reason - 出差事由
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置出差事由
     *
     * @param reason 出差事由
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取备注
     *
     * @return comment - 备注
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注
     *
     * @param comment 备注
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", place=").append(place);
        sb.append(", departureTime=").append(departureTime);
        sb.append(", returnTime=").append(returnTime);
        sb.append(", managerOpinion=").append(managerOpinion);
        sb.append(", attendanceClerkOpinion=").append(attendanceClerkOpinion);
        sb.append(", humanResourceOpinion=").append(humanResourceOpinion);
        sb.append(", createTime=").append(createTime);
        sb.append(", workersId=").append(workersId);
        sb.append(", reason=").append(reason);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}