package javaSession;

public class Test_Cusotmer_Static_FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calling method should not be in main class
		//create an object for customer_Static_Final_Variable
		
		Customer_Static_Final_Varible cus= new Customer_Static_Final_Varible();
		/// Class variable accessed by object
		cus.name="Amulrani";
		cus.emailID="amu@gmail.com";
		cus.isPrime=true;
		
		System.out.println(cus.name + "" + Customer_Static_Final_Varible.category); // static final varible accessed by class
//		Customer_Static_Final_Varible.category="Offline"; /// can not reassigned the final variable values
		System.out.println(Customer_Static_Final_Varible.category);// 
		System.out.println();

	}
}
