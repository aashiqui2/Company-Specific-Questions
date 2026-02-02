public class Demo2 {
    public static void main(String[] args) {
        int N = 2;
        int arr[] = { 6, 2 };
        double time = findTotalTime(arr, N);
        System.out.printf("%.2f", time);
    }

    public static double findTotalTime(int[] arr, int n) {
        double workPerHour = 0.0;
        for (int i = 0; i < n; i++) {
            workPerHour += 1.0 / arr[i];
        }
        return 1.0/workPerHour;
    }
}
