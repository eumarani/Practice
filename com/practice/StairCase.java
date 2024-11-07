package com.practice;

public class StairCase {
    public static int countOfWays(int n){
        if(n==0){//Base Case
            return 1;
        }if(n==1){//Base Case
            return 1;
        }
        int[] ways=new int[n+1];
        ways[0]=1;//for step 0
        ways[1]=1;//for step 1
        for(int i=2;i<=n;i++){
            ways[i]=ways[i-1]+ways[i-2];//ways to reach step i.recursive formuale
        }
        return ways[n];
    }
    public static void main(String[] args){
        System.out.println(countOfWays(10));
    }
}
