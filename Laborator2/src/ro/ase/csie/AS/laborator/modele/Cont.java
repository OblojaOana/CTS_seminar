package ro.ase.csie.AS.laborator.modele;

import ro.ase.csie.AS.laborator.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.AS.laborator.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	public abstract double getBalanta();
	public abstract void alimenteaza(Double valoare);
	public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente;
	public abstract void transfer(Cont destinatie, Double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
	
	

}
