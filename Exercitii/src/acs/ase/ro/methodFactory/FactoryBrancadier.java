package acs.ase.ro.methodFactory;

public class FactoryBrancadier implements AbstractFactory {

	@Override
	public PersonalMedical build(String nume) {
		return new Brancadier(nume);
	}

}
