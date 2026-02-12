public class Demo6 {
    public static void main(String[] args) {
        int n=6;
        int arr[]={11, 21, 32, 45, 1, 23};
        int num=6;
        int sum = findPrimeFactorIndexSum(arr, n,num);
        System.out.println(sum);
    }

    public static int findPrimeFactorIndexSum(int[] arr, int n, int num) {
        if(n==0){
            return -1;
        }

        int temp = num;
        int result = 0;
        boolean found = false;

        for (int i = 2; i * i <= temp; i++) {
            int count = 0;

            while (temp % i == 0) {
                count++;
                temp /= i;
            }

            if (count > 0 && i < n) {
                result += count * arr[i];
                found = true;
            }
        }

        if (temp > 1 && temp < n) {
            result += arr[temp];
            found = true;
        }

        return found ? result : 0;
    }
}
