package com.greenlearner.hackerrank.java;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        String input = "   ";//""He is a very very good boy, isn't he?";
        if(input.trim().isEmpty()){
            System.out.println(0);
        }else{
            String[] split = input.trim().split("[ !,?._'@]+");
            System.out.println(split.length);
            for(String s: split){
                System.out.println(s);
            }
        }

    }
}
