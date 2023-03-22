package testCoberturaCamino;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uptc.classes.Principal;

public class PrincipalTest {

    @Test
    public void testMostrarCalificacion_TC1() {
        Principal p = new Principal();
        String expectedOutput = "Excelente";
        String actualOutput = p.mostrarCalificacion(10, 10, 10);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMostrarCalificacion_TC2() {
        Principal p = new Principal();
        String expectedOutput = "Buena";
        String actualOutput = p.mostrarCalificacion(8, 8, 8);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMostrarCalificacion_TC3() {
        Principal p = new Principal();
        String expectedOutput = "Aceptable";
        String actualOutput = p.mostrarCalificacion(7, 7, 7);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testMostrarCalificacion_TC4() {
        Principal p = new Principal();
        String expectedOutput = "Reprobado";
        String actualOutput = p.mostrarCalificacion(6, 6, 6);
        assertEquals(expectedOutput, actualOutput);
    }
}