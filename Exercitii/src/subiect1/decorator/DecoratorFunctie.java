package subiect1.decorator;

import subiect1.compisite.InterfataActiuniEmail;

public class DecoratorFunctie extends DecoratorAbstract {

	public DecoratorFunctie(InterfataActiuniEmail interfataActiuniEmail) {
		super(interfataActiuniEmail);
		
	}

	@Override
	public void trimiteEmail(String subject, InterfataActiuniEmail destinatie) {
		
		super.trimiteEmail(subject, destinatie);
		System.out.println("Se trimite mail");
	}

	
}
