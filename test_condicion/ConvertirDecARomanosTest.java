package co.edu.uptc.classes.test_condicion;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ConvertirDecARomanosTest {

    @Test
    public void testConvertirDecARomanos() {
        ConvertirDecARomanos converter = new ConvertirDecARomanos();

        // Pruebas para cubrir el 100% de la cobertura de condición
        assertEquals("I", converter.convertirDecARomanos(1)); // Prueba para unidades menor a 5
        assertEquals("IV", converter.convertirDecARomanos(4)); // Prueba para unidades igual a 4
        assertEquals("V", converter.convertirDecARomanos(5)); // Prueba para unidades igual a 5
        assertEquals("IX", converter.convertirDecARomanos(9)); // Prueba para unidades igual a 9
        assertEquals("X", converter.convertirDecARomanos(10)); // Prueba para decenas menor a 5
        assertEquals("XL", converter.convertirDecARomanos(40)); // Prueba para decenas igual a 4
        assertEquals("L", converter.convertirDecARomanos(50)); // Prueba para decenas igual a 5
        assertEquals("XC", converter.convertirDecARomanos(90)); // Prueba para decenas igual a 9
        assertEquals("C", converter.convertirDecARomanos(100)); // Prueba para centenas menor a 5
        assertEquals("CD", converter.convertirDecARomanos(400)); // Prueba para centenas igual a 4
        assertEquals("D", converter.convertirDecARomanos(500)); // Prueba para centenas igual a 5
        assertEquals("CM", converter.convertirDecARomanos(900)); // Prueba para centenas igual a 9
        assertEquals("M", converter.convertirDecARomanos(1000)); // Prueba para miles

        assertEquals("XXXVIII", converter.convertirDecARomanos(38)); // Prueba para una combinación de decenas, unidades y centenas
        assertEquals("LXXXIII", converter.convertirDecARomanos(83)); // Prueba para una combinación de decenas, unidades y centenas
        assertEquals("CCLXXXV", converter.convertirDecARomanos(285)); // Prueba para una combinación de decenas, unidades y centenas
        assertEquals("CDLXXXIX", converter.convertirDecARomanos(489)); // Prueba para una combinación de decenas, unidades y centenas
        assertEquals("CMXIV", converter.convertirDecARomanos(914)); // Prueba para una combinación de decenas, unidades y centenas
        assertEquals("MMMCCCXXV", converter.convertirDecARomanos(3325)); // Prueba para una combinación de decenas, unidades, centenas y miles