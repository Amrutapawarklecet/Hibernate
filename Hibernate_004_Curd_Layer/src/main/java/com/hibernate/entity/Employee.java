package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "employee_tbl")
@DynamicUpdate
public class Employee {

	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;

	@Column(name = "emp_name")
	private String employeeName;

	private String email;

	private Double salary;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(String employeeName, String email, Double salary) {
		super();

		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
	}

	public Employee() {
		super();

	}

	@Override
	public String toString() {
		String result = "-----------------\nEmployee Details:\n-----------------\nEmployeeId= " + employeeId
				+ "\nEmployeeName= " + employeeName + "\nEmail= " + email + "\nSalary= " + salary;
		return result;
	}

}
