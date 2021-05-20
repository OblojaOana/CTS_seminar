package acs.ase.ro.composite;

import java.util.ArrayList;

public class GrupCaracter extends UnitateAbstracta {

	ArrayList<UnitateAbstracta> unitati = new ArrayList<>();
	@Override
	public void seDeplaseaza(int x, int y) {
		System.out.println("Grupul se deplaseaza la coordonatele" + x +" si" + y);
		
	}

	@Override
	public void atacaJucator(int puncte) {
		for(UnitateAbstracta unitate: unitati) {
			unitate.atacaJucator(puncte);
		}
		
	}

	@Override
	public void seRetrage() {
		for(UnitateAbstracta unitate: unitati) {
			unitate.seRetrage();
		}
		
	}

	@Override
	public void adaugaCaracter(UnitateAbstracta unitate) {
             unitati.add(unitate);
	
	}

	@Override
	public void stergeCaracter(UnitateAbstracta unitate) {
		unitati.remove(unitate);
	}

	@Override
	public UnitateAbstracta getCaracter(int index) {
		return this.unitati.get(index);
	}
	

}
