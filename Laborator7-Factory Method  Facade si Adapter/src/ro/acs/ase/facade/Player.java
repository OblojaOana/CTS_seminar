package ro.acs.ase.facade;

public class Player {
	
	public void login(ConexiuneServerJoc conexiune)
	{
		System.out.println("login player");
	}
	
	public ProfilPlayer getProfil() {
		return new ProfilPlayer();
	}

}
