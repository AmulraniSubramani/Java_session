package FinalizeMethod_String_manipulation;

public class String_Manipulation {

	public static void main(String[] args) {
		
		String str="This is my java code and i am very happy";
		//to get lenght 
		int len=str.length();
		System.out.println("Lowest index:" + 0);
		System.out.println("Highest index :" + " :" +(len-1));
		
		// to know the specific index value
		System.out.println(str.charAt(5));
		
		// to know index of specific value
		System.out.println(str.indexOf('i', 1)); // this is not good practice
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));
		
			}
}
