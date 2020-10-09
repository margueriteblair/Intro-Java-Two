import java.text.NumberFormat;
import java.util.Scanner;

public class mortgagecalculator {
    public static void main(String[] args) {
        //Principal: 100,000
        //Annual interest rate: 3.92 expressed as a decimal
        //Period (years): 30
        //returns our monthly mortgage payments
        //M = P (r(1+r)^n)/((1+r)^n-1)
        //r should be your monthly interest rate
        // long principal = 100000;
        // int monthlyPayment;
        // double maturity = 30;
        // maturity = maturity * 12; //the number of months you'll be paying the loan
        // double r = 3.92;
        // r = r/ (double)100 /(double)12; //this is the monthly interest rate
        // maturity = (principal*(r*(Math.pow(1+r, maturity)))/(Math.pow((1+r), maturity) - 1));
        // System.out.println(maturity);

        //Mosh's version

        final byte MONTHS_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the principal amount?");
        int principalMosh = scanner.nextInt();
        while (principalMosh < 1000 || principalMosh > 1000000) {
            System.out.println("Please input a principal between $1000 and $1,000,000.");
            principalMosh = scanner.nextInt();
        }

        System.out.println("Annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        while(annualInterest <= 0 || annualInterest > 30) {
            System.out.println("Please input an interest rate between 0 and 30%.");
            annualInterest = scanner.nextFloat();
        }
        float monthlyInterest = annualInterest / PERCENT / MONTHS_YEAR;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        while (years <= 0 || years > 30) {
            System.out.println("Please input a maturity timeline between 0 and 30 years.");
            years = scanner.nextByte();
        }

        int numberOfPayments = years * MONTHS_YEAR;

        double mortgage = principalMosh
                        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) /
                        (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println(mortgageFormatted);

    }
}