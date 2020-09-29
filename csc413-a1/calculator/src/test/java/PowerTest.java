import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.Multiply;
import edu.csc413.calculator.operators.Power;
import org.junit.jupiter.api.Test;

public class PowerTest {
    @Test
    public void PowerTest1(){
        Operand num1 =  new Operand(5);
        Operand num2 =  new Operand(3);

        Power powerSign =  new Power();

        Operand powered = new Operand(powerSign.execute(num1,num2).getValue());

        assertThat(powered.getValue(), equalTo(125));
    }

    @Test
    public void PowerTest2(){
        Operand num1 =  new Operand(22);
        Operand num2 =  new Operand(3);

        Power powerSign =  new Power();

        Operand powered = new Operand(powerSign.execute(num1,num2).getValue());
        assertThat(powered.getValue(), equalTo(10648));
    }

    @Test
    public void PowerTest3(){
        Operand num1 =  new Operand(12);
        Operand num2 =  new Operand(5);

        Power powerSign =  new Power();

        Operand powered = new Operand(powerSign.execute(num1,num2).getValue());

        assertThat(powered.getValue(), equalTo(248832));
    }

    @Test
    public void precedenceTest(){
        assertThat(new Power().precedence(), equalTo(3));
    }
}
