package com.practice;

public class PalindromeCheck {

    public static boolean isPalindrome(String str){

        for(int i=0;i<str.length();i++){
            //for odd length
            if(!expandAndCheck(str,i,i)){
                return false;
            }
            //for even length
            if(!expandAndCheck(str,i,i+1)){
                return false;
            }

        }
        return true ;
    }
    public static boolean expandAndCheck(String str,int left,int right){
        while(left>=0 && right<str.length() &&
                str.charAt(right)==str.charAt(left)){
            left--;
            right++;

        }
        return left<right;//return true if palindrome found

    }
    public static void main(String[] args){
        String str="aabbccbbaa";
        System.out.println(isPalindrome(str));
    }
}
