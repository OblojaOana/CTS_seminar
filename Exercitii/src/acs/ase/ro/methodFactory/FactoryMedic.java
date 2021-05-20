package acs.ase.ro.methodFactory;

public class FactoryMedic implements AbstractFactory {

	@Override
	public PersonalMedical build(String nume) {
		return new Medic(nume);
	}

}
