package com.struggler.common.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Table: sys_dept
 */
@Data
@TableName("sys_dept_t")
public class SysDept implements Serializable {
    /**
     * Table:     sys_dept_t
     * Column:    id
     * Nullable:  false
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 创建人
     *
     * Table:     sys_role
     * Column:    created_by
     * Nullable:  true
     */
    private Long createdBy;

    /**
     * 创建时间
     *
     * Table:     sys_role
     * Column:    created_date
     * Nullable:  true
     */
    private Date createdDate;

    /**
     * 修改人
     *
     * Table:     sys_role
     * Column:    updated_by
     * Nullable:  true
     */
    private Long updatedBy;

    /**
     * 修改时间
     *
     * Table:     sys_role
     * Column:    updated_date
     * Nullable:  true
     */
    private Date updatedDate;
    /**
     * 部门名称
     * <p>
     * Table:     sys_dept_t
     * Column:    name
     * Nullable:  true
     */
    private String name;

    /**
     * 上级部门ID
     * <p>
     * Table:     sys_dept_t
     * Column:    parent_id
     * Nullable:  true
     */
    private Long parentId;

    /**
     * 类型(7:集团,8:企业,9:部门)
     * <p>
     * Table:     sys_dept_t
     * Column:    dept_type
     * Nullable:  true
     */
    private int deptType;

    /**
     * 简称
     * <p>
     * Table:     sys_dept_t
     * Column:    short_name
     * Nullable:  true
     */
    private String shortName;

    /**
     * 全名
     * <p>
     * Table:     sys_dept_t
     * Column:    full_name
     * Nullable:  true
     */
    private String fullName;

    /**
     * 公司名称
     * <p>
     * Table:     sys_dept_t
     * Column:    company_name
     * Nullable:  true
     */
    private String companyName;

    private String comSerial;

    private Long comSerialId;

    /**
     * 父菜单名称
     */
    @TableField(exist=false)
    private String parentName;

    /**
     * 组织排序
     * <p>
     * Table:     sys_dept_t
     * Column:    sort
     * Nullable:  true
     */
    private Integer sort;

    private String orgCode;

    @TableField(exist=false)
    private Boolean open;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_dept_t
     *
     * @mbggenerated Tue Jun 04 14:37:07 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept_t
     *
     * @mbggenerated Tue Jun 04 14:37:07 CST 2019
     */
    public SysDept(Long id, String name, Long parentId, int deptType, String shortName, String fullName, String companyName, Integer sort) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.deptType = deptType;
        this.shortName = shortName;
        this.fullName = fullName;
        this.companyName = companyName;
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dept_t
     *
     * @mbggenerated Tue Jun 04 14:37:07 CST 2019
     */
    public SysDept() {
        super();
    }
}
