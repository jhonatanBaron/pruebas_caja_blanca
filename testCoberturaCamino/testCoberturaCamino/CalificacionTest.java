package testCoberturaCamino;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import co.edu.uptc.classes.Calificacion;

@DisplayName("Calificacion class tests")
public class CalificacionTest {

    private Calificacion calificacion = new Calificacion();

    @Test
    @DisplayName("Test for an 'Excelente' calificacion")
    public void testExcelente() {
        String result = calificacion.calificacion(10, 10, 10);
        assertEquals("Excelente", result);
    }

    @Test
    @DisplayName("Test for a 'Buena' calificacion")
    public void testBuena() {
        String result = calificacion.calificacion(8, 8, 8);
        assertEquals("Buena", result);
    }

    @Test
    @DisplayName("Test for an 'Aceptable' calificacion")
    public void testAceptable() {
        String result = calificacion.calificacion(7, 7, 7);
        assertEquals("Aceptable", result);
    }

    @Test
    @DisplayName("Test for a 'Reprobado' calificacion")
    public void testReprobado() {
        String result = calificacion.calificacion(5, 5, 5);
        assertEquals("Reprobado", result);
    }
}