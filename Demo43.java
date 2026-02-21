public class Demo43 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(nums1)); 

        int[] nums2 = { 3, 3, 7, 7, 10, 11, 11 };
        System.out.println(singleNonDuplicate(nums2)); 
    }

    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // Ensure mid is even
            if (mid % 2 == 1)
                mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Single element is after this pair
                low = mid + 2;
            } else {
                // Single element is before this pair (could be mid)
                high = mid;
            }
        }

        return nums[low];
    }

}
