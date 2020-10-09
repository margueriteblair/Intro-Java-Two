public class javaifs {
    public static void main(String[] args) {
        int temp = 13;
        if (temp > 30) {
            System.out.println("It's a hot day!");
            System.out.println("Make sure to drink water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day, perfect weather.");
        } else {
            System.out.println("It's chilly!");
        }
    }
}