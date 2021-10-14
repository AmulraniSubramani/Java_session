package com.OOPS_Encapsulation;

public class Employee_Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Employee obj= new Employee();
			Employee obj1= new Employee();
			Employee obj2= new Employee();
			
			obj.setName("Raji");
			obj.setAge(30);
			obj.setSalary(65.00);
			obj.setActive(true);
			obj.setGender('f');
			
	
			obj1.setName("Anu");
			obj1.setAge(23);
			obj1.setSalary(65.35);
			obj1.setActive(true);
			obj1.setGender('f');
			
			
			obj2.setName("Ragul");
			obj2.setAge(30);
			obj2.setSalary(85.00);
			obj2.setActive(true);
			obj2.setGender('m');
			
			
			System.out.println(obj.getName() + ":" + obj.getAge() + ":" + obj.getSalary() + ": " + obj.isActive() + ":" + obj.getGender());
			System.out.println(obj1.getName() + ":" + obj1.getAge() + ":" + obj1.getSalary() + ": " + obj1.isActive() + ":" + obj1.getGender());
			System.out.println(obj2.getName() + ":" + obj2.getAge() + ":" + obj2.getSalary() + ": " + obj2.isActive() + ":" + obj2.getGender());
			
	}
	
}
