import java.util.*;

public class Demo21 {
    public static void main(String[] args) {
        int nuums[]={3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nuums)));
    }
    /*
    public static int[] sortArrayByParityExtra(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

        for (int num : nums) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
    */

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i < j) {
            while (i < j && nums[i] % 2 == 0)
                i++;

            while (i < j && nums[j] % 2 != 0)
                j--;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        return nums;
    }
}
