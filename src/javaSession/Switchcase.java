package javaSession;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String browser ="firefox";
	
	switch (browser) {
	case "chrome":
		System.out.println("Chrome browser launch");
	break;
	
	case "firefox":
		System.out.println("Firefox brwoser launch");
	break;
	
	case "safari":
		System.out.println("safari browser launch");
	
	
	default:
		System.out.println("please pass the right browser"+ browser) ;
	break;
	}
	
	
	// diff envs ---> QA,DEV,STAGE,PROD  ---- non primitive datatypes
	
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

	int value=100;
	switch(value) {
	
	case 90:
		System.out.println("90");
	break;
	
	case 80:
		System.out.println("80");
	break;
	
	case 70:
		System.out.println("70");
	break;
	
	default:
		System.out.println("Values are not matched");
	break;
	}
	
	}
}
