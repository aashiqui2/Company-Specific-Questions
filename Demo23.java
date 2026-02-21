import java.util.*;

public class Demo23 {
    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2, 3 };
        System.out.println(Arrays.toString(sortEvenOddIndices(nums1))); // [2,3,4,1]

        int[] nums2 = { 2,1};
        System.out.println(Arrays.toString(sortEvenOddIndices(nums2))); // [2,1]
    }

    public static int[] sortEvenOddIndices(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return nums;
        }
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        // Step 1: Separate even and odd indices
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenList.add(nums[i]);
            } else {
                oddList.add(nums[i]);
            }
        }

        Collections.sort(evenList);

        oddList.sort(Collections.reverseOrder());

        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = evenList.get(evenIndex++);
            } else {
                nums[i] = oddList.get(oddIndex++);
            }
        }

        return nums;
    }

}
