package com.manjul.JavaCalc;

public class MathEngine {
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

    /*
    Constructors: They help set the initial state of the class.
    P.S. There are multiple ways to set initial state of a class and they follow this order:
    Field Initialization <  Initialization Block < Constructor

    Overloading: A class can differentiate between its multiple constructors or methods using their unique signature
    which consists of their name, number and type of parameters.
     */
    public MathEngine(){}

    public MathEngine(char opCode){
        this.opCode = opCode;
    }

    public MathEngine(double leftVal, double rightVal, char opCode){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

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
