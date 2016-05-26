package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table (name = "WorkingType")
public class WorkingType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "workingTypeId", nullable = false, length = 3)
	@Size (max = 3)
	private String workingTypeId;
	
	@Column (name = "longDescription", nullable = false, length = 30)
	private String longDescription;

	public String getWorkingTypeId() {
		return workingTypeId;
	}

	public void setWorkingTypeId(String workingTypeId) {
		this.workingTypeId = workingTypeId;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
}
