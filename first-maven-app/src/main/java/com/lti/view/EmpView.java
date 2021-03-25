package com.lti.view;

import com.lti.model.Employee;

public class EmpView {
	
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.setEmpId(1003);
		emp.setEmpName("James");
		
		System.out.println("id-"+emp.getEmpId());
		System.out.println("name-"+emp.getEmpName());
	}
}
