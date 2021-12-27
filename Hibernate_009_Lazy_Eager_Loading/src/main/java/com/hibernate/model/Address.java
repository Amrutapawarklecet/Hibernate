package com.hibernate.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int houseNo;
	private int main;
	private int crss;
	private String area;
	private String state;
	private int pincode;

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public int getMain() {
		return main;
	}

	public void setMain(int main) {
		this.main = main;
	}

	public int getCrss() {
		return crss;
	}

	public void setCrss(int crss) {
		this.crss = crss;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Address(int houseNo, int main, int crss, String area, String state, int pincode) {
		super();
		this.houseNo = houseNo;
		this.main = main;
		this.crss = crss;
		this.area = area;
		this.state = state;
		this.pincode = pincode;
	}
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String result = "-----------------\nEmployee Address:\n-----------------\nHouseNo= " + houseNo + "\nMain= "
				+ main + "\nCross= " + crss + "\nArea= " + area + "\nState= " + state + "\nPincode= " + pincode;
		return result;
	}

}
