package obloja.oana.as.factory;

import java.util.Date;

import obloja.oana.as.builder.Calatorie;

public class CalatorieDeAfaceri extends Calatorie {



	public CalatorieDeAfaceri(String numeCalatorie, String tara, String oras, Date dataDeInceput2, Date dataDeSfarsit) {
		super(numeCalatorie, tara, oras, dataDeInceput2, dataDeSfarsit);
		
	}

	@Override
	public void afisareCalatorie() {
		System.out.println("Calatoria cu prietenii are destinatia "+ this.tara +" si se desfasoara in intervalul de date " + this.dataDeInceput 
				           + " si " +this.dataSfarsit);
		
	}

	@Override
	public void statusCalatorie(Date dataInceput) {
		
	}

}
