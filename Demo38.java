public class Demo38 {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isTwistedPrime(n)); 
    }
    public static int isTwistedPrime(int N) {
       if(isPrime(N) && isPrime(rev(N)) ){
           return 1;
       }
       return 0;
    }
    
    public static  boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static int rev(int n){
        int sum=0;
        for(int i=n;i>0;i=i/10){
            sum=sum*10+(i%10);
        }
        return sum;
    }
}
