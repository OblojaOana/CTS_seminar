package obloja.oana.as.adapter;

public class PlataAdapter implements IPlataPrinAplicatie {
	private String nrCardCredit;
	private String numeUtilizator;
	private String dataExpirareCard;
	private String nrCVVCard;
	private Double sumaDePlata;
	
	private IEuPlatescPlatforma euPlatescPlatforma;
	
    public PlataAdapter(IEuPlatescPlatforma euPlatescPlatforma2) {
		this.euPlatescPlatforma=euPlatescPlatforma2;
		setPlata();
	}

	@Override
	public String getNrCardCredit() {
		return nrCardCredit;
	}

	@Override
	public String getNumeUtilizator() {
		return numeUtilizator;
	}

	@Override
	public String getDataExpirareCard() {
		return dataExpirareCard;
	}

	@Override
	public String getNrCVVCard() {
		return nrCVVCard;
	}

	@Override
	public Double getSumaDePlata() {
		return sumaDePlata;
	}

	@Override
	public void setNrCardCredit(String nrCardCredit) {
		this.nrCardCredit=nrCardCredit;
		
	}

	@Override
	public void setNumeUtilizator(String numeUtilizator) {
		this.numeUtilizator=numeUtilizator;
		
	}

	@Override
	public void setDataExpirareCard(String dataExpirareCard) {
		this.dataExpirareCard=dataExpirareCard;
		
	}

	@Override
	public void setNrCVVCard(String nrCVvCard) {
		this.nrCVVCard=nrCVVCard;
		
	}

	@Override
	public void setSumaDePlata(Double sumaDePlata) {
		this.sumaDePlata=sumaDePlata;
		
	}
	
	private void setPlata() {
		setNrCardCredit(this.euPlatescPlatforma.getNrCardCredit());
		setNumeUtilizator(this.euPlatescPlatforma.getNrCardCredit());
		setDataExpirareCard(this.euPlatescPlatforma.getDataExpirareCard());
		setNrCVVCard((this.euPlatescPlatforma.getNrCVVCard()));
        setSumaDePlata(this.euPlatescPlatforma.getSumaDePlata());		
		
	}
 
}
