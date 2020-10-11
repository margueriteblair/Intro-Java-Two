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


        // B = L[(1 + c)^n - (1 + c)^p] / [(1 + c)^n - 1]
        // L = principal
        // c = monthly rate
        // n = number of payments
        // p = number of payements made

        //Mosh's version

        final byte MONTHS_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal = getPrincipal(scanner);
        
        float annualRate = getAnnualRate(scanner);
        float monthlyRate = annualRate / PERCENT / MONTHS_YEAR;

        byte years = getYears(scanner);

        int numberOfPayments = years * MONTHS_YEAR;

        String mortgage = calculateMortgage(
                            principal,
                            monthlyRate,
                            numberOfPayments
        );

        String paymentSchedule = calculateSchedule(
                            principal,
                            monthlyRate,
                            numberOfPayments
        );

        System.out.println(createMessage("MORTGAGE", mortgage));
        System.out.println(createMessage("SCHEDULE BREAKDOWN", paymentSchedule));
        
        scanner.close();

    }

    public static int getPrincipal(Scanner scanner) {
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        if (principal >= 1_000 && principal <= 1_000_000) {
            return principal;
        } else {
            System.out.println("You must enter a value between $1,000 and $1,000,000");
            return getPrincipal(scanner);
        }
    }

    public static float getAnnualRate(Scanner scanner) {
        System.out.println("Annual interest rate: ");
        float annualRate = scanner.nextFloat();

        if (annualRate >= 1 && annualRate <= 30) {
            return annualRate;
        } else {
            System.out.println("Enter a value between 0 and 30%");
            return getAnnualRate((scanner));
        }
    }

    public static byte getYears(Scanner scanner) {
        System.out.println("Maturity date in years from today: ");
        byte years = scanner.nextByte();

        if(years >= 1 && years <= 30) {
            return years;
        } else {
            System.out.println("You must enter a value between 0 and 30 years.");
            return getYears((scanner));
        }
    }

    public static String calculateMortgage(
                    int principal, 
                    float monthlyRate, 
                    int numberOfPayments
                                ) {
    double mortgage = principal *
      (
        monthlyRate * 
        Math.pow(
          1 + monthlyRate, 
          numberOfPayments
        )
      ) / 
      (
        Math.pow(
          1 + monthlyRate, 
          numberOfPayments
        ) - 1);

    String mortgageInDollars = NumberFormat.getCurrencyInstance().format(mortgage);
    return mortgageInDollars;

}
public static String calculateSchedule(
    int principal, 
    float monthlyRate, 
    int numberOfPayments
  ) {
    String breakdown = "";
    
    for (int i = 0; i < numberOfPayments + 1; i++) {
      double balance = principal *
        (
          Math.pow(1 + monthlyRate,
            numberOfPayments  
          ) -
          Math.pow(1 + monthlyRate,
            i
          )
        ) / (
          Math.pow(1 + monthlyRate,
          numberOfPayments
        ) - 1
      );

      String balanceinCurrency = NumberFormat.getCurrencyInstance().format(balance);

      breakdown += balanceinCurrency + "\n";
    }

    return breakdown;
  }

  public static String createMessage(String message, String data) {
      int messageLength = message.length();
      String divider = "";
      for (int i = 0; i < messageLength;i++) {
          divider += "-";
      }

      String fullMessage = message+ "\n" + divider+ "\n" + data;

      return fullMessage;
  }

}