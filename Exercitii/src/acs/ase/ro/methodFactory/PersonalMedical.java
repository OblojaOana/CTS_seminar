package acs.ase.ro.methodFactory;

public abstract class PersonalMedical {

	String nume;

	public PersonalMedical(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public abstract void descrierePersonalMedical();

}
