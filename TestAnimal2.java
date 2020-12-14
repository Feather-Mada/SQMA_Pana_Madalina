package eu.ase.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.ase.clases.Animal;

public class TestAnimal2 {

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
	public void testVerifAge() {
		
		Animal x=new Animal();
		try {
			x.isOld(-4);
			fail("not throwing exception");
		}catch(Exception e) {
			assertTrue(true);
		}
	}

}
