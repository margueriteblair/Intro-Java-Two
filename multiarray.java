import java.util.Arrays;

public class multiarray {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //this is single dimensional
        int[][] numbers2 = new int[2][3]; //two rows, three columns
        numbers2[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers2));
        //if you don't specifiy array val, it'll default to 0
        //you can also create multi dimensional arrays with nested curly braces

    }
}