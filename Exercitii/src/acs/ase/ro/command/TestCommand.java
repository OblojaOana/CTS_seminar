package acs.ase.ro.command;

public class TestCommand {

	public static void main(String[] args) {
		ManagerTaskuri managerTaskuri=new ManagerTaskuri();
		managerTaskuri.adaugaTask(new TaskAsincron(new ModulUpdate(), "10.1", "5"));
		managerTaskuri.adaugaTask(new TaskAsincron(new ModulAutoSave(), "6","bunaa"));
		
   System.out.println("Jocul continua...");
		
   managerTaskuri.executaUrmatorulTask();
		
		System.out.println("Jocul continua...");

		managerTaskuri.executaUrmatorulTask();
		
		System.out.println("Jocul continua...");
		
	}

}
