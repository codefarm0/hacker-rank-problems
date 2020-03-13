package com.greenlearner.hackerrank.code30days;

import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * problem -
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */
public class HourGlass2DArray {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
    }
}
