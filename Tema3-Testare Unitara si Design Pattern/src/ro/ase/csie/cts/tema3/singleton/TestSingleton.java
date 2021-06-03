package ro.ase.csie.cts.tema3.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSingleton {

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
	public void testReferinteAceleasiSingletonRight() {
		ConexiuneServer conexiuneServer1 = ConexiuneServer.getServer();
		ConexiuneServer conexiuneServer2 = ConexiuneServer.getServer();
		assertEquals("Cele 2 referinte sunt egale", conexiuneServer1, conexiuneServer2);
	}

}
