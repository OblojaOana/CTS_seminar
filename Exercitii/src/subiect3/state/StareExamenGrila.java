package subiect3.state;

public class StareExamenGrila implements InterfataSustinereExamen{

	@Override
	public void sustineExamen(Examen examen) {
		System.out.println(String.format("Se sustine examen grila la materia %s, avand nr de studenti %d", examen.numeExamen, examen.nrStudenti));
	}

}
