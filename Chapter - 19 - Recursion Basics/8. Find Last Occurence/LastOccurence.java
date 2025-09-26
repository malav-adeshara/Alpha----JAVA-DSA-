public class LastOccurence {
    public static void main(String[] args) {
        int[] nums = {4, 6, 3, 9, 1, 0, 5, 5, 5};
        System.out.println(lastOccurence(nums, 0, 10));
    }

    public static int lastOccurence(int[] nums, int i, int key) {
        if(i == nums.length) {
            return -1;
        }

        int lastOccuringIndex = lastOccurence(nums,i+1, key);
        
        if(lastOccuringIndex == -1 && nums[i] == key) {
            return i;
        } else {
            return lastOccuringIndex;
        }
    }

}
