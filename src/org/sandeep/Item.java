package org.sandeep;

public enum Item {
    CHIPS("Potato Chips", 10),
    COLDDRINK("Cola ColdDrink",15),
    CHOCOLATE("Milk Chocolate",20);

    private String name;
    private int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
