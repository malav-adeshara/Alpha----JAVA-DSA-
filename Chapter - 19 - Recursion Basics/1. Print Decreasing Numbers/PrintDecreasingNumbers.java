public class PrintDecreasingNumbers {
    public static void main(String[] args) {
        printDecreasing(10);
    }

    public static void printDecreasing(int n) {
        if(n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
    }
}
