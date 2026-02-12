import java.util.*;
public class Demo5 {
       public static void main(String[] args) {
        int N = 12246;
        List<Integer> result = findPrimeFactors(N);
        for (int factor : result) {
            System.out.print(factor + " ");
        }
    }
     public static List<Integer> findPrimeFactors(int N) {
        // Step 1: Sieve to find all primes up to N
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Collect primes into a list
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) primes.add(i);
        }

        // Step 3: Factorize N using the primes
        List<Integer> factors = new ArrayList<>();
        int num = N;
        for (int prime : primes) {
            if (prime * prime > num) break; // no need to check further
            if (num % prime == 0) {
                factors.add(prime);
                while (num % prime == 0) {
                    num /= prime;
                }
            }
        }

        // If remaining number > 1, it's also a prime factor
        if (num > 1) factors.add(num);

        return factors;
    }
}



