public class PalindromeString {
    public static void main(String[] args) {
        String str = "malav";
        System.out.println("isPalindromeString : " + isPalindromeString(str));
    }

    public static boolean isPalindromeString(String str) {
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
