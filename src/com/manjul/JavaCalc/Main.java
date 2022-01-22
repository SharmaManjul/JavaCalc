package com.manjul.JavaCalc;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Initial comment to test start of JavaCalc.
        System.out.println("Hello world! This is the best practice java calculator.");

        MathEngine[] values = new MathEngine[4];
        values[0] = creater(100.0d, 50.0d, 'd');
        values[1] = creater(25.0d, 92.0d, 'a');
        values[2] = creater(225.0d, 17.0d, 's');
        values[3] = creater(11.0d, 3.0d, 'm');

        for (MathEngine value : values) {
            value.calculate();
            System.out.print("The result of your calculations is: ");
            System.out.println(value.getResult());
        }
    }

    public static MathEngine creater(double leftVal, double rightVal, char opCode){
        MathEngine value = new MathEngine();
        value.setLeftVal(leftVal);
        value.setRightVal(rightVal);
        value.setOpCode(opCode);
        return value;
    }
}
