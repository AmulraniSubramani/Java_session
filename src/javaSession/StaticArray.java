package javaSession;

import java.util.ArrayList;

public class StaticArray {

	public static int count;
	static int init;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array is use to store multiple value by index and in single variable/
		// To allows to store the duplicate values
		// There is no concept to store the values in (-) negative index
		
		//Limitations  are 
		
		// The size is  fixed (static array), some time need extra memory and waste memory
		//Cannot store different types of data type
		
		//  To overcome this limitations, we have to use collections(arraylist - dynamic array)
		
		//*********************
		
		// 1.integer array
		
		int i[]= new int[4];  /// new keyword is used for memory allocation
							 // i created array size is 4 i but only 3, if i print i[4] it gives 0 
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[2]=50; // we update the value of i[2] and java always takes latest value
		System.out.println("i [2] value is " + i[2]); // java always takes latest value of the variable so it print 30
		
		System.out.println("i memory location: "+i); // it prints where i's values are stored
		// length of int[3] is = 3-1	= 2
//		System.out.println(" 0 index value is "+i[0] + i[1]);
		i[3] = 60;
//		i[4]=70;
		
//		System.out.println("index 4 value is:"+i[4]);//  it gives ArrayIndexOutOfBoundsException
//		i[-1]= 100; // java wont allow (-) Negativ index
//		System.out.println("index -1 values:" +i[-1]);   // it gives java.lang.ArrayIndexOutOfBoundsException
		
		//for loop
		for (int j=0; j<=i.length-1; j++) { // length is use to get the size of the array
			System.out.println(i[j]);       // -it works only in static array 
		}
		
		// for each loop 
		count =0;
		for (int e:i) {
			
			System.out.println(count +" Index :"+e);
			count++; 
		}
		
		
		
		// 2.Object array is a static super class /parent class/inbuild class in java. 
		// It allows to store any data types.
		System.out.println(".................");
		
		// Employee Details -- empName(String,empID(long),Salary(double),gener(char),isPerm(Boolean)
		
		
		
		// char array
		char c[]= new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		
		System.out.println("...................");
		for(int d=0; d<c.length;d++) {
			System.out.println((int) +c[d]);// it gives ascii value
			System.out.println(c[d]);// it prints c array values 
		}
		
		// for each loop
		
		count =0;// this is public static variable and declated inside the class ,outside of the method
		for(char ce:c) {
			System.out.println(count + " ::"+ce);
//			
			count++;
		}
		
		// String array
		
		String familyNames[]= new  String[5];
		familyNames[0]= "Praveen";
		familyNames[1]= "Amulran";
		familyNames[2]="Anulekha";
		familyNames[3]="Madasamy";
		familyNames[4]="Usharani";
				
		System.out.println(familyNames);  // it prints memory location path
		System.out.println("......................////");
		int sd=familyNames.length;
		int k=0;
		// do while
		do {
			System.out.println(familyNames[k]);
		
		k++;
		}
		
		while(k<sd);
		int j=0;
		System.out.println("While loop values");
		
		// while loop
		while(j<familyNames.length) {
			System.out.println(familyNames[j]);
			j++;
		}
		
		// for loop
		System.out.println("For loop values...........");
		count=0;
		for(int l=0; l<familyNames.length;l++) {
			System.out.println(count + ": " +familyNames[l]);
			count++;
		}
		
		
		// for each loop
		System.out.println("for each loop values  ....");
		count=0;
		for(String s:familyNames) {
			System.out.println(count + ":" + s);
			count++;
		}
		
		
		Object studentDetails[]= new Object[5];
		studentDetails[0]="Amulrani";
		studentDetails[1]="10 th standrad";
		studentDetails[2]="English ";
		studentDetails[3]='f';
		studentDetails[4]=true;
		System.out.println(studentDetails);  // it prints memeory location
		
		// print the values using while loop
		System.out.println("Object values in while");
		init=0;
		count =0;
		while(init<studentDetails.length) {
			System.out.println(count + " :"+ studentDetails[init]);
//			System.out.println(count +" "+ studentDetails[init]) ;
			init++;
			count++;
		}
		
		
		/// print the values using do while
		System.out.println("object value using do while");
		init =0;
		do{
			System.out.println(studentDetails[init]);
			if(studentDetails[init].equals("Amulrani")) {
				System.out.println("Amulrani is availble in the emp details report");
			}
			init++;
		}
		
		while(init<studentDetails.length);
		
		
		
		// for loop
		System.out.println("for loop.........");
		for (init=0; init<studentDetails.length;init++) {
		System.out.println(studentDetails[init]);
			if(studentDetails[init].equals("Amulrani")) {
				System.out.println("Amulrani is avialable");
			}
		}
		
		/// print the value using for loop
		System.out.println("Object values using for loop");
		
		count=0;
		for (init=0;init<studentDetails.length;init++) {

			if(studentDetails[init].equals("Amulrani")) {
				System.out.println("Your expected name is available in the report");
				break;
			}
			System.out.println(count + ":"+ studentDetails[init] );
			count++;
		
	}

}
}