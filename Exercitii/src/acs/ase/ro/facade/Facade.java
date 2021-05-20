package acs.ase.ro.facade;

public class Facade {
	public static String getProfil(String username, String pass) {
		//1. creare conexiune
		ConexiuneJoc conexiune = new ConexiuneJoc();
		conexiune.conectare();
		
		//2. login player
		Login player = new Login();
		player.login(conexiune);
		
		//3. obtinem profilul
		ProfilPlayer profil = player.getProfile();
		
		//4. obtinem datele
		String dateProfil = profil.getProfil();
		
		return dateProfil;
	}
}
