package com.greenlearner.hackerrank.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 *
 * Problem statement :-
 *
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?h_r=next-challenge&h_v=zen
 */

public class CatAndMouse {
    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {

        int catA = Math.abs(z-x);
        int catB = Math.abs(y-z);
        if(catA==catB){//42,
            return "Mouse C";
        }else if(catA < catB){
            return "Cat A";
        }else{
            return "Cat B";
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            System.out.println(result);

        }

        scanner.close();
    }
}
