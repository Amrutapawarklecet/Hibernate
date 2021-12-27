package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "student_tbl")
@DynamicUpdate
public class Student {
	@Id
	@Column(name = "roll_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo; 
	private String name;
	private int marks;
	

	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
	


	public Student( String name, int marks) {
		super();
		
		this.name = name;
		this.marks = marks;
	}


	public Student() {
		super();
		
	}


	@Override
	public String toString() {
		String result = "-----------------\nStudent Details:\n-----------------\nRollNo= " + rollNo
				+ "\nName= " + name + "\nMarks= " + marks;
		return result;
	}

}
