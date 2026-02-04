public class Demo18 {
    public static void main(String[] args) {
        String b1 = "11111";
        String b2 = "11101";
    }

    /*public static void printBinarySum(String b1, String b2) {
        int i = b1.length() - 1;
        int carry = 0;
        String result = "";

        while (i >= 0) {
            int sum = (b1.charAt(i) - '0')
                    + (b2.charAt(i) - '0')
                    + carry;

            result = (sum % 2) + result;
            carry = sum / 2;
            i--;
        }

        if (carry == 1)
            result = carry + result;

        System.out.println(result);
    }*/

    public static void printBinarySum(String b1,String b2){
        int i = b1.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0) {
            int sum = (b1.charAt(i) - '0')
                    + (b2.charAt(i) - '0')
                    + carry;

            sb.append(sum % 2);
            carry = sum / 2;
            i--;
        }

        if (carry == 1)
            sb.append(carry);

        System.out.println(sb.reverse().toString());
    }
}
