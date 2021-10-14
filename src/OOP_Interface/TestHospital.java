package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating obejct of fortisHospital
		FortisHospital f= new FortisHospital(); 
		f.cardioService();
		f.dentalService();
		f.dermaService();
		f.emergencyService(); // all three
		f.entService();
		f.neuroService();
		f.oncologyService();
		f.orthoService();
		f.pediaService();
		f.physioService();
	
	}

}
