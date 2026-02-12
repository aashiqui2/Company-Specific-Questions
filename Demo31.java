public class Demo31 {
    public static void main(String[] args) {
        // String A="gksrek";
        // String B="geeksforgeeks";
        String A = "AXY";
        String B = "YADXCP";
        System.out.println(isSubsequence(A, B));
    }

    /*public static int isSubsequence(String A, String B) {
        int j = 0;
        for (int i = 0; i < A.length(); i++) {
            boolean found = false;
            while (j < B.length()) {
                if (A.charAt(i) == B.charAt(j)) {
                    found = true;
                    j++;
                    break;
                }
                j++;
            }
            if (!found) {
                return 0;
            }
        }
        return 1;
    }*/

    public static int isSubsequence(String A, String B) {
        int i = 0; // pointer for A
        int j = 0; // pointer for B

        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                i++; // match found, move A
            }
            j++; // always move B
        }

        return (i == A.length()) ? 1 : 0;
    }
}
