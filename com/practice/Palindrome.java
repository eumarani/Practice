package com.practice;

public class Palindrome {
    public static void longest(String str){
        int left=0,right=str.length()-1;
        /*char[] charArray=str.toCharArray();
        while(left<right){
           /* char temp=charArray[left];
           charArray[left]= charArray[right];
           charArray[right]=temp;
           left++;
           right--;
        }
        System.out.println(charArray);*/
        while(left<right) {
            if (str.charAt(left) != str.charAt(right)) {
System.out.println("Given string is not palindrome");
                return;
            }
            left++;
            right--;
        }

        System.out.println("Given string is  palindrome");

    }


    public static void main(String[] args){
        String str = "forgeeksskeegfor";
        longest(str);

    }
}

