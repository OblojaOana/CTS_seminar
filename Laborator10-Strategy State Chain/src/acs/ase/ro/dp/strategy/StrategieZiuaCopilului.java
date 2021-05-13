package acs.ase.ro.dp.strategy;

public class StrategieZiuaCopilului implements InterfataStrategieMarketing {

	@Override
	public void aplicaStrategieBonus(Jucator jucator) {
		if(jucator.getClasaJucator()>5)
		{
			jucator.clasaJucator*=2;
			System.out.println("Aplica strategie jucator special");
		}
		
	}

}
