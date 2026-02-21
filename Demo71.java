import java.util.*;

public class Demo71 {
    public static void main(String[] args) {
        String s = "abaccb";
        int[] distance = {1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s, distance));
    }

    /*public static boolean checkDistances(String s, int[] distance) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            // Find second occurrence
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == ch) {
                    int gap = j - i - 1;
                    if (gap != distance[ch - 'a']) {
                        return false;
                    }
                    break; // since each appears exactly twice
                }
            }
        }
        return true;
    }*/

    public static  boolean checkDistances(String s, int[] distance) {
        int[] firstPos = new int[26];
        Arrays.fill(firstPos, -1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (firstPos[ch - 'a'] == -1) {
                firstPos[ch - 'a'] = i;
            } else {
                int gap = i - firstPos[ch - 'a'] - 1;
                if (distance[ch - 'a'] != gap) {
                    return false;
                }

            }
        }
        return true;
    }
}
