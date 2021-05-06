package obloja.oana.as.decorator;

import java.text.SimpleDateFormat;
import java.util.Date;

import obloja.oana.as.builder.Calatorie;

public class DecoratorPoze extends DecoratorCalatorie {
	int numarPoze;

    public DecoratorPoze(String numeCalatorie, String tara, String oras, Date dataDeInceput2, Date dataDeSfarsit, int numarPoze) {
		super(numeCalatorie, tara, oras, dataDeInceput2, dataDeSfarsit);
		this.numarPoze=numarPoze;
	}

	@Override
	public void statusCalatorie(Date dataInceput) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataCurenta=new Date();
		int rezultatComparareDate=dataInceput.compareTo(dataCurenta);
		if(rezultatComparareDate>0) {
			System.out.println("Nu se pot adauga poze");
		}
		else {
			System.out.println("Se adauga " + numarPoze+ " poze");
		}
		
		
	}

	

	
	
	
     
}
