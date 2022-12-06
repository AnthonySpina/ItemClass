import java.util.ArrayList;

//Item Class
public class Item {
    private String name;
    private double salesPrice;
    private int quant;
    private double cost;
    private int reorderPoint;
    private double totalPrice;

    // Constructor
    public Item(String n, double sP, int q, double c, int rP) {
        salesPrice = sP;
        name = n;
        quant = q;
        cost = c;
        reorderPoint = rP;
        updateTotalPrice();
    }

    // Update TotalPrice
    public void updateTotalPrice() {
        if (quant < reorderPoint) {
            // printing for visibility (not viable)
            System.out.println("Restocked "+ name + "'s quant to 1+ max");
            quant = reorderPoint + 1;
        }
        totalPrice = salesPrice * (double) quant;
    }

    // Setters
    public void setSalesPrice(double sp) {
        salesPrice = sp;
        updateTotalPrice();
    }

    public void setQuant(int q) {
        quant = q;
        updateTotalPrice();
    }

    // Getters
    public double getSalesPrice() {
        return salesPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getQuant() {
        return quant;
    }

    public int getreorderPoint() {
        return reorderPoint;
    }

    public void printItemInfo() {
        System.out.println("Sales price: " + salesPrice);
        System.out.println("Cost: " + cost);
        System.out.println("Reorder Point: " + reorderPoint);
    }

    public String toString() {
        return name + " has a total price of: " + totalPrice;
    }

    // Store Class
    public static void main(String[] args) throws Exception {
        ArrayList<Item> store = new ArrayList<Item>();
        Item bread = new Item("Bread", 2.00, 5, 1.00, 3);
        Item cereal = new Item("Cereal", 5.00, 15, 3.00, 10);
        Item coffee = new Item("Coffee", 2.00, 4, 1.00, 5);
        store.add(bread);
        store.add(cereal);
        store.add(coffee);
        for (Item a : store) {
            System.out.println(a.toString());
            a.printItemInfo();
            System.out.println();
        }

    }
}
