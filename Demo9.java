public class Demo9 {
    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, 10, -4, 7, 2, -5 };
        int result = findMaxSubArraySum(arr, arr.length);
        System.out.println(result);
    }

    /*public static int findMaxSubArraySum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }*/

    public static int findMaxSubArraySum(int[] arr, int n) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
