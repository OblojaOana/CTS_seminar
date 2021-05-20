package acs.ase.ro.adapter;

public class CaracterMarvel extends CaracterJoc {

	public CaracterMarvel(String nume, int putere) {
		this.putere = putere;
		this.nume = nume;

	}

	@Override
	public void seDeplaseaza() {
		System.out.println("Se deplaseaza");
	}

}
