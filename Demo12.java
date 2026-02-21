import java.util.*;

public class Demo12 {
    public static void main(String[] args) {
        // int nums[]={1,2,2};
        int nums[] = { 3, 2, 1, 2, 1, 7 };
        int moves = minIncrementForUnique(nums);
        System.out.println(moves);
    }
    /*public static int minIncrementForUnique(int[] nums) {
        Set<Integer> used = new HashSet<>();
        int moves = 0;

        for (int i = 0; i < nums.length; i++) {
            while (used.contains(nums[i])) {
                nums[i]++;     
                moves++;
            }
            used.add(nums[i]);
        }
        return moves;
    }*/

    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int target = nums[i - 1] + 1;
                moves += target - nums[i];
                nums[i] = target;
            }
        }
        return moves;
    }
}
