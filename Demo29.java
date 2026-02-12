import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Demo29 {
    public static void main(String[] args) {
        // int arr[]={5,5,4,6,4};
        //int arr[] = { 9, 9, 9, 2, 5 };
        int arr[]={1,2,3,4};
        sortByFrequency(arr);
        //! Problem rule: 
        // 1.Higher frequency first 
        // 2.If same frequency → smaller value first
    }

    /*public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> elements = new ArrayList<>(freq.keySet());

        elements.sort((a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(b) - freq.get(a);
            }
            return a - b;
        });

        for (int num : elements) {
            for (int i = 0; i < freq.get(num); i++) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }*/

   public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        TreeMap<Integer, Integer> tree = new TreeMap<>(
            (a, b) -> {
                if (!freq.get(a).equals(freq.get(b))) {
                    return freq.get(b) - freq.get(a); // higher frequency first
                }
                return a - b; // smaller value first
            }
        );

        tree.putAll(freq);

    
        for (Map.Entry<Integer, Integer> entry : tree.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();

            for (int i = 0; i < count; i++) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }
}
