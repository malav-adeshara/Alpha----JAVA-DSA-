import java.util.*;

public class ReverseAnArray {
    public static void main(String[] args) {
        int numbers[] = {2, 6, 1, 59, 69, 75, 8};

        System.out.print("Array before reversal : ");
        printArray(numbers);

        reversArray(numbers);
        System.out.println();

        System.out.print("Array after reversal : ");
        printArray(numbers);

    }

    public static void printArray(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void reversArray(int numbers[]) {
        for(int i = 0; i < numbers.length/2; i++) {
            numbers[i] = numbers[i] + numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = numbers[i] - numbers[numbers.length - 1 - i];
            numbers[i] = numbers[i] - numbers[numbers.length - 1 - i];
        }
    }
}
