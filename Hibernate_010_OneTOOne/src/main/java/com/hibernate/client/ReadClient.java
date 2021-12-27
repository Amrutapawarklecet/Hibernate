package com.hibernate.client;

import java.util.List;

import com.hibernate.entity.Address;
import com.hibernate.entity.Employee;
import com.hibernate.service.EmployeeService;
import com.hibernate.service.impl.EmployeeServiceImpl;

public class ReadClient {
	public static void main(String[] args) {
		EmployeeService employeeService = null;
		Employee employee = null;
		
		try {
			employeeService = new EmployeeServiceImpl();
			employee = employeeService.getEmployeeById(1);
			System.out.println("---------------");
			
			System.out.println(employee);
			System.out.println(employee.getAddress());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
