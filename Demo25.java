import java.util.Arrays;

public class Demo25 {
     public static void main(String[] args) {
        int[] A = { 20, 7 };
        int[] B = { 11, 5 };

        System.out.println(Arrays.toString(leastPrimeToAdd(A, B)));
    }
    
    // 1 is considered prime as per problem statement
    static boolean isPrime(int n) {
        if (n == 1)
            return true;
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int[] leastPrimeToAdd(int[] A, int[] B) {
        int n = A.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int ans = -1;

            for (int p = 1; p < 1000; p++) {
                if (isPrime(p) && (A[i] + p) % B[i] == 0) {
                    ans = p;
                    break;
                }
            }

            result[i] = ans;
        }
        return result;
    }

}
