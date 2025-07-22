public class CheckOddEven {
    public static void main(String[] args) {
        checkOddOrEven(8);
    }

    public static void checkOddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}