public class Demo51 {
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    /*public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            for (int j = 0; j < jewels.length(); j++) {
                if (stone == jewels.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }*/
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
