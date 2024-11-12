package com.practice;

public class RemoveStar {
    public static void main(String[] args) {
        String s="lee*t*Code";
        System.out.println(remove(s));


    }
    public static String remove(String s){


        if(s.isEmpty()){
            return "-1";
        }

        StringBuilder result=new StringBuilder(s);
        for(int i=0;i<result.length();i++){
            if(result.charAt(i)=='*'){
                result.deleteCharAt(i);
                i--;
            }
        }

        return result.toString();

    }
}
