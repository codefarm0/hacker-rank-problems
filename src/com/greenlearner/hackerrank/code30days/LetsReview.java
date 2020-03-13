package com.greenlearner.hackerrank.code30days;

import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * Problem -
 * https://www.hackerrank.com/challenges/30-review-loop/problem
 */
public class LetsReview {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] inputs = new String[n];
        for(int i=0;i<n;i++){
            inputs[i]=scanner.nextLine();
        }

        processInputStrings(inputs,n);
        scanner.close();
    }

    private static void processInputStrings(String[] inputs, int n) {

        for(int i =0; i< n; i++){
            char all[]=inputs[i].toCharArray();
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();
            for(int j=0;j<all.length;j++){
                if(j %2 ==0){
                    even.append(all[j]);
                }else{
                    odd.append(all[j]);
                }
            }
            System.out.println(even + "  "+odd);
        }
    }
}
