import java.util.*;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int numbers[] = {3, 6, -1, 80, 67, 69, 5};
        maxSubarraySum(numbers);
    }

    public static void maxSubarraySum(int numbers[]) {
        int maxSum = 0;
        int currSum = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {
                currSum = 0;
                for(int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Subarray Sum is = " + maxSum);

        // We can obtain total n*(n+1)/2 sub arrays from an array having n elements.
    }
}