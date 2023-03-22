package testCoberturaCamino;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uptc.classes.SensacionTermica;

public class SensacionTermicaTest {

	@Test
	public void testHaceMuchoFrio() {
		SensacionTermica st = new SensacionTermica();
		assertEquals("Hace mucho frío.", st.sensacionTermica(-5));
	}

	@Test
	public void testHacePocoFrio() {
		SensacionTermica st = new SensacionTermica();
		assertEquals("Hace poco frío.", st.sensacionTermica(12));
	}

	@Test
	public void testTemperaturaNormal() {
		SensacionTermica st = new SensacionTermica();
		assertEquals("Hace una temperatura normal.", st.sensacionTermica(20));
	}

	@Test
	public void testHacePocoCalor() {
		SensacionTermica st = new SensacionTermica();
		assertEquals("Hace poco calor.", st.sensacionTermica(28));
	}

	@Test
	public void testHaceMuchoCalor() {
		SensacionTermica st = new SensacionTermica();
		assertEquals("Hace mucho calor.", st.sensacionTermica(35));
	}
}