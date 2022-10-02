package com.bridgelabz.Day6AllLogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n,result;
        System.out.print("Enter Any Number:- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.print("Reverse Order:-");

        while (n > 0) {
            result = n % 10;
            n = n / 10;
            System.out.print(result);
        }
    }
}
