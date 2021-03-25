package ro.ase.csie.cts.as.laborator5.singleton.registru;

public class TestRegistruSingleton {

	public static void main(String[] args) {
	ConexiuneBD conexiune1=ConexiuneBD.getConexiune("10.0.1", "cts");
	ConexiuneBD conexiune2=ConexiuneBD.getConexiune("10.0.2", "cts");
	
	if(conexiune1==conexiune2)
	{
		System.out.println("Cele 2 sunt egale");
	}else
	{
		System.out.println("Nu sunt egale");
	}
	
	
	}

}
