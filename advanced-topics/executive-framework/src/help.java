package com.margieblair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> test = new ArrayList<>();
        test.add(3);
        test.add(6);
        test.add(6);
        test.add(7);
        minimumBias(test);

        System.out.println(10.0/0);

    }


    public static void minimumBias(List<Integer> ratings) {
        int totalBias = 0;
        Integer[] ratingsStream = ratings.stream().sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(Arrays.stream(ratingsStream).toArray()));
        for (int i = 0; i < ratingsStream.length; i+=2) {
            System.out.println();
            totalBias += (ratingsStream[i+1] - ratingsStream[i]);
        }
        System.out.println(totalBias);
    }
}
