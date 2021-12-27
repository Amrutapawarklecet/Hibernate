package com.hibernate.client;

import com.hibernate.entity.Employee;
import com.hibernate.model.Address;
import com.hibernate.service.EmployeeService;
import com.hibernate.service.impl.EmployeeServiceImpl;

public class ClientCrud {
 public static void main(String[] args) {
	EmployeeService employeeService=new EmployeeServiceImpl();
	try {
		Address address=new Address(1092, 5, 21, "Jayanagar", "Karnataka", 765656);
		Employee employee=new Employee("Jayant","jk@jk.com", 3000.0);
		employee.setAddress(address);
		
		Integer i=employeeService.saveEmployee(employee);
		System.out.println("Employee is created with id: "+i);
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
