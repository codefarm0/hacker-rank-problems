package com.greenlearner.hackerrank.problemsolving;

import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * <p>
 * Problem -
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 */
public class UtopianTree {

    static int utopianTree(int n) {
        int height = 1;//initial height of the sapling
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                //summer season
                height += 1;
            } else {
                //spring season
                height *= 2;
            }
        }
        return height;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);
            System.out.println(result);
//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}

