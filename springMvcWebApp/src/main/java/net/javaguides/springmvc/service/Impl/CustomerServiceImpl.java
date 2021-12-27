package net.javaguides.springmvc.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.javaguides.springmvc.dao.CustomerDAO;
import net.javaguides.springmvc.entity.Customer;
import net.javaguides.springmvc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public List < Customer > getCustomers() {
        return customerDAO.getCustomers();
    }

    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerDAO.saveCustomer(theCustomer);
    }

    @Transactional
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Transactional
    public void deleteCustomer(int theId) {
        customerDAO.deleteCustomer(theId);
    }
}
/*package com.hibernate.service.impl;

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
*/