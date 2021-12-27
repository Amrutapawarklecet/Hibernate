package com.hibernate.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hibernate.dao.StudentDao;
import com.hibernate.entity.Student;
import com.hibernate.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao {

	public int saveStudent(Student student) {
		Integer id = 0;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			id = (Integer) session.save(student);
			session.getTransaction().commit();
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return id;
	}

	public Student getStudentById(int rollNo) {
		Student student=null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			student=session.get(Student.class, rollNo);
			if(student!=null) {
				System.out.println("Student Found!!");
			}
			else {
				System.out.println("Student not found with rollno:"+rollNo);
			}
		} catch (HibernateException e) {

			e.printStackTrace();
		}
		return student;
	}

	public void updateStudentById(int rollNo, Student studentTO) {
		Student student=null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			student=session.get(Student.class, rollNo);
			if(student!=null) {
				//student.setName(studentTO.getName());
				//student.setMarks(studentTO.getMarks());//dynamic update
				student.setName(studentTO.getName());
				student.setMarks(studentTO.getMarks());
				
				
				session.beginTransaction();
				session.update(student);
				session.getTransaction().commit();
			}
			else {
				System.out.println("Student not found!!");
			}
		} catch (HibernateException e) {

			e.printStackTrace();
		}

	}

	public void deleteStudentById(int rollNo) {
		Student student=null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			student=session.get(Student.class, rollNo);
			if(student!=null) {
				session.beginTransaction();
				session.delete(student);
				session.getTransaction().commit();
			}
			else {
				System.out.println("Student not found with rollno:"+rollNo);
			}
		} catch (HibernateException e) {

			e.printStackTrace();
		}

	}

}
