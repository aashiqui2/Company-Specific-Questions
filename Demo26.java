public class Demo26 {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 3 };
        int sum = 4;
        // System.out.println(coinChangeRecursive(coins, sum, 0));
        System.out.println(coinChangeDP(coins, sum));
    }

    /*public static int coinChangeRecursive(int[] coins, int sum, int index) {
        if (sum == 0)
            return 1;
        if (sum < 0 || index == coins.length)
            return 0;

        // Include coins[index] or skip it
        int include = coinChangeRecursive(coins, sum - coins[index], index);
        int exclude = coinChangeRecursive(coins, sum, index + 1);

        return include + exclude;
    }*/

    public static int coinChangeDP(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        dp[0] = 1; // one way to make sum 0

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[sum];
    }
}
