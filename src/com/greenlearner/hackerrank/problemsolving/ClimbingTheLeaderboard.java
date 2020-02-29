package com.greenlearner.hackerrank.problemsolving;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * <p>
 * Problem - https://www.hackerrank.com/challenges/climbing-the-leaderboard/
 */
public class ClimbingTheLeaderboard {
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int totalScoreLength = scores.length;
        int[] rankings = new int[totalScoreLength];

        rankings[0] = 1;
        for (int i = 1; i < totalScoreLength; i++) {

            if (scores[i] == scores[i - 1]) {
                rankings[i] = rankings[i - 1];
            } else {
                rankings[i] = rankings[i - 1] + 1;
            }
        }
        int[] result = new int[alice.length];
        for (int i = 0; i < alice.length; i++) {

           int aliceScore = alice[i];
           if(aliceScore > scores[0]){
               result[i]=1;//top
           }else if(aliceScore < scores[scores.length-1]){
               result[i] = rankings[rankings.length-1]+1;//bottom
           }else{
                int n = binarySearchForIndex(scores, 0, scores.length-1, aliceScore);
                result[i]=rankings[n];
           }
        }
        return result;
    }

    private static int binarySearchForIndex(int[] scores, int low, int high, int aliceScore) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (scores[mid] == aliceScore) {
                return mid;
            } else if (scores[mid] < aliceScore && aliceScore < scores[mid - 1]) {
                return mid;
            } else if (scores[mid] > aliceScore && aliceScore >= scores[mid + 1]) {
                return mid + 1;
            } else if (scores[mid] < aliceScore) {
                high = mid - 1;
            } else if (scores[mid] > aliceScore) {
                low = mid + 1;
            }
        }
        return -1;//it's never gonna be the case. If it's then runtime exception
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

