import java.util.*;

public class Demo68 {
    public static void main(String[] args) {
        //String  s = "ilike";
        //String dictionary[] = {"i", "like", "gfg"};
        String s="catsandog";
        List<String> dictionary = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(wordBreak(s, dictionary));
    }

    /*public static boolean wordBreak(String s, String[] dictionary) {
        return solve(s, new HashSet<>(Arrays.asList(dictionary)));
    }

    public static boolean solve(String s, Set<String> set) {
        if (s.length() == 0){
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (set.contains(prefix)) {
                if (solve(s.substring(i), set)) {
                    return true;
                }
            }
        }
        return false;
    }*/

    /*public static boolean wordBreak(String s, List<String> dictionary) {
        Set<String> set = new HashSet<>(dictionary);
        
        //find max len in the dictionary
        int maxLen=0;
        for(String word:dictionary){
            maxLen=MAth.max(maxLen,word.length());
        }
        int n=s.length();
        boolean[] dp = new boolean[n + 1];
        //base case :empty string
        dp[0] = true;

        for (int i = 1; i <= n; i++) {

            for (int j = i-1; j >=Math.max(0,i-maxLen); j--) {

                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }*/
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String>dict = new HashSet<>(wordDict);
        int n = s.length();
        boolean []dp = new boolean [n+1];
        dp[0] = true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j] && dict.contains(s.substring(j,i))){
                    dp[i] =true;
                     break;
                }
            }
        }
        return dp[n];
    }
}
