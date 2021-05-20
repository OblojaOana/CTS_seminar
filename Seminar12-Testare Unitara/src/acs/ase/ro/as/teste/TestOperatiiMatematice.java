package acs.ase.ro.as.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import acs.ase.ro.as.modele.OperatiiMatematice;

public class TestOperatiiMatematice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSumaValoriNormale() {
		int a = 5;
		int b = 6;
		int sumaAsteptata = 11;
		int sumaCalculata = OperatiiMatematice.suma(a, b);
		assertEquals("Test cu 5 si 6", sumaAsteptata, sumaCalculata);

	}

}