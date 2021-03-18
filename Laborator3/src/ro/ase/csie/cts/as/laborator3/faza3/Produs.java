package ro.ase.csie.cts.as.laborator3.faza3;

import java.nio.channels.UnsupportedAddressTypeException;
import ro.ase.csie.cts.as.laborator3.exceptii.ExceptiePretInvalid;
import ro.ase.csie.cts.as.laborator3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.as.laborator3.faza1.TipProdus;
import ro.ase.csie.cts.as.laborator3.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.as.laborator3.faza3.servicii.InterfataValidare;
import ro.ase.csie.cts.as.laborator3.faza3.servicii.ServiciuValidari;
import ro.ase.csie.cts.as.laborator3.faza3.servicii.StrategieMarketing2021;

	

public class Produs {
	
	InterfataMarketing serviciuMk = null;
	InterfataValidare serviciuValidare = null;
	
	
	public Produs(InterfataMarketing mk, InterfataValidare validare)
	{
		if(mk==null)
		{
			throw new NullPointerException();
		}
		if(validare==null)
		{
			throw new NullPointerException();
		}
		this.serviciuMk=mk;
		this.serviciuValidare=validare;
		
	}
	
	public void setStrategieMarketing(InterfataMarketing strategie)
	{
		if(strategie==null)
		{
			throw new NullPointerException();
		}
		this.serviciuMk=strategie;
	}
	
	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial - (discount * pretInitial);
	}
	
	public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni) 
			throws ExceptiePretInvalid, ExceptieVechimeClient
	  {
		
		serviciuValidare.validarePret(pretInitial);
		serviciuValidare.validareVechimeClient(vechimeClientInAni);
			    
	    float discountFidelitate = 
	    		(tipProdus == TipProdus.NOU) ? 0 : serviciuMk.getDiscountFidelitate(vechimeClientInAni);
	    
    	float discount = tipProdus.getDiscount();
    	float valoareDiscountTipProdus = getPretCuDiscount(pretInitial,discount);
    	float pretFinal = valoareDiscountTipProdus *(1 - discountFidelitate);
    	
	    
	    return pretFinal;
	  }

}