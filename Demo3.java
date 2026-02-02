import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String[] args) {
        String str = "Helloworld";
        char result = findFrequentVowel(str);
        System.out.println(result);
    }

    public static char findFrequentVowel(String str) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toLowerCase().toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int max = 0;
        char result = ' ';

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char ch = entry.getKey();
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    result = ch;
                }
            }
        }

        return result;
    }
}
