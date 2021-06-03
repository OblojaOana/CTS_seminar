package ro.ase.csie.cts.tema3.prototype;

import ro.ase.csie.cts.tema3.interfata.InterfataServer;

public class Server implements InterfataServer {

	String adresaIp;
	int port;
	int nrMaximConexiune;
	int nrActualConexiune;

	public Server(String adresaIp, int port, int nerMaximConexiun) {
		super();
		this.adresaIp = adresaIp;
		this.port = port;
		this.nrMaximConexiune = nrMaximConexiune;
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

	@Override
	public Object clone() throws CloneNotSupportedException {

		Server copie = new Server(this.adresaIp, this.port, this.nrMaximConexiune);
		copie.adresaIp = this.adresaIp;
		copie.port = this.port;
		copie.nrMaximConexiune = this.nrMaximConexiune;
		return copie;
	}

}
