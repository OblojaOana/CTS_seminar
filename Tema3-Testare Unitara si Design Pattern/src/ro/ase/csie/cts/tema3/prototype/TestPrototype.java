package ro.ase.csie.cts.tema3.prototype;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPrototype {

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
	public void testClonePrototypeRight() throws CloneNotSupportedException {
		Server server = new Server("localhost", 5000, 1);
		Server server1 = (Server) server.clone();
		assertEquals("Cele 2 servere sunt egale", server.getAdresaIp(), server1.getAdresaIp());
	}

}
