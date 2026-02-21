public class Demo47 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] { 1, 2, 3, 5 }));
        System.out.println(missingNumber(new int[] { 8, 2, 4, 5, 3, 7, 1 }));
        System.out.println(missingNumber(new int[] { 1 }));
    }

    /*public static int missingNumber(int[] arr) {
        int n = arr.length + 1;

        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }*/

    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        for (int num : arr) {
            xor ^= num;
        }
        return xor;
    }

}
