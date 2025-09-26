public class FirstOccurence {
    public static void main(String[] args) {
        int nums[] = {5, 3, 4, 8, 9, 1};
        System.out.println(firstOccurence(nums, 0, 0));
    }

    public static int firstOccurence(int[] nums, int i, int key) {
        if(i == nums.length) {
            return -1;
        }

        if(nums[i] == key) {
            return i;
        } else {
            return firstOccurence(nums, i + 1, key);
        }
    }
}
