package com.inheritanceproj;

public class TaxReport {
    private TaxCalculator calculator; //we want to make an instance of the interace TaxCalculator

    // public TaxReport(TaxCalculator calculator) {
    //     this.calculator = calculator; //we're injecting the dependency via  a construcotr;
    // }
            //this right here is constructor injection, as opposed to saying:
        //this.calculator = new TaxCalculator();

    public void show(TaxCalculator calculator) {
        this.calculator = calculator;
        //this right here!!! is method injection, we're injecting our dependencies within a method that belongs to this class
        //we can also inject depedencies into setter and constructors
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}