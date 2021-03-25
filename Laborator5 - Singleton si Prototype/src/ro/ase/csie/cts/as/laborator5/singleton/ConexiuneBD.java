package ro.ase.csie.cts.as.laborator5.singleton;

public class ConexiuneBD {
	
	String ip;
	String denumire;
	
	
	private static ConexiuneBD conexiune=null;
	
	public ConexiuneBD()
	{
		
	}

	private ConexiuneBD(String ip, String denumire) {
		System.out.println("Apel constructor");
		this.ip = ip;
		this.denumire = denumire;
	}
	
	
	//versiune lazy
	public static synchronized ConexiuneBD getConexiune() {
		if(conexiune==null)
		{
			//datele se pot prelua din fisierele de configurare
			conexiune=new ConexiuneBD("10.0.0.1", "cts");
			
		}
		return conexiune;
	}

	
	

}
