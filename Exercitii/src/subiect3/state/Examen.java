package subiect3.state;

public class Examen {
	String numeExamen;
	int nrStudenti;
	
	InterfataSustinereExamen sustinereExamen;
	
	
	public Examen(String numeExamen, int i) {
		super();
		this.numeExamen = numeExamen;
		this.nrStudenti = i;
		this.sustinereExamen = new StareExamenPractic();
	}
	
	
	public void setExamen(TipExamen tipExamen ) {
		switch(tipExamen) {
		case PRACTIC: 
		
			this.sustinereExamen=new StareExamenPractic();
		
		case ORAL:
			this.sustinereExamen=new StareExamenOral();
		case GRILA:
			this.sustinereExamen=new StareExamenGrila();
		}
	}


	@Override
	public String toString() {
		return "Examen [numeExamen=" + numeExamen + ", nrStudenti=" + nrStudenti + ", sustinereExamen="
				+ sustinereExamen + "]";
	}
	
	
	
	

}
