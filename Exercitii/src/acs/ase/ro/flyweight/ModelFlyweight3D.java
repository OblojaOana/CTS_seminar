package acs.ase.ro.flyweight;

import java.util.Date;

public class ModelFlyweight3D implements InterfataFlyweight {
	
	String nume;
	
	

	public ModelFlyweight3D(String nume) {
		super();
		this.nume = nume;
	}



	@Override
	public void afisareEcran(DateEcran date) {
		System.out.println(
				String.format("Afisare %s la coordonatele %d,%d,%d cu %s",
						nume, date.x, date.y, date.z, date.textura));
		
	}
	
	

}
