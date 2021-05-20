package acs.ase.ro.decorator;

public class Dragon extends SuperErou {

	public Dragon(String nume, int nivelPuncte) {
		super(nume, nivelPuncte);
		
	}

	@Override
	public int getPuncte() {
		return this.nivelPuncte;
	}

	@Override
	public void seDeplaseaza() {
	System.out.println(String.format("%s se deplaseaza", this.nume));
		
	}

	@Override
	public void ataca(int puncte) {
		System.out.println(String.format("%s pierde numarul de puncte %d", this.nume, this.nivelPuncte));
		this.nivelPuncte-=puncte;
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(String.format("%s se vindeca cu numarul de puncte %d", this.nume, this.nivelPuncte));
		this.nivelPuncte+=puncte;
		
	}

}
