package com.practice;

public class SecondProblem {
    public static int longestStringlength(String[] dict,String toSearch){
        int maxLength=0;
        for(String word:dict){
            //System.out.println(word);
            if(word.contains(toSearch)){
                if(word.length()>maxLength){
                    maxLength=word.length();
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        String[] dict={"CODGE","ODG","LODGES","SODG","dodge","mODJ","LODGESSSS"};;
        String toSearch="ODG";
        System.out.println(longestStringlength(dict,toSearch));

    }
}
