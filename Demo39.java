public class Demo39 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    public static int[] moveZeros(int n, int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != index) {
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
                index++;
            }
        }
        return arr;
    }

}
