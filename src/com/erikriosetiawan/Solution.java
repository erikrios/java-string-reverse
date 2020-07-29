package com.erikriosetiawan;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char[] reverse = new char[A.length()];
        for (int i = 0; i < A.length(); i++) {
            reverse[i] = A.charAt(A.length() - 1 - i);
        }

        System.out.println(A.equals(String.valueOf(reverse)) ? "Yes" : "No");
    }
}
