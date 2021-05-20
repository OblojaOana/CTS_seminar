package acs.ase.ro.decorator;

public class DecoratorEsteRanit extends DecoratorSuperErou{

	public static int NIVEL_CRITIC=10;
	public DecoratorEsteRanit(SuperErou erou) {
		super(erou);
		
	}

	@Override
	public void seDeplaseaza() {
		if(superErou.getPuncte()<NIVEL_CRITIC) {
			System.out.println("Eroul nu mai poate alerga. Este ranit critic");
		}
		else {
			superErou.seDeplaseaza();
		}
	}
	
	

}
