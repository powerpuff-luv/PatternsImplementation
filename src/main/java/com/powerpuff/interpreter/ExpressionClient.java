package com.powerpuff.interpreter;

import com.powerpuff.interpreter.expressions.AddExpression;
import com.powerpuff.interpreter.expressions.Expression;
import com.powerpuff.interpreter.expressions.NumberExpression;
import com.powerpuff.interpreter.expressions.SubtractExpression;

import java.util.Stack;

/**
 * Класс, демонстрирующий использование интерпретатора
 */
public class ExpressionClient {
    private static Expression parseExpression(String expression) {
        Stack<Expression> stack = new Stack<>();

        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.equals("+")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression add = new AddExpression(left, right);
                stack.push(add);
            } else if (token.equals("-")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression subtract = new SubtractExpression(left, right);
                stack.push(subtract);
            } else {
                Expression number = new NumberExpression(Integer.parseInt(token));
                stack.push(number);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "7 3 + 2 -"; // Обратная польская нотация
        Expression parsedExpression = parseExpression(expression);
        int result = parsedExpression.interpret();
        System.out.println("Result: " + result);
    }
}
