import java.util.*;

public class Demo62 {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*public static  void duplicateZeros(int[] arr) {
        int n=arr.length;
        int temp[]= new int[n];
        int j=0;
        for(int i=0;i<n && j<n;i++){
            temp[j++]=arr[i];
            if(arr[i]==0 && j<n){
                temp[j++]=0;
            }
        }

        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
    }*/
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        for (int num : arr) {
            if (num == 0) zeros++;
        }

        int i = n - 1;
        int j = n + zeros - 1;

        // Step 2: move from back
        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }

            if (arr[i] == 0) {
                j--;
                if (j < n) {
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }
}
