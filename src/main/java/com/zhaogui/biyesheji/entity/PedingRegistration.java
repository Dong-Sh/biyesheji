package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

@Table(name = "peding_registration")
public class PedingRegistration implements Serializable {
    /**
     * phone
     */
    @Id
    private String phone;

    /**
     * manager_id
     */
    @Id
    @Column(name = "manager_id")
    private Integer managerId;

    /**
     * create_time
     */
    @Id
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * state
     */
    private Integer state;

    @Column(name = "create_id")
    private Integer createId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取phone
     *
     * @return phone - phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone
     *
     * @param phone phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取manager_id
     *
     * @return manager_id - manager_id
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * 设置manager_id
     *
     * @param managerId manager_id
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * 获取create_time
     *
     * @return create_time - create_time
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置create_time
     *
     * @param createTime create_time
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取state
     *
     * @return state - state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置state
     *
     * @param state state
     */
    public void setState(Integer state) {
        this.state = state;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phone=").append(phone);
        sb.append(", managerId=").append(managerId);
        sb.append(", createTime=").append(createTime);
        sb.append(", state=").append(state);
        sb.append(", createId=").append(createId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}