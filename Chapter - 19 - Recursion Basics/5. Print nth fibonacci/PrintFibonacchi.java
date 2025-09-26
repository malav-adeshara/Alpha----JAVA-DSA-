public class PrintFibonacchi {
    public static void main(String[] args) {
        System.out.println(printNthFibonacci(6));
    }

    public static int printNthFibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return printNthFibonacci(n-1) + printNthFibonacci(n-2);
    }
}