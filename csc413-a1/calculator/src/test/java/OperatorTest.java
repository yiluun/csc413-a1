import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.csc413.calculator.operators.Add;
import edu.csc413.calculator.operators.Subtract;
import edu.csc413.calculator.operators.Multiply;
import edu.csc413.calculator.operators.Divide;
import edu.csc413.calculator.operators.Power;
import edu.csc413.calculator.operators.Operator;
import org.junit.jupiter.api.Test;

public class OperatorTest {
    @Test
    public void addOperatorTest() {
        Operator testSign = Operator.create("+");
        assertTrue(testSign instanceof Add);
    }

    @Test
    public void subtractOperatorTest() {
        Operator testSign = Operator.create("-");
        assertTrue(testSign instanceof Subtract);
    }

    @Test
    public void multiplyOperatorTest() {
        Operator testSign = Operator.create("*");
        assertTrue(testSign instanceof Multiply);
    }

    @Test
    public void divideOperatorTest() {
        Operator testSign = Operator.create("/");
        assertTrue(testSign instanceof Divide);
    }

    @Test
    public void powerOperatorTest() {
        Operator testSign = Operator.create("^");
        assertTrue(testSign instanceof Power);
    }
}
