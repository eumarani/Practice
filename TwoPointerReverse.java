import java.util.Arrays;

public class TwoPointerReverse {
    public static void reverse(int[] input){
       int left=0,right=input.length-1;
       while(left<right) {
           int temp = input[left];
           input[left] = input[right];
           input[right] = temp;
           left++;
           right--;
       }
       System.out.println(Arrays.toString(input));


    }
    public static void main(String[] args){
       int[] input={3,1,4,5,6,8};
        reverse(input);
    }
}
