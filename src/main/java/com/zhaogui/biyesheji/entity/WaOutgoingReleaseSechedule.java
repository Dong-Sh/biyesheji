package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wa_outgoing_release_sechedule")
public class WaOutgoingReleaseSechedule implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 出厂时间
     */
    @Column(name = "put_factory_tiem")
    private Date putFactoryTiem;

    /**
     * 负责人意见
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
    @Column(name = "human_resources_clerk")
    private Integer humanResourcesClerk;

    /**
     * 申请时间
     */
    @Column(name = "apply_time")
    private LocalDateTime applyTime;

    /**
     * 申请人Id
     */
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * 事由
     */
    private String reason;

    /**
     * 物品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

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
     * 获取出厂时间
     *
     * @return put_factory_tiem - 出厂时间
     */
    public Date getPutFactoryTiem() {
        return putFactoryTiem;
    }

    /**
     * 设置出厂时间
     *
     * @param putFactoryTiem 出厂时间
     */
    public void setPutFactoryTiem(Date putFactoryTiem) {
        this.putFactoryTiem = putFactoryTiem;
    }

    /**
     * 获取负责人意见
     *
     * @return manager_opinion - 负责人意见
     */
    public Integer getManagerOpinion() {
        return managerOpinion;
    }

    /**
     * 设置负责人意见
     *
     * @param managerOpinion 负责人意见
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
     * @return human_resources_clerk - 人力资源中心意见
     */
    public Integer getHumanResourcesClerk() {
        return humanResourcesClerk;
    }

    /**
     * 设置人力资源中心意见
     *
     * @param humanResourcesClerk 人力资源中心意见
     */
    public void setHumanResourcesClerk(Integer humanResourcesClerk) {
        this.humanResourcesClerk = humanResourcesClerk;
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
     * 获取事由
     *
     * @return reason - 事由
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置事由
     *
     * @param reason 事由
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * 获取物品名称
     *
     * @return goods_name - 物品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置物品名称
     *
     * @param goodsName 物品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", putFactoryTiem=").append(putFactoryTiem);
        sb.append(", managerOpinion=").append(managerOpinion);
        sb.append(", attendanceClerkOpinion=").append(attendanceClerkOpinion);
        sb.append(", humanResourcesClerk=").append(humanResourcesClerk);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", workersId=").append(workersId);
        sb.append(", reason=").append(reason);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}