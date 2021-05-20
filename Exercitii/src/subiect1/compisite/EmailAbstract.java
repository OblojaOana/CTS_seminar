package subiect1.compisite;

import acs.ase.ro.composite.UnitateAbstracta;

public abstract class EmailAbstract implements InterfataActiuniEmail {
	
	String nume;
	String ip;
	String email;
	
	public EmailAbstract(String nume, String ip, String email) {
		super();
		this.nume = nume;
		this.ip = ip;
		this.email = email;
	}
	

	public void adaugaEmail(EmailAbstract email) {
		throw new UnsupportedOperationException();
	}
	
	public void stergeEmail(EmailAbstract email)
	{
		throw new UnsupportedOperationException();
	}
	
	public EmailAbstract getEmail(int index) {
		throw new UnsupportedOperationException();
		
	}
	
	
	

}
