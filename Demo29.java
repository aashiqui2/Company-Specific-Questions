public class Demo29 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6, 8, 9, 10, 12 };
        int[] arr2 = { 2, 4, 6, 8, 10, 12 };
        System.out.println(findExtra(arr1, arr2));
    }

    /*public static int findExtra(int[] arr1, int[] arr2) {
        int n = arr2.length;

        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return i;
            }
        }
        return n;
    }*/

    public static int findExtra(int[] arr1, int[] arr2) {
        int low = 0, high = arr2.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr1[mid] == arr2[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

}
