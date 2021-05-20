package cts.obloja.oana.as.pattern.chain;

public class AccidentareUsoara extends AccidentareHandler {

	@Override
	public void tratareAccidentare(Accidentare accidentare, TipAccidentare tipAccidentare) {
		if (tipAccidentare.USOARA == TipAccidentare.USOARA) {
			System.out.println("Este o accidentare usoara. Se trateaza");
			accidentare.accidentare(tipAccidentare);
		} else {
			this.next.tratareAccidentare(accidentare, tipAccidentare);
		}
	}

}
