package subiect3.flyweight;

public class Student implements IStudent {
	
	String nume;
	

	public Student(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void sustineExamen(String displina) {
	
		System.out.println(String.format("Studnetul %s sustine examenul la disciplina %s", this.nume, displina));
	}

}
