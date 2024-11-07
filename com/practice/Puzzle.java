package com.practice;

public class Puzzle {
    public static int countOfBulbs(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){//because we know the ans for this
        count++;
    }
    return count;
}
public static void main(String[] args){
        int n=100;
        System.out.println(countOfBulbs(n));
    }
}
