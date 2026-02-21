public class Demo40 {
    public static void main(String[] args) {
        //System.out.println(findTheDifferenceSort("abcd", "abcde")); // Output: e
        // System.out.println(findTheDifferenceSort("", "y")); // Output: y
        System.out.println(findTheDifferenceXOR("", "y")); // Output: y
    }

    /*public static char findTheDifferenceSort(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i] != tArr[i])
                return tArr[i];
        }
        return tArr[tArr.length - 1]; // the extra letter is at the end
    }*/

    /*public static char findTheDifferenceMap(String s, String t) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        for (char c : t.toCharArray()) {
            if (freq[c - 'a'] == 0)
                return c;
            freq[c - 'a']--;
        }
        return ' '; // should never reach here
    }*/

    public static char findTheDifferenceXOR(String s, String t) {
        int xor = 0;
        for (char c : s.toCharArray())
            xor ^= c;
        for (char c : t.toCharArray())
            xor ^= c;
        return (char) xor;
    }

}
