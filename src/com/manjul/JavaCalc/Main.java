package com.manjul.JavaCalc;

import org.w3c.dom.html.HTMLDivElement;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Initial comment to test start of JavaCalc.
        System.out.println("Hello world! This is the best practice java calculator.");
        useMathEquation();
        useCalculatorBase();
        //Using the Calculator helper which takes inout of string and outputs a string.
        String[] statements = {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculatorHelper helper = new CalculatorHelper();

        for (String statement:statements){
            helper.process(statement);
            System.out.println(helper);
        }


    }

    static void useMathEquation(){
        MathEngine[] values = new MathEngine[4];
        values[0] = new MathEngine(100.0d, 50.0d, 'd');
        values[1] = new MathEngine(25.0d, 92.0d, 'a');
        values[2] = new MathEngine(225.0d, 17.0d, 's');
        values[3] = new MathEngine(11.0d, 3.0d, 'm');

        for (MathEngine value : values) {
            value.calculate();
            System.out.print("The result of your calculations is: ");
            System.out.println(value.getResult());
        }
    }

    static void useCalculatorBase(){
        System.out.println();
        System.out.println("Using calculators:");
        System.out.println();

        CalculateBase [] calculators = {
                new Adder(25.0d, 92.0d),
                new Divider(100.0d, 50.0d),
                new Multiplier(11.0d, 3.0d),
                new Subtracter(225.0d, 17.0d)
        };

        for (CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.println("Sum is: " + calculator.getResult());
        }
    }
}
