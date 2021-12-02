package com.greatlearning.department;

import com.greatlearning.base.SuperDepartment;

public class HrDepartment extends SuperDepartment{
	
	public static final String DEPTNAME = "Hr Department";
	private String activity;
	/**
	 * constructor to initiate parent class with given values. Calling setter method within constructor to initialize class variable
	 */
	public HrDepartment() {
		super(DEPTNAME, "Fill today’s timesheet and mark your attendance", "Complete by EOD");
		setActivity("team Lunch");
	}
	/**
	 * getter method for activity
	 * @return
	 */
	public String doActivity() {
		return activity;
	}
	/**
	 * setter method for activity
	 * @param activity
	 */
	private void setActivity(String activity) {
		this.activity = activity;
	}
	
}
