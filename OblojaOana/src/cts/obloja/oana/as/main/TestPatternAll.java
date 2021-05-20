package cts.obloja.oana.as.main;

import cts.obloja.oana.as.pattern.builder.CursuriFitness;
import cts.obloja.oana.as.pattern.strategy.Challenge;
import cts.obloja.oana.as.pattern.strategy.StrategieFlotare;
import cts.obloja.oana.as.pattern.strategy.StrategieSalturi;
import cts.obloja.oana.as.pattern.strategy.StrategieSariCoarda;
import cts.obloja.oana.as.pattern.strategy.TipExercitiu;

public class TestPatternAll {

	public static void main(String[] args) {
		// Testare STRATEGY
		Challenge challenge = new Challenge("Concurs1", TipExercitiu.COARDA);
		challenge.startExercitiu(100);
		challenge.setStrategieTrainer(new StrategieSariCoarda());
		challenge.acordaStrategie();

		challenge.setTipExercitiu(TipExercitiu.FLOTARE);
		challenge.setStrategieTrainer(new StrategieFlotare());
		challenge.acordaStrategie();

		challenge.setTipExercitiu(TipExercitiu.SALTURI);
		challenge.setStrategieTrainer(new StrategieSalturi());
		challenge.acordaStrategie();

		Challenge challenge1 = new Challenge("Concurs2", TipExercitiu.FLOTARE);
		challenge1.startExercitiu(200);
		challenge1.setStrategieTrainer(new StrategieFlotare());
		challenge1.acordaStrategie();

		challenge1.setTipExercitiu(TipExercitiu.FLOTARE);
		challenge1.setStrategieTrainer(new StrategieFlotare());
		challenge1.acordaStrategie();

		challenge1.setTipExercitiu(TipExercitiu.SALTURI);
		challenge1.setStrategieTrainer(new StrategieSalturi());
		challenge1.acordaStrategie();

		// TEST BUILDER

		CursuriFitness cursuriFitness = new CursuriFitness.CursuriFitnessBuilder().build();
	}

}
