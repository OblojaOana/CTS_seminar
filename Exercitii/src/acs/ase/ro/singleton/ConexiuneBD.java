package acs.ase.ro.singleton;

public class ConexiuneBD {
	
	private String nume;
	private String parola;
	
	private ConexiuneBD(String nume, String parola) {
		super();
		System.out.println("Apel constructor");
		this.nume = nume;
		this.parola = parola;
	}
	
	private ConexiuneBD() {}
	
	private static ConexiuneBD conexiuneBD=null;
	
	public static ConexiuneBD getIstanta() {
		if(conexiuneBD==null)
		{
			conexiuneBD=new ConexiuneBD("Baza de date", "123");
		}
		
		return conexiuneBD;
		
	}
	
	
	
	
	
	

}
