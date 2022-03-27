package com.glearning.pg.model;

public class TechDepartment extends SuperDepartment{

	String strTechStackInformation ;
	
	public String getStrTechStackInformation() {
		return strTechStackInformation;
	}

	public void setStrTechStackInformation(String strTechStackInformation) {
		this.strTechStackInformation = strTechStackInformation;
	}

	@Override
	String departmentName() {
		return strDeptName ;
	}
	
	@Override
	String getTodaysWork() {
		return strTodaysWork;
	}
	
	@Override
	String getWorkDeadline() {
		return strWorkDeadline;
	}
	
	String getTechStackInformation() {
		return strTechStackInformation;
	}
	
	public void DisplayTechDept() {
		System.out.println("\nWelcome to "+ departmentName()+ " Department");
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
	}
	
}
