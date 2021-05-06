package obloja.oana.as.flyweight;

import java.util.HashMap;
import java.util.Map;

import obloja.oana.as.factory.TipCalatorie;

public class LocatieFactory {
private static final Map<TipCalatorie, Locatie> mapLocatie = new HashMap();
	
	public static Locatie getLocatieDupaTipulCalatoriei(TipCalatorie tipCalatorie) {
		Locatie locatie = mapLocatie.get(tipCalatorie);
		
		if (locatie == null) {
			locatie = new Locatie(tipCalatorie);
			mapLocatie.put(tipCalatorie, locatie);
		}
		
		return locatie;
	}

}
