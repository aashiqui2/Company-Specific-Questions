public class Demo17 {

    public static void main(String[] args) {
        System.out.println(lookAndSay(5));
    }

    public static String lookAndSay(int n) {
        String[] dp = new String[n + 1];
        dp[1] = "1";

        for (int i = 2; i <= n; i++) {
            dp[i] = build(dp[i - 1]);
        }

        return dp[n];
    }

    private static String build(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i <s.length(); i++) {
            // if next char exists and is same, keep counting
            if (i+1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count);
                sb.append(s.charAt(i));
                count = 1;
            }
        }
        return sb.toString();
    }

}
