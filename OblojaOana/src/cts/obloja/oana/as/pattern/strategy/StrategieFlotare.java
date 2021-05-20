package cts.obloja.oana.as.pattern.strategy;

public class StrategieFlotare implements IStrategieTrainer {

	@Override
	public void aplicaStrategie(Challenge challenge) {

		if (challenge.tipExercitiu.equals(TipExercitiu.FLOTARE)) {
			System.out.println("S-a ales strategia flotare");
		}
	}

}
