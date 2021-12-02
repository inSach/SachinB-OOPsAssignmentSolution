package com.greatlearning.department;

import com.greatlearning.base.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	
	public static final String DEPTNAME = "Admin Department";
	/**
	 * constructor to initiate parent class with given values.
	 */
	public AdminDepartment() {
		super(DEPTNAME, "Complete your documents submission", "Complete by EOD");
	}
	
}
