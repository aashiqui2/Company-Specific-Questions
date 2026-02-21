public class Demo59 {
    public static void main(String[] args) {
        //String s="leet2code3";
        //int k=10;
        String s="a2345678999999999999999";
        int k=1;
        System.out.println(decodeAtIndex(s, k));
    }

    /*public static String decodeAtIndex(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int d = c - '0';
                String temp = sb.toString();
                for (int i = 1; i < d; i++) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }
        //System.out.println(sb);
        return sb.substring(k-1, k);
    }*/

    public static String decodeAtIndex(String s, int k) {
        long length = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                length *= (c - '0');
            } else {
                length++;
            }
        }

        //traverse backwards
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int d = c - '0';
                length /= d;
                k %= length;//k=(int)k%length;
            } else {
                if (k == 0 || k == length) {
                    return String.valueOf(c);
                }
                length--;
            }
        }

        return "";
    }

}
