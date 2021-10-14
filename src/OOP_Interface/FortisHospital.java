package OOP_Interface;

public  class FortisHospital implements USMedical,UKMedicak,IndianMedical{

	//Indianmedical
	@Override
	public void neuroService() {
		// TODO Auto-generated method stub
		System.out.println(" IN -Neruro Service");
	}

	@Override
	public void orthoService() {
		// TODO Auto-generated method stub
		System.out.println("IN- OrthoService");
	}

	@Override
	public void entService() {
		// TODO Auto-generated method stub
		System.out.println("IN-Ent Service");
	}

	//UK Medical
	@Override
	public void pediaService() {
		// TODO Auto-generated method stub
		System.out.println("UK- pedia service");
	}

	@Override
	public void cardioService() {
		// TODO Auto-generated method stub
		System.out.println("UK -cardio service");
		
	}

	//US Medical
	@Override
	public void physioService() {
		// TODO Auto-generated method stub
		System.out.println("US - physioservice");
	}

	@Override
	public void oncologyService() {
		// TODO Auto-generated method stub
		System.out.println(" US -oncology service");
	}

	@Override
	public void dentalService() {
		// TODO Auto-generated method stub
		System.out.println("US - dental service");
	}

	@Override
	public void dermaService() {
		// TODO Auto-generated method stub
		System.out.println("US - derma service");
	}

	@Override
	public void emergencyService() {
		// TODO Auto-generated method stub
		System.out.println("US - emergency service");
	}

}
