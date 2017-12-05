package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wa_persons")
public class WaPersons implements Serializable {
    /**
     * 类型
     */
    @Id
    private Integer type;

    /**
     * 类型ID
     */
    @Id
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 职工ID
     */
    @Id
    @Column(name = "workers_id")
    private Integer workersId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", type=").append(type);
        sb.append(", typeId=").append(typeId);
        sb.append(", workersId=").append(workersId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}