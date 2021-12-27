package com.hibernate.client;

import org.hibernate.Session;

import com.hibernate.entity.Address;
import com.hibernate.entity.Employee;
import com.hibernate.service.EmployeeService;
import com.hibernate.service.impl.EmployeeServiceImpl;
import com.hibernate.util.HibernateUtil;

public class SaveClient {
	public static void main(String[] args) {
		//Session session=null;
		EmployeeService employeeService = new EmployeeServiceImpl();
		try {
			
			Address address = new Address(1092, 5, 21, "Jayanagar", "Karnataka", 765656);
			Employee employee = new Employee("Jayant", "jk@jk.com", 3000.0);
			employee.setAddress(address);
			
			Integer i = employeeService.saveEmployee(employee);
			System.out.println("Employee is created with id: " + i);
			
			/*session=HibernateUtil.getSessionFactory().openSession();
			Address address = new Address(1092, 5, 21, "Jayanagar", "Karnataka", 765656);
			Employee employee = new Employee("Jayant", "jk@jk.com", 3000.0);
			employee.setAddress(address);
			session.save(address);
			session.save(employee);*/
			
			
		} catch (Exception e) {

			e.printStackTrace();
		} /*finally {
			if(session!=null)
			session.close();
		}*/
	}
}
