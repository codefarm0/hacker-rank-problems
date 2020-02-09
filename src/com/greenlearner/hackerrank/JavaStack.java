package com.greenlearner.hackerrank;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * https://www.hackerrank.com/challenges/java-stack/problem?h_r=next-challenge&h_v=zen
 * Sample Input
 *
 * {}()
 * ({()})
 * {}(
 * []
 * Sample Output
 *
 * true
 * true
 * false
 * true
 */
public class JavaStack {
    public static void main(String[] args) {

        String input = "{}()";
        char[] arr = input.toCharArray();
        for(int i= 0; i < arr.length/2; i++){
            if(arr[i] == arr[arr.length-1 - i]){

            }
        }
    }
}
