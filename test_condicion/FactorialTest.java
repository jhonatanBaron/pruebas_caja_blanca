package co.edu.uptc.classes.test_condicion;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial fact = new Factorial();

        // Pruebas para cubrir el 100% de la cobertura de condición
        assertEquals(1, fact.factorial(0), 0); // Caso base
        assertEquals(1, fact.factorial(1), 0); // Caso base
        assertEquals(2, fact.factorial(2), 0); // Prueba de la primera iteración del bucle
        assertEquals(6, fact.factorial(3), 0); // Prueba de la segunda iteración del bucle
        assertEquals(24, fact.factorial(4), 0); // Prueba de la tercera iteración del bucle
    }
}