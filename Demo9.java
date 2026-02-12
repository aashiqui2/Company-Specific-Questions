public class Demo9 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 2 };
        int result = equilibriumIndex(arr, arr.length);
        System.out.println(result);
    }

    /*public static int equilibriumIndex(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            for (int l = 0; l < i; l++) {
                leftSum += arr[l];
            }
            int rightSum = 0;
            for (int r = i + 1; r < n; r++) {
                rightSum += arr[r];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }*/

    public static int equilibriumIndex(int[] arr, int n) {
        int totalSum = 0;
        for (int x : arr) {
            totalSum += x;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
           int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1; 
    }

}
