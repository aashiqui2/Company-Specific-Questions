import java.util.*;
public class Demo63 {
    public static void main(String args[]) {
        int n = 5;
        int[] arr = { -8, 1, 4, 6, 10, 45 };
        int target = 16;

        int[] ans = twoSum(n, arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int n, int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }

}
