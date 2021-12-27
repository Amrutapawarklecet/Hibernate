package com.hibernate;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
	public static void main(String[] args) {
		/*Laptop laptop =new Laptop();
		laptop.setLid(103);
		laptop.setLname("Mac");
		
		Student s=new Student();
		s.setName("amruta");
		s.setRollno(3);
		s.setMarks(60);
		//s.setLaps(laptop);//@onetoone
		s.getLaps().add(laptop); //@onetomany
		
		//laptop.getStudent().add(s);//@ManyToMany
		*/
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		session.beginTransaction();
		
		Student s1=session.get(Student.class, 1);
		
		//session.save(laptop);
		//session.save(s);
		
		System.out.println(s1.getName());
		//by default fetch type is lazy below it is example for lazy fetch
		/*Collection<Laptop> laps=s1.getLaps();
		
		for(Laptop l:laps) {
			System.out.println(l);
		}*/
		
		
}
}
