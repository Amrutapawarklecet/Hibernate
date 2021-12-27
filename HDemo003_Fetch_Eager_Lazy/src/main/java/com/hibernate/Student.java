package com.hibernate;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	private int rollno; 
	private String name;
	private int marks;
	
	
	@OneToMany(mappedBy="student",fetch=FetchType.EAGER)
	private Collection<Laptop> laps=new ArrayList<Laptop>();
	
	public Collection<Laptop> getLaps(){
		return laps;
		
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}
	
	
	
	
	
}
