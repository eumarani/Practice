package com.practice;

import java.util.*;
import java.util.Map;

public class First{
    public static String convertor(String s){
        if(s==null || s.length()==0){
            return "";
        }
        Map<Character,Integer> freqMap=new TreeMap<>();//for sorting order,use the tree map
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);//if char is not there default coount value is 0 else updated by 1

            }
        StringBuilder result=new StringBuilder();//for the result
        for(Map.Entry<Character,Integer> entry:freqMap.entrySet()){
       result.append(entry.getKey());
       result.append(entry.getValue());
        }
        return result.toString();

    }

public static void main(String[] args) {
    String s="aabbccdacctg";
    System.out.println(convertor(s));
    
}

}
