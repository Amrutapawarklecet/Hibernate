package com.hibernate.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Customer;

public class Client {

	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration();
			//read the xml file
			cfg.configure();
			//cfg.congigure("hibernate.xml");
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			//save
			Customer customer=new Customer(1001, "amruta", "am@am.com");
			Transaction tx=session.beginTransaction();
			session.save(customer);
			tx.commit();
			session.close();
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}

	}

}
