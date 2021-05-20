package subiect1.compisite;

import java.util.ArrayList;



public class GrupEmail extends EmailAbstract {
	
	ArrayList<EmailAbstract> emails = new ArrayList<>();
	
	public GrupEmail(String nume, String ip, String email) {
		super(nume, ip, email);
		
	}

	@Override
	public void trimiteEmail(String subject, InterfataActiuniEmail destinatie) {
		for(EmailAbstract emailGrup: emails)
		{
			emailGrup.trimiteEmail(subject, destinatie);
		}
	}

	@Override
	public void creareEmailDraft(String subject, int prioritate) {
		for(EmailAbstract emailGrup: emails)
		{
			emailGrup.creareEmailDraft(subject, prioritate);
		}
	}

	@Override
	public void trimiteEvenimit(String subject, String data, InterfataActiuniEmail destinatie) {
		for(EmailAbstract emailGrup: emails) {
			emailGrup.trimiteEvenimit(subject, data, destinatie);
		}
		
	}

	@Override
	public void adaugaEmail(EmailAbstract email) {
		 emails.add(email);
	}

	@Override
	public void stergeEmail(EmailAbstract email) {
		emails.remove(email);
	}

	@Override
	public EmailAbstract getEmail(int index) {
		return emails.get(index);
	}



}
