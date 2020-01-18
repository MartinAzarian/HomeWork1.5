package com.company;

public abstract class AbstractLongValue {
    private double number;


    public AbstractLongValue(double number) {
        this.number = number;
    }

    public AbstractLongValue() {
    }


    public abstract void printConverter();

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
