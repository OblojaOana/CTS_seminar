package ro.ase.csie.cts.tema3.factory;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.tema3.interfata.InterfataServer;

public class TestFactory {

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
	public void testFactoryCreateTypeServerRight() {
		InterfataServer server = ServerFactory.createServer(TipServer.SERVER_BAZA_DE_DATE);
		int portAsteptat = 5000;
		assertEquals("Porturile sunt egale", portAsteptat, server.getPort());

	}

}
