package acs.ase.ro.decorator;

public abstract class SuperErou {

	String nume;
	int nivelPuncte;
	
	public SuperErou(String nume, int nivelPuncte) {
		super();
		this.nume = nume;
		this.nivelPuncte = nivelPuncte;
	}
	public abstract int getPuncte();
	public abstract void seDeplaseaza();
	public abstract void ataca(int puncte);
	public abstract void seVindeca(int puncte);
	
	
	
}
