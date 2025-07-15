public class MaxSubarraySum {
    public static void main(String[] args) {
        int numbers[] = {3, 2, 7, 4, 10, 60};
        int maxSubarraySum = maxSubarraySumUsingPrefixSumArray(numbers);
        System.out.println("Max Subarry Sum Is : " + maxSubarraySum);
    }

    public static int maxSubarraySumUsingPrefixSumArray(int numbers[]) {
        int prefixSumArray[] = new int[numbers.length];
        int currentSum = 0;
        int maxSum = 0;

        // calculating prefix sum array
        prefixSumArray[0] = numbers[0];
        for(int i = 1; i < prefixSumArray.length; i++) {
            prefixSumArray[i] = prefixSumArray[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {
                currentSum = i == 0 ? prefixSumArray[j] :  prefixSumArray[j] - prefixSumArray[i-1];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                } else {
                    currentSum = 0;
                }
            }
        }

        return maxSum;
    }
}