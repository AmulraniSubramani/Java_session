package BuilderPattern;

public class TestShop extends Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestShop shop = new TestShop();
//		shop.addToCart("mac");
//		System.out.print( shop.search("h"));
		shop.login("amulr@gmail.com", "Amulrani@123")
			.search("mac")
			.addToCart("mac")
			.dopayment("4125 5452 4578 254 ", 123)
			.logout();
		
	}

}
