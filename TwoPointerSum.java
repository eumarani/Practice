import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointerSum {
    public static void sum(int[] input, int target) {
        int right = input.length - 1, left = 0;

        List<int[]> result = new ArrayList<>();
        while (left < right) {
            int sum = input[left] + input[right];
            if (sum == target) {
                result.add(new int[]{input[left], input[right]});
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("The result array is: " +(result));
        for(int[] i:result){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void main(String[] args){
        int target=11;
        int[] input={2,4,6,10,6,6,5,1};
        sum(input,target);

    }
}
