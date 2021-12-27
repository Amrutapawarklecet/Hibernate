package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		/*AlienName an=new AlienName();
		an.setFname("yuvi");
		an.setLname("Pawar");
		an.setMname("Ashok");*/
		
		Alien a = null;
		/*Alien a = new Alien();
		
		a.setAid(103);
		a.setAcolor("pink");
		a.setAname(an);*/
		

		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

		SessionFactory sf = con.buildSessionFactory(reg);
		
		//session1
		Session session1 = sf.openSession();

		Transaction tx1=session1.beginTransaction();
		
		a=(Alien)session1.get(Alien.class, 101);
		System.out.println(a);
		
		session1.getTransaction();
		tx1.commit();
		session1.close();
		
		//session2
		Session session2 = sf.openSession();

		Transaction tx2=session2.beginTransaction();
		
		a=(Alien)session2.get(Alien.class, 101);
		System.out.println(a);
		//session1.save(a);
		// fatching the value
		session2.getTransaction();
		tx2.commit();
		session2.close();
		

		
	}
}
