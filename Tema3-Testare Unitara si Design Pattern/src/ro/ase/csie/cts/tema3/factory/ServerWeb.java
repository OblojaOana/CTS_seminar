package ro.ase.csie.cts.tema3.factory;

import ro.ase.csie.cts.tema3.interfata.InterfataServer;

public class ServerWeb implements InterfataServer {

	String adresaIp;
	int port;
	int nrMaximConexiune;
	int nrActualConexiune;

	public ServerWeb() {
		super();
		this.adresaIp = "127.158.1.1";
		this.port = 5001;
		this.nrMaximConexiune = 4;
		this.nrActualConexiune = 0;
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
