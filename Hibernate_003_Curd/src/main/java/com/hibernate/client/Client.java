package com.hibernate.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Customer;
import com.hibernate.util.HibernateUtil;

public class Client {

	public static void main(String[] args) {
		Session session=null;
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			session = factory.openSession();
			//1.CREATE CUSTOMER
			//createCustomer(session);
			
			//2. READ CUSTOMER
			//getCustomerById(session);
			
			//3.UPDATE CUSTOMER
			//updateCustomerById(session);
			
			//4.DELETE CUSTOMER
			deleteCustomerById(session);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}

	}
	public static void createCustomer(Session session) {
		session.beginTransaction();
		Customer customer = new Customer(1004, "yuvi", "yuvi@gmail.com");
		Integer id = (Integer) session.save(customer);
		System.out.println("Id: " + id);
		session.getTransaction().commit();
	}
	
	public static void getCustomerById(Session session) {
		Integer id=1002;
		//to retrive the data
		Customer customer=session.get(Customer.class, id);
		if(customer!=null) {
			System.out.println(customer);
		}
		else {
			System.out.println("No customer found with this id");
		}
			
	}
	
	public static void updateCustomerById(Session session) {
		Integer id=1001;
		Customer customer=session.get(Customer.class, id);
		if(customer!=null) {
			customer.setCustomerName("Marlabs");
			session.beginTransaction();
			session.update(customer);
			session.getTransaction().commit();
		}
		else {
			System.out.println("No customer found with this id");
		}
	
	}
	
	public static void deleteCustomerById(Session session) {
		Integer id=1003;
		Customer customer=session.get(Customer.class, id);
		if(customer!=null) {
			session.beginTransaction();
			session.delete(customer);
			session.getTransaction().commit();
			
		}
	}
		
	}

