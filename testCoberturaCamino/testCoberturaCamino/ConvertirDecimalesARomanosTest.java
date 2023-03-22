package testCoberturaCamino;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import co.edu.uptc.classes.ConvertirDecimalesARomanos;

@DisplayName("Tests for ConvertirDecimalesARomanos")
class ConvertirDecimalesARomanosTest {

	private ConvertirDecimalesARomanos conversor = new ConvertirDecimalesARomanos();

	@Test
	@DisplayName("Test for millar")
	void testMillar() {
		assertEquals("M", conversor.convertirDecARomanos(1000));
		assertEquals("MM", conversor.convertirDecARomanos(2000));
		assertEquals("MMM", conversor.convertirDecARomanos(3000));
	}

	@Test
	@DisplayName("Tests for centenas")
	void testCentenas() {
		assertEquals("C", conversor.convertirDecARomanos(100));
		assertEquals("D", conversor.convertirDecARomanos(500));
		assertEquals("CD", conversor.convertirDecARomanos(400));
		assertEquals("CM", conversor.convertirDecARomanos(900));
		assertEquals("CCC", conversor.convertirDecARomanos(300));
		assertEquals("DC", conversor.convertirDecARomanos(600));
		assertEquals("DCCC", conversor.convertirDecARomanos(800));
	}

	@Test
	@DisplayName("Tests for decenas")
	void testDecenas() {
		assertEquals("X", conversor.convertirDecARomanos(10));
		assertEquals("L", conversor.convertirDecARomanos(50));
		assertEquals("XL", conversor.convertirDecARomanos(40));
		assertEquals("XC", conversor.convertirDecARomanos(90));
		assertEquals("XX", conversor.convertirDecARomanos(20));
		assertEquals("LX", conversor.convertirDecARomanos(60));
		assertEquals("LXXX", conversor.convertirDecARomanos(80));
	}

	@Test
	@DisplayName("Tests for unidades")
	void testUnidades() {
		assertEquals("I", conversor.convertirDecARomanos(1));
		assertEquals("V", conversor.convertirDecARomanos(5));
		assertEquals("IV", conversor.convertirDecARomanos(4));
		assertEquals("IX", conversor.convertirDecARomanos(9));
		assertEquals("III", conversor.convertirDecARomanos(3));
		assertEquals("VI", conversor.convertirDecARomanos(6));
		assertEquals("VIII", conversor.convertirDecARomanos(8));
	}
}