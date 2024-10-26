package com.practice;

public class MedianRotatedSortedArray {
    public static int median(int[] arr){
        int left=0,right=arr.length-1;

        while(left<right){//for left equals to right
            int mid=(left+right)/2;
            if(arr[mid]>arr[right]){

                left=mid+1; //minimun is in right half

            }else{
                right=mid;//Minimum is in the left half (including mid)
            }


        }
        return arr[left];//// After the loop, left points to the minimum element
    }
    public static void main(String[] args){
        int[] arr={5,6,1,2,3,4};
        int result=median(arr);
       System.out.println(result);
    }
}
