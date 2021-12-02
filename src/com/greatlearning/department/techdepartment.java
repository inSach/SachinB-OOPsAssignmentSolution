package com.greatlearning.department;

import com.greatlearning.base.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	
	public static final String DEPTNAME = "Tech Department";
	private String techStack;
	/**
	 * Constructor to initiate parent class with given values. Calling setter method within constructor to initialize class variable
	 */
	public TechDepartment() {
		super(DEPTNAME, "Complete coding of Module 1", "Complete by EOD");
		setTechStackInformation("Core Java");
	}
	/**
	 * getter method for Tech Stack Information
	 * @return
	 */
	public String getTechStackInformation() {
		return techStack;
	}
	/**
	 * setter method for Tech Stack Information
	 * @param techStack
	 */
	private void setTechStackInformation(String techStack) {
		this.techStack = techStack;
	}
}
