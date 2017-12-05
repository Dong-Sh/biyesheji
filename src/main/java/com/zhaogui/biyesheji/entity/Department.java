package com.zhaogui.biyesheji.entity;

import java.io.Serializable;
import javax.persistence.*;

public class Department implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 部门ID
     */
    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门状态
     */
    private String state;

    /**
     * 部门负责人
     */
    @Column(name = "depatment_workers_id")
    private Integer depatmentWorkersId;

    private String password;

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
     * 获取部门ID
     *
     * @return department_id - 部门ID
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门ID
     *
     * @param departmentId 部门ID
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取部门名称
     *
     * @return name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取部门状态
     *
     * @return state - 部门状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置部门状态
     *
     * @param state 部门状态
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * 获取部门负责人
     *
     * @return depatment_workers_id - 部门负责人
     */
    public Integer getDepatmentWorkersId() {
        return depatmentWorkersId;
    }

    /**
     * 设置部门负责人
     *
     * @param depatmentWorkersId 部门负责人
     */
    public void setDepatmentWorkersId(Integer depatmentWorkersId) {
        this.depatmentWorkersId = depatmentWorkersId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
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
        sb.append(", id=").append(id);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", name=").append(name);
        sb.append(", state=").append(state);
        sb.append(", depatmentWorkersId=").append(depatmentWorkersId);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}