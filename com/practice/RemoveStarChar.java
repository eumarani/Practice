package com.practice;

public class RemoveStarChar {

    public static void main(String[] args){
        String str="erase*****";
        System.out.println(removalFromLtoR(str));

        String str1="leet**cod*e";
        System.out.println(removalFromLtoR(str1));

        String str3="";
        System.out.println(removalFromLtoR(str3));

    }

    public static String removalFromLtoR(String str){

        if(str.isEmpty()){
            return "-1";
        }
        StringBuilder result=new StringBuilder();//for result
        for(char c:str.toCharArray()){
            if(c=='*'){
                if(result.length()>0){//if result length is greater than 0 then only we are able to delete char
                    result.deleteCharAt(result.length()-1);// we need to delete the char before *
                }
            }else{
                result.append(c);//add the non * chars to result
            }

        }

        return result.toString();

    }
}
