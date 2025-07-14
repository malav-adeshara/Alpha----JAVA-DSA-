import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int numbers[] = {2, -1, 5, 10, 6, 8};
        int key = 10;
        System.out.println(key + " is at index : " + linearSearch(numbers, key));
    }

    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
}