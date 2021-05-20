package subiect1.compisite;

public class Email extends EmailAbstract {

	public Email(String nume, String ip, String email) {
		super(nume, ip, email);
		
	}

	@Override
	public void trimiteEmail(String subject, InterfataActiuniEmail destinatie) {
	   System.out.println(String.format("De pe adresa de email %s s-a trimis mesajul cu subiectul %s", this.email, subject));
		
	}

	@Override
	public void creareEmailDraft(String subject, int prioritate) {
	    System.out.println(String.format("S-a creat draft la adresa de email %s", this.email));
		
	}

	@Override
	public void trimiteEvenimit(String subject, String data, InterfataActiuniEmail destinatie) {
		System.out.println(String.format("Se trimite mesajul de la adresa de email",this.email ));
		
	}

}
