package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@IdClass (DailyCalendarId.class)
@Table (name = "WorkingDayCalendar")
public class WorkingDayCalendar implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "calendarId", nullable = false, length = 8)
	@Size (min = 8, max = 8)
	private String calendarId;
	
	@Id
	@OneToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "workingTypeId", nullable = false)
	private WorkingType workingTypeId;
	
	@Id
	@OneToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "employeeId", nullable  = false)
	private Employees employeeId;
	
	@Column (name = "workedHours", nullable = false)
	private int workedHours;
	
	@Column (name = "isApproved", nullable = false, length = 1, columnDefinition = "String default 'N'")
	@Size (max = 1)
	private String isApproved;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "reportId")
	private long weeklyReport;

	public String getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(String calendarId) {
		this.calendarId = calendarId;
	}

	public WorkingType getWorkingTypeId() {
		return workingTypeId;
	}

	public void setWorkingTypeId(WorkingType workingTypeId) {
		this.workingTypeId = workingTypeId;
	}

	public Employees getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employees employeeId) {
		this.employeeId = employeeId;
	}

	public int getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public long getWeeklyReport() {
		return weeklyReport;
	}

	public void setWeeklyReport(long weeklyReport) {
		this.weeklyReport = weeklyReport;
	}
	
}
