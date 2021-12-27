package com.hibernate.dao;

import com.hibernate.entity.Student;

public interface StudentDao {
	public int saveStudent(Student student);

	public Student getStudentById(int rollNo);

	public void updateStudentById(int rollNo, Student StudentTO);// TO-Transfer Object

	public void deleteStudentById(int rollNo);
}
