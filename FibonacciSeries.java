package com.bridgelabz.Day6AllLogicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int term;
        int a = 0;
        int b = 1;
        int c;

        System.out.print("Enter Term:- ");
        Scanner sc = new Scanner(System.in);
        term =sc.nextInt();

        for (int i = 1; i <= term; i++) {
            System.out.print(a+ "  ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
