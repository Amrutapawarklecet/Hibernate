package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AlienName an=new AlienName();
		an.setFname("Amruta");
		an.setLname("Pawar");
		an.setMname("Ashok");
		
		Alien telusko = new Alien();
		//Alien telusko=null;
		telusko.setAid(101);
		telusko.setAcolor("green");
		telusko.setAname(an);
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(telusko);
		//fatching the value
		//telusko=(Alien)session.get(Alien.class,102);
		

		tx.commit();

		System.out.println(telusko);
	}
}
