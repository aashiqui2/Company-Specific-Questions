public class Demo60 {
    public static void main(String[] args) {
        String str = "ab4c2ed3";
        int k = 9;
        char c = findCharAtK(str, k);
        System.out.println(c);
    }
    /*
    public static char findCharAtK(String str, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len = str.length();

        while (i < len) {
            StringBuilder current = new StringBuilder();
            while (i < len && Character.isLetter(str.charAt(i))) {
                current.append(str.charAt(i));
                i++;
            }
            int count = 0;
            while (i < len && Character.isDigit(str.charAt(i))) {
                count = count * 10 + (str.charAt(i) - '0');
                i++;
            }

            for (int j = 0; j < count; j++) {
                sb.append(current);
            }
        }
        return sb.charAt(k - 1);
    }
    */

    public static char findCharAtK(String s, long k) {
        char[] str= s.toCharArray();
        int n = str.length;
        int i = 0;

        while (i < n) {

            int start = i;
            int len = 0;

            // Count substring length
            while (i < n && Character.isAlphabetic(str[i])) {
                i++;
                len++;
            }

            // Read frequency (multi-digit safe)
            long freq = 0;
            while (i < n && Character.isDigit(str[i])) {
                freq = freq * 10 + (str[i] - '0');
                i++;
            }

            long blockLength = len * freq;

            // If k lies in this block
            if (k <= blockLength) {
                long index = (k - 1) % len;
                return str[start + (int) index];
            }

            // Otherwise skip this block
            k -= blockLength;
        }

        // Edge case: no digits in string
        return str[(int) k - 1];
    }

}
