package com.OOPS_Encapsulation;

import java.util.ArrayList;

public class Univeristy {

	private String  name;
	private String hq;
	private  ArrayList<String> courses;
	
	public Univeristy(String name,String hq,ArrayList<String> courses) {
		this.name=name;
		this.hq=hq;
		this.courses=courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}
	
	
}
