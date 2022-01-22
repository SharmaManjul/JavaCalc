package com.manjul.JavaCalc;

public class MathEngine {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    public double getLeftVal(){return leftVal;}
    public void setLeftVal(double leftVal){this.leftVal = leftVal;}
    public double getRightVal(){return rightVal;}
    public void setRightVal(double rightVal){this.rightVal = rightVal;}
    public char getOpCode(){return opCode;}
    public void setOpCode(char opCode){this.opCode = opCode;}
    public double getResult(){return result;}

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
