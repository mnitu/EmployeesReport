package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name = "Employees")
public class Employees implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "employeeId", nullable = false, length = 7)
	@Size (max = 7)
	private String employeeId;
	
	@Column (name  = "firstName", nullable = false, length = 25)
	private String firstName;
	
	@Column (name = "lastName", nullable = false, length = 25)
	private String lastName;
	
	@OneToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "roleId", nullable = false)
	private Roles role;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}

}
