import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Operand;
import org.junit.jupiter.api.Test;

public class OperandTest {
    @Test
    public void getValue_fromInt() {
        Operand operand = new Operand(4);
        assertThat(operand.getValue(), equalTo(4));
    }

    @Test
    public void getValue_fromInt_negative() {
        Operand operand = new Operand(-6);
        assertThat(operand.getValue(), equalTo(-6));
    }

    @Test
    public void getValue_fromString() {
        Operand operand = new Operand("8");
        assertThat(operand.getValue(), equalTo(8));
    }

    @Test
    public void getValue_fromString_negative() {
        Operand operand = new Operand("-2");
        assertThat(operand.getValue(), equalTo(-2));
    }

    @Test
    public void isValid_true() {
        assertThat(Operand.isValid("15"), equalTo(true));
    }

    @Test
    public void isValid_negative() {
        assertThat(Operand.isValid("-4"), equalTo(true));
    }

    @Test
    public void isValid_letter() {
        assertThat(Operand.isValid("hz"), equalTo(false));
    }

    @Test
    public void isValid_specialCharacter() {
        assertThat(Operand.isValid("$"), equalTo(false));
    }

    @Test
    public void isValid_decimal() {
        assertThat(Operand.isValid("1.7"), equalTo(false));
    }
}
