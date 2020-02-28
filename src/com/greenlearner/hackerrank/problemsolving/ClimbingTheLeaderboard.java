package com.greenlearner.hackerrank.problemsolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * <p>
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/
 */
public class ClimbingTheLeaderboard {
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int totalScoreLength = scores.length;
        int[] rankings = new int[totalScoreLength];

        for (int i = 0; i < totalScoreLength; i++) {
            if (i == 0) {
                rankings[i] = 1;
                continue;
            }
            if (scores[i] == scores[i - 1]) {
                rankings[i] = rankings[i - 1];
            } else {
                rankings[i] = rankings[i - 1] + 1;
            }
        }
        int[] result = new int[alice.length];
        for (int i = 0; i < alice.length; i++) {

            int aliceRank = Integer.MAX_VALUE;
            int j = 0;
            while (j < scores.length) {
                if (alice[i] >= scores[j]) {
                    aliceRank = rankings[j];
                    break;
                } else {
                    aliceRank = rankings[j] + 1;
                }
                j++;
            }
            result[i] = aliceRank;

        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write("\n");
//            }
            System.out.println(result[i] + " ");
        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

