import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Evaluator;
import edu.csc413.calculator.exceptions.InvalidExpressionException;
import org.junit.jupiter.api.Test;

public class EvaluatorTest {
    @Test
    public void addTest() throws InvalidExpressionException {
        String exp = "4+15";
        Evaluator evaluate = new Evaluator();

        int sum = evaluate.evaluateSimpleExpression(exp);

        assertThat(sum, equalTo(19));
    }

    @Test
    public void subtractTest() throws InvalidExpressionException {
        String exp = "40-6";
        Evaluator evaluate = new Evaluator();

        int diff = evaluate.evaluateSimpleExpression(exp);

        assertThat(diff, equalTo(34));
    }

    @Test
    public void multiplyTest() throws InvalidExpressionException {
        String exp = "20*4";
        Evaluator evaluate = new Evaluator();


        int product = evaluate.evaluateSimpleExpression(exp);


        assertThat(product, equalTo(80));
    }


    @Test
    public void divideTest() throws InvalidExpressionException {
        String exp = "99/9";
        Evaluator evaluate = new Evaluator();

        int dividend = evaluate.evaluateSimpleExpression(exp);

        assertThat(dividend, equalTo(11));
    }

    @Test
    public void powerTest() throws InvalidExpressionException {
        String exp = "4^6";
        Evaluator evaluate = new Evaluator();

        int powered = evaluate.evaluateSimpleExpression(exp);

        assertThat(powered, equalTo(4096));
    }

    @Test
    public void expTest1() throws InvalidExpressionException {
        String exp = "6/2*4";
        Evaluator evaluate = new Evaluator();

        int result = evaluate.evaluateSimpleExpression(exp);

        assertThat(result, equalTo(12));
    }

    @Test
    public void expTest2() throws InvalidExpressionException {
        String exp = "12+4^3";
        Evaluator evaluate = new Evaluator();

        int result = evaluate.evaluateSimpleExpression(exp);

        assertThat(result, equalTo(76));
    }

    @Test
    public void expTest3() throws InvalidExpressionException {
        String exp = "6+1-2*3";
        Evaluator evaluate = new Evaluator();
        int result = evaluate.evaluateSimpleExpression(exp);
        assertThat(result, equalTo(1));
    }

}
