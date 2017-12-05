package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wa_sign_puch_clock")
public class WaSignPuchClock implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 上班打卡时间
     */
    @Column(name = "top_sign")
    private Date topSign;

    /**
     * 下班打卡时间
     */
    @Column(name = "down_sign")
    private Date downSign;

    /**
     * 职工ID
     */
    @Column(name = "workers_id")
    private Integer workersId;

    /**
     * 状态
     */
    private String state;

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
     * 获取上班打卡时间
     *
     * @return top_sign - 上班打卡时间
     */
    public Date getTopSign() {
        return topSign;
    }

    /**
     * 设置上班打卡时间
     *
     * @param topSign 上班打卡时间
     */
    public void setTopSign(Date topSign) {
        this.topSign = topSign;
    }

    /**
     * 获取下班打卡时间
     *
     * @return down_sign - 下班打卡时间
     */
    public Date getDownSign() {
        return downSign;
    }

    /**
     * 设置下班打卡时间
     *
     * @param downSign 下班打卡时间
     */
    public void setDownSign(Date downSign) {
        this.downSign = downSign;
    }

    /**
     * 获取职工ID
     *
     * @return workers_id - 职工ID
     */
    public Integer getWorkersId() {
        return workersId;
    }

    /**
     * 设置职工ID
     *
     * @param workersId 职工ID
     */
    public void setWorkersId(Integer workersId) {
        this.workersId = workersId;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", topSign=").append(topSign);
        sb.append(", downSign=").append(downSign);
        sb.append(", workersId=").append(workersId);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}