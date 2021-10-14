package javaSession;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodInJava {

	// Methods /function : Logic written in a block
	// we can call this block
	//static/ non static method
	//can not create a method inside a method
	//but can call the methods from diff method
	//duplicate methods are not allowed 
	//methods should be independent to each other/parallel to each other
	//to call non static method we have to create the object of the class
	//function can not return multiple values
	
	
	//1. no input and no return
	// void does not return anything(no return keyword
	public void test() {
		System.out.println("test");
	}
	
	// 2. no input but some return 
	
	public int sum() {
	System.out.println("Sum method");
	int a=10;
	int b=20;
	int c= a+b;
	return c;
	}
	
	// 2. no input but some retur
	public String getTrainerName() {
		String name="Amulrani";
		return name;
	}
	
	// 3. some input and some return
	
	public int add (int x, int y) {
		System.out.println("Add method");
		int z=x+y;
		return z;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodInJava obj= new MethodInJava();
		obj.test();// test
		int i=obj.sum(); // 30
		System.out.println(i);
		String trainerName=obj.getTrainerName();
		System.out.println(trainerName);
		if(trainerName.equals("Amulrani")) {
			System.out.println("Test Pass");
		}
		
		int value=obj.add(5, 3);
		System.out.println(value);
	}

}
