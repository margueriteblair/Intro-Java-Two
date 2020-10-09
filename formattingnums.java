import java.text.NumberFormat;

public class formattingnums {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123456.789);
        System.out.println(result);

        String result2 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result2);
    }
}