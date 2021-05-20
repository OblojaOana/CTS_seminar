package acs.ase.ro.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		SuperErou dragonRosu=new Dragon("Dragon rosu", 500);
		dragonRosu.seDeplaseaza();
		dragonRosu.ataca(100);
		dragonRosu.ataca(450);
		dragonRosu.seVindeca(10);
		
		dragonRosu=new DecoratorArmura(dragonRosu, 100);
		dragonRosu.ataca(10);
		
		dragonRosu=new DecoratorEsteRanit(dragonRosu);
		dragonRosu.seDeplaseaza();
	}

}
