package cts.obloja.oana.as.pattern.chain;

public class AccidentareGrava extends AccidentareHandler {

	@Override
	public void tratareAccidentare(Accidentare accidentare, TipAccidentare tipAccidentare) {
		if (tipAccidentare.GRAVA == TipAccidentare.GRAVA) {
			System.out.println("Este o accidentare grava. Este transportata la spital");
			accidentare.accidentare(tipAccidentare);
		} else {
			this.next.tratareAccidentare(accidentare, tipAccidentare);
		}

	}

}
