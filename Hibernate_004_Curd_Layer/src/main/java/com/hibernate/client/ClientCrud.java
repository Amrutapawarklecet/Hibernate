package com.hibernate.client;

import com.hibernate.entity.Employee;
import com.hibernate.service.EmployeeService;
import com.hibernate.service.impl.EmployeeServiceImpl;

public class ClientCrud {
 public static void main(String[] args) {
	EmployeeService employeeService=new EmployeeServiceImpl();
	try {
		//1.Create Employee
		/*Employee employee=new Employee("amruta", "am@kh.com", 1000.00);
		employeeService.saveEmployee(employee);*/
		
		//2.Read Employee
		/*Integer id=2;
		System.out.println(employeeService.getEmployeeById(id));
		*/
		
		//3.Update Employee
		Integer id=1;
		Employee employee=new Employee();
		employee.setEmployeeId(1);
		employee.setEmployeeName("amruta");
		employee.setEmail("am@am.com");
		employee.setSalary(6000.00);
		employeeService.updateEmployeeById(id,employee);
		
		//4.Delete Employee
		/*Integer id=2;
		employeeService.deleteEmployeeById(id);*/
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
