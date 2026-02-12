public class Demo43 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 3, 2, 5 };
        int[] res = singleNumber(nums);

        System.out.println(res[0] + " " + res[1]);
    }

    public static int[] singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        int diffBit = xor & (-xor);

        int a = 0, b = 0;

        for (int num : nums) {
            if ((num & diffBit) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[] { a, b };
    }

}
