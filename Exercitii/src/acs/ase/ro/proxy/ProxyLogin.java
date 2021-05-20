package acs.ase.ro.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataLogin {
	private InterfataLogin interfataLogin;

	public static int NR_MAXIM = 3;
	Map<String, Integer> utilizatori = new HashMap<>();


	public ProxyLogin(InterfataLogin interfataLogin) {
		super();
		this.interfataLogin = interfataLogin;
	}

	@Override
	public boolean login(String nume, String pass) {
	Integer nrIncercari=utilizatori.get(nume);
	if(nrIncercari==null)
	{
		utilizatori.put(nume, 0);
		nrIncercari=0;
	}
	if(nrIncercari>NR_MAXIM)
	{
		return false;
	}
	
	
	if(interfataLogin.login(nume, pass)) {
		utilizatori.put(nume, 0);
		return true;
	}
	else
	{
		nrIncercari += 1;
		utilizatori.put(nume, nrIncercari);
		if(nrIncercari == NR_MAXIM) {
			System.out.println("Blocare cont");
		}
		return false;
	}

	
	}

	@Override
	public boolean statusServer() {
	return interfataLogin.statusServer();
	}
}
