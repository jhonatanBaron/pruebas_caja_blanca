package testCoberturaCamino;

import co.edu.uptc.classes.Factorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {

    @Test
    public void testFactorial() {
        Factorial f = new Factorial();
        assertEquals(1, f.factorial(0));
        assertEquals(1, f.factorial(1));
        assertEquals(2, f.factorial(2));
        assertEquals(6, f.factorial(3));
        assertEquals(24, f.factorial(4));
        assertEquals(120, f.factorial(5));
        assertEquals(720, f.factorial(6));
    }
    
    @Test
    public void testFactorialNegativeInput() {
        Factorial f = new Factorial();
        assertEquals(0.0, f.factorial(-1));
    }
}
