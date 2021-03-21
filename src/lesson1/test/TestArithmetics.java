package lesson1.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArithmetics {
    @Test
    public void testAdd() {
        Arithmetics a = new Arithmetics();
        double resultAdd = a.add(7.0, 13.0);
        if (resultAdd != 20.0) Assertions.fail("Error add method");
    }

    @Test
    public void testDeduct() {
        Arithmetics a = new Arithmetics();
        double resultDeduct = a.deduct(7.0, 13.0);
        if (resultDeduct != -6.0) Assertions.fail("Error deduct method");
    }

    @Test
    public void testMult() {
        Arithmetics a = new Arithmetics();
        double resultMult = a.mult(7.0, 13.0);
        if (resultMult != 91.0) Assertions.fail("Error mult method");
    }

    @Test
    public void testDiv() {
        Arithmetics a = new Arithmetics();
        double resultDiv = a.div(20.0, 4.0);
        if (resultDiv != 5.0) Assertions.fail("Error div method");
    }
}
