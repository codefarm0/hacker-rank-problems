package com.greenlearner.hackerrank.problemsolving;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class FormingAMagicSquare {
    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {

        int n = 3;
        int cost = Integer.MAX_VALUE;

        // all possible combination of magic arrays
        int[][][] allMagicSquares = {{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}, {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}, {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}}, {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}, {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}};

        for (int i = 0; i < n * n - 1; i++) {
            int difference = 0;
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    difference += Math.abs(allMagicSquares[i][x][y] - s[x][y]);
                }
            }
            if (difference < cost)
                cost = difference;
        }

        return cost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}