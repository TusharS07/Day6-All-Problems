package com.bridgelabz.Day6AllLogicalPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n ;
        int sum = 0;
        System.out.print("Enter Any Number:- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //check the number is perfect or not
        //ex= ip number is 6 ----> 1.2.3.4.5 //less than 6 number
        //divide 6 by all number check wich number remender is zero
        //6---> 1+2+3=6 then 6 is perfect number // sum of number must be same as ip number

        for (int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum) {
            System.out.println(n+ "  is Perfect Number ");
        } else {
            System.out.println(n+ " is not Perfect Number ");
        }
    }
}
