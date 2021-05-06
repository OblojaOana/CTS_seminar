package obloja.oana.as.adapter;

public interface IEuPlatescPlatforma {
	
	public String getNrCardCredit();
	public String getNumeUtilizator();
	public String getDataExpirareCard();
	public String getNrCVVCard();
	public Double getSumaDePlata();
	
	public void setNrCardCredit(String nrCardCredit);
	public void setNumeUtilizator(String numeUtilizator);
	public void setDataExpirareCard(String dataExpirareCard);
	public void setNrCVVCard(String nrCVVCard);
	public void setSumaDePlata(Double sumaDePlata);
	
}
