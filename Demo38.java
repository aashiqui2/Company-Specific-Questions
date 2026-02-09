public class Demo38 {
    public static void main(String[] args){
        int n=121;
        //int n=-121;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0;
        int temp=x;
        while(temp!=0){
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp/=10;
        }
        return (rev==x)? true: false;
    }
}