package hcihw2;

/**
 *
 * @author batuhan
 */
public class Item {

    int number, cost;
    String name;

    public Item(int number, int cost, String name) {
        this.number = number;
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String toString() {
        return "stock number: " + number + "  cost: " + cost + "  name: " + name;
    }

}
