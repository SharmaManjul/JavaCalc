package com.manjul.JavaCalc;

//ABSTRACTION

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    /*
     ENCAPSULATION:
     Process of wrapping code & data into a single unit in a way that hides and controls the data while making the class
     easy to test.
     Getters and setters here allow us to control and hide the left, right and opCode variables. Only using a getter for
     the result allows us to protect the final data and restrict any other class from accessing it.
    */
    public double getLeftVal(){return leftVal;}
    public void setLeftVal(double leftVal){this.leftVal = leftVal;}
    public double getRightVal(){return rightVal;}
    public void setRightVal(double rightVal){this.rightVal = rightVal;}
    public char getOpCode(){return opCode;}
    public void setOpCode(char opCode){this.opCode = opCode;}
    public double getResult(){return result;}
    public void setResult(double result){this.result = result;}

    public CalculateBase(){}
    public CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }
    public abstract void calculate();
}
