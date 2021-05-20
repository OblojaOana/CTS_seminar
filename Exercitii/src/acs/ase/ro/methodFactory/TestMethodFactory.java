package acs.ase.ro.methodFactory;

public class TestMethodFactory {
	private static void afisarePersonalMedical(AbstractFactory abstractFactory, String nume) {
		PersonalMedical personalMedical = abstractFactory.build(nume);

		personalMedical.descrierePersonalMedical();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		afisarePersonalMedical(new FactoryAsistent(), "Alex");
		afisarePersonalMedical(new FactoryBrancadier(), "Mihai");
		afisarePersonalMedical(new FactoryMedic(), "Ana");
	}
}
