
package subiect4.adapter;

import java.util.ArrayList;

public class TestAdaptorS4 {

	public static void main(String[] args) {
		ArrayList<IBilet> bilete=new ArrayList<>();
		
		IBilet biletAutobuz=new BiletAutobuz();
		biletAutobuz.plataBilet(100);
		
		BiletMetrou biletMetrou=new BiletMetrou();
		biletAutobuz= new AdaptorMetrou(biletMetrou);
		biletAutobuz.plataBilet(30);
		
	}

}
