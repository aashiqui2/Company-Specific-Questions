import java.util.ArrayList;
import java.util.Arrays;

public class Demo44 {
    public static void main(String[] args) {
        // int arr[]={2, 2, 0, 4, 0, 8};
        int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
        System.out.println(Arrays.toString(modifyAndRearrangeArr(arr)));
    }
    public static int[] modifyAndRearrangeArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
                i++; // skip next element
            }
        }

        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(i!=idx){
                    arr[idx]=arr[i];
                    arr[i]=0;
                }
                idx++;
            }
        }
        return arr;
    }
}
