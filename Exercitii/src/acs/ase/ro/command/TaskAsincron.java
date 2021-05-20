package acs.ase.ro.command;

public class TaskAsincron implements InterfataTaskAsincron {
	
	private InterfataModulJoc modJoc=null;
	String prioritate;
	String detalii;
	
	

	public TaskAsincron(InterfataModulJoc modJoc, String prioritate, String detalii) {
		super();
		this.modJoc = modJoc;
		this.prioritate = prioritate;
		this.detalii=detalii;
	}



	@Override
	public void startTaskAsincron() {
		modJoc.executaTask(detalii);
	}

}
