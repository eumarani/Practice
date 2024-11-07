package com.practice;

public class MinimumSortedRotatedArray {
    public static int toFindMin(int[] arr){
        int low=0,high=arr.length-1;
        while(low<high) {
            int mid = (low + high) / 2;

            if (arr[mid] <= arr[high]) {//then right part is sorted.SO,min is mid or leftSide
                high = mid;
            } else {//left part is sorted,So min is on right side
                low = mid + 1;
            }
        }
        //here low nd high both are equal
            return arr[low];
    }
      public static void main(String[] args){
            int[] arr={5,6,1,2,3,4};
            System.out.println(toFindMin(arr));
            int[] arr1={1,2,3,4};
          System.out.println(toFindMin(arr1));


        }
        }

