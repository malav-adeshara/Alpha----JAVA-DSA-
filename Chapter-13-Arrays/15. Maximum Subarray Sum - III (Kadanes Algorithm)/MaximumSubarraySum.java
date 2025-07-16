import java.util.*;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = maximumSubarraySum(numbers);
        System.out.println("Maximum Subarray Sum Is : " + maxSum);
    }

    public static int maximumSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if(currentSum < 0) {
                currentSum = 0;
            } else {
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}