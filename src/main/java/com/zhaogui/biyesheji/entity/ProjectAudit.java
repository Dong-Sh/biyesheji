package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "project_audit")
public class ProjectAudit implements Serializable {
    /**
     * 项目ID
     */
    @Id
    @Column(name = "project_id")
    private Integer projectId;

    /**
     * 类型
     */
    @Id
    private Integer type;

    /**
     * 意见人ID
     */
    @Id
    @Column(name = "manager_id")
    private Integer managerId;

    /**
     * 进度
     */
    @Id
    @Column(name = "progredd_bar")
    private Integer progreddBar;

    /**
     * 意见
     */
    private Integer opinion;

    /**
     * 日期
     */
    private Date date;

    private static final long serialVersionUID = 1L;

    /**
     * 获取项目ID
     *
     * @return project_id - 项目ID
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * 设置项目ID
     *
     * @param projectId 项目ID
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
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
     * 获取意见人ID
     *
     * @return manager_id - 意见人ID
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * 设置意见人ID
     *
     * @param managerId 意见人ID
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * 获取进度
     *
     * @return progredd_bar - 进度
     */
    public Integer getProgreddBar() {
        return progreddBar;
    }

    /**
     * 设置进度
     *
     * @param progreddBar 进度
     */
    public void setProgreddBar(Integer progreddBar) {
        this.progreddBar = progreddBar;
    }

    /**
     * 获取意见
     *
     * @return opinion - 意见
     */
    public Integer getOpinion() {
        return opinion;
    }

    /**
     * 设置意见
     *
     * @param opinion 意见
     */
    public void setOpinion(Integer opinion) {
        this.opinion = opinion;
    }

    /**
     * 获取日期
     *
     * @return date - 日期
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置日期
     *
     * @param date 日期
     */
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", projectId=").append(projectId);
        sb.append(", type=").append(type);
        sb.append(", managerId=").append(managerId);
        sb.append(", progreddBar=").append(progreddBar);
        sb.append(", opinion=").append(opinion);
        sb.append(", date=").append(date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}