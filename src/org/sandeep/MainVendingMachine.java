package org.sandeep;

public class MainVendingMachine {

    public static void main(String[] args) {
        VendingMachineImpl v1 = new VendingMachineImpl();
        v1.selectAndCheckPrice(Item.CHOCOLATE);
        v1.insertCoins(Coin.TEN);
        v1.insertCoins(Coin.TEN);
        v1.collectItemsAndChange();
    }
}
