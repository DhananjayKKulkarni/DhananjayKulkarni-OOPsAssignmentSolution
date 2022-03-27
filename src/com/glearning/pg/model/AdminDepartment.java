package com.glearning.pg.model;

public class AdminDepartment extends SuperDepartment{

	@Override
	String departmentName() {
		return strDeptName; 
	}
	
	@Override	
	String	getTodaysWork() {
		return strTodaysWork ;
	}
	
	@Override
	String getWorkDeadline() {
		return strWorkDeadline ; 
	}
	
	public void DisplayAdminDept() {
		System.out.println("\nWelcome to "+ departmentName()+ " Department");
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}
	
}
