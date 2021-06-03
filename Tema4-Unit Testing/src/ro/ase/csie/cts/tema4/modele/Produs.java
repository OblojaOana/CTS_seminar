package ro.ase.csie.cts.tema4.modele;

import java.util.ArrayList;

import ro.ase.csie.cts.tema4.exceptii.ExceptieNume;
import ro.ase.csie.cts.tema4.exceptii.ExceptiePret;
import ro.ase.csie.cts.tema4.exceptii.ExceptieVanzari;

/*
 * 
 * DISCLAIMER
 * 
 * Cele mai multe dintre metodele date au bug-uri si greseli de implementare
 * 
 * 
 * SPECS
 * 
 * nume - intre 5 si 200 caractere alfa-numerice (fara caractere speciale)
 * pret - intre [0.01, 100000)
 * valori in produseVanduteSaptamanal - intre [0, 1000]
 * 
 * 
 */

public class Produs {

	public static final int MIN_LUNGIME_NUME = 5;
	public static final int MAX_LUNGIME_NUME = 255;
	public static final float MIN_PRET = 0.01F;
	public static final float MAX_PRET = 100000F;
	public static final int MAX_PRODUSE_VANDUTE_SAPTAMANAL = 1000;

	private String nume;
	private float pret;
	private ArrayList<Integer> produseVanduteSaptamanal; // numar de produse vandute in fiecare saptamana

	public Produs(String nume, float pret) {
		this.nume = nume;
		this.pret = pret;
		this.produseVanduteSaptamanal = new ArrayList<Integer>();
	}

	public Produs(String nume, float pret, ArrayList<Integer> produseVandute)
			throws ExceptieNume, ExceptiePret, ExceptieVanzari {
		if (nume.length() < MIN_LUNGIME_NUME || nume.length() > MAX_LUNGIME_NUME) {
			throw new ExceptieNume();
		} else if (pret < MIN_PRET || pret > MAX_PRET) {
			throw new ExceptiePret();
		} else if (produseVandute == null || produseVandute.size() > MAX_PRODUSE_VANDUTE_SAPTAMANAL) {
			throw new ExceptieVanzari();
		} else {
			this.nume = nume;
			this.pret = pret;
			this.produseVanduteSaptamanal = produseVandute;
		}
	}

	public void setVanzari(ArrayList<Integer> produseVandute) throws ExceptieVanzari {
		if (this.produseVanduteSaptamanal == null) {
			throw new ExceptieVanzari();
		} else {
			this.produseVanduteSaptamanal = produseVandute;
		}
	}

	public String getName() {
		return this.nume;
	}

	public float getPret() {
		return this.pret;
	}

	public ArrayList<Integer> getProduseVanduteSaptamanal() {
		return produseVanduteSaptamanal;
	}

	public void setProduseVanduteSaptamanal(ArrayList<Integer> produseVanduteSaptamanal) {
		this.produseVanduteSaptamanal = produseVanduteSaptamanal;
	}

	public static int getMinLungimeNume() {
		return MIN_LUNGIME_NUME;
	}

	public static int getMaxLungimeNume() {
		return MAX_LUNGIME_NUME;
	}

	public static double getMinPret() {
		return MIN_PRET;
	}

	public static double getMaxPret() {
		return MAX_PRET;
	}

	public static int getMaxProduseVanduteSaptamanal() {
		return MAX_PRODUSE_VANDUTE_SAPTAMANAL;
	}

	public void adaugaSaptamana(int produseVandute) {
		produseVanduteSaptamanal.add(produseVandute);
	}

	public int getNrProduseVandute(int i) {
		return produseVanduteSaptamanal.get(i);
	}

	/*
	 * 
	 * 
	 * determina numarul de saptamani in care au fost vandute un numar de produse
	 * peste limita data
	 * 
	 */
	public int getNrSaptamaniPesteMedie(int minLimit) {
		int nrSaptamani = 0;
		for (int n : produseVanduteSaptamanal)
			if (n >= minLimit)
				nrSaptamani++;
		nrSaptamani++;
		return nrSaptamani;
	}

	/*
	 * 
	 * 
	 * determina procentul saptamanilor (din total saptamani) care au avut vanzari
	 * sub limita data
	 * 
	 */
	public int getProcentSaptamaniSlabe(int minLimit) {
		float m = 0;
		for (Integer n : produseVanduteSaptamanal)
			if (n > minLimit)
				m += n;

		return (int) (100 * m / this.produseVanduteSaptamanal.size());
	}

	/*
	 * 
	 * 
	 * 
	 * determina indexul saptamanilor cu vanzari maxime (mai multe saptamani pot
	 * avea vanzari la nivel maxim)
	 * 
	 * 
	 */

	public ArrayList<Integer> getIndexSaptamaniCuVanzariMaxime() {
		ArrayList<Integer> saptamaniMax = new ArrayList<>();
		int max = this.produseVanduteSaptamanal.get(0);

		for (int i = 0; i < this.produseVanduteSaptamanal.size(); i++)
			if (this.produseVanduteSaptamanal.get(i) > max)
				saptamaniMax.add(i);

		return saptamaniMax;
	}

	@Override
	public String toString() {
		String output = this.nume + " vanzari saptamanale: ";
		for (Integer n : produseVanduteSaptamanal)
			output += n + " ";
		return output;
	}
}