public class Demo46 {
    public static void main(String[] args) {
        System.out.println(minimumMoves("XXX")); 
        System.out.println(minimumMoves("XXOX")); 
        System.out.println(minimumMoves("OXOX")); 
    }
    public static int minimumMoves(String s) {
        int moves = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3; // fix s[i], s[i+1], s[i+2]
            } else {
                i++;
            }
        }
        return moves;
    }

    
}
