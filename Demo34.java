import java.util.Arrays;

public class Demo34 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10)); // Output: 4
        System.out.println(countPrimes(0));  // Output: 0
        System.out.println(countPrimes(1));  // Output: 0
        System.out.println(countPrimes(100)); // Output: 25
    }
    public static int countPrimes(int n) {
        if (n <= 2) return 0; // no prime less than 2

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }

    
}
