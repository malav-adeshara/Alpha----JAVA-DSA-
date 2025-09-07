public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println(fastExponentiation(5, 25));
    }

    public static int fastExponentiation(int base, int power) {
        int ans = 1;
        while(power != 0) {
            if((power & 1) != 0) {
                ans = ans * base;
            }
            base = base * base;
            power = power >> 1;
        }

        return ans;
    }
}
