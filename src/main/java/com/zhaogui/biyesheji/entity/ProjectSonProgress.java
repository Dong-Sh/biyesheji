package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "project_son_progress")
public class ProjectSonProgress implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目ID
     */
    @Column(name = "project_id")
    private Integer projectId;

    /**
     * 项目状态
     */
    private Integer state;

    /**
     * 项目进度
     */
    @Column(name = "progress_bar")
    private Integer progressBar;

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
     * 获取项目状态
     *
     * @return state - 项目状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置项目状态
     *
     * @param state 项目状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取项目进度
     *
     * @return progress_bar - 项目进度
     */
    public Integer getProgressBar() {
        return progressBar;
    }

    /**
     * 设置项目进度
     *
     * @param progressBar 项目进度
     */
    public void setProgressBar(Integer progressBar) {
        this.progressBar = progressBar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", projectId=").append(projectId);
        sb.append(", state=").append(state);
        sb.append(", progressBar=").append(progressBar);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}