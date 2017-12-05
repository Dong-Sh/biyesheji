package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "account_table")
public class AccountTable implements Serializable {
    /**
     * workers_id
     */
    @Id
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private String password;

    private static final long serialVersionUID = 1L;

    /**
     * 获取workers_id
     *
     * @return workers_id - workers_id
     */
    public Integer getWorkersId() {
        return workersId;
    }

    /**
     * 设置workers_id
     *
     * @param workersId workers_id
     */
    public void setWorkersId(Integer workersId) {
        this.workersId = workersId;
    }

    /**
     * 获取username
     *
     * @return username - username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username
     *
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取password
     *
     * @return password - password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", workersId=").append(workersId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}