import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator myCalculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(6, myCalculator.add(4,2));
    }
    @Test
    public void canSubtract(){
        assertEquals(3, myCalculator.subtract(6, 3));
    }
    @Test
    public void canMultiply(){
        assertEquals(15, myCalculator.multiply(5,3));
    }
    @Test
    public void canDivide(){
        assertEquals(5.0, myCalculator.divide(15.0, 3.0), 0.0);
    }
}
