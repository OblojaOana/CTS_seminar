package subiect4.chain;

public class CalatorMetrou extends CalatorHandler {

	@Override
	public void deplasareAutovehicul(Calator calator, int nrKm) {
		if(nrKm<15)
		{
			System.out.println("Se deplaseaza cu metroul");
			calator.deplaseaza(nrKm);
		}
		else
		{
			this.next.deplasareAutovehicul(calator, nrKm);
		}
	}

}
