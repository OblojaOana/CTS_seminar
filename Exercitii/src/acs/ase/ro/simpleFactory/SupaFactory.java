package acs.ase.ro.simpleFactory;

public class SupaFactory {

	public static ISupa createSupa(TipSupa tip) {
		switch (tip) {
		case LEGUME:
			return new SupaDeLEgume();
		case PUI:
			return new SupaDePui();
		case VITA:
			return new SupaDeVita();
		default:
			return null;

		}

	}

}
