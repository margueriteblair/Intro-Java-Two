package com.inheritanceproj;

public class TaxReport {
    private TaxCalculator calculator;

    // public TaxReport(TaxCalculator calculator) {
    //     this.calculator = calculator; //we're injecting the dependency via  a construcotr;
    // }

    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    // public void setCalculator(TaxCalculator calculator) {
    //     this.calculator = calculator;
    // }
}