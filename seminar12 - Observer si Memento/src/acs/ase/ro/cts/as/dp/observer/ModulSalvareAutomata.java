package acs.ase.ro.cts.as.dp.observer;

public class ModulSalvareAutomata implements InterfataStatusConexiuneServer {

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("Salvare automata date joc");
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("Afisare istoric salvari");
	}

}