public class StringCompress {
    public static void main(String[] args) {
        String str = "     aabbbbbcccccdddddee      ";
        System.out.println(CompressString(str));
    }

    public static String CompressString(String str) {
        str = str.trim();
        int count = 1;
        StringBuilder sb = new StringBuilder("");
        int end = str.length() - 2;
        int i = 0;
        while(i <= end) {
            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                char ch = str.charAt(i);
                sb.append(ch);
                if(count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
            i++;
        }

        if(str.charAt(i) == str.charAt(i-1)) {
            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(count);
            }
        } else {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}