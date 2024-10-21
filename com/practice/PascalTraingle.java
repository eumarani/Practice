package com.practice;

import java.util.Arrays;

public class PascalTraingle {
    public static void main(String[] args){
        int[] prev={1,2,1};
        int res[]=getRow(prev);
       /* for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }*/
        printPascal(3);
    }

    public static void printPascal(int n){
        int[] input=new int[]{1};
        System.out.println(Arrays.toString(input));
        for(int i=0;i<n;i++){
            input=getRow(input);
            System.out.println(Arrays.toString(input));


        }

    }


    public static int[] getRow(int[] prev){
        int[] result=new int[prev.length+1];
        for(int i=0;i<result.length;i++){
            if(i==0){
                result[i]=prev[0];
            }else if(i==result.length-1){
                result[i]=prev[prev.length-1];
            }else{
                result[i]=prev[i-1]+prev[i];
            }
        }
       // System.out.println(Arrays.toString(result));
        return result;
    }

}
