package cts.obloja.oana.as.pattern.chain;

public class Accidentare implements IAccidentare {

	@Override
	public void accidentare(TipAccidentare tipAccidentare) {
		System.out.println("Pacientul a suferit o accidentare " + tipAccidentare.toString());

	}

}
