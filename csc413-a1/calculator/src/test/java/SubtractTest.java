import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.Subtract;
import org.junit.jupiter.api.Test;

public class SubtractTest {
    @Test
    public void SubtractTest1(){
        Operand num1 =  new Operand(53);
        Operand num2 =  new Operand(12);

        Subtract subtractSign =  new Subtract();
        Operand product = new Operand(subtractSign.execute(num1,num2).getValue());

        assertThat(product.getValue(), equalTo(41));
    }

    @Test
    public void SubtractTest2(){
        Operand num1 =  new Operand(532);

        Operand num2 =  new Operand(234);

        Subtract subtractSign =  new Subtract();

        Operand product = new Operand(subtractSign.execute(num1,num2).getValue());

        assertThat(product.getValue(), equalTo(298));
    }

    @Test
    public void SubtractTest3(){
        Operand num1 =  new Operand(4212);

        Operand num2 =  new Operand(1231);

        Subtract subtractSign =  new Subtract();

        Operand product = new Operand(subtractSign.execute(num1,num2).getValue());
        assertThat(product.getValue(), equalTo(2981));
    }

    @Test
    public void precedenceTest(){
        assertThat(new Subtract().precedence(), equalTo(1));
    }
}
