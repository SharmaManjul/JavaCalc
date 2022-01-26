package com.manjul.JavaCalc;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class CalculatorHelper {
    //Using static final so the symbol cannot be change by anyone or anywhere after initialization.
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';

    MathCommand command;
    double leftValue;
    double rightValue;
    double result;

    public void process (String statements) throws InvalidStatementException{
        //This will receive parameter: "divide 100.0 50.0"
        String[] parts = statements.split(" ");

        if (parts.length != 3)
            throw new InvalidStatementException("Incorrect Number of fields", statements); //Throwing custom exception.

        String commandString = parts[0]; //Expected value of command is add, subtract, divide or multiply.

        try {
            leftValue = Double.parseDouble(parts[1]); //Convert string literal to double.
            rightValue = Double.parseDouble(parts[2]); //Convert string literal to double.
        } catch (NumberFormatException e){
            throw new InvalidStatementException("Non-numeric data", statements, e); //Throwing custom exception.
        }

        setCommandFromString(commandString);
        if (command == null)
            throw new InvalidStatementException("Invalid Command", statements); //Throwing custom exception.

        CalculateBase calculator = null;
        switch (command){
            case Add:
                calculator = new Adder(leftValue,rightValue);
                break;
            case Subtract:
                calculator = new Subtracter(leftValue,rightValue);
                break;
            case Multiply:
                calculator = new Multiplier(leftValue,rightValue);
                break;
            case Divide:
                calculator = new Divider(leftValue,rightValue);
                break;
        }

        calculator.calculate();
        result = calculator.getResult();
    }

    private void setCommandFromString(String commandString){
        if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
        command = MathCommand.Divide;
    }

    @Override
    public String toString(){
        //This overridden method is responsible for build the expected output of form '1.0 + 2.0 = 3.0'
        char symbol = ' ';
        switch (command){
            case Add:
                symbol = ADD_SYMBOL;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
            case Divide:
                symbol = DIVIDE_SYMBOL;
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftValue);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append('=');
        sb.append(result);

        return sb.toString();
    }
}
