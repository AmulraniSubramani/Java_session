package javaSession;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=4;
		System.out.println(a+b); //it does arthimetic operations means it adds two number and out:8

		String x="Amulrani";
		String y="PRaveen";
		System.out.println(x+y); // it does join (concat) the string,output is AmulraniPraveen 
		
		System.out.println(a+x); // we can concat string + integer also, this output is 4Amulrani
		System.out.println(a+b+x+y); //8AmulraniPRaveen
		System.out.println(x+y+a+b);// AmulraniPRaveen44
		System.out.println(x+y+(a+b)); //AmulraniPRaveen8
		
		char c='a';
		System.out.println(c); // if we print just c it prints only c value is a
		
		char d='b';
		System.out.println(c+d); // it print ascii value, when concat two char it gives ascii values
								// cant get like a+b because jave cant not concat two chars
		

		
		System.out.println((int) + c); // without using concat sysmbol we can get ascii value.
										// just convert to int (all ascii values are integers) 
		
		// Ascii values applies only for char datatype not for others
		
		
		
		
	}

}
