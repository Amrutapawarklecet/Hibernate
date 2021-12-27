package com.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.internal.compile.CriteriaQueryTypeQueryAdapter;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/*
		 * AlienName an=new AlienName(); an.setFname("yuvi"); an.setLname("Pawar");
		 * an.setMname("Ashok");
		 */

		Alien a = null;
		/*
		 * Alien a = new Alien();
		 * 
		 * a.setAid(103); a.setAcolor("pink"); a.setAname(an);
		 */

		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

		SessionFactory sf = con.buildSessionFactory(reg);

		// session1
		Session session1 = sf.openSession();
		Transaction tx1 = session1.beginTransaction();
		Query q1 = session1.createQuery("from Alien where aid=101");
		q1.setCacheable(true);//first 
		//query result is store in cache

		a = (Alien) q1.uniqueResult();
		System.out.println(a);

		/*
		 * a=(Alien)session1.get(Alien.class, 101); System.out.println(a);
		 */

		session1.getTransaction();
		tx1.commit();
		session1.close();

		// session2
		Session session2 = sf.openSession();

		Transaction tx2 = session2.beginTransaction();
		Query q2 = session2.createQuery("from Alien where aid=101");
		q2.setCacheable(true);//second time it is fetching from cache
		
		a = (Alien) q2.uniqueResult();
		System.out.println(a);

		/*
		 * a=(Alien)session2.get(Alien.class, 101); System.out.println(a);
		 */
		// session1.save(a);
		// fatching the value
		session2.getTransaction();
		tx2.commit();
		session2.close();

	}
}
