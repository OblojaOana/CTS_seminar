package subiect3.flyweight;

import acs.ase.ro.flyweight.DateEcran;
import acs.ase.ro.flyweight.FlyweightFactory;
import acs.ase.ro.flyweight.InterfataFlyweight;
import acs.ase.ro.flyweight.TipModel3D;

public class TestFlyweight {
	public static void main(String[] args) {
		
		Student student1=new Student("Mihai");
		Student student2=new Student("George");
		Student student3=new Student("Ion");
		
		Disciplina factory=FlyweightStudent.getModel(TipDiscipline.ALGEBRA);
		student1.sustineExamen(factory.denumire);
		student2.sustineExamen(factory.denumire);
		
		



	}

}
