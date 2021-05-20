package acs.ase.ro.methodFactory;

public class Brancadier extends PersonalMedical {

	public Brancadier(String nume) {
		super(nume);

	}

	@Override
	public void descrierePersonalMedical() {
		System.out.println(String.format("%s este brancadier", this.nume));

	}

}
