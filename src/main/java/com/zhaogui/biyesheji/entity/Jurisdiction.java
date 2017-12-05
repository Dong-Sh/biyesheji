package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

public class Jurisdiction implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 权限ID
     */
    @Column(name = "level_id")
    private Integer levelId;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 权限级别
     */
    private Integer level;

    /**
     * 权限状态
     */
    private Integer state;

    /**
     * 创建人
     */
    @Column(name = "create_person")
    private Integer createPerson;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 权限备注
     */
    private String remarks;

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
     * 获取权限ID
     *
     * @return level_id - 权限ID
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * 设置权限ID
     *
     * @param levelId 权限ID
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * 获取权限名称
     *
     * @return name - 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名称
     *
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取权限级别
     *
     * @return level - 权限级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置权限级别
     *
     * @param level 权限级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取权限状态
     *
     * @return state - 权限状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置权限状态
     *
     * @param state 权限状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取创建人
     *
     * @return create_person - 创建人
     */
    public Integer getCreatePerson() {
        return createPerson;
    }

    /**
     * 设置创建人
     *
     * @param createPerson 创建人
     */
    public void setCreatePerson(Integer createPerson) {
        this.createPerson = createPerson;
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
     * 获取权限备注
     *
     * @return remarks - 权限备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置权限备注
     *
     * @param remarks 权限备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", levelId=").append(levelId);
        sb.append(", name=").append(name);
        sb.append(", level=").append(level);
        sb.append(", state=").append(state);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", createTime=").append(createTime);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}