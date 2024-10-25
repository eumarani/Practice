package com.practice;


class FindLoop {
    public static int lengthOfLoop(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }
        int result = 0, i = 0, length = 0;
        boolean[] isvisit = new boolean[n];
        while (true) {
            if (isvisit[i]) {
                return -1;
            }

            if (arr[i] > 0) {
                result = (i + arr[i]) % n;
            } else {
                result = (i - arr[i]) % n;
            }
            isvisit[i] = true;
            i = result;

            length += 1;
            if (i == 0)
                return length;
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        System.out.println(lengthOfLoop(arr));
    }
}
