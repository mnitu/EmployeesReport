package com.jpa.entities;

import java.io.Serializable;

public class DailyCalendarId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String calendarId;
	
	private String workingTypeId;
	
	private String employeeId;

	public String getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(String calendarId) {
		this.calendarId = calendarId;
	}

	public String getWorkingTypeId() {
		return workingTypeId;
	}

	public void setWorkingTypeId(String workingTypeId) {
		this.workingTypeId = workingTypeId;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}
