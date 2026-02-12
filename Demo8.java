public class Demo8 {
    public static void main(String[] args) {
        String str = "b3c6d15";
        int k = 5;
        char c = findCharAtK(str, k);
        System.out.println(c);
    }

    public static char findCharAtK(String str, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len=str.length();
        while (i < len) {
            char current = str.charAt(i);
            if (Character.isLetter(current)) {
                i++;
                int count=0;
                while(i<len && Character.isDigit(str.charAt(i))){
                    count+=count*10+ str.charAt(i) -'0';
                    i++;
                }
                for(int j=0;j<count;j++)
                {
                    sb.append(current);
                }
            }
        }
        return sb.charAt(k);
    }
}
