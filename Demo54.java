import java.util.Stack;

public class Demo54 {
    public static void main(String[] args) {
        String s="3[b2[ca]]";
        System.out.println(decodeString(s));
    }
    
    /*static int  idx = 0;
    public static String decodeString(String s) {
        return decode(s);
    }

    public static  String decode(String s) {
        StringBuilder result = new StringBuilder();

        while (idx < s.length() && s.charAt(idx) != ']') {

            if (Character.isDigit(s.charAt(idx))) {
                int k = 0;
                while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
                    k = k * 10 + (s.charAt(idx) - '0');
                    idx++;
                }

                idx++; // skip '['
                String decoded = decode(s);
                idx++; // skip ']'

                while (k-- > 0) {
                    result.append(decoded);
                }
            } else {
                result.append(s.charAt(idx++));
            }
        }
        return result.toString();
    }*/

    public static  String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(curr);
                curr = new StringBuilder();
                k = 0;
            }

            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();

                while (repeat-- > 0) {
                    prev.append(curr);
                }
                curr = prev;
            }

            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}
