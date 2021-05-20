package acs.ase.ro.simpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		ISupa legume = SupaFactory.createSupa(TipSupa.LEGUME);
		legume.descriereSupa();
		ISupa pui = SupaFactory.createSupa(TipSupa.PUI);
		pui.descriereSupa();

	}

}
