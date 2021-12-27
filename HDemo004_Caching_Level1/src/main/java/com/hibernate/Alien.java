package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alien_tbl")
public class Alien {
	@Id
	//@Column(name="aid")
	private int aid;
	
	//@Column(name="aname")
	//@Transient
	private AlienName aname;
	
	//@Column(name="color")
	private String color;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}


	public AlienName getAname() {
		return aname;
	}

	public void setAname(AlienName aname) {
		this.aname = aname;
	}

	public String getAcolor() {
		return color;
	}

	public void setAcolor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

	
	
	
}
