import java.util.*;

public class Demo13 {

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2, 5, 5, 108, 3, 1 };
        replaceDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*public static void replaceDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean first = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    first = false;
                    break;
                }
            }

            if (!first) {
                int candidate = 1;
                while (contains(arr, candidate)) {
                    candidate++;
                }
                arr[i] = candidate;
            }
        }
    }

    public static boolean contains(int[] arr, int val) {
        for (int x : arr) {
            if (x == val)
                return true;
        }
        return false;
    }*/

    public static void replaceDuplicates(int[] arr) {
        Set<Integer> used = new HashSet<>();
        for (int x : arr) {
            used.add(x);
        }
        int nextMin = 1;
        for (int i = 0; i < arr.length; i++) {
            boolean first = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    first = false;
                    break;
                }
            }

            if (!first) {
                while (used.contains(nextMin)) {
                    nextMin++;
                }
                arr[i] = nextMin;
                used.add(nextMin);
                nextMin++;
            }
        }
    }
}
