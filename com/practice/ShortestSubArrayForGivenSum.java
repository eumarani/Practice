package com.practice;

public class ShortestSubArrayForGivenSum {
    public static int shortestSubArray(int[] arr,int k){
        if(arr.length==0 || arr==null){
            return -1;
        }
        int left=0;//for index
                int n=arr.length;//Given Array length
        int currentSum=0;//to track the Sum
        int minLength=Integer.MAX_VALUE;//to track the minlength
        for(int right=0;right<n;right++){
            currentSum+=arr[right];

            while(currentSum>=k){
                if(currentSum==k){
                    minLength=Math.min(minLength,right-left+1);
                }
                currentSum-=arr[left++];//to shrink the Window Size
            }
        }
        return (minLength==Integer.MAX_VALUE)? -1:minLength;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,10,2,1};
        System.out.println(shortestSubArray(arr,12));
        int[] arr1={};
        System.out.println(shortestSubArray(arr1,0));
    }

}
