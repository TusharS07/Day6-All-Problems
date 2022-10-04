package com.bridgelabz.Day6AllLogicalPrograms;

public class CouponNumbers {
    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int max = 100000000;
        int randam = (int) (Math.random()*max);
        StringBuilder sb = new StringBuilder();


        while (randam > 0) {
            sb.append(chars[randam % chars.length]);
            randam /= chars.length;
        }

        String couponCode = sb.toString();
        System.out.println("Coupon Code :- " +couponCode);
    }
}
