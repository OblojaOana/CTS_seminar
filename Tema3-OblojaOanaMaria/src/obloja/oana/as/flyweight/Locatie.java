package obloja.oana.as.flyweight;

import obloja.oana.as.factory.TipCalatorie;

public class Locatie {
	
	private String tara;
	private String judet;
	private String oras;
	private TipCalatorie tipCalatorie;
	
	public Locatie(TipCalatorie tipCalatorie) {
		this.tipCalatorie=tipCalatorie;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}

	public void setJudet(String judet) {
		this.judet = judet;
	}

	public void setOras(String oras) {
		this.oras = oras;
	}

	@Override
	public String toString() {
		return "Calatoria de tipul: "+ this.tipCalatorie+ " are destinatia: "+ this.tara +", " + this.judet+ ", " + this.oras;
	}
	
	

	

	

}
