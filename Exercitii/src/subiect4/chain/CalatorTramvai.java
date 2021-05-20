package subiect4.chain;

public class CalatorTramvai extends CalatorHandler {



	@Override
	public void deplasareAutovehicul(Calator calator, int nrKm) {
		if(nrKm<10)
		{
			System.out.println(String.format("Se deplaseaza cu tramvaiul"));
			calator.deplaseaza(nrKm);
			
		}
		else {
			this.next.deplasareAutovehicul(calator, nrKm);
		}
	}

}
