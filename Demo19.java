public class Demo19 {
    public static void main(String[] args) {
        // String b1 = "11111";
        // String b2 = "11101";
        String b1 = "01001001";
        String b2 = "0110101";
        System.out.println(addBinary(b1, b2)); // 1111110
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        sb.reverse();
        int index = 0;
        // give me atleast one leading zero "0000"->"0".so, sb.length() - 1 
        while (index < sb.length() - 1 && sb.charAt(index) == '0') {
            index++;

        }
        return sb.substring(index);
        // return sb.reverse().toString();
    }

}
