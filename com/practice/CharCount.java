package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void findCharCount(String str){
        Map<Character,Integer> freqMap=new HashMap<>();

        for(char c:str.toCharArray()){
            if(freqMap.containsKey(c)){
                //if c character found then return the count value as 1 else return default value as 0
                freqMap.put(c,freqMap.getOrDefault(c,0)+1);


            }else{
                freqMap.put(c,1);//if char c is not found then initializes the count to 1
            }
        }
        freqMap.forEach((key,value)->System.out.print(key+ ""+value));//key is charcater and value is it's freq
        

    }



    public static void main(String[] args){
        String str="aabbbbcddc";
        findCharCount(str);
    }
}
