import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        int n = 12246;
        System.out.println(findPrimeFactors(n));
    }

    static final int MAX = 100000;
    static List<Integer> primes = new ArrayList<>();
    static boolean isSieveDone = false;

    static void sieve() {
        if (isSieveDone) {
            return; // avoid recomputation
        }

        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        isSieveDone = true;
    }

    static List<Integer> findPrimeFactors(int N) {
        sieve();
        List<Integer> factors = new ArrayList<>();
        for (int prime : primes) {
            if (prime * prime > N) {
                break;
            }
            while (N % prime == 0) {
                factors.add(prime);
                N /= prime;
            }

        }
        if (N > 1) {
            factors.add(N);
        }
        return factors;
    }
}
