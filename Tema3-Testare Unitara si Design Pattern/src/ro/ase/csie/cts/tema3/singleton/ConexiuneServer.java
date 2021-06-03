package ro.ase.csie.cts.tema3.singleton;

import ro.ase.csie.cts.tema3.interfata.InterfataServer;

public class ConexiuneServer implements InterfataServer {

	private String adresaIp;
	private int port;
	private int nrMaximConexiune;
	private int nrActualConexiune;

	private static ConexiuneServer server = null;

	private ConexiuneServer(String adresaIp, int port, int nrMaximConexiune) {
		super();
		this.adresaIp = adresaIp;
		this.port = port;
		this.nrMaximConexiune = nrMaximConexiune;
		this.nrActualConexiune = 0;
	}

	private ConexiuneServer() {

	}

	public static synchronized ConexiuneServer getServer() {
		if (server == null) {
			server = new ConexiuneServer("localhost", 5000, 1);
		}
		return server;
	}

	@Override
	public String getAdresaIp() {
		return this.adresaIp;
	}

	@Override
	public int getPort() {
		return this.port;
	}

	@Override
	public int getNrMaximConexiune() {

		return this.nrMaximConexiune;
	}

	@Override
	public boolean conectare() {
		if (this.nrActualConexiune <= this.nrMaximConexiune) {
			System.out.println("S-a conectat");
			this.nrActualConexiune++;
			return true;
		} else {
			System.out.println("S-a atins numarul maxim de conexiuni");
			return false;
		}
	}

	@Override
	public boolean deconectare() {
		System.out.println("S-a deconectat");
		this.nrActualConexiune--;
		return true;
	}

}
