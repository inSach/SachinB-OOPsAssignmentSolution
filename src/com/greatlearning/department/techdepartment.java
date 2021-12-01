package com.greatlearning.department;

import com.greatlearning.base.superdepartment;

public class techdepartment extends superdepartment{
	
	public techdepartment() {
		super("Tech Department", "Complete coding of module 1", "Complete by EOD");
	}
	
	public String getTechStackInformation() {
		return "Core Java";
	}
}
