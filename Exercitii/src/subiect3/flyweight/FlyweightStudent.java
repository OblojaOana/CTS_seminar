package subiect3.flyweight;

import java.util.HashMap;
import java.util.Map;

import acs.ase.ro.flyweight.InterfataFlyweight;
import acs.ase.ro.flyweight.ModelFlyweight3D;
import acs.ase.ro.flyweight.TipModel3D;

public class FlyweightStudent {
	private static Map<String, Disciplina> modele=new HashMap<>();
	
	static {
		modele.put(TipDiscipline.ALGEBRA.toString(), new Disciplina("Algebra", 5));
		modele.put(TipDiscipline.POO.toString(), new Disciplina("POO", 6));
		modele.put(TipDiscipline.CTS.toString(), new Disciplina("CTS", 4));
		
		
	}
	
	public static Disciplina getModel(TipDiscipline tip) {
		return modele.get(tip.toString());
	}

}
