package com.hibernate.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hibernate.dao.EmployeeDao;
import com.hibernate.entity.Employee;
import com.hibernate.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	public int saveEmployee(Employee employee) {
		Integer id = 0;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			id = (Integer) session.save(employee);
			session.getTransaction().commit();
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return id;
	}

	public Employee getEmployeeById(int employeeId) {
		Employee employee=null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			employee=session.get(Employee.class, employeeId);
			if(employee!=null) {
				System.out.println("Employee Found!!");
			}
			else {
				System.out.println("Employee not found with id:"+employeeId);
			}
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return employee;
	}

	public void updateEmployeeById(int employeeId, Employee employeeTO) {
		Employee employee=null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			employee=session.get(Employee.class, employeeId);
			if(employee!=null) {
				//employee.setEmployeeName(employeeTO.getEmployeeName());
				//employee.setEmail(employeeTO.getEmail());//dynamic update
				employee.setEmployeeName(employeeTO.getEmployeeName());
				employee.setEmail(employeeTO.getEmail());
				employee.setSalary(employeeTO.getSalary());
				
				session.beginTransaction();
				session.update(employee);
				session.getTransaction().commit();
			}
			else {
				System.out.println("Employee not found!!");
			}
		} catch (HibernateException e) {

			e.printStackTrace();
		}

	}

	public void deleteEmployeeById(int employeeId) {
		Employee employee=null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			employee=session.get(Employee.class, employeeId);
			if(employee!=null) {
				session.beginTransaction();
				session.delete(employee);
				session.getTransaction().commit();
			}
			else {
				System.out.println("Employee not found with id:"+employeeId);
			}
		} catch (HibernateException e) {

			e.printStackTrace();
		}

	}

}
