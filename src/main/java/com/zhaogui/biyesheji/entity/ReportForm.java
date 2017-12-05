package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Table(name = "report_form")
public class ReportForm implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 发送人ID
     */
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 今日完成工作
     */
    @Column(name = "finish_work")
    private String finishWork;

    /**
     * 未完成工作
     */
    @Column(name = "un_work")
    private String unWork;

    /**
     * 需协调工作
     */
    @Column(name = "coordinate_work")
    private String coordinateWork;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 总结
     */
    private String summary;

    /**
     * 工作计划
     */
    @Column(name = "work_play")
    private String workPlay;

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
     * 获取发送人ID
     *
     * @return workers_id - 发送人ID
     */
    public Integer getWorkersId() {
        return workersId;
    }

    /**
     * 设置发送人ID
     *
     * @param workersId 发送人ID
     */
    public void setWorkersId(Integer workersId) {
        this.workersId = workersId;
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
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取今日完成工作
     *
     * @return finish_work - 今日完成工作
     */
    public String getFinishWork() {
        return finishWork;
    }

    /**
     * 设置今日完成工作
     *
     * @param finishWork 今日完成工作
     */
    public void setFinishWork(String finishWork) {
        this.finishWork = finishWork == null ? null : finishWork.trim();
    }

    /**
     * 获取未完成工作
     *
     * @return un_work - 未完成工作
     */
    public String getUnWork() {
        return unWork;
    }

    /**
     * 设置未完成工作
     *
     * @param unWork 未完成工作
     */
    public void setUnWork(String unWork) {
        this.unWork = unWork == null ? null : unWork.trim();
    }

    /**
     * 获取需协调工作
     *
     * @return coordinate_work - 需协调工作
     */
    public String getCoordinateWork() {
        return coordinateWork;
    }

    /**
     * 设置需协调工作
     *
     * @param coordinateWork 需协调工作
     */
    public void setCoordinateWork(String coordinateWork) {
        this.coordinateWork = coordinateWork == null ? null : coordinateWork.trim();
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

    /**
     * 获取总结
     *
     * @return summary - 总结
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置总结
     *
     * @param summary 总结
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * 获取工作计划
     *
     * @return work_play - 工作计划
     */
    public String getWorkPlay() {
        return workPlay;
    }

    /**
     * 设置工作计划
     *
     * @param workPlay 工作计划
     */
    public void setWorkPlay(String workPlay) {
        this.workPlay = workPlay == null ? null : workPlay.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workersId=").append(workersId);
        sb.append(", createTime=").append(createTime);
        sb.append(", type=").append(type);
        sb.append(", finishWork=").append(finishWork);
        sb.append(", unWork=").append(unWork);
        sb.append(", coordinateWork=").append(coordinateWork);
        sb.append(", remarks=").append(remarks);
        sb.append(", summary=").append(summary);
        sb.append(", workPlay=").append(workPlay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}