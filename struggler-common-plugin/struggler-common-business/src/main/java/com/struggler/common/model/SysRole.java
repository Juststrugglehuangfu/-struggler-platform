package com.struggler.common.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Table: sys_role
 */
@Data
@TableName("sys_role")
public class SysRole implements Serializable {
    /**
     * Table:     sys_role
     * Column:    id
     * Nullable:  false
     */
    @TableId(type = IdType.AUTO)
    private Long id;


    /**
     * 删除状态[-1:删除，1:正常]
     *
     * Table:     sys_role
     * Column:    del
     * Nullable:  true
     */
    private Integer del;

    /**
     * 乐观锁
     *
     * Table:     sys_role
     * Column:    revision
     * Nullable:  true
     */
    private Integer revision;

    /**
     * 企业编号
     *
     * Table:     sys_role
     * Column:    comSerial
     * Nullable:  true
     */
    private String comSerial;

    /**
     * 企业ID
     *
     * Table:     sys_role
     * Column:    comSerialId
     * Nullable:  true
     */

    private Long comSerialId;

    /**
     * 角色名称
     *
     * Table:     sys_role
     * Column:    roleName
     * Nullable:  true
     */
    private String roleName;

    /**
     * 角色编码
     *
     * Table:     sys_role
     * Column:    code
     * Nullable:  true
     */
    private String roleCode;

    /**
     * 角色描述
     *
     * Table:     sys_role
     * Column:    comments
     * Nullable:  true
     */
    @TableField(exist = false)
    private String comments;

    /**
     * 角色状态 Y启用 N禁用
     *
     * Table:     sys_role
     * Column:    status
     * Nullable:  true
     */
    private Integer status;

    /**
     * 角色类型(数据字典SYS_ROLE_TYPE:<SYSTEM:系统角色,WORKFLOW:业务流程角色>)
     *
     * Table:     sys_role
     * Column:    role_type
     * Nullable:  true
     */
    private String roleType;

    /**
     * 是否只读角色(数据字典PUB_Y_N:<Y:是,N:否>)
     *
     * Table:     sys_role
     * Column:    readonly
     * Nullable:  true
     */
    private String readonly;

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

    @TableField(exist = false)
    private List<Long> menuIdList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role
     *
     * @mbggenerated Tue Jun 04 14:37:07 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Tue Jun 04 14:37:07 CST 2019
     */
    public SysRole(Long id,Integer del,List<Long> menuIdList,String comments,String comSerial,Long comSerialId, String roleName, String roleCode, Integer status, String roleType, String readonly, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.del = del;
        this.menuIdList = menuIdList;
        this.comSerial = comSerial;
        this.comSerialId = comSerialId;
        this.roleName = roleName;
        this.roleCode = roleCode;
        this.comments = comments;
        this.status = status;
        this.roleType = roleType;
        this.readonly = readonly;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbggenerated Tue Jun 04 14:37:07 CST 2019
     */
    public SysRole() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRole sysRole = (SysRole) o;
        return Objects.equals(id, sysRole.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
