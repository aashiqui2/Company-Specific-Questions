import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo7 {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = { 5, 3, 20, 10, 1, 4, 2 };
        int m = 60;
        // int n = 6;
        // int[] arr = {2, 2, 3, 3, 4, 6};
        // int m = 12;
        int count = countTripletsUnique(arr, n, m);
        System.out.println(count);
    }

    /*public static int countTripletsUnique(int[] arr, int n, int m) {
        Set<List<Integer>> unique = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] * arr[j] * arr[k] == m) {
                        List<Integer> temp = new ArrayList<>();
                        temp.addAll(Arrays.asList(arr[i], arr[j], arr[k]));
                        temp.sort();
                        unique.add(temp);

                    }
                }
            }
        }
        System.out.println(unique); // [[5, 3, 4], [3, 10, 2], [3, 20, 1]]
        return unique.size();
    }*/

    public static int countTripletsUnique(int[] arr, int n, int m) {
        if (n < 3) return 0;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<List<Integer>> unique = new TreeSet<>(
            (a, b) -> {
                if (!a.get(0).equals(b.get(0))) return a.get(0) - b.get(0);
                if (!a.get(1).equals(b.get(1))) return a.get(1) - b.get(1);
                return a.get(2) - b.get(2);
            }
        );

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int product = arr[i] * arr[j];
                if (product == 0)
                    continue;

                if (m % product == 0) {
                    int third = m / product;

                    if (freq.containsKey(third)) {

                        int needed = 1;
                        if (third == arr[i])
                            needed++;
                        if (third == arr[j])
                            needed++;

                        if (freq.get(third) >= needed) {
                            List<Integer> triplet = Arrays.asList(arr[i], arr[j], third);
                            Collections.sort(triplet);
                            unique.add(triplet);
                        }
                    }
                }
            }
        }
        // System.out.println(unique); //[(2,3,10), (1,3,20), (3,4,5)]
        return unique.size();
    }
}
