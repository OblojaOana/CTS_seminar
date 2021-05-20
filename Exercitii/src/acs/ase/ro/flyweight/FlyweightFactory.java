package acs.ase.ro.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static Map<String, InterfataFlyweight> modele=new HashMap<>();
	

	
	static {
		modele.put(TipModel3D.CLADIRE.toString(), new ModelFlyweight3D("Cladire"));
		modele.put(TipModel3D.SOLDAT.toString(), new ModelFlyweight3D("Soldat"));
		
	}
	
	public static InterfataFlyweight getModel(TipModel3D tip) {
		return modele.get(tip.toString());
	}
	
	
}
