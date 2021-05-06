package obloja.oana.as.builder;

public class BuilderLucruriNecesare implements Builder {
	
	private UtilizatorLucruriNecesare lucruriNecesare;
	
	public BuilderLucruriNecesare() {
		super();
		this.lucruriNecesare=new UtilizatorLucruriNecesare();
	}
	
	public BuilderLucruriNecesare setAreBuletin(boolean areBuletin) {
		lucruriNecesare.setAreBuletin(areBuletin);
		return this;
	}
	
	public BuilderLucruriNecesare setArePasaport(boolean arePasaport) {
		lucruriNecesare.setArePasaport(arePasaport);
		return this;
	}
	
	public BuilderLucruriNecesare setAreBiletAvion(boolean areBiletAvion) {
		lucruriNecesare.setAreBiletAvion(areBiletAvion);
		return this;
	}
	
	public BuilderLucruriNecesare setAreRezervareAvion(boolean areRezervareAvion) {
		lucruriNecesare.setAreRezervareAvion(areRezervareAvion);
		return this;
	}
	
	public BuilderLucruriNecesare setAreMedicamente(boolean areMedicamente) {
		lucruriNecesare.setAreMedicamente(areMedicamente);
		return this;
	}
	
	public BuilderLucruriNecesare setArePapuciDeCasa(boolean arePapuciDeCasa) {
		lucruriNecesare.setArePapuciDeCasa(arePapuciDeCasa);
		return this;
	}

	@Override
	public UtilizatorLucruriNecesare build() {
		return lucruriNecesare;
	}

}
