package com.inheritanceproj;

public class App {
    public static void main(String[] args) throws Exception {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
        report.show(new TaxCalculator2019()); //method injection
        //we pass an injection to the method that needs that dependency

        report.setCalculator(new TaxCalculator2019());
    }
    //coupling to an interface is far less than coupling to a class
    //its not ideal to create big fat interfaces
    //smaller, lightweight interfaces are ideal for loosely coupled code
}
