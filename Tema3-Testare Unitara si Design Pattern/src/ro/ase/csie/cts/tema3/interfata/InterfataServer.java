package ro.ase.csie.cts.tema3.interfata;


public interface InterfataServer {
	public String getAdresaIp();

	public int getPort();

	public int getNrMaximConexiune();

	public boolean conectare();

	public boolean deconectare();

}
