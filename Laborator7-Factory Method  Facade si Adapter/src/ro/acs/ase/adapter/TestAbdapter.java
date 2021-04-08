package ro.acs.ase.adapter;

import java.util.ArrayList;

import ro.acs.ase.CaracterDisney;
import ro.acs.ase.CaracterJoc;

public class TestAbdapter {

	public static void main(String[] args) {
		//1. colectie caractere existente
		
		ArrayList<CaracterJoc> caractere=new ArrayList<>();
		caractere.add(new CaracterDisney("Donald"));
		
		//2. colectie caractere EA
		ArrayList<InterfataCaracter> caractereEA=new ArrayList<>();
		caractereEA.add(new CaracterGenericEA());
		
		//folosind un adapter
		InterfataCaracter caracterEA=new CaracterGenericEA();
		AdapterEA2CaracterJoc adapt=new AdapterEA2CaracterJoc(caracterEA);
		caractere.add(adapt);
		
		

	}

}
