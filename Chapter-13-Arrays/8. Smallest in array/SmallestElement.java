import java.util.*;

public class SmallestElement {
    public static void main(String[] args) {
        int numbers[] = {2, 6, 7, -2, 0, 60};
        System.out.println("Smallest element in given array is : " + smallestElement(numbers));
    }

    public static int smallestElement(int numbers[]) {
        int minElem = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < minElem) {
                minElem = numbers[i];
            }
        }
        return minElem;
    }
}