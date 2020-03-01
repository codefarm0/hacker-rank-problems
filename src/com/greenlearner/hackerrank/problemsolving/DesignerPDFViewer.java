package com.greenlearner.hackerrank.problemsolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * <p>
 * Problem -
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
public class DesignerPDFViewer {
    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i =0; i< h.length; i++) {
            map.put((char) (97 + i), h[i]);
        }
        int max = Integer.MIN_VALUE;
        int length = word.length();
        for(char c: word.toCharArray()){
            int val = map.get(c);
            if(val > max){
                max = val;
            }
        }
        return max * length;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
