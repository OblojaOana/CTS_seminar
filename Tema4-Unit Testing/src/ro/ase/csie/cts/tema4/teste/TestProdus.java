package ro.ase.csie.cts.tema4.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.tema4.exceptii.ExceptieNume;
import ro.ase.csie.cts.tema4.exceptii.ExceptiePret;
import ro.ase.csie.cts.tema4.exceptii.ExceptieVanzari;
import ro.ase.csie.cts.tema4.modele.Produs;

public class TestProdus {
//	static Student student;
//	static ArrayList<Integer> note;
//	static String numeInitial = "Gigel";
//	static int varstaInitiala = 21;
	static Produs produs;
	static Produs produsTotiConstructorii;
	static ArrayList<Integer> produseVandute;
	static String numeProdusInitial = "Telefon";
	static float pretProdusInitial = 2000F;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		produseVandute = new ArrayList<Integer>();
		produseVandute.add(10);
		produseVandute.add(12);
		produseVandute.add(2);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		produs = new Produs(numeProdusInitial, pretProdusInitial);
		produsTotiConstructorii = new Produs(numeProdusInitial, pretProdusInitial, produseVandute);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructorNumePretConformanceRight() {
		String nume = "Telefon";
		float pret = 2000F;
		assertEquals(pret, produs.getPret(), 0F);
		assertSame(nume, produs.getName());
	}

	@Test
	public void testConstructorTotiParametriiConformanceRight() {
		String nume = "Telefon";
		float pret = 2000F;
		assertEquals(pret, produsTotiConstructorii.getPret(), 0F);
		assertSame(nume, produsTotiConstructorii.getName());
		assertSame(produseVandute, produsTotiConstructorii.getProduseVanduteSaptamanal());
	}

	@Test
	public void testSetVanzariExistenceReferinteNoteNull() throws ExceptieVanzari {
		ArrayList<Integer> produseVanduteNou = null;
		produsTotiConstructorii.setVanzari(produseVanduteNou);
		assertEquals("Test cu referinta null pentru vanzari", produseVanduteNou,
				produsTotiConstructorii.getProduseVanduteSaptamanal());

	}

	@Test
	public void testContructorTotiParametriiExistence() throws ExceptieNume, ExceptiePret, ExceptieVanzari {
		String nume = "Buna";
		float pret = 0F;
		Produs produsNou = new Produs(nume, pret, produseVandute);
		assertEquals("Pret", pret, produsNou.getPret(), 0F);
		assertSame("Nume", nume, produsNou.getName());
		assertSame(produseVandute, produsNou.getProduseVanduteSaptamanal());

	}

}
