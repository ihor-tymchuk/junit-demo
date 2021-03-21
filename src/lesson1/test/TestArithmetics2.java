package lesson1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArithmetics2 {
    @Test
    public void testAdd() {
        Arithmetics a = new Arithmetics();
        double result = a.add(7.0, 13.0);
        Assertions.assertEquals(result, 20.0);
//        Assertions.assertTrue(result == 20.0);
//        Assertions.assertFalse(result == 21.0);
        Assertions.assertNotEquals(result, 21.0);
        Assertions.assertNotNull(a);
        Assertions.assertNull(null);
    }

    @Test
    public void testDeduct() {
        Arithmetics a = new Arithmetics();
        double result = a.deduct(7.0, 13.0);
        Arithmetics b = new Arithmetics();
        double result2 = a.deduct(7, 13);
        Assertions.assertEquals(result, -6.0);
        Assertions.assertSame(a, a);
    }

    @Test
    public void testMult() {
        Arithmetics a = new Arithmetics();
        double result = a.mult(7.0, 13.0);
        Assertions.assertEquals(result, 91.0);
    }

    @Test
    public void testDiv() {
        Arithmetics a = new Arithmetics();
        double result = a.div(20.0, 4.0);
        Assertions.assertEquals(result, 5.0);
    }
}
