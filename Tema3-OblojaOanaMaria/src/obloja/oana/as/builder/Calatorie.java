package obloja.oana.as.builder;

import java.util.Date;

public abstract class Calatorie {
	
	protected String numeCalatorie;
	protected String tara;
	protected String oras;
	protected Date dataDeInceput;
	protected Date dataSfarsit;

	public Calatorie(String numeCalatorie, String tara, String oras, Date dataDeInceput2, Date dataDeSfarsit) {
		super();
		this.numeCalatorie = numeCalatorie;
		this.tara = tara;
		this.oras = oras;
		this.dataDeInceput = dataDeInceput2;
		this.dataSfarsit = dataDeSfarsit;
	}
	
	public abstract void afisareCalatorie();
	
	public abstract void statusCalatorie(Date dataInceput);

	

}
