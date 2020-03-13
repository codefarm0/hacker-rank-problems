package com.greenlearner.hackerrank.code30days;

import java.util.Scanner;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //we can use Integer.toBinaryString(n) also
        int[] binary=new int[n];
        int index=0;
        while(n>0){
            binary[index++]=n%2;
            n=n/2;
        }
        //print binary number
//        for(int i = index-1;i >= 0;i--){
//            System.out.print(binary[i]);
//        }
        int max1Sofar = 0;
        int count = 0;
        for(int i = index-1;i >= 0;i--){
            if(binary[i]==1){
                count++;
            }else{
                count=0;
            }
            if(max1Sofar < count){
                max1Sofar=count;
            }
        }
        System.out.println(max1Sofar);
        scanner.close();
    }
}
