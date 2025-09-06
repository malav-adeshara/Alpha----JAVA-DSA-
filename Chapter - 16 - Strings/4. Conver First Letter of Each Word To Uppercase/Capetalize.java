public class Capetalize {
    public static void main(String[] args) {
        String str = "hi, my name is malav.";
        System.out.println(CapetalizeString(str));
    }

    public static String CapetalizeString(String str) {
        str = str.trim();
        StringBuilder sb = new StringBuilder();

        int end = str.length()-1;
        while(end >= 0) {
            if(str.charAt(end) != ' ' && end == 0) {
                sb.append(Character.toUpperCase(str.charAt(end)));
                break;
            } else if(str.charAt(end-1) == ' ' && str.charAt(end) != ' ') {
                sb.append(Character.toUpperCase(str.charAt(end)));
            } else {
                sb.append(str.charAt(end));
            }
            end--;
        }

        return sb.reverse().toString();
    }
}