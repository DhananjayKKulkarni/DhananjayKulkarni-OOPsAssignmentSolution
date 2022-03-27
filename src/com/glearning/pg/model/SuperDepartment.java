package com.glearning.pg.model;

public class SuperDepartment {

	public String strDeptName ; 
	public String strTodaysWork ;
	public String strWorkDeadline ;
	public String strIsHoliday ;
	
	public  String getStrDeptName() {
		return strDeptName;
	}

	public  void setStrDeptName(String strDeptName) {
		this.strDeptName = strDeptName;
	}

	public String getStrTodaysWork() {
		return strTodaysWork;
	}

	public void setStrTodaysWork(String strTodaysWork) {
		this.strTodaysWork = strTodaysWork;
	}

	public String getStrWorkDeadline() {
		return strWorkDeadline;
	}

	public void setStrWorkDeadline(String strWorkDeadline) {
		this.strWorkDeadline = strWorkDeadline;
	}

	public String getStrIsHoliday() {
		return strIsHoliday;
	}

	public void setStrIsHoliday(String strIsHoliday) {
		this.strIsHoliday = strIsHoliday;
	}

	SuperDepartment(){
	
		this.strDeptName = "Super" ; 
		this.strTodaysWork = "No Work as of now";
		this.strWorkDeadline = "Nil";
		this.strIsHoliday = "Today is not a holiday";
	}
		
	String departmentName() {
		return strDeptName;
	}
	
	String getTodaysWork() {
		return strTodaysWork;
	}
	
	String getWorkDeadline() {
		return strWorkDeadline;
	}
	
	String isTodayAHoliday() {
		return strIsHoliday;
	}
	
	public void DisplaySuperAdmin() {
		System.out.println();
		
	}
	
	public void DisplaySuperDept() {
		System.out.println("\nWelcome to "+ departmentName()+ " Department");
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}
}
