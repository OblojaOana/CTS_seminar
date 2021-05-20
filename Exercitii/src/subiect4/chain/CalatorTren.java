package subiect4.chain;

public class CalatorTren extends CalatorHandler {

	@Override
	public void deplasareAutovehicul(Calator calator, int nrKm) {
		System.out.println("Deplasare utilizand trenul");
        calator.deplaseaza(nrKm);
		
	}

}
