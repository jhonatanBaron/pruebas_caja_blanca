package co.edu.uptc.classes.test_condicion;

//public class CalificacionTest {
//}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalificacionTest {

    @Test
    public void testCalificacionExcelente() {
        Calificacion calificacion = new Calificacion();
        assertEquals("Excelente", calificacion.alificacion(10, 10, 10));
    }

    @Test
    public void testCalificacionBuena() {
        Calificacion calificacion = new Calificacion();
        assertEquals("Buena", calificacion.alificacion(8, 8, 8));
    }

    @Test
    public void testCalificacionAceptable() {
        Calificacion calificacion = new Calificacion();
        assertEquals("Aceptable", calificacion.alificacion(6, 7, 8));
    }

    @Test
    public void testCalificacionReprobado() {
        Calificacion calificacion = new Calificacion();
        assertEquals("Reprobado", calificacion.alificacion(4, 5, 6));
    }
}
