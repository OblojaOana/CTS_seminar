package subiect1.decorator;

import subiect1.compisite.Email;
import subiect1.compisite.InterfataActiuniEmail;

public class TestDecoratS1 {

	public static void main(String[] args) {
		
		InterfataActiuniEmail interfata=new Email("aaa","12.34", "a@yahoo.com");
		interfata.creareEmailDraft("aaa", 2);
		
		interfata=new DecoratorOraInregistrata(interfata, "12.00");
		interfata.trimiteEvenimit("aaa", "aaa", interfata);

	}

}
