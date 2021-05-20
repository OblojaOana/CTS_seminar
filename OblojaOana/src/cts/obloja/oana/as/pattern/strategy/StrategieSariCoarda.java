package cts.obloja.oana.as.pattern.strategy;

public class StrategieSariCoarda implements IStrategieTrainer {

	@Override
	public void aplicaStrategie(Challenge challenge) {
		if (challenge.tipExercitiu.equals(TipExercitiu.COARDA)) {
			System.out.println("S-a ales strategia de sarit coarda");
		}

	}

}
