package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wa_overtime")
public class WaOvertime implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 加班时间
     */
    private Integer overtime;

    /**
     * 部门负责人意见
     */
    @Column(name = "manager_opinion")
    private Integer managerOpinion;

    /**
     * 申请时间
     */
    @Column(name = "apply_time")
    private LocalDateTime applyTime;

    /**
     * 人力资源中心意见
     */
    @Column(name = "human_resources_clerk")
    private Integer humanResourcesClerk;

    /**
     * 批准时间
     */
    @Column(name = "approval_time")
    private Date approvalTime;

    /**
     * 申请人ID
     */
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * 原因
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
     * 获取加班时间
     *
     * @return overtime - 加班时间
     */
    public Integer getOvertime() {
        return overtime;
    }

    /**
     * 设置加班时间
     *
     * @param overtime 加班时间
     */
    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }

    /**
     * 获取部门负责人意见
     *
     * @return manager_opinion - 部门负责人意见
     */
    public Integer getManagerOpinion() {
        return managerOpinion;
    }

    /**
     * 设置部门负责人意见
     *
     * @param managerOpinion 部门负责人意见
     */
    public void setManagerOpinion(Integer managerOpinion) {
        this.managerOpinion = managerOpinion;
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
     * 获取批准时间
     *
     * @return approval_time - 批准时间
     */
    public Date getApprovalTime() {
        return approvalTime;
    }

    /**
     * 设置批准时间
     *
     * @param approvalTime 批准时间
     */
    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
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
     * 获取原因
     *
     * @return reason - 原因
     */
    public String getReason() {
        return reason;
    }

    /**
     * 设置原因
     *
     * @param reason 原因
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
        sb.append(", overtime=").append(overtime);
        sb.append(", managerOpinion=").append(managerOpinion);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", humanResourcesClerk=").append(humanResourcesClerk);
        sb.append(", approvalTime=").append(approvalTime);
        sb.append(", workersId=").append(workersId);
        sb.append(", reason=").append(reason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}