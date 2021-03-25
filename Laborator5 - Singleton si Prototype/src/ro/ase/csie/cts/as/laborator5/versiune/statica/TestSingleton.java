package ro.ase.csie.cts.as.laborator5.versiune.statica;

public class TestSingleton {

	public static void main(String[] args) {
		ConexiuneBD conexiune1=ConexiuneBD.conexiune;
		ConexiuneBD conexiune2=ConexiuneBD.conexiune;
		if(conexiune1==conexiune2)
		{
			System.out.println("Cele 2 sunt egale");
		}else
		{
			System.out.println("Nu sunt egale");
		}
		
	}

}
