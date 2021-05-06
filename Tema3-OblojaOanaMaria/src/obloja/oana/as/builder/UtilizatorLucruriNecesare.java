package obloja.oana.as.builder;

public class UtilizatorLucruriNecesare {
	private boolean areBuletin;
	private boolean arePasaport;
	private boolean areBiletAvion;
	private boolean areRezervareAvion;
	private boolean areMedicamente;
	private boolean arePapuciDeCasa;
	
	public UtilizatorLucruriNecesare(boolean areBuletin,
						   boolean arePasaport,
						   boolean areBiletAvion,
						   boolean areRezervareAvion,
						   boolean areMedicamente,
						   boolean arePapuciDeCasa) {
		super();
		this.areBuletin = areBuletin;
		this.arePasaport = arePasaport;
		this.areBiletAvion = areBiletAvion;
		this.areRezervareAvion = areRezervareAvion;
		this.areMedicamente = areMedicamente;
		this.arePapuciDeCasa = arePapuciDeCasa;
	}
	
	public UtilizatorLucruriNecesare() {
		super();
		this.areBuletin = false;
		this.arePasaport = false;
		this.areBiletAvion = false;
		this.areRezervareAvion = false;
		this.areMedicamente = false;
		this.arePapuciDeCasa = false;	
	}

	public void setAreBuletin(boolean areBuletin) {
		this.areBuletin = areBuletin;
	}

	public void setArePasaport(boolean arePasaport) {
		this.arePasaport = arePasaport;
	}

	public void setAreBiletAvion(boolean areBiletAvion) {
		this.areBiletAvion = areBiletAvion;
	}


	public void setAreRezervareAvion(boolean areRezervareAvion) {
		this.areRezervareAvion = areRezervareAvion;
	}


	public void setAreMedicamente(boolean areMedicamente) {
		this.areMedicamente = areMedicamente;
	}


	public void setArePapuciDeCasa(boolean arePapuciDeCasa) {
		this.arePapuciDeCasa = arePapuciDeCasa;
	}

	@Override
	public String toString() {
		return "UtilizatorLucruriNecesare [areBuletin=" + areBuletin + ", arePasaport=" + arePasaport
				+ ", areBiletAvion=" + areBiletAvion + ", areRezervareAvion=" + areRezervareAvion + ", areMedicamente="
				+ areMedicamente + ", arePapuciDeCasa=" + arePapuciDeCasa + "]";
	}
	
	
	
	
	
	

}
