public class CheckSorted {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(checkSortedArray(nums, 0));
    }

    public static boolean checkSortedArray(int[] nums, int i) {
        if(i == nums.length-1) {
            return true;
        }
        if(nums[i] > nums[i+1]) {
            return false;
        } else {
            return checkSortedArray(nums, i+1);
        }
    }
}