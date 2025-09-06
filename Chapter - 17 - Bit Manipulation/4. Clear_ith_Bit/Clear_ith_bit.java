public class Clear_ith_bit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(15, 1));
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = 1;
        bitmask = bitmask << i;
        bitmask = ~(bitmask);
        return (n & bitmask);
    }
}