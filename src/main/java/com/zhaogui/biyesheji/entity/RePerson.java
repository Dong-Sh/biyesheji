package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "re_person")
public class RePerson implements Serializable {
    /**
     * 类型ID
     */
    @Id
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 接收人ID
     */
    @Id
    @Column(name = "manager_id")
    private Integer managerId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取类型ID
     *
     * @return type_id - 类型ID
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置类型ID
     *
     * @param typeId 类型ID
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取接收人ID
     *
     * @return manager_id - 接收人ID
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * 设置接收人ID
     *
     * @param managerId 接收人ID
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeId=").append(typeId);
        sb.append(", managerId=").append(managerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}