package subiect4.chain;

public class DeplasareAutobuz extends CalatorHandler {

	@Override
	public void deplasareAutovehicul(Calator calator, int nrKm) {
		if(nrKm<5) {
			System.out.println(String.format("Se deplaseaza cu autobuz"));
			calator.deplaseaza(nrKm);
		}
		else
		{
			this.next.deplasareAutovehicul(calator, nrKm);
		}
		
	}

}
