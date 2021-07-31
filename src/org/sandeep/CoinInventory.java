package org.sandeep;

import java.util.HashMap;

public class CoinInventory {
    private HashMap<Coin,Integer> coinInventory; // Coin, number of that coin present

    public CoinInventory() {
        this.coinInventory = new HashMap<>();
    }

    public void add(Coin coin){
        int currentCount = coinInventory.get(coin);
        coinInventory.put(coin, currentCount + 1);
    }

    //override or first time
    public void add(Coin coin, int quantity){
        coinInventory.put(coin, quantity);
    }

    public void reduceCoin(Coin coin){
        if(checkCoin(coin)) {
            int currentCount = coinInventory.get(coin);
            coinInventory.put(coin, currentCount - 1);
        }
    }

    public boolean checkCoin(Coin coin){
        int currentCount = coinInventory.get(coin);
        return currentCount > 0;
    }

    public void reset(){
        coinInventory.clear();
    }

}
