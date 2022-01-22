package com.manjul.JavaCalc;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //Initial comment to test start of JavaCalc.
        System.out.println("Hello world! This is the best practice java calculator.");

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
}
