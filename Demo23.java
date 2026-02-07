import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo23 {
    public static void main(String[] args) {
        //int nums[] = { -1, 1, -6, 4, 5, -6, 1, 4, 1 };
        int nums[]={1,2,3,4};
        System.out.println(Arrays.toString(frequencySort(nums)));
        // ! Problem rule:
        // 1.Lower frequency first
        // 2.If same frequency → larger value first
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int val : nums) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }

        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(a) - freq.get(b);
            }
            return b - a;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;

    }
}
