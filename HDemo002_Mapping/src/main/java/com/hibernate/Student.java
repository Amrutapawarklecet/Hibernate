package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.cfg.Configuration;

@Entity
public class Student {
	
	@Id
	private int rollno; 
	private String name;
	private int marks;
	/*@OneToOne
	private Laptop laptop;*/
	
	/*@OneToMany
	private List<Laptop> laptop=new ArrayList<Laptop>();*/
	
	/*@OneToMany(mappedBy="student")
	private List<Laptop> laptop=new ArrayList<Laptop>();*/
	
	//@ManyToMany
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptop=new ArrayList<Laptop>();
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
	//@onetoone
	/*public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/
	//@OnetoMany or @ManyToMany
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
