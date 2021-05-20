package subiect1.decorator;

import subiect1.compisite.InterfataActiuniEmail;

public class DecoratorOraInregistrata extends DecoratorAbstract {
	
	private String oraInregistrata;

	public DecoratorOraInregistrata(InterfataActiuniEmail interfataActiuniEmail, String oraInregistrata) {
		super(interfataActiuniEmail);
		this.oraInregistrata=oraInregistrata;
	}

	@Override
	public void trimiteEvenimit(String subject, String data, InterfataActiuniEmail destinatie) {
		 System.out.println("Ora inregistrate "+this.oraInregistrata);
	}
	
	

	
		

}
