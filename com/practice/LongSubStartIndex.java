package com.practice;

public class LongSubStartIndex {
    public static int[] longSubStartIndext(String str){
        if(str.isEmpty() || str.length()==0){
            return new int[]{-1,0};//-1 is for char not found and 0 for count
        }
        int maxStartIndex=0;
        int currentLength=1;
        int maxLength=1;
        for(int i=1;i<str.length();i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStartIndex = i - currentLength;
                }
                currentLength = 1;
            }
        }
            if(currentLength>maxLength){
                maxLength=currentLength;
                maxStartIndex=str.length()-currentLength;// Update starting index for the last substring
            }


        return new int[]{maxStartIndex,maxLength};
    }
    public static void main(String[] args){
        String str="aabbbbccddd";
        int[] result=longSubStartIndext(str);
        System.out.println("Starting index: " + result[0]);
        System.out.println("Length of substring: " + result[1]);
       System.out.println("Longest substring: \"" + str.substring(result[0], result[0] + result[1]) + "\"");
    }
    }

