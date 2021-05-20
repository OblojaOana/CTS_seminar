package acs.ase.ro.methodFactory;

public class Asistent extends PersonalMedical {

	public Asistent(String nume) {
		super(nume);

	}

	@Override
	public void descrierePersonalMedical() {
		System.out.println(String.format("%s este asistent", this.nume));
	}

}
