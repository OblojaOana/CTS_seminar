package cts.obloja.oana.as.pattern.builder;

public class CursuriFitness {

	private String numeAntrenor;
	private int durataCurs;
	private TipNivelDificultate nivelDificultate;
	private int numarMaximParticipanti;
	private ExercitiuAlergare alergare;
	private ExercitiuLaBanda banda;
	private ExcercitiuFlotare flotare;
	private ExercitiuSarituri sarituri;

	public CursuriFitness(String numeAntrenor, int durataCurs, TipNivelDificultate nivelDificultate,
			int numarMaximParticipanti, ExercitiuAlergare alergare, ExercitiuLaBanda banda, ExcercitiuFlotare flotare,
			ExercitiuSarituri sarituri) {
		super();
		this.numeAntrenor = numeAntrenor;
		this.durataCurs = durataCurs;
		this.nivelDificultate = nivelDificultate;
		this.numarMaximParticipanti = numarMaximParticipanti;
		this.alergare = alergare;
		this.banda = banda;
		this.flotare = flotare;
		this.sarituri = sarituri;
	}

	public CursuriFitness() {

	}

	@Override
	public String toString() {
		return "CursuriFitness [numeAntrenor=" + numeAntrenor + ", durataCurs=" + durataCurs + ", nivelDificultate="
				+ nivelDificultate + ", numarMaximParticipanti=" + numarMaximParticipanti + ", alergare=" + alergare
				+ ", banda=" + banda + ", flotare=" + flotare + ", sarituri=" + sarituri + "]";
	}

	public static class CursuriFitnessBuilder {
		CursuriFitness cursuriFitness = null;

		public CursuriFitnessBuilder() {
			cursuriFitness = new CursuriFitness();
		}

		public CursuriFitnessBuilder setNume() {
			this.cursuriFitness.numeAntrenor = "Bogdan";
			return this;
		}

		public CursuriFitnessBuilder setNivelDeDificultate() {
			this.cursuriFitness.nivelDificultate = TipNivelDificultate.AVANSAT;
			return this;
		}

		public CursuriFitnessBuilder setNumarMaximParticipanti() {
			this.cursuriFitness.numarMaximParticipanti = 100;
			return this;
		}

		public CursuriFitnessBuilder setExercitiuAlergare(ExercitiuAlergare alergare) {
			this.cursuriFitness.alergare = alergare;
			return this;
		}

		public CursuriFitnessBuilder setExercitiuFlotare(ExcercitiuFlotare flotare) {
			this.cursuriFitness.flotare = flotare;
			return this;
		}

		public CursuriFitnessBuilder setExercitiuBanda(ExercitiuLaBanda banda) {
			this.cursuriFitness.banda = banda;
			return this;
		}

		public CursuriFitnessBuilder setExercitiuSarituri(ExercitiuSarituri sarituri) {
			this.cursuriFitness.sarituri = sarituri;
			return this;
		}

		public CursuriFitness build() {
			return cursuriFitness;

		}

	}

}
