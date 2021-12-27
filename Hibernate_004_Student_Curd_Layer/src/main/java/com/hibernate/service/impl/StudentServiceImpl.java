package com.hibernate.service.impl;

import com.hibernate.dao.StudentDao;
import com.hibernate.dao.impl.StudentDaoImpl;
import com.hibernate.entity.Student;
import com.hibernate.service.StudentService;

public class StudentServiceImpl implements StudentService {
	StudentDao studentDao=null;
	
	public int saveStudent(Student student) {
		StudentDao studentDao=new StudentDaoImpl();
		return studentDao.saveStudent(student);
	}

	public Student getStudentById(int rollNo) {
		StudentDao studentDao=new StudentDaoImpl();
		return studentDao.getStudentById(rollNo);
	}

	public void updateStudentById(int rollNo, Student studentTO) {
		StudentDao studentDao=new StudentDaoImpl();
		studentDao.updateStudentById(rollNo,studentTO);
		
	}

	public void deleteStudentById(int rollNo) {
		StudentDao studentDao=new StudentDaoImpl();
		studentDao.deleteStudentById(rollNo);
		
	}

}
