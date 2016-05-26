package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name = "Roles")
public class Roles implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "roleId", nullable = false, length = 3)
	@Size (max = 3)
	private String roleId;
	
	@Column (name = "longDescription", nullable = false, length = 30)
	private String longDescription;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
}
