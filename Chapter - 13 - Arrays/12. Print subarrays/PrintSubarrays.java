import java.util.*;

public class PrintSubarrays {
    public static void main(String[] args) {
        int numbers[] = {3, 6, -1, 80, 67, 69, 5};
        printSubArrays(numbers);
    }

    public static void printSubArrays(int numbers[]) {
        int totalSubArrays = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                totalSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays printed = " + totalSubArrays);

        // We can obtain total n*(n+1)/2 sub arrays from an array having n elements.
    }
}
