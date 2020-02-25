package com.greenlearner.hackerrank.java;

import java.util.Stack;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 * https://www.hackerrank.com/challenges/java-stack/problem?h_r=next-challenge&h_v=zen
 * Sample Input
 * <p>
 * {}()
 * ({()})
 * {}(
 * []
 * Sample Output
 * <p>
 * true
 * true
 * false
 * true
 */
public class JavaStack {
    public static void main(String[] args) {

        String input = "[]";
        if (isBalance(input)) {
            System.out.println("balanced");
        } else {
            System.out.println("no balance");
        }
    }

    static boolean isBalance(String input) {
        char[] arr = input.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if ('{' == c || '(' == c || '[' == c) {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && c != ')') ||
                        (top == '{' && c != '}') ||
                        (top == '[' && c != ']')
                ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

