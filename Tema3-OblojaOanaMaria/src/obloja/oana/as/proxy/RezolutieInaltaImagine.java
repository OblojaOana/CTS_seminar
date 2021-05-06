package obloja.oana.as.proxy;

public class RezolutieInaltaImagine implements IImagine {

public RezolutieInaltaImagine(String imaginePath) {
		
	IncarcatiImaginea(imaginePath);
	}

	private void IncarcatiImaginea(String imaginePath) {
          System.out.println("Imaginea este preluata din " + imaginePath);
	}
	
	@Override
	public void arataImaginea() {
		
	}

}
