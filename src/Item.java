public class Item implements Comparable<Item> {
    private final String id;
    private String name;
    private String category;
    private int quantity;
    private final int threshold;

    public Item(String id, String name, String category, int quantity, int threshold) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public int getThreshold() { return threshold; }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.out.println("Invalid Quantity!");
            return;
        }
        this.quantity = quantity;
        if (quantity < threshold) {
            System.out.println("ALERT: Item " + name + " (ID: " + id +
                    ") is below threshold. Current quantity: " + quantity);
        }

    }

    @Override
    public int compareTo(Item other) {
        // Sort by quantity in descending order
        return Integer.compare(other.quantity, this.quantity);
    }

    @Override
    public String toString() {
        return "Item{id='" + id + "', name='" + name + "', category='" +
                category + "', quantity=" + quantity + "}";
    }
}