package com.hibernate.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.hibernate.model.Address;

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

	// Value Object
	@Embedded
	@AttributeOverrides(value= {
			@AttributeOverride(column = @Column(name = "local_houseNo"),name="houseNo"),
			@AttributeOverride(column = @Column(name = "local_main"),name="main"),
			@AttributeOverride(column = @Column(name = "local_crss"),name="crss"),
			@AttributeOverride(column = @Column(name = "local_area"),name="area"),
			@AttributeOverride(column = @Column(name = "local_state"),name="state"),
			@AttributeOverride(column = @Column(name = "local_pincode"),name="pincode")
			
	})
	private Address localAddress;

	@Embedded
	@AttributeOverrides(value= {
			@AttributeOverride(column = @Column(name = "perm_houseNo"),name="houseNo"),
			@AttributeOverride(column = @Column(name = "perm_main"),name="main"),
			@AttributeOverride(column = @Column(name = "perm_crss"),name="crss"),
			@AttributeOverride(column = @Column(name = "perm_area"),name="area"),
			@AttributeOverride(column = @Column(name = "perm_state"),name="state"),
			@AttributeOverride(column = @Column(name = "perm_pincode"),name="pincode")
			
	})
	private Address permAddress;

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

	public Address getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(Address localAddress) {
		this.localAddress = localAddress;
	}

	public Address getPermAddress() {
		return permAddress;
	}

	public void setPermAddress(Address permAddress) {
		this.permAddress = permAddress;
	}

}
