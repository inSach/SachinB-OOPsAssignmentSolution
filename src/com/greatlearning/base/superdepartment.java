package com.greatlearning.base;

public class superdepartment {
	private String deptName, todaysWork, workDeadline; 
	private String isHoliday = "Today is not a holiday";
	
	public superdepartment() {
		this.deptName = "Super Department";
		this.todaysWork = " No Work as of now";
		this.workDeadline = "Nil";
	}
	
	public superdepartment(String deptName, String todaysWork, String workDeadline) {
		this.deptName = deptName;
		this.todaysWork = todaysWork;
		this.workDeadline = workDeadline;
	}
	
	public String departmentName() {
		return deptName;
	}
	
	public String getTodaysWork() {
		return todaysWork;
	}
	
	public String getWorkDeadline() {
		return workDeadline;
	}
	
	public String isTodayAHoliday() {
		return isHoliday;
	}
}
