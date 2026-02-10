public class Demo42 {
    public static void main(String[] args) {
        String s = "a0b1c2";
        System.out.println(reformat(s));
    }

    /*public static String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                letters.append(ch);
            }
        }
        // If difference > 1 → impossible
        if (Math.abs(letters.length() - digits.length()) > 1) {
            return "";
        }

        boolean letterTurn = letters.length() >= digits.length();

        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;

        while (i < letters.length() || j < digits.length()) {
            if (letterTurn && i < letters.length()) {
                ans.append(letters.charAt(i++));
            } else if (!letterTurn && j < digits.length()) {
                ans.append(digits.charAt(j++));
            }
            letterTurn = !letterTurn;
        }

        return ans.toString();
    }*/

    public static String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                letters.append(ch); 
            }
        }

        // If difference > 1 → impossible
        if (Math.abs(letters.length() - digits.length()) > 1) {
            return "";
        }

        StringBuilder res = new StringBuilder();

   
        if (digits.length() > letters.length()) {
            StringBuilder temp = letters;
            letters = digits;
            digits = temp;
        }

        for (int i = 0; i < letters.length(); i++) {
            res.append(letters.charAt(i));
            if (i < digits.length()) {
                res.append(digits.charAt(i));
            }
        }

        return res.toString();
    }
}
