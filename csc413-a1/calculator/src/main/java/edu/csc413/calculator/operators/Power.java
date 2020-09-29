package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;
import java.lang.Math;

public class Power extends Operator {

    @Override
    public int precedence() {
        int precedenceLevel = 3;
        return precedenceLevel;
    }

    @Override
    public Operand execute(Operand lhs, Operand rhs) {
        int left = lhs.getValue();
        int right = rhs.getValue();
        int postOperation = (int)Math.round(Math.pow(left, right));
        Operand newOperand = new Operand(postOperation);
        return newOperand;
    }
}