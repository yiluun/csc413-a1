import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.Multiply;
import org.junit.jupiter.api.Test;

public class MultiplyTest {
    @Test
    public void MultiplyTest1(){
        Operand num1 =  new Operand(5);

        Operand num2 =  new Operand(14);

        Multiply multiplySign =  new Multiply();

        Operand product = new Operand(multiplySign.execute(num1,num2).getValue());

        assertThat(product.getValue(), equalTo(70));
    }

    @Test
    public void MultiplyTest2(){
        Operand num1 =  new Operand(321);
        Operand num2 =  new Operand(112);

        Multiply multiplySign =  new Multiply();

        Operand product = new Operand(multiplySign.execute(num1,num2).getValue());

        assertThat(product.getValue(), equalTo(35952));
    }

    @Test
    public void MultiplyTest3(){
        Operand num1 =  new Operand(142);
        Operand num2 =  new Operand(123);

        Multiply multiplySign =  new Multiply();

        Operand product = new Operand(multiplySign.execute(num1,num2).getValue());

        assertThat(product.getValue(), equalTo(17466));
    }

    @Test
    public void precedenceTest(){
        assertThat(new Multiply().precedence(), equalTo(2));
    }
}
