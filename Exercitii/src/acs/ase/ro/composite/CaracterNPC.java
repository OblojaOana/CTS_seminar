package acs.ase.ro.composite;

public class CaracterNPC extends UnitateAbstracta {
	
	String nume;
	int nivelPuncte;
	
	

	public CaracterNPC(String nume, int nivelPuncte) {
		super();
		this.nume = nume;
		this.nivelPuncte = nivelPuncte;
	}

	@Override
	public void seDeplaseaza(int x, int y) {
		
		System.out.println(String.format("%s se deplaseaza", nume));
	}

	@Override
	public void atacaJucator(int puncte) {
		this.nivelPuncte-=puncte;
		System.out.println(String.format("%s este atacat si are numarul de puncte %d",this.nume, this.nivelPuncte ));
		
	}

	@Override
	public void seRetrage() {
		System.out.println(String.format("%s se retrage", this.nume));
		
	}

}
