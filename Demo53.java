import java.util.*;

public class Demo53 {
    public static void main(String[] args) {
        String str = "geeksogeeks";
        if (canFormPalindrome(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /*public static boolean canFormPalindrome(String s) {
        int oddCount = 0;
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount <= 1) {
            return true;
        } else {
            return false;
        }
    }*/

    /*public static boolean canFormPalindrome(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        for (int count : freq.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return (oddCount <= 1) ? true : false;
    }*/

    public static boolean canFormPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0)
                oddCount++;
        }
        return oddCount <= 1 ? true : false;
    }

}
