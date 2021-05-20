package acs.ase.ro.facade;



public class Login {
	
	public void login(ConexiuneJoc conexiune)
	{
		System.out.println("S-a conectat la joc");
	}
	
	public ProfilPlayer getProfile()
	{
		return new ProfilPlayer();
		}
	
	

}
