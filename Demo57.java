import java.util.*;

public class Demo57 {
    public static void main(String[] args) {
        String s = "3[b2[ca]]";
        // String s = "3[a2[c]]";
        // String s = "2[abc]3[cd]ef";
        // String s="2[ab]3c";
        // String s = "2a3bc";
        System.out.println(decode(s));
    }

    /*
    static int index = 0;
    public static String decode(String s) {
        StringBuilder result = new StringBuilder();
        int number = 0;
        while (index < s.length() && s.charAt(index) != ']') {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
                index++;
            } else if (ch == '[') {
                index++; // skip '['
                String inner = decode(s);
                for (int i = 0; i < number; i++) {
                    result.append(inner);
                }
                number = 0;
            } else {
                if (number != 0) {
                    for (int i = 0; i < number; i++) {
                        result.append(ch);
                    }
                    number = 0;
                } else {
                    result.append(ch);
                }
                index++;
            }
        }
        if (index < s.length() && s.charAt(index) == ']') {
            index++;
        }
        return result.toString();
    }
    */

    public static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(number);
                stringStack.push(current);
                number = 0;
                current = new StringBuilder();
            }
            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();
                for (int j = 0; j < repeat; j++) {
                    previous.append(current);
                }
                current = previous;
            }
            else { 
                if (number != 0) { 
                    for (int j = 0; j < number; j++) {
                        current.append(ch);
                    }
                    number = 0;
                } else {
                    current.append(ch);
                }
            }
        }
        return current.toString();
    }
}
