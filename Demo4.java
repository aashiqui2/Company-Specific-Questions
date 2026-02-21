import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        int n=100;
        List<Integer> list=uniquePrimeFacor(n);
        System.out.println(list);
    }
    public static ArrayList<Integer> uniquePrimeFacor(int n) {
       Set<Integer> s= new HashSet<>();
        while(n%2==0){
            n=n/2;
            s.add(2);
        }
        for(int i=3;i*i<=n;i=i+2){
            while(n%i==0){
                s.add(i);
                n=n/i;
            }
        }
        if(n>2){
            s.add(n);
        }
        return new ArrayList<>(s);  
    }
}
