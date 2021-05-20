package acs.ase.ro.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {
		// .1 colectie caractere existente

		ArrayList<CaracterJoc> caractere = new ArrayList<>();
		caractere.add(new CaracterMarvel("Donald", 4));

		// 2. colectie caractere EA
		ArrayList<InterfataCaracterEA> caractereEA = new ArrayList<>();
		caractereEA.add(new CaracterEA());

		// folosind un adapter
		InterfataCaracterEA caracterEA = new CaracterEA();
		AdapterEA2CaracterMarvel adapt = new AdapterEA2CaracterMarvel(caracterEA);
		caractere.add(adapt);

	}

}
