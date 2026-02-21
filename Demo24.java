public class Demo24 {
    public static void main(String[] args) {
        countCurrency(1500);
    }
    //! Greedy Approach
    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] noteCounter = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            while (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
     
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "+ noteCounter[i]);
            }
        }
    }
}
