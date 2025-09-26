public class XpowerN {
    public static void main(String[] args) {
        System.out.println(printXPowerN(3, 5));
    }

    public static int printXPowerN(int x, int n) {
        if(n == 1) {
            return x;
        }

        int halfPower = printXPowerN(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 == 0) {
            return halfPowerSq;
        } else {
            return halfPowerSq*x;
        }
    }
}