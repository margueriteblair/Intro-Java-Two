public class mortgagecalculator {
    public static void main(String[] args) {
        //Principal: 100,000
        //Annual interest rate: 3.92 expressed as a decimal
        //Period (years): 30
        //returns our monthly mortgage payments
        //M = P (r(1+r)^n)/((1+r)^n-1)
        //r should be your monthly interest rate
        long principal = 100000;
        int monthlyPayment;
        double maturity = 30;
        maturity = maturity * 12; //the number of months you'll be paying the loan
        double r = 3.92;
        r = r/ (double)100 /(double)12; //this is the monthly interest rate
        maturity = (principal*(r*(Math.pow(1+r, maturity)))/(Math.pow((1+r), maturity) - 1));
        System.out.println(maturity);
    }
}