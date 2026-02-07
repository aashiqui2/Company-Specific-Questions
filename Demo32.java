public class Demo32 {
    public static void main(String[] args) {
        int nums[]={2,2,2,3};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int bit = 0; bit < 32; bit++) {
            int count = 0;

            for (int num : nums) {
                if (((num >> bit) & 1) == 1) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }
        return result;
    }
}
