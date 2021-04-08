package ro.acs.ase.adapter;

import ro.acs.ase.CaracterJoc;

public class AdapterEA2CaracterJoc extends CaracterJoc {
	InterfataCaracter caracterEA;
	
	public AdapterEA2CaracterJoc(InterfataCaracter caracterEA) {
		super();
		this.caracterEA=caracterEA;
	}

	@Override
	public void seDeplaseaza() {
	
		caracterEA.move();
	}

}
