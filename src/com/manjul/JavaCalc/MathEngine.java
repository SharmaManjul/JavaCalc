package com.manjul.JavaCalc;

public class MathEngine {
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;

    public void calculate(){
        switch (opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode : assigning 0 value to result.");
                result = 0.0d;
                break;
        }
    }
}
