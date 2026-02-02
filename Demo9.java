public class Demo9 {
    public static void main(String[] args) {
        int N = 100;
        int Y = 17;

        int result = findMinFriends(N, Y);
        System.out.println(result);
    }

    /*public static int findMinFriends(int N, int Y) {
        for (int i = Y; i <= N; i++) {
            if (N % i == 0) {
                return sumOfDigits(i);
            }
        }
        return -1;
    }*/

    public static int findMinFriends(int N, int Y) {
        int minFriends = Integer.MAX_VALUE;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                int d1 = i;
                int d2 = N / i;
                if (d1 >= Y) {
                    minFriends = Math.min(minFriends, d1);
                }
                if (d2 >= Y) {
                    minFriends = Math.min(minFriends, d2);
                }
            }
        }

        if (minFriends == Integer.MAX_VALUE)
            return -1;

        return sumOfDigits(minFriends);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
