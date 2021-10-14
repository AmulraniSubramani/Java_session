package javaSession;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// increment and decrement ++ --
		// 1.Post increment  ++1
		
		int a=2;
		int b=a++; /// first assign the value to b // 2nd increase the value
		
		System.out.println(a); // output 3
		System.out.println(b); //output is 2
		
		int c=-99; // -98
		int d=c++;  // -99
		System.out.println(c);//output -98
		System.out.println(d); //ouput- 99 
		
		
		// Pre increment ++
		
		int h=1;
		int g=++h;// before assign value increase the value  and h value is 2
		
		System.out.println(h); // 2
		System.out.println(g);// 2
		
		int p=-97; //-96
		int q=++p; // -96
		
		System.out.println(p);
		System.out.println(q);
		
		// post decrement
		
		int r=2; //1
		int s=r--;  // 2
		System.out.println(r);
		System.out.println(s);
		
		
		int x=-999;  // -1000
		int y=x--; // -999
		
		System.out.println(x);
		System.out.println(y);
		
		
		//pre decrement
		
		int u=2; //1 
		int v=--u; //1
		
		System.out.println(u);
		System.out.println(v);
		
		int m=3;
		System.out.println(++m); //1+3 = 4
		
		//without using char, we can print ascii values using int
		
		 int f='a';
		 System.out.println(f); // it returns ascii value 
		
		 int w='b';
		 System.out.println(f+w);// it returns ascii values & result is 195
		 
		 // char always hold ascii values
		 
		 char b1='a';
		 char b2='b';
		 System.out.println(b1); // it prints a
		 System.out.println(b1+ "" +b2); //it prits ascii value, when concat the two chars it gives ascii values
		
		
	}

}
