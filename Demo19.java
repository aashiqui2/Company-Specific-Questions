import java.util.*;
import java.util.stream.Collectors;

public class Demo19 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 7, 10 };
        sortIt(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*public static void sortIt(int[] arr) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int num : arr) {
            if ((num & 1) == 1)
                odd.add(num);
            else
                even.add(num);
        }

        odd.sort(Collections.reverseOrder());
        even.sort(Integer::compareTo);

        int index = 0;
        for (int x : odd)
            arr[index++] = x;
        for (int x : even)
            arr[index++] = x;
    }*/

    /*public static void sortIt(int[] arr) {

        List<Integer> odds = Arrays.stream(arr)
                .filter(n -> (n & 1) == 1)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        List<Integer> evens = Arrays.stream(arr)
                .filter(n -> (n & 1) == 0)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        int idx = 0;
        for (int x : odds)
            arr[idx++] = x;
        for (int x : evens)
            arr[idx++] = x;
    }*/

    public static void sortIt(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, (a, b) -> {

            if ((a & 1) == 1 && (b & 1) == 1)
                return b - a; // descending

            if ((a & 1) == 0 && (b & 1) == 0)
                return a - b; // ascending

            // odd comes before even
            return (a & 1) == 1 ? -1 : 1;
        });

        for (int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
    }
}
