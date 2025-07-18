public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};

        System.out.print("Original array : ");
        printArray(nums);

        selectionSort(nums);

        System.out.print("Sorted array : ");
        printArray(nums);
    }

    public static void selectionSort(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int minElementIndex = findMinimumElementIndex(nums, start, end);
            if (start != minElementIndex) {
                int temp = nums[start];
                nums[start] = nums[minElementIndex];
                nums[minElementIndex] = temp;
            }
            start++;
        }
    }

    public static int findMinimumElementIndex(int nums[], int Si, int Ei) {
        int minimumElement = Integer.MAX_VALUE;
        int minimumIndex = Si;
        for (int i = Si; i <= Ei; i++) {
            if (nums[i] < minimumElement) {
                minimumElement = nums[i];
                minimumIndex = i;
            }
        }
        return minimumIndex;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}