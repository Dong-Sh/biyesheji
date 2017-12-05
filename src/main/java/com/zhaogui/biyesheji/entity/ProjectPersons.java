package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "project_persons")
public class ProjectPersons implements Serializable {
    /**
     * 职工ID
     */
    @Id
    @Column(name = "workers_is")
    private Integer workersIs;

    /**
     * 项目ID
     */
    @Id
    @Column(name = "project_number")
    private Integer projectNumber;

    @Id
    @Column(name = "progredd_bar")
    private Integer progreddBar;

    /**
     * 分工
     */
    @Column(name = "branch_work")
    private String branchWork;

    private static final long serialVersionUID = 1L;

    /**
     * 获取职工ID
     *
     * @return workers_is - 职工ID
     */
    public Integer getWorkersIs() {
        return workersIs;
    }

    /**
     * 设置职工ID
     *
     * @param workersIs 职工ID
     */
    public void setWorkersIs(Integer workersIs) {
        this.workersIs = workersIs;
    }

    /**
     * 获取项目ID
     *
     * @return project_number - 项目ID
     */
    public Integer getProjectNumber() {
        return projectNumber;
    }

    /**
     * 设置项目ID
     *
     * @param projectNumber 项目ID
     */
    public void setProjectNumber(Integer projectNumber) {
        this.projectNumber = projectNumber;
    }

    /**
     * @return progredd_bar
     */
    public Integer getProgreddBar() {
        return progreddBar;
    }

    /**
     * @param progreddBar
     */
    public void setProgreddBar(Integer progreddBar) {
        this.progreddBar = progreddBar;
    }

    /**
     * 获取分工
     *
     * @return branch_work - 分工
     */
    public String getBranchWork() {
        return branchWork;
    }

    /**
     * 设置分工
     *
     * @param branchWork 分工
     */
    public void setBranchWork(String branchWork) {
        this.branchWork = branchWork == null ? null : branchWork.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", workersIs=").append(workersIs);
        sb.append(", projectNumber=").append(projectNumber);
        sb.append(", progreddBar=").append(progreddBar);
        sb.append(", branchWork=").append(branchWork);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}