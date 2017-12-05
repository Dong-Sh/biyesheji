package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "project_base")
public class ProjectBase implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目编号
     */
    @Column(name = "project_number")
    private String projectNumber;

    /**
     * 项目负责人
     */
    @Column(name = "project_workers")
    private Integer projectWorkers;

    /**
     * 预计开始时间
     */
    @Column(name = "es_start_time")
    private Date esStartTime;

    /**
     * 预计结束时间
     */
    @Column(name = "es_end_time")
    private Date esEndTime;

    /**
     * 预计周期
     */
    @Column(name = "es_cycle")
    private BigDecimal esCycle;

    /**
     * 项目状态
     */
    @Column(name = "project_state")
    private Integer projectState;

    /**
     * 进度
     */
    @Column(name = "progredd_bar")
    private Integer progreddBar;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "create_id")
    private Integer createId;

    /**
     * 项目内容
     */
    private String body;

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
     * 获取项目编号
     *
     * @return project_number - 项目编号
     */
    public String getProjectNumber() {
        return projectNumber;
    }

    /**
     * 设置项目编号
     *
     * @param projectNumber 项目编号
     */
    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber == null ? null : projectNumber.trim();
    }

    /**
     * 获取项目负责人
     *
     * @return project_workers - 项目负责人
     */
    public Integer getProjectWorkers() {
        return projectWorkers;
    }

    /**
     * 设置项目负责人
     *
     * @param projectWorkers 项目负责人
     */
    public void setProjectWorkers(Integer projectWorkers) {
        this.projectWorkers = projectWorkers;
    }

    /**
     * 获取预计开始时间
     *
     * @return es_start_time - 预计开始时间
     */
    public Date getEsStartTime() {
        return esStartTime;
    }

    /**
     * 设置预计开始时间
     *
     * @param esStartTime 预计开始时间
     */
    public void setEsStartTime(Date esStartTime) {
        this.esStartTime = esStartTime;
    }

    /**
     * 获取预计结束时间
     *
     * @return es_end_time - 预计结束时间
     */
    public Date getEsEndTime() {
        return esEndTime;
    }

    /**
     * 设置预计结束时间
     *
     * @param esEndTime 预计结束时间
     */
    public void setEsEndTime(Date esEndTime) {
        this.esEndTime = esEndTime;
    }

    /**
     * 获取预计周期
     *
     * @return es_cycle - 预计周期
     */
    public BigDecimal getEsCycle() {
        return esCycle;
    }

    /**
     * 设置预计周期
     *
     * @param esCycle 预计周期
     */
    public void setEsCycle(BigDecimal esCycle) {
        this.esCycle = esCycle;
    }

    /**
     * 获取项目状态
     *
     * @return project_state - 项目状态
     */
    public Integer getProjectState() {
        return projectState;
    }

    /**
     * 设置项目状态
     *
     * @param projectState 项目状态
     */
    public void setProjectState(Integer projectState) {
        this.projectState = projectState;
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
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return create_id
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * @param createId
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * 获取项目内容
     *
     * @return body - 项目内容
     */
    public String getBody() {
        return body;
    }

    /**
     * 设置项目内容
     *
     * @param body 项目内容
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", projectNumber=").append(projectNumber);
        sb.append(", projectWorkers=").append(projectWorkers);
        sb.append(", esStartTime=").append(esStartTime);
        sb.append(", esEndTime=").append(esEndTime);
        sb.append(", esCycle=").append(esCycle);
        sb.append(", projectState=").append(projectState);
        sb.append(", progreddBar=").append(progreddBar);
        sb.append(", createDate=").append(createDate);
        sb.append(", createId=").append(createId);
        sb.append(", body=").append(body);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}