package ro.acs.ase.ro.factory;

public class CaracterMarvel extends CaracterAbstract {
	
int putere;
	
	
	
	public CaracterMarvel(String nume, int putere) {
		this.nume=nume;
		this.putere = putere;
	}

	@Override
	public void alearga() {
		System.out.println("Alearga....");
		
	}

	@Override
	public void sare() {
		System.out.println("Sare....");
		
	}


}