import java.util.Arrays;

public class Demo27 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 11, 10, 20, 9, 16, 23 };
        System.out.println(Arrays.toString(sortByFactors(arr1)));
    }
    static class Element {
        int value;
        int factorsCount;
        int index;

        Element(int value, int factorsCount, int index) {
            this.value = value;
            this.factorsCount = factorsCount;
            this.index = index;
        }
    }

    public static int[] sortByFactors(int[] arr) {
        int n = arr.length;
        Element[] elements = new Element[n];

        for (int i = 0; i < n; i++) {
            elements[i] = new Element(arr[i], countFactors(arr[i]), i);
        }

        Arrays.sort(elements, (a, b) -> {
            if (b.factorsCount != a.factorsCount)
                return b.factorsCount - a.factorsCount; 
            return a.index - b.index;         
        });

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = elements[i].value;
        }
        return result;
    }
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n/i)
                    count += 1;
                else
                    count += 2;
            }
        }
        return count;
    }
}
