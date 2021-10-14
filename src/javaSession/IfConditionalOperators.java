package javaSession;

public class IfConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=4;
		int b=5;
		if(a==b) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Not requal numbers");
	}
		
//		char c1='a';
//		char c2='b';
//		
//		System.out.println("C1 value is :" + c1);
//		System.out.println("c1 and c2 values are:" + c1+c2);
//		System.out.println(c1+c2);
//		
//		System.out.println((int)+c1);
		
		
		//dead code
		if(false) {
			System.out.println("PASS");
		}
		else {
			System.out.println("Fail");
		}
		
		/// dead code
		if(true) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		//Good practice use boolean to check true or false condition
		boolean flag= true;
		if(flag) {
			System.out.println("element is visible");
		}
		else {
			System.out.println("element is not visible");
		}
		
		
		
		// nested if condition
		int total = 80;
		if (total <= 100) {
			System.out.println("total is less than or eq to 100");
			if (total >= 80) {
				System.out.println("total is gr than or eq to 80");
				if (total == 80) {
					System.out.println("GRADE A");
				} else {
					System.out.println("PASS");
				}

			} else {
				System.out.println("NA");
			}
		} else {
			System.out.println("Bye");
		}
		
		//logic to launch the browser
		String browser="safari";
		if(browser.equals("chrome")) {
			System.out.println("chrome browser launch");
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox browser launch");
		}
		else if(browser.equals("safari")) {
			System.out.println("safari browser launch");
		}
		else {
			System.out.println("Please pass right browser");
		}
	}
	
	
	

}
