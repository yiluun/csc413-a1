package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class Divide extends Operator {

    @Override
    public int precedence() {
        int precedenceLevel = 2;
        return precedenceLevel;
    }

    @Override
    public Operand execute(Operand lhs, Operand rhs) {
        int left = lhs.getValue();
        int right = rhs.getValue();
        int postOperation = left / right;
        Operand newOperand = new Operand(postOperation);
        return newOperand;
    }
}