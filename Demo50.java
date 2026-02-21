import java.util.*;

public class Demo50 {
    public static void main(String[] args) {
        int a[] = { 4, 6, 3, 7 };
        System.out.println(countTriangles(a));
    }

    /*public static int countTriangles(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k] &&
                        arr[i] + arr[k] > arr[j] &&
                        arr[j] + arr[k] > arr[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }*/

    /*public static int countTriangles(int[] arr) {
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int low = j + 1, high = n - 1;
                int idx = j;

                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (arr[i] + arr[j] > arr[mid]) {
                        idx = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                count += idx - j;
            }
        }
        return count;
    }*/

    public static int countTriangles(int[] arr) {
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);

        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;

            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }

}
