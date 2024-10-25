package com.practice;

public class Wave {

    public static int[] wave(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] < arr[i + 1]) {
                    valueswap(arr, i, i + 1);
                }
            } else {
                if (arr[i] > arr[i + 1]) {
                    valueswap(arr, i, i+1);
                }
            }
        }
        return arr;
    }

    public static void valueswap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

        public static void main(String[] args) {
            int[] arr={10,5,6,3,2,20,100,80};

            int[] result=wave(arr);
            for(int num:result){
                System.out.print(num+" ");
            }


        }
    }


