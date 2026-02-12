import java.util.HashSet;
import java.util.Set;

public class Demo15 {
    public static void main(String[] args) {
        //int[] nums = { 1, 2, 3, 4, 2, 3, 3, 5, 7 };
        int[] nums={4,5,6,4,4};
        System.out.println(minimumOperations(nums));
    }

    /*public static int minimumOperations(int[] nums) {
        int n = nums.length;
        int hash[]= new int[101];
        for(int num:nums){
            hash[num]++;
        }
        int ans=0;
        int idx=0;
        while(!unique(hash)){
            int count=3;
            while(idx<n && count-- >0){
                hash[nums[idx]]--;
                idx++;
            }
            ans++;
        }
        return ans;
    }

    public static boolean unique(int[] hash) {
        for(int i=0;i<hash.length;i++){
            if(hash[i]>1){
                return false;
            }
        }
        return true;
    }*/


    public static int minimumOperations(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (!seen.add(nums[i])) {
                // ceil((i + 1) / 3) [ceil method-work only on decimal point]
                // ceil(a / b) = (a + b - 1) / b [Formulae]
                // a = i + 1, b = 3
                // = ((i + 1) + 3 - 1) / 3
                // = (i + 3) / 3
                return (i + 3) / 3;
            }
        }
        return 0; 
    }

}
