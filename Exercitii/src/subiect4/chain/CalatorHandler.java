package subiect4.chain;



public abstract class CalatorHandler  {
	
	CalatorHandler next=null;
	
	public abstract void deplasareAutovehicul(Calator calator, int nrKm);
	
	public void setNext(CalatorHandler next) {
		this.next = next;
	}
	

}
