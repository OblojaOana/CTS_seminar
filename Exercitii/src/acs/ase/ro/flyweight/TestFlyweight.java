package acs.ase.ro.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		DateEcran soldat1 = new DateEcran(100, 50, 50, "Verde");
		DateEcran soldat2 = new DateEcran(100, 100, 50, "Rosu");
		DateEcran cladire1 = new DateEcran(10, 10, 0, "Gri");
		DateEcran cladire2 = new DateEcran(107, 150, 0, "Maro");
		
		InterfataFlyweight modelSoldat = 
		FlyweightFactory.getModel(TipModel3D.SOLDAT);
modelSoldat.afisareEcran(soldat1);
modelSoldat.afisareEcran(soldat2);



	}

}
