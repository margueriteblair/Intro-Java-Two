public class simplifyifs {
    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome = income > 100_000;
        //most simple and elegant way to implement this

        //ternary operators
        String className = income > 100_000 ? "First" : "Economy";
        // if (income > 100_000) {className = "first";}
        // else {className = "economy";}
        System.out.println(className);



    }
}