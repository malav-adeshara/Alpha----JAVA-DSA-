public class Get_ith_Bit {
    public static void main(String[] args) {
        int n = 7;
        int bit = 2;
        System.out.println(getIthBit(n, bit));
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1;
        bitMask = bitMask << i;
        if((n & bitMask) != 0) {
            return 1;
        } else {
            return 0;
        }
    }
}