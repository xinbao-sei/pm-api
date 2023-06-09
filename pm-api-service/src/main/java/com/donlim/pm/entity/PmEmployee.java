package com.donlim.pm.entity;

import com.changhong.sei.core.dto.serializer.EnumJsonSerializer;
import com.changhong.sei.core.entity.BaseAuditableEntity;
import com.donlim.pm.em.EmpstatidEnum;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * (PmEmployee)实体类
 *
 * @author sei
 * @since 2022-08-10 16:44:57
 */
@Entity
@Table(name = "pm_employee")
@DynamicInsert
@DynamicUpdate
public class PmEmployee extends BaseAuditableEntity implements Serializable {
    private static final long serialVersionUID = 521018544837962805L;

    @Column(name = "employee_code")
    private String employeeCode;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "groupid")
    private String groupid;

    @JoinColumn(name = "groupid",insertable = false,updatable = false)
    @ManyToOne
    private PmOrganize pmOrganize;

    @Column(name = "orgid")
    private Integer orgid;

    @Column(name = "orgcode")
    private String orgcode;

    @Column(name = "orgname")
    private String orgname;

    @Column(name = "sp_name")
    private String spName;

    @Column(name = "telephone")
    private String telephone;

    @JsonSerialize(using = EnumJsonSerializer.class)
    @Column(name = "empstatid")
    private EmpstatidEnum empstatid;

    @Column(name = "ljdate")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate ljdate;

    @Column(name = "emp_remark")
    private String empRemark;

    @Column(name = "tenant_code")
    private String tenantCode;

    @Column(name = "idpath")
    private String idpath;


    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public EmpstatidEnum getEmpstatid() {
        return empstatid;
    }

    public void setEmpstatid(EmpstatidEnum empstatid) {
        this.empstatid = empstatid;
    }

    public LocalDate getLjdate() {
        return ljdate;
    }

    public void setLjdate(LocalDate ljdate) {
        this.ljdate = ljdate;
    }

    public String getEmpRemark() {
        return empRemark;
    }

    public void setEmpRemark(String empRemark) {
        this.empRemark = empRemark;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    public String getIdpath() {
        return idpath;
    }

    public void setIdpath(String idpath) {
        this.idpath = idpath;
    }

    public PmOrganize getPmOrganize() {
        return pmOrganize;
    }

    public void setPmOrganize(PmOrganize pmOrganize) {
        this.pmOrganize = pmOrganize;
    }
}
