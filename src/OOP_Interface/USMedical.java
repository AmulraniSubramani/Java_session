package OOP_Interface;

public interface USMedical {

	// can not create object of interface
	// interface have only method body not any business logic
	// variables are final/static by default
	// we have to override the method in class
	
	public void physioService();
	public void oncologyService();
	public void dentalService();
	public void dermaService();
	public void emergencyService();
	
	
}
