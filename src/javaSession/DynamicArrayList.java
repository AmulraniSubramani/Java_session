package javaSession;

import java.util.ArrayList;

public class DynamicArrayList {

	static int i,count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList is a dynamic class which is available in java class
		// Size is not fixed
		//Its a dynamic array
		//ArrayList is index based & its maintain the order
		
		ArrayList ar= new ArrayList<>();  // create an object of the ArrayList class
		ar.add(100); // it shows compile time error that the code is raw type
		ar.add(200); // so we always mention the datatype inside the diamond<>
		ar.add(300); //This is ugly code 
		ar.add(400);
		System.out.println(ar.size()); // 4
		ar.remove(2);  // removing  value by index based
		
		System.out.println(ar.size()); //3
		System.out.println(ar);
		ar.add(3, 3001);
		System.out.println(ar);
		boolean b=ar.isEmpty();
		System.out.println(b);
		
		// for loop 
		count=0;
		for(i=0;i<ar.size();i++) {
			System.out.println(count + ":"+ar.get(i));
			count++;
		}
		
		System.out.println("For each loop..............");
		
		for(Object e:ar) {
			System.out.println(e);
		}
		
		// do while
		
		System.out.println("Do while ........");
		i=0;
		do {
			System.out.println(ar.get(i));
			i++;
		}
		while(i<ar.size());
		
		
		// while loop 
		System.out.println("While loop.....");
		i=0;
		while(i<ar.size()) {
			System.out.println(ar.get(i));
			i++;
		}
		
		
		///Arraylist -- object
		System.out.println("Arraylist using object in the diamond");
		ArrayList<Object> empDetails= new ArrayList<Object>(5);
		empDetails.add("Anu");
		empDetails.add(15423);
		empDetails.add("Testing");
		empDetails.add(75.22);
		empDetails.add(true);
		System.out.println(empDetails);;
		
//		empDetails.add(2, "Developer");
		empDetails.set(2, "Developer");
		System.out.println(empDetails);
		System.out.println("4th index value"+empDetails.get(4));
		
		// to print the values in for loop
		System.out.println("for loop vaues ");
		for(i=0; i<empDetails.size();i++) {
			System.out.println(empDetails.get(i));
		}
		
		// for each loop
		System.out.println("For each loop ............");
		for(Object obj:empDetails) {
			System.out.println(obj);
		}
		
		// while loop
		System.out.println("While loop........");
		i=0;
		while(i<empDetails.size()) {
			System.out.println(empDetails.get(i));
			i++;
		}
		
		// do while
		System.out.println("Do while.........");
		i=0;
		do {
			System.out.println(empDetails.get(i));
			i++;
		}
		while(i<empDetails.size());
		
		
		/// switch cas
		String browser="IE";
		
		switch(browser.toUpperCase()) {
		
		case "CHROME":
		
			System.out.println("Chrome browser launched");
		break;
		
		case "FIREFOX":
				System.out.println("Firefox browser launched");
		break;
		case "IE":
			System.out.println("IE browser launched");
			break;
		default:
			System.out.println("Please pass right browser here :  " + browser);
			break;
		}
		
		
		String envs="DEV";
		
		switch (envs.toUpperCase()) {
		case "QA":
			System.out.println("url:" + "http://www.qa.abc.com");
			System.out.println("qa:qa");
		break;
		case "DEV":
			System.out.println("url:" + "http://www.dev.abc.com");
			System.out.println("dev:dev");
		break;
		case "STAGE":
			System.out.println("url" + "http://www.stage.abc.com");
			System.out.println("stage:stage");
		break;
		case "PROD":
			System.out.println("url" + "http://www.prod.abc.com");
			System.out.println("prod:prod");
		break;	
		default:
			System.out.println("Please pass right browser");
				break;
		}

		
		
	}
	
	
}
