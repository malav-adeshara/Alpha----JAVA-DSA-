public class Update_ith_bit {
    public static void main(String[] args) {
        System.out.println(update_ith_bit(2, 10, 1));
    }

    public static int clearIthBit(int i, int num) {
        int bitmask = 1;
        bitmask = ~(bitmask << i);
        return (num & bitmask);
    }

    public static int update_ith_bit(int i, int n, int newBit) {
        n = clearIthBit(i, n);
        int bitmask = newBit << i;
        return (n | bitmask);
    } 
}