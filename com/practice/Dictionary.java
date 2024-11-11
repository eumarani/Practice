package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {

    public static void main(String[] args) {
        String[] dict={"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input="abcd";
        List<String> result=dictCount(dict,input);
        System.out.println(result);


    }

    public static List<String> dictCount(String[] dict1,String input1) {
        List<String> result=new ArrayList<>();

        int n=dict1.length;//find the dict1 length

        String input=input1.toLowerCase();//convert the input to lower case

        //convert the dictionary words to lowercase
        String[] dict = new String[dict1.length];
        for(int i=0;i<n;i++) {
            dict[i]=dict1[i].toLowerCase();
        }
        System.out.println(Arrays.toString(dict));


        int[] freqinput=new int[26];//to get frequency of input

        for(int i=0;i<input.length();i++) {
            char ch=input.charAt(i);
            int index=ch-'a';
            freqinput[index]++;
        }


        for(int i=0;i<n;i++) {
            String s=dict[i];
            if(s.length()==input.length()) {

                int[] freqElem=new int[26];//to get frequency of dictionary words
                for(int j=0;j<s.length();j++) {
                    char ch=s.charAt(j);
                    int index=ch-'a';
                    freqElem[index]++;

                }
                if(Arrays.equals(freqinput, freqElem)) {
                    result.add(s);
                }

            }

        }
        return result;

    }
}
