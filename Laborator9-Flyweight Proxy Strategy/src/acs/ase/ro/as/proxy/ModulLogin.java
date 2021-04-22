package acs.ase.ro.as.proxy;

public class ModulLogin implements InterfataLogin {

	String ipServer;
	

	public ModulLogin(String ipServer) {
		super();
		this.ipServer = ipServer;
	}

	@Override
	public boolean login(String user, String pass) {
		if(user.equals("Admin")&& pass.equals("root123"))
		return true;
		else 
			return false;
	}

	@Override
	public boolean verificareStatusServer() {
		return true;
	}

}