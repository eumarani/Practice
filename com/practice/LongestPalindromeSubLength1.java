
package com.practice;
public class LongestPalindromeSubLength1 {
    public static void longest(String str) {
        int start = 0, end = 0;
        if (str.length() == 0 || str == null) {
            System.out.println("");
        }
        for (int i = 0; i < str.length()-1; i++) {
            int len1 = test(str,i,i);//for odd
            int len2 = test(str,i,i+1);//for even length palindrome
            int len = Math.max(len1, len2);
            if (len > end - start) {//if len is greater than previous len
                start = i - (len - 1) / 2;//for odd palindrome
                end = i + len / 2;
            }
        }
        System.out.println("Longest Palindromic Substring Length: " + (end - start + 1));

    }

    public static int test(String str, int left, int right) {

        while (left >= 0 && right <= str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        longest(str);
    }
}