package com.powerpuff.interpreter.expressions;

/**
 * Класс для числового выражения
 */
public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
