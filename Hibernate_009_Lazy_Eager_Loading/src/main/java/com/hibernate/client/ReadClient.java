package com.hibernate.client;

import java.util.List;

import com.hibernate.entity.Employee;
import com.hibernate.model.Address;
import com.hibernate.service.EmployeeService;
import com.hibernate.service.impl.EmployeeServiceImpl;

public class ReadClient {
	public static void main(String[] args) {
		EmployeeService employeeService = null;
		Employee employee = null;
		//List<Address> address=null;
		
			try {
				employeeService = new EmployeeServiceImpl();
				employee = employeeService.getEmployeeById(1);
				System.out.println("---------------");
				/*address=(List)employee.getAddresses();
				System.out.println(employee);
				for(int i=0;i<address.size();i++) {
					System.out.println(address.get(i));
				}*/
				
				System.out.println(employee);
				employee.getAddresses().forEach(System.out::println);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}

