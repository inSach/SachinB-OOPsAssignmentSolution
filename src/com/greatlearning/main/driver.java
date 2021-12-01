package com.greatlearning.main;

import com.greatlearning.department.admindepartment;
import com.greatlearning.department.hrdepartment;
import com.greatlearning.department.techdepartment;

public class driver {
	
	public static void main(String[] args) {
		
		admindepartment adminDept = new admindepartment();
		System.out.println("Welcome to "+ adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		System.out.println("------------------------------------------------------");
		hrdepartment hrDept = new hrdepartment();
		System.out.println("Welcome to "+ hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		System.out.println("------------------------------------------------------");
		techdepartment techDept = new techdepartment();
		System.out.println("Welcome to "+ techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
		
	}
}
