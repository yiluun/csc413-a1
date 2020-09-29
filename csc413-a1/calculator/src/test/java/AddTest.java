import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.Add;
import org.junit.jupiter.api.Test;

public class AddTest {
    @Test
    public void addTest1(){

        Operand num1 =  new Operand(3);

        Operand num2 =  new Operand(27);

        Add addSign =  new Add();

        Operand sum = new Operand(addSign.execute(num1,num2).getValue());

        assertThat(sum.getValue(), equalTo(30));
    }

    @Test
    public void addTest2(){
        Operand num1 =  new Operand(332);

        Operand num2 =  new Operand(115);

        Add addSign =  new Add();

        Operand sum = new Operand(addSign.execute(num1,num2).getValue());

        assertThat(sum.getValue(), equalTo(447));
    }

    @Test
    public void addTest3(){
        Operand num1 =  new Operand(1255);

        Operand num2 =  new Operand(6662);

        Add addSign =  new Add();

        Operand sum = new Operand(addSign.execute(num1,num2).getValue());

        assertThat(sum.getValue(), equalTo(7917));
    }

    @Test
    public void precedenceTest(){
        assertThat(new Add().precedence(), equalTo(1));
    }
}
