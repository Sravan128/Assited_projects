package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		// Store Employee
		Employee emp1 = new Employee();
		emp1.setId(7);
		emp1.setName("Seeta");
		emp1.setSalary(12000);
		
		EmployeeService es = new EmployeeService();
		String result = es.storeEmployee(emp1);
		System.out.println(result);
		
		
	}

}
