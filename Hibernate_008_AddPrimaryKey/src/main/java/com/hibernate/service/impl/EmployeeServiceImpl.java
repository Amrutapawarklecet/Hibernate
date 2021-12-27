package com.hibernate.service.impl;

import com.hibernate.dao.EmployeeDao;
import com.hibernate.dao.impl.EmployeeDaoImpl;
import com.hibernate.entity.Employee;
import com.hibernate.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeeDao=null;
	
	public int saveEmployee(Employee employee) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		return employeeDao.saveEmployee(employee);
	}

	public Employee getEmployeeById(int employeeId) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		return employeeDao.getEmployeeById(employeeId);
	}

	public void updateEmployeeById(int employeeId, Employee employeeTO) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		employeeDao.updateEmployeeById(employeeId,employeeTO);
		
	}

	public void deleteEmployeeById(int employeeId) {
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		employeeDao.deleteEmployeeById(employeeId);
		
	}

}
