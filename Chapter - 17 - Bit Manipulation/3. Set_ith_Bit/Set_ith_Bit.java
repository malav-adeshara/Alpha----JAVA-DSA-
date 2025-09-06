public class Set_ith_Bit {
    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }

    public static int setIthBit(int n, int i) {
        int bitmask = 1;
        bitmask = bitmask << i;
        return (n | bitmask);
    }
}