package OOP_Inheritance;

public class TestCar_MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create object for child class
		BMW_ChildClass b= new BMW_ChildClass();
		b.start();// overridden method
		b.stop();// inherited method
		b.refuel(); //inherited method
		b.autoParking(); // indidual method
		b.engine(); // vehicle class metho
		
		// create object for parent class(Car class)
		Car_Parent c= new Car_Parent();
		c.start(); // car class method
		c.stop(); // car class method
		c.refuel(); // car class emthod
		c.engine(); // vehicle method
//		c.autoParking(); // parent  class can not access child class method 
		
		
	
		//child class object can be accessed by grnadparent class reference variable
		//top casting
		Vehicle_ParentClassOfCar v1= new BMW_ChildClass();
		v1.engine(); // vehicle 
		
		
		//child class object can be accessed by parent class reference variable
		//top casting
		// now this reference varible can access onyl inherited and overridden methods only
		Car_Parent c1= new BMW_ChildClass();
		c1.start(); // overridden method
		c1.stop(); // inherited method
		c1.refuel(); // inherited method
		//example for top casting
//		Webdriver driver= new ChromeDrive(); // example for top casting  (webdriver is parentclass and chromedriver is child class)
		
		//down casting
		//parent class object can be accessed by child class reference varible
		
//		BMW_ChildClass b1= new Car_Parent();// can do down casting /
		BMW_ChildClass b1= (BMW_ChildClass) new Car_Parent();// forcefully changing the object creation// and it gives classCastException
//		b1.autoParking(); // it wont execute becuase at line n0.40 it gives expection
		
		
//		 BMW_ChildClass b2= (BMW_ChildClass) new Vehicle_ParentClassOfCar();// down casting amd it throw classcastexception
		 
		// final keyword method
		// method also can create using final keyword and this method 
		// this method can not be overridden
		
		
		// final keyword class
		// if a class created with final keyword this class can not be a parent class and can not be inherit and overridden
		
		
		//static method can be overload
		// static method can be override is not possible
		
		//varible can not be overriden
}
}