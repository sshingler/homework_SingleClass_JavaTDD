import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void setup(){
        calculator = new Calculator(2.00, 4.00);
    }

    @Test
    public void hasNumber1(){
        assertEquals(2.00, calculator.getNumber1(), 0.01);
    }

    @Test
    public void hasNumber2(){
        assertEquals(4.00, calculator.getNumber2(), 0.01);
    }

    @Test
    public void canAdd(){
        assertEquals(6.00, calculator.addNumbers(), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(2.00, calculator.subtractNumbers(), 0.01);
    }

    @Test
    public void canMultiply(){
        assertEquals(8.00, calculator.multiplyNumbers(), 0.01);
    }

    @Test
    public void canDivide(){
        assertEquals(2.00, calculator.divideNumbers(), 0.01);
    }
}

