package com.jpa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Size;

@Entity
@Table (name = "WeeklyGeneratedReports")
public class WeeklyGeneratedReports implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@TableGenerator (name = "reports_gen", table = "id_gen_reports", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "reports_gen")
	@Id
	@GeneratedValue (strategy = GenerationType.TABLE,  generator = "reports_gen")
	@Column (name = "reportId")
	private long reportId;
	
	@Column (name = "startDate", nullable = false , length = 8)
	@Size (max = 8)
	private String startDate;
	
	@Column (name = "endtDate", nullable = false , length = 8)
	@Size (max = 8)
	private String endtDate;
	
	@OneToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "employeeId", nullable = false)
	private Employees supervisorId;
	
	@OneToMany (mappedBy = "weeklyReport", fetch = FetchType.EAGER)
	private List<WorkingDayCalendar> workedDays;
	
	@Column (name = "isChecked", nullable  = false, length = 1)
	@Size (max = 1)
	private String isChecked;

	public long getReportId() {
		return reportId;
	}

	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndtDate() {
		return endtDate;
	}

	public void setEndtDate(String endtDate) {
		this.endtDate = endtDate;
	}

	public Employees getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(Employees supervisorId) {
		this.supervisorId = supervisorId;
	}

	public List<WorkingDayCalendar> getWorkedDays() {
		return workedDays;
	}

	public void setWorkedDays(List<WorkingDayCalendar> workedDays) {
		this.workedDays = workedDays;
	}

	public String getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
	}
	
}
