import java.util.*;

public class LargestElement{
    public static void main(String[] args) {
        int numbers[] = {2, 6, 7, -2, 0, 60};
        System.out.println("Largest element in given array is : " + largestInArray(numbers));
    }

    public static int largestInArray(int numbers[]) {
        int maxElem = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > maxElem) {
                maxElem = numbers[i];
            }
        }
        return maxElem;
    }
}