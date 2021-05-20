package subiect3.state;

public class StareExamenOral  implements InterfataSustinereExamen{

	@Override
	public void sustineExamen(Examen examen) {
		System.out.println(String.format("Se sustine examen oral la materia %s, avand nr de studenti %d", examen.numeExamen, examen.nrStudenti));
	}

}
