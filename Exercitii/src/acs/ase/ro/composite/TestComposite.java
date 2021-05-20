package acs.ase.ro.composite;

public class TestComposite {

	public static void main(String[] args) {
		UnitateAbstracta grup1=new GrupCaracter();
		UnitateAbstracta caracter1=new CaracterNPC("Spiderman", 100);
		UnitateAbstracta caracter2=new CaracterNPC("SuperMan", 200);
		grup1.adaugaCaracter(caracter1);
		grup1.adaugaCaracter(caracter2);
		
		grup1.atacaJucator(10);
		
		
		

	}

}
