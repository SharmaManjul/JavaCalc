package com.manjul.JavaCalc;

public class Divider extends CalculateBase{
    public Divider(){}
    public Divider(double leftVal, double rightVal){
        //Accessing base class method from which Adder is inheriting.
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
