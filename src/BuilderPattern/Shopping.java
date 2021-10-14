package BuilderPattern;

public class Shopping {

	public Shopping login(long ph, int otp) {
		System.out.println("Login to app :" + ph+otp);
		return this;
	}
	
	public Shopping login(String un,String pw) {
		System.out.println("Login to app :" + un+pw);
		return this;
	}
	
	public Shopping search(String productName) {
		System.out.println("Search with:" + productName);
		return this;
	} 
	public Shopping search(String productName,String color) {
		System.out.println("search with:" + productName + color);
		return this;
	}
	public Shopping addToCart(String productName) {
		System.out.println("adding to cart:" + productName);
		return this;
	}
	
	public Shopping dopayment(String cc,int otp) {
		System.out.println("do payment with:" + cc + otp);
		return this;
	}
	
	public Shopping dopayment(String UPI,long ph,int otp) {
		System.out.println("dopayment with:" + UPI+ ph+ otp);
		return this;
	}
	
	public Shopping track(String orderNumber) {
		System.out.println("Tracking with id:" + orderNumber);
		return this;
	}
	public Shopping logout() {
		System.out.println("Logout");
		return this;
	}
//	public void test() {
//		System.out.println("Hi");
//	}
}
