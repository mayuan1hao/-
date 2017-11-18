package cn.gsw.smbms.pojo;

import java.util.Date;

public class Role {
	private Integer id;
	private String roleCode;
	private String roleName;
	private Integer createdBy;
	private Date creationDate;
	private Integer modifyBy;
	private Date modifyDate;
	public Role(Integer id, String roleCode, String roleName,
			Integer createdBy, Date creationDate, Integer modifyBy,
			Date modifyDate) {
		super();
		this.id = id;
		this.roleCode = roleCode;
		this.roleName = roleName;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}
	public Role() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}
