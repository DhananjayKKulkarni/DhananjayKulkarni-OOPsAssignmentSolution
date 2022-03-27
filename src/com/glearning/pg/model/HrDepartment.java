package com.glearning.pg.model;

public class HrDepartment extends SuperDepartment {

	String strDoActivity;
	
	public String getStrDoActivity() {
		return strDoActivity;
	}

	public void setStrDoActivity(String strDoActivity) {
		this.strDoActivity = strDoActivity;
	}

	@Override
	String departmentName() {
		return strDeptName ;
	}
	
	@Override
	String getTodaysWork() {
		return  strTodaysWork;
	}
	
	@Override
	String getWorkDeadline() {
		return strWorkDeadline;
	}
	
	String doActivity() {
				return strDoActivity;
	}
	
	public void DisplayHrDept() {
		System.out.println("\nWelcome to "+ departmentName()+ " Department");
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}
}
