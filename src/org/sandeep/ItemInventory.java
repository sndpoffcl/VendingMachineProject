package org.sandeep;

import java.util.HashMap;

public class ItemInventory {
    private HashMap<Item,Integer> itemInventory; // Items, number of that item present

    public ItemInventory() {
        this.itemInventory = new HashMap<>();
    }

    public void add(Item item){
        int currentCount = itemInventory.get(item);
        itemInventory.put(item, currentCount + 1);
    }

    public void add(Item item, int quantity){
        itemInventory.put(item, quantity);
    }

    public Item reduceItem(Item item){
        if(checkItem(item)) {
            int currentCount = itemInventory.get(item);
            itemInventory.put(item, currentCount - 1);
            return item;
        }else{
            return null;
        }
    }

    public boolean checkItem(Item item){
        int currentCount = itemInventory.get(item);
        return currentCount > 0;
    }

    public void reset(){
        itemInventory.clear();
    }
}
