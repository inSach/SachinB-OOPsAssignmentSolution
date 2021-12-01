package com.greatlearning.department;

import com.greatlearning.base.superdepartment;

public class hrdepartment extends superdepartment{
	
	public hrdepartment() {
		super("Hr Department", "Fill today’s timesheet and mark your attendance", "Complete by EOD");
	}
	
	public String doActivity() {
		return "team Lunch";
	}
	
}
