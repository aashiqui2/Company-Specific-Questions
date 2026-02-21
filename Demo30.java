public class Demo30 {
    public static void main(String[] args) {
        String[] strs = { "10", "0001", "111001", "1", "0" };
        int m = 5, n = 3;
        // String[]
        // strs={"11","11","0","0","10","1","1","0","11","1","0","111","11111000","0","11","000","1","1","0","00","1","101","001","000","0","00","0011","0","10000"};
        // int m=90,n=66;
        System.out.println(findMaxForm(strs, m, n));
    }

    /* public static int findMaxForm(String[] strs, int m, int n) {
        return helper(strs, m, n, 0);
    }

    public static int helper(String[] strs, int zero, int one, int index) {
        if (index == strs.length || zero + one == 0) {
            return 0;
        }

        int[] count = countZeroOne(strs[index]);

        // if we Take
        int take = 0;
        if (zero >= count[0] && one >= count[1]) {
            take = 1 + helper(strs, zero - count[0], one - count[1], index + 1);
        }
        // Skip
        int notTake = helper(strs, zero, one, index + 1);

        return Math.max(take, notTake);
    }

    public static int[] countZeroOne(String s) {
        int zero = 0, one = 0;
        for (char c : s.toCharArray()) {
            if (c == '0')
                zero++;
            else
                one++;
        }
        return new int[] { zero, one };
    } */

    /* static int[][][] dp;

    public static int findMaxForm(String[] strs, int m, int n) {
        dp = new int[m + 1][n + 1][strs.length];
        return helper(strs, m, n, 0);
    }

    public static int helper(String[] strs, int zero, int one, int index) {
        if (index == strs.length || zero + one == 0) {
            return 0;
        }
        if (dp[zero][one][index] > 0) {
            return dp[zero][one][index];
        }
        int[] count = countZeroOne(strs[index]);

        // if we Take
        int take = 0;
        if (zero >= count[0] && one >= count[1]) {
            take = 1 + helper(strs, zero - count[0], one - count[1], index + 1);
        }
        // Skip
        int notTake = helper(strs, zero, one, index + 1);
        dp[zero][one][index] = Math.max(take, notTake);
        return dp[zero][one][index];
    }

    public static int[] countZeroOne(String s) {
        int zero = 0, one = 0;
        for (char c : s.toCharArray()) {
            if (c == '0')
                zero++;
            else
                one++;
        }
        return new int[] { zero, one };
    } */

    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (String s : strs) {
            int zero = 0, one = 0;

            for (char c : s.toCharArray()) {
                if (c == '0')
                    zero++;
                else
                    one++;
            }

            // Traverse backward
            for (int i = m; i >= zero; i--) {
                for (int j = n; j >= one; j--) {
                    dp[i][j] = Math.max(dp[i][j],dp[i - zero][j - one]+1);
                }
            }
        }

        return dp[m][n];
    }
}

/*
 * Test case failed for recursive approach
 * ["11","11","0","0","10","1","1","0","11","1","0","111","11111000","0","11",
 * "000","1","1","0","00","1","101","001","000","0","00","0011","0","10000"]
 * m=90
 * n=66
 */