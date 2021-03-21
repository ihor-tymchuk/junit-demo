package lesson1.test;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;

public class TestArithmetics3 {
    private static Arithmetics a;

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

    @Test(timeout=1000)
    public void testTimeException() {
        while (true){

        }
    }
}
