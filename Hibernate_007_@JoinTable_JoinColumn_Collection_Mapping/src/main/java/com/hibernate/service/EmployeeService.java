package com.hibernate.service;

import com.hibernate.entity.Employee;

public interface EmployeeService {
	public int saveEmployee(Employee employee);

	public Employee getEmployeeById(int employeeId);

	public void updateEmployeeById(int employeeId, Employee employeeTO);// TO-Transfer Object

	public void deleteEmployeeById(int employeeId);
}
