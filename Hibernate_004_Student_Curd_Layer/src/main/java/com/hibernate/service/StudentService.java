package com.hibernate.service;

import com.hibernate.entity.Student;

public interface StudentService {
	public int saveStudent(Student student);

	public Student getStudentById(int rollNo);

	public void updateStudentById(int rollNo, Student StudentTO);// TO-Transfer Object

	public void deleteStudentById(int rollNo);
}
