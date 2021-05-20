package cts.obloja.oana.as.pattern.strategy;

public class StrategieSalturi implements IStrategieTrainer {

	@Override
	public void aplicaStrategie(Challenge challenge) {

		if (challenge.tipExercitiu.equals(TipExercitiu.SALTURI)) {
			System.out.println("S-a ales strategia salturi");
		}
	}

}
