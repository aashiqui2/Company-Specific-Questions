import java.util.*;

class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class Demo27 {
    public static double fractionalKnapsack(int capacity, Item[] items) {
        Arrays.sort(items,(a,b) ->{
                return Double.compare(
                    (double) b.value / b.weight,
                    (double) a.value / a.weight
                ); // descending
            }
        );


        double totalValue = 0.0;

        for (Item item : items) {

            if (capacity >= item.weight) {
                // Take full item
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // Take fractional part
                totalValue += ((double)item.value / item.weight) * capacity; //(V/W)*C
                break;
            }
        }

        return totalValue;
    }
    public static void main(String[] args) {

        // Item[] items = {
        //     new Item(60, 10),
        //     new Item(100, 20),
        //     new Item(120, 30)
        // };

        // int capacity = 50;
        Item[] items = {
            new Item(1, 4),
            new Item(5, 9),
            new Item(7, 6),
            new Item(2, 3),
            new Item(7, 7),
            new Item(10, 3)
        };

        int capacity = 24;


        double result = fractionalKnapsack(capacity, items);
        System.out.println("Maximum value = " + result);
    }
}

