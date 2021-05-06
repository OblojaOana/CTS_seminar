package obloja.oana.as.decorator;

import java.util.Date;

import obloja.oana.as.builder.Calatorie;

public class DecoratorCalatorie extends Calatorie {


	public DecoratorCalatorie(String numeCalatorie, String tara, String oras, Date dataDeInceput2, Date dataDeSfarsit) {
		super(numeCalatorie, tara, oras, dataDeInceput2, dataDeSfarsit);
		
	}

	Calatorie calatorie=null;
	
	

	@Override
	public void afisareCalatorie() {
		this.calatorie.afisareCalatorie();
		
	}

	
	@Override
	public void statusCalatorie(Date dataInceput) {
		this.calatorie.statusCalatorie(dataInceput);
		
	}
	
	
	

}
