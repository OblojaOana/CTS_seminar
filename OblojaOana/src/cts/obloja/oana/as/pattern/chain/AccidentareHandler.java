package cts.obloja.oana.as.pattern.chain;

public abstract class AccidentareHandler {

	AccidentareHandler next = null;

	public abstract void tratareAccidentare(Accidentare accidentare, TipAccidentare tipAccidentare);

	public void setNext(AccidentareHandler next) {
		this.next = next;
	}

}
