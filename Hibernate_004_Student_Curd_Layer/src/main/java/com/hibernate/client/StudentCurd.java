package com.hibernate.client;

import com.hibernate.entity.Student;
import com.hibernate.service.StudentService;
import com.hibernate.service.impl.StudentServiceImpl;

public class StudentCurd {
 public static void main(String[] args) {
	StudentService studentService=new StudentServiceImpl();
	try {
		//1.Create Employee
		/*Student student=new Student("samidha", 57);
		studentService.saveStudent(student);*/
		
		//2.Read Employee
		/*Integer id=2;
		System.out.println(studentService.getStudentById(id));*/
		
		
		//3.Update Employee
		/*Integer id=1;
		Student student=new Student();
		student.setRollNo(2);
		student.setName("piyu");
		student.setMarks(60);
		studentService.updateStudentById(id,student);*/
		
		//4.Delete Employee
		/*Integer id=2;
		studentService.deleteStudentById(id);*/
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
