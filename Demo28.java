import java.util.*;

public class Demo28 {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int res = 0;
        for (int[] box : boxTypes) {
            if (truckSize == 0)
                break;
            int boxesToTake = Math.min(truckSize, box[0]);
            res += boxesToTake * box[1];
            truckSize -= boxesToTake;
        }

        return res;
    }
    public static void main(String[] args) {
        int boxTypes[][]={{1,3},{2,2},{3,1}};
        int truckSize=4;
        System.out.println(maximumUnits(boxTypes, truckSize));

    }
}
