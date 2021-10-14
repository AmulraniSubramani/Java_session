package OOP_Inheritance;

public class BMW_ChildClass  extends Car_Parent {

	@Override
	//parent has same method but child updated and modified the features
	public void start() {
		System.out.println("Child class - BMW start");
	}
	
	// indidual method
	public void autoParking() {
		System.out.println("Child class - BMW autoparking");
	}
	
	
}


/// Method overridding : Polymorphism- runtime (Dynamic)
//When  you have a method in the parent class and the same method in child classs with
//1.the same method name
//2.the same number of parameters and the same type of parameter with the same sequence of the parameter
//3.the same return type

// Final keyword

// final methods can not overridden
// static method can not be overridden
// static method can be inherit(Overload)