package com.practice;

public class MissingNumBinarySearch {
    public static int missingNum(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]==mid){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;

    }
    public static void main(String[] args){
        int[] arr={0,1,2,4};
        System.out.println(missingNum(arr));
        int[] arr1={0,1,2,3,4,6};
        System.out.println(missingNum(arr1));
    }
}
