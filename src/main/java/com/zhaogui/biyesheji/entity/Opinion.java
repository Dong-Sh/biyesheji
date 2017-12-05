package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

public class Opinion implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 意见名称
     */
    @Column(name = "opinion_name")
    private String opinionName;

    /**
     * 意见
     */
    private Integer opinion;

    /**
     * 意见状态
     */
    @Column(name = "opinion_state")
    private Integer opinionState;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "create_id")
    private Integer createId;

    /**
     * 意见备注
     */
    @Column(name = "opinion_remakers")
    private String opinionRemakers;

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
     * 获取意见名称
     *
     * @return opinion_name - 意见名称
     */
    public String getOpinionName() {
        return opinionName;
    }

    /**
     * 设置意见名称
     *
     * @param opinionName 意见名称
     */
    public void setOpinionName(String opinionName) {
        this.opinionName = opinionName == null ? null : opinionName.trim();
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
     * 获取意见状态
     *
     * @return opinion_state - 意见状态
     */
    public Integer getOpinionState() {
        return opinionState;
    }

    /**
     * 设置意见状态
     *
     * @param opinionState 意见状态
     */
    public void setOpinionState(Integer opinionState) {
        this.opinionState = opinionState;
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
     * 获取意见备注
     *
     * @return opinion_remakers - 意见备注
     */
    public String getOpinionRemakers() {
        return opinionRemakers;
    }

    /**
     * 设置意见备注
     *
     * @param opinionRemakers 意见备注
     */
    public void setOpinionRemakers(String opinionRemakers) {
        this.opinionRemakers = opinionRemakers == null ? null : opinionRemakers.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", opinionName=").append(opinionName);
        sb.append(", opinion=").append(opinion);
        sb.append(", opinionState=").append(opinionState);
        sb.append(", createTime=").append(createTime);
        sb.append(", createId=").append(createId);
        sb.append(", opinionRemakers=").append(opinionRemakers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}