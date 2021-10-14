package javaSession;

public class LoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/// print odd number using for loop
		for(int i=1; i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		
		//while loop
		int a=1;
		System.out.println("for loop result");
		while(a<=100) {
			
			
			if(a%2==0) {
				System.out.println(a);
			}
			a++;
		}
		
		boolean  flag =true;
		while(flag) { /// if we write true over here it prints unreachable error in runtime
			System.out.println("flag is :"+ flag);
			flag=false;   /// if we remove this line the above execute infinite ......
		}
		
		/// do while
		int k=0;
		do {
			if(k%2==0) {
				System.out.println(k);
			}
			k++;
		}
		while(k<=100);
		
		// to print ascii value in for loop
		System.out.println("*****************");
		// char in for loop
		for(char c='a'; c<='z'; c++ ) {
			System.out.println((int) + c);
		}
		
		// print a to z in for loop 
		
		for (char d='a'; d<='z'; d++) {
			System.out.println(d);
		}
		
		/// print ascii value in for loop
		System.out.println("!!!!!!!!!!!!!!!!!!!!1");
		for (char e='A'; e<='Z'; e++) {
			System.out.println(e);
		}
		
		
		for (int n=1; n<=100;n++) {
			System.out.println(n);
		}
		
	
	//// loop with break;
		for(int b=1;  b<=100; b++) {
			if(b%5==0) {
				System.out.println("break"+b);
				break; // this break helps to exit the loop once satisfied the condition
						// if we don't write break , it executes until the condition gets false
			} 

		}
		
		
		/// for loop inside another for loop
		System.out.println("/////////////");
		for(int p=1; p<=5; p++) {
			for(int q=1; q<=2;q++) {
				System.out.println(p +""+  q);
			}
		}
		
		/// do while
		int f=1;
		do{
		System.out.println(f +"Do while");	
		f++;
		}
		while(f<=10);
	

	
	}

}
