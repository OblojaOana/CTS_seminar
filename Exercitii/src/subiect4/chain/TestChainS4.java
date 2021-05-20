package subiect4.chain;



public class TestChainS4 {
	public static void main(String[] args) {
		
		Calator calator1=new Calator();
		Calator calator2=new Calator();
		Calator calator3=new Calator();
		
		CalatorHandler calatorMetrou=new CalatorMetrou();
		CalatorHandler calatorTramvai=new CalatorTramvai();
		CalatorHandler calatorTren=new CalatorTren();
		CalatorHandler calatorAutobuz=new DeplasareAutobuz();
		
		calatorAutobuz.setNext(calatorTramvai);
		calatorTramvai.setNext(calatorMetrou);
		calatorMetrou.setNext(calatorTren);

		calatorAutobuz.deplasareAutovehicul(calator1, 3);
		calatorAutobuz.deplasareAutovehicul(calator2, 16);
		

	}

}
