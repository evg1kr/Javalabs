import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculate() {
        var calc = new Calculator();

        // act
        double res = calc.Calculate(0,1);

        // assert
        assertEquals(0, res);
    }
    @Test
    void calculate1() {
        var calc = new Calculator();

        // act
        double res = calc.Calculate(3,6);

        // assert
        assertEquals((403.428), res,0.001);
    }
    @Test
    void calculate2() {
        var calc = new Calculator();

        // act
        double res = calc.Calculate(2,5);

        // assert
        assertEquals((148.403), res,0.001);
    }
}