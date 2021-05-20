package subiect4.adapter;

public class AdaptorTramvai implements IBilet {

	BiletTramvai biletTramvai;
	@Override
	public void plataBilet(float suma) {
		biletTramvai.plataBilet(suma);
		
	}

}
