package cts.obloja.oana.as.pattern.strategy;

public class Challenge implements IChallenge {

	String numeChallenge;
	TipExercitiu tipExercitiu;

	IStrategieTrainer strategieTrainer = null;

	public Challenge(String numeChallenge, TipExercitiu tipExercitiu) {
		super();
		this.numeChallenge = numeChallenge;
		this.tipExercitiu = tipExercitiu;
	}

	@Override
	public void startExercitiu(int nrRepetitii) {
		System.out.println(String.format("Numarul de excercitii stabilete de trainer sunt %d", nrRepetitii));
	}

	public String getNumeChallenge() {
		return numeChallenge;
	}

	public void setTipExercitiu(TipExercitiu tipExercitiu) {
		this.tipExercitiu = tipExercitiu;
	}

	public TipExercitiu getTipExercitiu() {
		return tipExercitiu;
	}

	public void setStrategieTrainer(IStrategieTrainer strategieTrainer) {
		this.strategieTrainer = strategieTrainer;
	}

	public void acordaStrategie() {
		if (this.strategieTrainer != null) {
			this.strategieTrainer.aplicaStrategie(this);
			;
		} else {
			throw new UnsupportedOperationException();
		}

	}

}
