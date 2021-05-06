package obloja.oana.as.decorator;

import java.util.Date;

import obloja.oana.as.builder.Calatorie;

public class CalatorieCompleta extends Calatorie {

	public CalatorieCompleta(String numeCalatorie, String tara, String oras, Date dataDeInceput2, Date dataDeSfarsit) {
		super(numeCalatorie, tara, oras, dataDeInceput2, dataDeSfarsit);
	}

	@Override
	public void afisareCalatorie() {
	  System.out.println("Calatoria " + numeCalatorie+ "este in tara "+ tara + "si orasul "+ oras+"desfasurandu-se intre datele "
			             +dataDeInceput +"si " +dataSfarsit);
		
	}

	@Override
	public void statusCalatorie(Date dataInceput) {
	   System.out.println("Calatoria"+ numeCalatorie+ "are data de inceput"+ dataInceput);
	}
	
	

}
