package obloja.oana.as.prototype;

public class Poza implements Cloneable {
	String fisierPreluarePoza;
	int inaltimePoza;
	int lungimePoza;
	
	public Poza(String fisierPreluarePoza, int inaltimePoza, int lungimePoza)
	{
		System.out.println("Se incarca poza din fisierul: "
	                        + fisierPreluarePoza+ ", inaltime: "
				            + inaltimePoza+", lungime poza: " + lungimePoza);
		
	}
	
	public Poza()
	{
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lungime poza: "+ inaltimePoza + ".Latime poza:" + lungimePoza);
		return sb.toString();
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {	
		Poza copie = new Poza();
		copie.fisierPreluarePoza=this.fisierPreluarePoza;
		copie.inaltimePoza=this.inaltimePoza;
		copie.lungimePoza=this.lungimePoza;	
		return copie;
	}

}
