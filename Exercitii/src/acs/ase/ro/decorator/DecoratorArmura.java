package acs.ase.ro.decorator;

public class DecoratorArmura extends DecoratorSuperErou {

	private int nivelArmura;
	
	public DecoratorArmura(SuperErou erou, int nivelArmura) {
		super(erou);
		this.nivelArmura=nivelArmura;
	}

	@Override
	public void ataca(int puncte) {
		int punctePierdute=nivelArmura-puncte;
		if(punctePierdute>0)
		{
			superErou.ataca(punctePierdute);
		}
	}


	
	
	

}
