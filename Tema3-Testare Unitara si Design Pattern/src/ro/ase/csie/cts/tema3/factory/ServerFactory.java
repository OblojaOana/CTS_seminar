package ro.ase.csie.cts.tema3.factory;

import ro.ase.csie.cts.tema3.interfata.InterfataServer;

public class ServerFactory {

	public static InterfataServer createServer(TipServer tipServer) {
		switch (tipServer) {
		case SERVER_WEB:
			return new ServerWeb();
		case SERVER_BAZA_DE_DATE:
			return new ServerBazaDeDate();
		default:
			return null;

		}
	}

}
