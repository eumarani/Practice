package com.practice;

public class TenPower {
    public static boolean isPowerOfTen(int n){
        //n should be non negative
        if(n<=0){
            return false;
        }
        while(n%10==0){
               n/=10;

           }

//if n is 1 then also true
        return n==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTen(10));
        System.out.println(isPowerOfTen(2));
        System.out.println(isPowerOfTen(-2));
        System.out.println(isPowerOfTen(0));
        System.out.println(isPowerOfTen(20));
        System.out.println(isPowerOfTen(100));
        System.out.println(isPowerOfTen(1000));
        System.out.println(isPowerOfTen(1));

    }
}
