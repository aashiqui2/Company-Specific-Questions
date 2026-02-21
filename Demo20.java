import java.util.*;

public class Demo20 {
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
        //even.sort(Integer::compareTo); same as below
        even.sort(null);

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

    /*public static void sortIt(int[] arr) {
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
    }*/
   
    public static void sortIt(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] % 2 != 0) {
                left++;
            } else if (arr[right] % 2 == 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

       
        // 0 to left-1 → odds
        // left to end → evens
        Arrays.sort(arr, 0, left);
        reverse(arr, 0, left - 1);

        Arrays.sort(arr, left, arr.length);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
