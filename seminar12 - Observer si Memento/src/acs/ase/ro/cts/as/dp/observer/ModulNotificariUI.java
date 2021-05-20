package acs.ase.ro.cts.as.dp.observer;

public class ModulNotificariUI implements InterfataStatusConexiuneServer {

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("PopUo: conexiune pierduta!");
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("PopUo: conexiune activa!");

	}

}