import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // Add items
        System.out.println("Adding items to inventory");
        Item item1 = new Item("1", "Laptop", "Electronics", 10, 5);
        Item item2 = new Item("2", "Phone", "Electronics", 20, 12);
        Item item3 = new Item("3", "Tablet", "Electronics", 15, 3);
        Item item4 = new Item("4", "Table", "Furniture", 15, 15);
        Item item5 = new Item("5", "Chair", "Furniture", 30, 20);
        Item item6 = new Item("6", "Sofa", "Furniture", 20, 10);;
        Item item7 = new Item("7", "Milk", "Grocery", 50, 30);
        Item item8 = new Item("8", "Apples", "Grocery", 50, 40);
        Item item9 = new Item("9", "Cookies", "Grocery", 80, 50);

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);
        inventory.addItem(item4);
        inventory.addItem(item5);
        inventory.addItem(item6);
        inventory.addItem(item7);
        inventory.addItem(item8);
        inventory.addItem(item9);

        List<Item>  allItems = inventory.getInventory();
        for(Item item: allItems){
            System.out.println(item.toString());
        }

        System.out.println(inventory.getSize()+" Items added to the inventory\n\n");

        // Retrieving Items by their ID
        System.out.println("Retrieving Items with Item ID 2,4 and 7");
        System.out.println(inventory.getItem("2").toString());
        System.out.println(inventory.getItem("4").toString());
        System.out.println(inventory.getItem("7").toString());
        System.out.println("\n");

        // Updating Quantity of items
        System.out.println("Updating quantity of Items 2,4 and 7");
        inventory.updateQuantity("2",8);
        System.out.println(inventory.getItem("2").toString()+"\n");

        inventory.updateQuantity("4",-50);
        System.out.println(inventory.getItem("4").toString()+"\n");

        inventory.updateQuantity("7",100);
        System.out.println(inventory.getItem("7").toString()+"\n");
        System.out.println();

        // Removing Items
        System.out.println("Removing Items 6, 13");
        System.out.println("Removing Item 6");
        inventory.removeItem("6");
        System.out.println();
        System.out.println("Removing Item 13 (which does not exist)");
        inventory.removeItem("13");
        System.out.println("\n");

        // Retrieve Items by Category
        System.out.println("Retrieving Electronics Items in Descending order of quantity");
        List<Item> categoryItems = inventory.getItemsByCategory("Electronics");
        for(Item item: categoryItems){
            System.out.println(item.toString());
        }
        System.out.println("\n");

        // Retrieving top 4 Items
        System.out.println("Retrieving top 4 Items");
        List<Item> top4Items = inventory.getTopKItems(4);
        for(Item item: top4Items){
            System.out.println(item.toString());
        }
        System.out.println("\n");

        // Merging Inventories
        Inventory secondaryInventory = new Inventory();

        // Add items
        System.out.println("Adding items to secondaryInventory");
        Item item10 = new Item("10", "SmartWatch", "Electronics", 7, 3);
        Item item11 = new Item("11", "Speakers", "Electronics", 20, 12);
        Item item12 = new Item("12", "Earphones", "Electronics", 15, 3);
        Item item13 = new Item("4", "Table", "Furniture", 50, 15);
        Item item14 = new Item("5", "Chair", "Furniture", 5, 20);
        Item item15 = new Item("13", "Sugar", "Grocery", 20, 10);;

        secondaryInventory.addItem(item10);
        secondaryInventory.addItem(item11);
        secondaryInventory.addItem(item12);
        secondaryInventory.addItem(item13);
        secondaryInventory.addItem(item14);
        secondaryInventory.addItem(item15);

        List<Item> secondaryItems = secondaryInventory.getInventory();
        for(Item item: secondaryItems){
            System.out.println(item.toString());
        }

        System.out.println(secondaryInventory.getSize()+" Items added to the inventory\n\n");

        System.out.println("Merging Inventories");
        inventory.mergeInventories(secondaryInventory);
        List<Item>  mergedItems = inventory.getInventory();
        for(Item item: mergedItems){
            System.out.println(item.toString());
        }






    }
}