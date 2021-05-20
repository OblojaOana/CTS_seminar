package acs.ase.ro.methodFactory;

public class Medic extends PersonalMedical {

	public Medic(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void descrierePersonalMedical() {
		System.out.println(String.format("%s este medic", this.nume));

	}

}
