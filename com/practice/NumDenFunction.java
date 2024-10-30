package com.practice;

public class NumDenFunction {

    //to find the GCD
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static int[] addFractions(int num_frac1,int den_frac1,int num_frac2,int den_frac2){
       //cal the results
        int num_ans=(num_frac1*den_frac2)+(den_frac1*num_frac2);
        int den_ans=den_frac1*den_frac2;

        //to simplify the fraction
        int gcd=gcd(num_ans,den_ans);
        num_ans/=gcd;
        den_ans/=gcd;


        return new int[]{num_ans,den_ans};
    }

    public static void main(String[] args) {
        int[] result=addFractions(1,3,3,9);
        System.out.println(result[0]+"/" + result[1]);

    }
}
