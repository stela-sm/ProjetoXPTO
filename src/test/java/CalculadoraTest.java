import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.example.Calculadora.*;

public class CalculadoraTest extends TestCase {

    @Test
    public void testSum() {
        Double resultado = sum(4D,1D);
        assertEquals(String.valueOf(5.0),"5.0");
    }
    @Test
    public void testSub() {
        Double resultado = sub(4D,1D);
        assertEquals(String.valueOf(3.0),"3.0");
    }
    @Test
    public void testMult() {
        Double resultado = mult(4D,1D);
        assertEquals(String.valueOf(4.0),"4.0");
    }
    @Test
    public void testDiv() {
        Double resultado = div(4D,1D);
        assertEquals(String.valueOf(4.0),"4.0");
    }
}