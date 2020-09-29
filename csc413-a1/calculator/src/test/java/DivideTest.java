import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.Divide;
import org.junit.jupiter.api.Test;

public class DivideTest {
    @Test
    public void DivideTest1(){
        Operand num1 =  new Operand(100);
        Operand num2 =  new Operand(25);

        Divide divideSign =  new Divide();

        // Dividend of two operands
        Operand dividing = new Operand(divideSign.execute(num1,num2).getValue());

        // import static org.hamcrest.MatcherAssert.assertThat;
        assertThat(dividing.getValue(), equalTo(4));
    }

    @Test
    public void DivideTest2(){
        Operand num1 =  new Operand(256);
        Operand num2 =  new Operand(128);

        Divide divideSign =  new Divide();

        Operand dividing = new Operand(divideSign.execute(num1,num2).getValue());

        assertThat(dividing.getValue(), equalTo(2));
    }

    @Test
    public void DivideTest3(){
        Operand num1 =  new Operand(5050);
        Operand num2 =  new Operand(50);

        Divide divideSign =  new Divide();

        Operand dividing = new Operand(divideSign.execute(num1,num2).getValue());

        assertThat(dividing.getValue(), equalTo(101));
    }

    @Test
    public void precedenceTest(){
        assertThat(new Divide().precedence(), equalTo(2));
    }
}
