public class Demo69 {
    public static void main(String[] args) {
        String str1="occurrence";
        String str2="car";
        System.out.println(removeChars(str1, str2));

    }

    /*public static String removeChars(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean found = false;

            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result.append(ch);
            }
        }
        return result.toString();
    }*/

    public static String removeChars(String str1, String str2) {
        boolean[] remove = new boolean[26];
        // Mark characters from str2
        for (int i = 0; i < str2.length(); i++) {
            remove[str2.charAt(i) - 'a'] = true;
        }
        StringBuilder result = new StringBuilder();

        // Build result from str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (!remove[ch - 'a']) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
