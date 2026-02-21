public class Demo10 {
    public static void main(String[] args) {
        int N = 100;
        int Y = 17;

        int result = findMinFriends(N, Y);
        System.out.println(result);
    }

    
    public static int findMinFriends(int N, int Y) {
        for (int i = Y; i <= N; i++) {
            if (N % i == 0) {
                return sumOfDigits(i);
            }
        }
        return -1;
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
