package cts.obloja.oana.as.pattern.chain;

public class AccidentareMedie extends AccidentareHandler {

	@Override
	public void tratareAccidentare(Accidentare accidentare, TipAccidentare tipAccidentare) {
		if (tipAccidentare.MEDIE == TipAccidentare.MEDIE) {
			System.out.println("Este o accidentare medie. Se trateaza");
			accidentare.accidentare(tipAccidentare);
		} else {
			this.next.tratareAccidentare(accidentare, tipAccidentare);
		}

	}

}
