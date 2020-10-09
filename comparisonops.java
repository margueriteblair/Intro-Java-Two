public class comparisonops {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y); //returns a boolean exp

        int temp = 12;
        boolean isWarm = temp > 20 && temp < 30;

        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    }
}