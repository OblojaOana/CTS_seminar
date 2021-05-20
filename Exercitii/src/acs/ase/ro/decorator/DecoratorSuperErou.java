package acs.ase.ro.decorator;

public abstract class DecoratorSuperErou extends SuperErou {
	  SuperErou superErou=null;
	
	public DecoratorSuperErou(SuperErou erou) {
		super(erou.nume, erou.nivelPuncte);
		this.superErou=erou;	
	}

	@Override
	public int getPuncte() {
		
		return this.superErou.getPuncte();
	}

	@Override
	public void seDeplaseaza() {
		 this.superErou.seDeplaseaza();
		
	}

	@Override
	public void ataca(int puncte) {
		this.superErou.ataca(puncte);
		
	}

	@Override
	public void seVindeca(int puncte) {
		this.superErou.seVindeca(puncte);
		
	}
	
	
	
	


	

}
