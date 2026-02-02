public class Demo1 {

    public static void main(String[] args) {
        int n = 956781;
        int k = 3;
        int result = findKthDigit(n, k);
        System.out.println(result);
    }

    /* public static int findKthDigit(int n, int k) {
        String str = String.valueOf(n);
        if (k > str.length() || k <= 0)
            return -1;
        return str.charAt(k - 1) - '0';
    } */

    public static int findKthDigit(int n, int k) {
        int digits = (int) Math.log10(n) + 1;

        if (k > digits || k <= 0)
            return -1;

        for (int i = 1; i <= digits - k; i++) {
            n = n / 10;
        }

        return n % 10;
    }

}