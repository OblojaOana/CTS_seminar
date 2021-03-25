package ro.ase.csie.cts.as.laborator5.singleton;

public class TestSingleton {
	public static void main(String[] args)
	{



		ConexiuneBD conexiune1=ConexiuneBD.getConexiune();
		ConexiuneBD conexiune2=ConexiuneBD.getConexiune();
		
		
		if(conexiune1==conexiune2)
		{
			System.out.println("Cele 2 sunt egale");
		}else
		{
			System.out.println("Nu sunt egale");
		}
		
		ModulUI modulUI=new ModulUI();
		ModulProfil modulProfil=new ModulProfil();
		
	}

}
