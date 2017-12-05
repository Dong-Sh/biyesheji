package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Table(name = "project_son_file")
public class ProjectSonFile implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 子ID
     */
    @Id
    @Column(name = "son_id")
    private Integer sonId;

    /**
     * 状态
     */
    private Integer state;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "create_id")
    private Integer createId;

    /**
     * 文件位置
     */
    private String file;

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
     * 获取子ID
     *
     * @return son_id - 子ID
     */
    public Integer getSonId() {
        return sonId;
    }

    /**
     * 设置子ID
     *
     * @param sonId 子ID
     */
    public void setSonId(Integer sonId) {
        this.sonId = sonId;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return create_time
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
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
     * 获取文件位置
     *
     * @return file - 文件位置
     */
    public String getFile() {
        return file;
    }

    /**
     * 设置文件位置
     *
     * @param file 文件位置
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sonId=").append(sonId);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", createId=").append(createId);
        sb.append(", file=").append(file);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}