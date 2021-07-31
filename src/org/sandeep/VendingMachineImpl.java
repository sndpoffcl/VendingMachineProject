package org.sandeep;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine{

    private CoinInventory coinInventory = new CoinInventory();
    private ItemInventory itemInventory = new ItemInventory();
    private Item choosenItem = null;
    private int currentAmount = 0 ;


    public VendingMachineImpl(){
        initialise();
    }


    @Override
    public void selectAndCheckPrice(Item item) {
        if(itemInventory.checkItem(item)){
            choosenItem = item;
            System.out.println("Price of the item : " + item.getPrice());
        }else{
            System.out.println("Item is not present currently");
        }
    }

    @Override
    public void insertCoins(Coin coin) {
        currentAmount = currentAmount + coin.getValue();
        coinInventory.add(coin);
    }

    @Override
    public Bucket collectItemsAndChange() {
        if(currentAmount >= choosenItem.getPrice()){
            int change = currentAmount - choosenItem.getPrice();
            if(checkChangeAvailable(change)){
                Item dispItem = getChoosenItem();
                List<Coin> dispChange = getChange(change);
                Bucket bucket = new Bucket(dispItem, dispChange);
                choosenItem = null;
                currentAmount = 0;
                System.out.println("Item has been dispened : " + choosenItem.getName());
                return bucket;
            }else{
                System.out.println("Sorry! Change not available");
            }
        }else{
            System.out.println("Invalid amount entered");
        }
        return null;
    }


    private Item getChoosenItem(){
        Item dispItem = itemInventory.reduceItem(choosenItem);
        if(dispItem != null){
            System.out.println("Item has been dispensed");
            return dispItem;
        }else{
            System.out.println("Sorry! Not able to dispensed ");
            return null;
        }
    }


    private List<Coin>  getChange(int change){
        if(change > 0){
            // TODO  : logic for getting change in coins
            return null;
        }else{
            return new ArrayList<>();
        }
    }

    /*
            change 4
            1,1,1,1
            2,2
            1,1,2

            minimum number of coins forming the amount
            reduce the coins from inventory before returning change
     */


    private boolean checkChangeAvailable(int change){
        if(change > 0) {
            // TODO : logic for checking change amount
            return true;
        }else {
            return true;
        }
    }

    /*
        12 -> 15 = 3Rs.
        inventory -> 5 rs coins
     */

    @Override
    public void reset() {
        itemInventory.reset();
        coinInventory.reset();
        choosenItem = null;
        currentAmount = 0;
    }

    private void initialise(){
        for(Item i : Item.values()){
            itemInventory.add(i,5);
        }

        for(Coin c : Coin.values()){
            coinInventory.add(c,5);
        }
    }
}