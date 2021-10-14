package javaSession;

public class Employee_Class {

	
			// What is class?  Class is a blueprint of all objects
			//Class is a concept, its not a physical entity - every object has their own properties
			// Class variables always comes inside the class outisde of the method
			//*** Default values applicable only for class varibles
			//Default String value is NULL
			//Default integer value is 0
			//Default boolean value is false
			//Default double value is 0.0
			
			
			//Employee class is template and from here we can create en number of employees
			// Every employees have name,age,salary,isActive or not - there are common for all employees
	
		String name; // class variable
		int age; // class variable
		double salary; // class variable
		long contactNo; //class variable
		boolean isActive; // class variable
		char gender;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Local variable never given to an object
		// local variable never been part of the object
		
		String empName="Java"; // local variable 
		System.out.println(empName); 
		
		Employee_Class e1= new Employee_Class();  // the moment we create an object, java takes the photoopy of all the class variable
									// send it to an object.
		
		//e1 is an object reference name
		// new Employee(); is an object
		
		e1.name="Amulrani";
		e1.age=35;
		e1.salary=45.00;
		e1.contactNo=47893324l;
		e1.isActive=true;
		e1.gender='f';
		
		System.out.println(e1.name+ " :" + e1.age + " :"+e1.salary + " :" +e1.contactNo +":"+e1.isActive +":"+e1.gender);
		
		Employee_Class e2= new Employee_Class();
		e2.name="Praveen";
		e2.age=36;
		e2.salary=82.00;
		e2.contactNo=86659722;
		e2.isActive=true;
		e2.gender='m';
		
		System.out.println(e2.name+ " :" + e2.age + " :"+e2.salary + " :" +e2.contactNo +":"+e2.isActive +":"+e2.gender);
		
		Employee_Class e3=  new Employee_Class();
		
		e3.name="Anu";
		e3.age=3;
		e3.salary=98.00;
		e3.contactNo=865985;
		e3.isActive=true;
		e3.gender='f';
		
		System.out.println(e3.name+ " :" + e3.age + " :"+e3.salary + " :" +e3.contactNo +":"+e3.isActive +":"+e3.gender);
		
		e1=e2;
		System.out.println("e1= e2");
		System.out.println(e1.name+ " :" + e1.age + " :"+e1.salary + " :" +e1.contactNo +":"+e1.isActive +":"+e1.gender);
		System.out.println(e2.name+ " :" + e2.age + " :"+e2.salary + " :" +e2.contactNo +":"+e2.isActive +":"+e2.gender);
		System.out.println(e3.name+ " :" + e3.age + " :"+e3.salary + " :" +e3.contactNo +":"+e3.isActive +":"+e3.gender);
		
		e2=e3;
		System.out.println("e2=e3");
		System.out.println(e1.name+ " :" + e1.age + " :"+e1.salary + " :" +e1.contactNo +":"+e1.isActive +":"+e1.gender);
		System.out.println(e2.name+ " :" + e2.age + " :"+e2.salary + " :" +e2.contactNo +":"+e2.isActive +":"+e2.gender);
		System.out.println(e3.name+ " :" + e3.age + " :"+e3.salary + " :" +e3.contactNo +":"+e3.isActive +":"+e3.gender);
		
		e3=e1;
		System.out.println("e3=e1");
		System.out.println(e1.name+ " :" + e1.age + " :"+e1.salary + " :" +e1.contactNo +":"+e1.isActive +":"+e1.gender);
		System.out.println(e2.name+ " :" + e2.age + " :"+e2.salary + " :" +e2.contactNo +":"+e2.isActive +":"+e2.gender);
		System.out.println(e3.name+ " :" + e3.age + " :"+e3.salary + " :" +e3.contactNo +":"+e3.isActive +":"+e3.gender);
		
		
		System.out.println(new Employee_Class().name="Amulrani Praveen");
		Employee_Class e= new Employee_Class();
		e.name="A123";
		System.out.println(e.name);
		e=null;
//		System.out.println(e.name);
		System.gc();
		
	}

}
