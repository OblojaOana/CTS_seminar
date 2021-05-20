package subiect4.adapter;

public class AdaptorMetrou implements IBilet {
     
	private  BiletMetrou biletMetrou;
    
	
	public AdaptorMetrou(BiletMetrou biletMetrou2) {
		this.biletMetrou=biletMetrou2;
	}


	@Override
	public void plataBilet(float suma) {
		biletMetrou.plataBilet(suma);
	}

}
