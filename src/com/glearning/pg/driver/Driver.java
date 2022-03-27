package com.glearning.pg.driver;

import com.glearning.pg.model.AdminDepartment;
import com.glearning.pg.model.HrDepartment;
import com.glearning.pg.model.TechDepartment;

public class Driver {
	public static void main(String[] args) {
		
		AdminDepartment objAdminDept = new AdminDepartment();
		objAdminDept.setStrDeptName("Admin");
		objAdminDept.setStrTodaysWork("Complete your documents submission");
		objAdminDept.setStrWorkDeadline("Complete by EOD");
		objAdminDept.DisplayAdminDept();
		
		HrDepartment objHrDept = new HrDepartment();
		objHrDept.setStrDeptName("HR");
		objHrDept.setStrTodaysWork("Fill today’s worksheet and mark your attendance");
		objHrDept.setStrWorkDeadline("Complete by EOD");
		objHrDept.setStrDoActivity("team Lunch");
		objHrDept.DisplayHrDept();
		
		TechDepartment objTechDept = new TechDepartment();
		objTechDept.setStrDeptName("Tech");
		objTechDept.setStrTodaysWork("Complete coding of module 1");
		objTechDept.setStrWorkDeadline("Complete by EOD");
		objTechDept.setStrTechStackInformation("Core Java");
		objTechDept.DisplayTechDept();
		
	}

}
