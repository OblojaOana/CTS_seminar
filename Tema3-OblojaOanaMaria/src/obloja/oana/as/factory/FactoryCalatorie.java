package obloja.oana.as.factory;

import java.util.Date;

import obloja.oana.as.builder.Calatorie;

public class FactoryCalatorie {
	
	
	public static Calatorie getCalatorie(TipCalatorie tipCalatorie,
			                             String numeCalatorie,
			                             String tara,
			                             String oras,
			                             Date dataDeInceput,
			                             Date dataDeSfarsit)
	{
		Calatorie calatorie=null;
		
		switch(tipCalatorie) {
		case FAMILIE:
			calatorie=new CalatorieCuFamilia(numeCalatorie, tara, oras, dataDeInceput, dataDeSfarsit);
			break;
		case PRIETENI:
			calatorie=new CalatorieCuPrietenii(numeCalatorie, tara, oras, dataDeInceput, dataDeSfarsit);
			break;
		case AFACERI:
			calatorie=new CalatorieDeAfaceri(numeCalatorie, tara, oras, dataDeInceput, dataDeSfarsit);
			break;
		}
		return calatorie;
	}

}
