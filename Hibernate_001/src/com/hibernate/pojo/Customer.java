package com.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_tbl")
public class Customer {
	
	@Id
	@Column(name="Customer_id")
	private int customerId;
	
	@Column(name="Customer_name")
	private String CustomerName;
	private String email;

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		public Customer(int customerId, String customerName, String email) {
		super();
		this.customerId = customerId;
		CustomerName = customerName;
		this.email = email;
	}
	
	
}
