package org.sandeep;

import java.util.List;

public class Bucket {
    private Item item;
    private List<Coin> change;

    public Bucket(Item item, List<Coin> change) {
        this.item = item;
        this.change = change;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Coin> getChange() {
        return change;
    }

    public void setChange(List<Coin> change) {
        this.change = change;
    }
}
