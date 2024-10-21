package com.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int longestPalindrome(String s){
        Map<Character,Integer> freqMap=new HashMap<>();
        for(char c:s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
            int length=0;
        boolean found=false;
        for(int count:freqMap.values()) {
            length += (count / 2) * 2;
            if (count % 2 == 1) {
                found = true;
            }
        }
        return found? length+1:length;

    }
        public static void main(String[] args){
            String s="abccccdd";
            int result=longestPalindrome(s);
            System.out.println(result);
        }
        //System.out.println(longestPalindrome("abccccdd"));

    }

