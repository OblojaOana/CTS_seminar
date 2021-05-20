package acs.ase.ro.prototype;

import acs.ase.ro.decorator.SuperErou;

public class SuperErouPrototype {
	
	String fisier;
	int nrPuncte;
	String nume;
	
	public SuperErouPrototype(String fisier, int i, String nume) {
		super();
		System.out.println("Se construieste");
		this.fisier = fisier;
		this.nrPuncte = i;
		this.nume = nume;
	}
	
    public SuperErouPrototype() {
		
	}
    

	@Override
	public String toString() {
		return "SuperErouPrototype [fisier=" + fisier + ", nrPuncte=" + nrPuncte + ", nume=" + nume + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		SuperErouPrototype superErou=new SuperErouPrototype();
		superErou.fisier=this.fisier;
		superErou.nrPuncte=this.nrPuncte;
		superErou.nume=this.nume;
		return superErou;
		
	}
	
	
	

}
