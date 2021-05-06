package obloja.oana.as.proxy;

public class Imagine implements IImagine {

	private String imaginePath;
	private IImagine imagine;
	
	public Imagine(String imaginePath) {
		this.imaginePath= imaginePath;	
	}
	
	
	
	@Override
	public void arataImaginea() {
		imagine=new RezolutieInaltaImagine(imaginePath);
		
		imagine.arataImaginea();
		
	}


}
