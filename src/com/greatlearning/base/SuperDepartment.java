package com.greatlearning.base;

public class SuperDepartment {
	private String deptName, todaysWork, workDeadline, isHoliday;
	/**
	 * constructor setting values to class variables.
	 */
	public SuperDepartment() { 
		this.deptName = "Super Department";
		this.todaysWork = "No Work as of now";
		this.workDeadline = "Nil";
		this.isHoliday = "Today is not a Holiday";
	}
	/**
	 *  overloaded constructor calling setter methods to initialize class variables with values passes.
	 * @param deptName
	 * @param todaysWork
	 * @param workDeadline
	 */
	public SuperDepartment(String deptName, String todaysWork, String workDeadline) { 
		setdepartmentName(deptName);
		setTodaysWork(todaysWork);
		setWorkDeadline(workDeadline);
		setisHoliday("Today is not a Holiday");
	}
	/**
	 * getter method for Department name
	 * @return String deptName
	 */
	public String departmentName() {
		return deptName;
	}
	/**
	 * setter method for Department name
	 * @param deptName
	 */
	public void setdepartmentName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * getter method for Todays work
	 * @return
	 */
	public String getTodaysWork() {
		return todaysWork;
	}
	/**
	 * setter method for Todays work
	 * @param todaysWork
	 */
	public void  setTodaysWork(String todaysWork) {
		this.todaysWork = todaysWork;
	}
	/**
	 * getter method for Work deadline
	 * @return
	 */
	public String getWorkDeadline() {
		return workDeadline;
	}
	/**
	 * setter method for work Deadline
	 * @param workDeadline
	 */
	public void setWorkDeadline(String workDeadline) {
		this.workDeadline = workDeadline;
	}
	/**
	 * getter method for is Holiday
	 * @return
	 */
	public String isTodayAHoliday() {
		return isHoliday;
	}
	/**
	 * setter method for is Holiday
	 * @param isHoliday
	 */
	public void setisHoliday(String isHoliday) {
		this.isHoliday = isHoliday;
	}
}
