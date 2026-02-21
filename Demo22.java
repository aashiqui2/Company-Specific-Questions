import java.util.*;

public class Demo22 {

    public static void main(String[] args) {
        int[] nums = { 4, 2, 5, 7 };
        System.out.println(Arrays.toString(sortArrayByParityIIExtra(nums)));
    }

    /*public static int[] sortArrayByParityIIExtra(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return result;
    }*/

    public static int[] sortArrayByParityIIExtra(int[] nums) {
        int n = nums.length;
        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < n && oddIndex < n) {
            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
                continue;
            }
            if (nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
                continue;
            }
            // swap wrong elements
            int temp = nums[evenIndex];
            nums[evenIndex] = nums[oddIndex];
            nums[oddIndex] = temp;

            evenIndex += 2;
            oddIndex += 2;
        }
        return nums;
    }

}
