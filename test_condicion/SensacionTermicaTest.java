package co.edu.uptc.classes.test_condicion;

public class SensacionTermicaTest {

    @Test
    public void testSensacionTermicaMuchoFrio() {
        SensacionTermica st = new SensacionTermica();
        String resultado = st.sensacionTermica(5);
        assertEquals("Hace mucho frío.", resultado);
    }

    @Test
    public void testSensacionTermicaPocoFrio() {
        SensacionTermica st = new SensacionTermica();
        String resultado = st.sensacionTermica(12);
        assertEquals("Hace poco frío.", resultado);
    }

    @Test
    public void testSensacionTermicaNormal() {
        SensacionTermica st = new SensacionTermica();
        String resultado = st.sensacionTermica(22);
        assertEquals("Hace una temperatura normal.", resultado);
    }

    @Test
    public void testSensacionTermicaPocoCalor() {
        SensacionTermica st = new SensacionTermica();
        String resultado = st.sensacionTermica(28);
        assertEquals("Hace poco calor.", resultado);
    }

    @Test
    public void testSensacionTermicaMuchoCalor() {
        SensacionTermica st = new SensacionTermica();
        String resultado = st.sensacionTermica(35);
        assertEquals("Hace mucho calor.", resultado);
    }
}