package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

public class Notice implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 公告级别
     */
    private Integer level;

    /**
     * 公告部门
     */
    @Column(name = "notice_department")
    private Integer noticeDepartment;

    /**
     * 公告类型
     */
    @Column(name = "notice_type")
    private Integer noticeType;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 发布人
     */
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * 公告内容
     */
    @Column(name = "notice_body")
    private String noticeBody;

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
     * 获取公告级别
     *
     * @return level - 公告级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置公告级别
     *
     * @param level 公告级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取公告部门
     *
     * @return notice_department - 公告部门
     */
    public Integer getNoticeDepartment() {
        return noticeDepartment;
    }

    /**
     * 设置公告部门
     *
     * @param noticeDepartment 公告部门
     */
    public void setNoticeDepartment(Integer noticeDepartment) {
        this.noticeDepartment = noticeDepartment;
    }

    /**
     * 获取公告类型
     *
     * @return notice_type - 公告类型
     */
    public Integer getNoticeType() {
        return noticeType;
    }

    /**
     * 设置公告类型
     *
     * @param noticeType 公告类型
     */
    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
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
     * 获取发布人
     *
     * @return workers_id - 发布人
     */
    public Integer getWorkersId() {
        return workersId;
    }

    /**
     * 设置发布人
     *
     * @param workersId 发布人
     */
    public void setWorkersId(Integer workersId) {
        this.workersId = workersId;
    }

    /**
     * 获取公告内容
     *
     * @return notice_body - 公告内容
     */
    public String getNoticeBody() {
        return noticeBody;
    }

    /**
     * 设置公告内容
     *
     * @param noticeBody 公告内容
     */
    public void setNoticeBody(String noticeBody) {
        this.noticeBody = noticeBody == null ? null : noticeBody.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", level=").append(level);
        sb.append(", noticeDepartment=").append(noticeDepartment);
        sb.append(", noticeType=").append(noticeType);
        sb.append(", createTime=").append(createTime);
        sb.append(", workersId=").append(workersId);
        sb.append(", noticeBody=").append(noticeBody);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}