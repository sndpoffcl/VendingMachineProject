package org.sandeep;

public interface VendingMachine {
    void selectAndCheckPrice(Item item);
    void insertCoins(Coin coin);
    Bucket collectItemsAndChange();
    void reset();
}


/*
    Item -> enum ( 3 products )
    Coins -> enum ( 5 coins )
    Inventory -> stores all coins and items
    Bucket ->
 */