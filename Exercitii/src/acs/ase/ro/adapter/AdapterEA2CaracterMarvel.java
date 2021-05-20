package acs.ase.ro.adapter;

public class AdapterEA2CaracterMarvel extends CaracterJoc {

	InterfataCaracterEA caracterEA;

	public AdapterEA2CaracterMarvel(InterfataCaracterEA caracterEA) {
		super();
		this.caracterEA = caracterEA;
	}

	@Override
	public void seDeplaseaza() {
		caracterEA.move();

	}

}
