import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] numbers2 = {1, 2, 3, 4, 5};
        Arrays.sort(numbers); //this will sort the array for us
        System.out.println(numbers2.length);
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));
        
    }
}