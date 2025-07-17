public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {3, 1, 8, 4, 10, 56, 22, 34};
        System.out.print("Array before sorting : ");
        printArray(nums);
        System.out.println();
        System.out.print("Array after sorting : ");
        bubbleSort(nums);
        printArray(nums);
    }

    public static void printArray(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j] + nums[j + 1];
                    nums[j + 1] = nums[j] - nums[j + 1];
                    nums[j] = nums[j] - nums[j + 1];
                }
            }
        }
    }
}
