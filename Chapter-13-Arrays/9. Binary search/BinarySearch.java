import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {
        int numbers[] = {-5, -3, -1, 0, 6, 8, 10, 15};
        int key = 10;

        System.out.println(key + " is found at index : " + binarySearch(numbers, key) + " in given array.");
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length-1;
        while(start <= end) {
            int mid = start + ((end-start)/2);
            if(numbers[mid] == key) {
                return mid;
            }

            if(numbers[mid] > key) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return -1;
    }
}