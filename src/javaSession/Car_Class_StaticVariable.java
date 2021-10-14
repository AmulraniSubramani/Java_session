package javaSession;

public class Car_Class_StaticVariable {

	
	// class properties / Class variables
	String carName; // default value is NULL
	int price; // default value is o
	String color; // default value is NULL
	static int wheels=4; /// static is a class variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object never hold any static property
		// Static variable should be access by class name
		
		Car_Class_StaticVariable cc= new Car_Class_StaticVariable();
		cc.carName="BMW";
		cc.price=80;
		cc.color="White";
		System.out.println(cc.carName + " "+ cc.price+ " "+ cc.color + " "+ Car_Class_StaticVariable.wheels);
		System.out.println("............");
		System.out.println(Car_Class_StaticVariable.wheels);// static variable accessed by class name
		System.out.println("....");
		System.out.println(cc.wheels);// static varible can also accessed by object, but this is proper approach
		System.out.println(wheels); // static varible can also access without class  name

	}

}
