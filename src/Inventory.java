import java.util.*;

public class Inventory {
    private Map<String, TreeSet<Item>> categoryItems;
    private Map<String, Item> inventoryItems;

    public Inventory(){
        categoryItems = new HashMap<>();
        inventoryItems = new HashMap<>();
    }

    public void addItem(Item item){
        inventoryItems.put(item.getId(), item);
        TreeSet<Item> categorySet;
        if (!categoryItems.containsKey(item.getCategory())) {
            categorySet = new TreeSet<>();
            categoryItems.put(item.getCategory(), categorySet);
        }
        else {
            categorySet = categoryItems.get(item.getCategory());
        }
        categorySet.add(item);
    }

    public void removeItem(String itemId){
        Item item = inventoryItems.get(itemId);
        if(item!=null){
            inventoryItems.remove(itemId);
            categoryItems.get(item.getCategory()).remove(item);
        }
        else{
            System.out.println("Item not found");
        }
    }

    public void updateQuantity(String itemId, int quantity){
        Item item = inventoryItems.get(itemId);
        if(item!=null){
            categoryItems.get(item.getCategory()).remove(item);
            item.setQuantity(quantity);
            categoryItems.get(item.getCategory()).add(item);
            inventoryItems.put(itemId, item);
            System.out.println("Quantity Updated for Item " + item.getName() + " (ID: " + itemId + ")");
        }
    }

    public Item getItem(String itemId){
        return inventoryItems.get(itemId);
    }

    public List<Item> getInventory(){
        return new ArrayList<>(inventoryItems.values());
    }

    public List<Item> getItemsByCategory(String category){
        if(categoryItems.containsKey(category)){
            return new ArrayList<>(categoryItems.get(category));
        }
        return new ArrayList<>();
    }

    public List<Item> getTopKItems(int k) {
        PriorityQueue<Item> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.getQuantity(), b.getQuantity()));
        for (Item item : inventoryItems.values()) {
            pq.offer(item);
            if (pq.size() > k) pq.poll();
        }
        List<Item> topK = new ArrayList<>(pq);
        topK.sort((a, b) -> Integer.compare(b.getQuantity(), a.getQuantity()));
        return topK;
    }

    public void mergeInventories(Inventory secondaryInventory){
        secondaryInventory.getInventory().forEach(secondaryItem -> {
            Item existingItem = this.inventoryItems.get(secondaryItem.getId());
            if (existingItem == null || secondaryItem.getQuantity() > existingItem.getQuantity()) {
                if (existingItem != null) {
                    removeItem(existingItem.getId());
                }
                addItem(secondaryItem);
            }
        });
    }

    public int getSize(){
        return inventoryItems.size();
    }


}
