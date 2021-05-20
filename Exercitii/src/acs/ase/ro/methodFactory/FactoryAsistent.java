package acs.ase.ro.methodFactory;

public class FactoryAsistent implements AbstractFactory {

	@Override
	public PersonalMedical build(String nume) {
		return new Asistent(nume);
	}

}
