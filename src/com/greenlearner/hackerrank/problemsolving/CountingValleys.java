package com.greenlearner.hackerrank.problemsolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 *
 * Sample Input
 * 8
 * UDDDUDUU
 * Sample Output
 * 1
 */
public class CountingValleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    int valley = 0;
    int altitude = 0;

    for(int i = 0; i<n; i++){
        char ch = s.charAt(i);
        if(ch == 'U'){
            altitude ++;
            if(altitude ==0){
                valley++;
            }
        }else{
            altitude--;
        }
    }
    return valley;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
