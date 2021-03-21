package lesson1.test;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;

public class TestArithmetics3 {
    private static Arithmetics a;

    @Rule
    public final ExpectedException ex = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT() {
        a = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double result = a.add(7.0, 13.0);
        Assertions.assertEquals(result, 20.0);
    }

    @Test
    public void testDeduct() {
        double result = a.deduct(7.0, 13.0);
        Assertions.assertEquals(result, -6.0);
    }


    @Test
    @Ignore
    public void testMult() {
        double result = a.mult(7.0, 13.0);
        Assertions.assertEquals(result, 91.0);
    }

    @Test
    public void testDiv() {
        double result = a.div(20.0, 4.0);
        Assertions.assertEquals(result, 5.0);
    }

    @Test
    public void testDivException() {
        ex.expect(ArithmeticException.class);
        a.div(20.0, 0);
    }

    @Test
    public void testTimeException() {
        while (true){

        }
    }
}
