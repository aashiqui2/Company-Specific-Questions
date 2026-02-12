import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Demo19 {
    public static void main(String[] args) {
        int nums[]= {131,11,48};
        System.out.println(Arrays.toString(common_digits(nums)));
    }

    /*public static int[] common_digits(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            String s = String.valueOf(num);
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i) - '0');
            }
        }

        
        int[] result = new int[set.size()];
        int idx = 0;
        for (int digit : set) {
            result[idx++] = digit;
        }

        Arrays.sort(result);
        return result;
    }*/

    public static int[] common_digits(int[] nums) {
        boolean[] seen = new boolean[10];

        for (int num : nums) {
            while (num > 0) {
                int digit = num % 10;
                seen[digit] = true;
                num /= 10;
            }
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (seen[i]) count++;
        }

        int[] result = new int[count];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (seen[i]) {
                result[idx++] = i;
            }
        }

        return result;
    }
}
