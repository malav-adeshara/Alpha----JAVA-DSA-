public class ClearRangeOfBits {
    public static int clearRangeOfBits(int n, int i, int j) {
        int bitmaskA = (~0) << (j+1);
        int bitmaskB = (1 << i) - 1;
        int bitmask = bitmaskA | bitmaskB;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(15, 2, 4));
    }
}