package subiect1.compisite;

import acs.ase.ro.composite.GrupCaracter;
import acs.ase.ro.composite.UnitateAbstracta;

public class TestSub1Composite {
	public static void main(String[] args) {
		EmailAbstract grup1=new GrupEmail("grup1", "10.02.09", "grup1");
		
		EmailAbstract email=new Email("oblojaOana", "10.08.22", "oana@yahoo.com");
		EmailAbstract email2=new Email("maria", "10.08.22", "oana2@yahoo.com");
		EmailAbstract email3=new Email("ion", "10.08.22", "ion@yahoo.com");
		grup1.adaugaEmail(email);
		grup1.adaugaEmail(email2);
		grup1.adaugaEmail(email3);
		
		grup1.creareEmailDraft("aaaa", 2);
		
		grup1.stergeEmail(email2);
		
		grup1.trimiteEmail("aaa", email2);
		
		
		

	}

}
