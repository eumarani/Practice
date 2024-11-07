package com.practice;

public class MedianOfTwoSortedArrays {
    public static int medianOfArray(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] result=new int[n1+n2];
        int n3=result.length;
        int i=0,j=0,median=0,k=0;
        //To merge the elements
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
            //add the remaining elements to the result
            while(i<n1){
                result[k]=arr1[i];
                i++;
                k++;
            }
            while(j<n2){
                result[k]=arr2[j];
                j++;
                k++;
            }
            if(n3%2==0){//if result length is even
                median=(result[n3/2]+result[n3/2 -1])/2;
            }else{
                median=result[n3/2];//for odd length
            }
        }


        return median;
    }

    public static void main(String[] args) {
        int[] arr1={2,3,5,8,9,10};
        int[] arr2={10,12,16,18,20,22,23,24};
        System.out.println(medianOfArray(arr1,arr2));
    }
}
