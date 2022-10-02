package com.bridgelabz.Day6AllLogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        int count = 0;
        System.out.print("Enter Any Number:- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //checking the number is prime or not
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(n + " is Prime Number ");
        } else {
            System.out.println(n + " is Not prime Number ");
        }

    }

}
