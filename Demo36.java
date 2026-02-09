import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Demo36 {
    public static void main(String[] args) {
        int mat[][] = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
        System.out.println(Arrays.deepToString(mat));
        System.out.println(Arrays.deepToString(diagonalSort(mat)));

    }
    public static  int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> d=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                d.putIfAbsent(i-j, new PriorityQueue<>());
                d.get(i-j).add(mat[i][j]);
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                mat[i][j]=d.get(i-j).poll();
            }
        } 
        return mat;
    }

    /*public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // row=0
        for (int col = 0; col < n; col++) {
            sort(mat, 0, col, m, n);
        }

        // col=0  (skip 0,0)
        for (int row = 1; row < m; row++) {
            sort(mat, row, 0, m, n);
        }
        return mat;
    }*/

    /*public static void sort(int mat[][], int row, int col, int m, int n) {
        List<Integer> values = new ArrayList<>();
        int r = row;
        int c = col;

        while (r < m && c < n) {
            values.add(mat[r][c]);
            r++;
            c++;
        }
        Collections.sort(values);
        r = row;
        c = col;
        int idx = 0;

        while (r < m && c < n) {
            mat[r][c] = values.get(idx++);
            r++;
            c++;
        }
    }*/

    // Counting sort
    /*public static void sort(int mat[][], int row, int col, int m, int n) {
        int[] count = new int[101]; // values 1..100

        int r = row, c = col;

        while (r < m && c < n) {
            count[mat[r][c]]++;
            r++;
            c++;
        }

        r = row;
        c = col;

        for (int val = 1; val <= 100; val++) {
            while (count[val] > 0) {
                mat[r][c] = val;
                r++;
                c++;
                count[val]--;
            }
        }
    }*/
}
