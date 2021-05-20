package subiect1.decorator;

import subiect1.compisite.InterfataActiuniEmail;

public abstract class DecoratorAbstract implements InterfataActiuniEmail {
	
	private InterfataActiuniEmail interfataActiuniEmail=null;
	
	
	

	public DecoratorAbstract(InterfataActiuniEmail interfataActiuniEmail) {
		super();
		this.interfataActiuniEmail = interfataActiuniEmail;
	}

	@Override
	public void trimiteEmail(String subject, InterfataActiuniEmail destinatie) {
	    this.interfataActiuniEmail.trimiteEmail(subject, destinatie);
	}

	@Override
	public void creareEmailDraft(String subject, int prioritate) {
		this.interfataActiuniEmail.creareEmailDraft(subject, prioritate);
	}

	@Override
	public void trimiteEvenimit(String subject, String data, InterfataActiuniEmail destinatie) {
		this.interfataActiuniEmail.trimiteEmail(subject, destinatie);
		
	}

}
