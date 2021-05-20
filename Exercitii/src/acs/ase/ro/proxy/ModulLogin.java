package acs.ase.ro.proxy;

public class ModulLogin implements InterfataLogin {

	String ipServer;
	
	public ModulLogin(String ipServer) {
		super();
		this.ipServer = ipServer;
	}

	@Override
	public boolean login(String nume, String pass) {
	  if(nume.contains("admin") && pass.contains("root1234"))
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
	}

	@Override
	public boolean statusServer() {
		return true;
	}

}
