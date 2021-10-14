package com.OOPS_Encapsulation;

import java.util.ArrayList;

public class Test_University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Univeristy com= new Univeristy("VIT", "Katpadi", null);
		
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Maths");
		ar.add("B.tech");
		ar.add("B.C.A");
		Univeristy com= new Univeristy("VIT", "Vellore", ar);
//		ArrayList<String> ar1=com.getCourses();
		System.out.println(com.getName());
		System.out.println(com.getHq());
		System.out.println(com.getCourses());
		
		com.setName("SSM");
		
		System.out.println(com.getName());
		System.out.println(com.getHq());
		System.out.println(com.getCourses());
		ar.add("M.C.A");
		System.out.println(com.getName());
		System.out.println(com.getHq());
		System.out.println(com.getCourses());
		
		
	}

}
