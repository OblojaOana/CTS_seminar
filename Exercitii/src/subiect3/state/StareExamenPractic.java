package subiect3.state;

public class StareExamenPractic implements InterfataSustinereExamen {

	@Override
	public void sustineExamen(Examen examen) {
		System.out.println(String.format("Se sustine examen practic la materia %s, avand nr de studenti %d", examen.numeExamen, examen.nrStudenti));
		
	}

}
