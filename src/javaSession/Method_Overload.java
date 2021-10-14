package javaSession;

public class Method_Overload {

	/// method overload
	// with in the same class when we have different method
	//1. with the same name
	//2.with different types and number of parameter
	//3. the sequence of the parameters should be differen
	
	public void login() {
		System.out.println("default login");
	}
	
	public void login(String un,String pwd) {
		System.out.println("Login with:  " + un + pwd);
	}
	
	public void login (String un, String pwd,String role) {
		System.out.println("Login with: " + un + pwd+role);
	}
	
	
	public void login (long ph, int opt) {
		System.out.println("login with: " + ph +opt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// method overload means, we can overload the method with different parameters  and datatypes.
		//this is compile time polymorphism /different forms
		 Method_Overload obj= new Method_Overload();
		 obj.login("Amul", "Rani");
	}

}
