package com.hibernate.client;

import com.hibernate.entity.Employee;
import com.hibernate.model.Address;
import com.hibernate.service.EmployeeService;
import com.hibernate.service.impl.EmployeeServiceImpl;

public class ClientCrud {
 public static void main(String[] args) {
	EmployeeService employeeService=new EmployeeServiceImpl();
	try {
		Address localAddress=new Address(1092, 5, 21, "Jayanagar", "Karnataka", 765656);
		Address permAddress=new Address(4092, 51, 2, "JPNagar", "Karnataka", 765689);
		Employee employee=new Employee("Jayant","jk@jk.com", 3000.0);
		employee.setLocalAddress(localAddress);
		employee.setPermAddress(permAddress);
		
		Integer i=employeeService.saveEmployee(employee);
		System.out.println("Employee is created with id: "+i);
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
