package com.practice;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {
    public static String convertFtoD(int numerator,int denominator){
        if(numerator==0){
            return "not valid";
        }if(denominator==0){
            return "undefined";
        }

        StringBuilder result=new StringBuilder();
        if((numerator<0)^(denominator<0)){//for sign handling
            result.append('-');

        }
        //To handle overflow
       long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);

        //for integer part result
        result.append(num/den);
        long remainder=num%den;

        if(remainder==0){
            return result.toString();
        }
        //for decimal point
        result.append(".");
        //to store the remainders each time
        Map<Long,Integer> map=new HashMap<>();
        map.put(remainder,result.length());

        //remainder not zero
        while(remainder!=0){
            result.append(remainder);
            remainder=remainder*10;
            result.append(remainder/den);
            remainder%=den;

            //check for remainder repetation
            if(map.containsKey(remainder)){
                int index=map.get(remainder);
                result.insert(index,'(');
                result.append(')');
                return result.toString();
            }
            map.put(remainder,result.length());

        }
        return result.toString();

    }
    public static void main(String[] args){
        System.out.println(convertFtoD(5,2));
        System.out.println(convertFtoD(8,2));
        System.out.println(convertFtoD(-5,2));
        System.out.println(convertFtoD(0,2));
        System.out.println(convertFtoD(5,0));
        System.out.println(convertFtoD(1,2));
    }
}
