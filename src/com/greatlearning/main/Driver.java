package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.base.SuperDepartment;
import com.greatlearning.department.AdminDepartment;
import com.greatlearning.department.HrDepartment;
import com.greatlearning.department.TechDepartment;

public class Driver {
	
	public static void main(String[] args) {
		
		String toContinue = "yes";
		while (toContinue.trim().equalsIgnoreCase("yes")) {  // loop to keep execution flow continue till user inputs to.
			System.out.println("Please choose department Id \n 1. Admin Department \n 2. Hr Department \n 3. Tech Department");
			Scanner sc = new Scanner(System.in);
			int deptId = sc.nextInt(); // Get users choice of department.
			
			switch (deptId) {
			case 1:
				AdminDepartment adminDept = new AdminDepartment();  // set dept object to child class Admin department.
				
				System.out.println("\nWelcome to "+ adminDept.departmentName());
				System.out.println(adminDept.getTodaysWork());
				System.out.println(adminDept.getWorkDeadline());
				System.out.println(adminDept.isTodayAHoliday());
				
				break;
	
			case 2:
				HrDepartment hrDept = new HrDepartment();  // set dept object to child class Hr department.
				
				System.out.println("\nWelcome to "+ hrDept.departmentName());
				System.out.println(hrDept.doActivity());
				System.out.println(hrDept.getTodaysWork());
				System.out.println(hrDept.getWorkDeadline());
				System.out.println(hrDept.isTodayAHoliday());
				
				break;
	
			case 3:
				TechDepartment techDept = new TechDepartment();  // set dept object to child class Tech department.
				
				System.out.println("\nWelcome to "+ techDept.departmentName());
				System.out.println(techDept.getTodaysWork());
				System.out.println(techDept.getWorkDeadline());
				System.out.println(techDept.getTechStackInformation());
				System.out.println(techDept.isTodayAHoliday());
				
				break;
			
			default:
				SuperDepartment superDept = new SuperDepartment();
				
				System.out.println("\nWelcome to "+ superDept.departmentName());
				System.out.println(superDept.getTodaysWork());
				System.out.println(superDept.getWorkDeadline());
				System.out.println(superDept.isTodayAHoliday());
				
				break;
			}
			
			System.out.println("\nDo you want to continue?"); // Ask users choice to continue to display info of another department or quit.
			toContinue = sc.next();
		}
		System.out.println("Exitting the execution flow.");
	}
}
