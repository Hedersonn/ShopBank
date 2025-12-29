package br.com.hederson.shopbank.app;

import java.util.ArrayList;
import java.util.Collections;

public class Account {
    private double limit;
    private double balance;
    private ArrayList<Item> items = new ArrayList<>();

    public Account(double limit) {
        this.limit = limit;
        this.balance = limit;
    }

    public int addItem(Item item) {
        if (this.balance >= item.getPrice()) {
            items.add(item);
            this.balance -= item.getPrice();
            return 1;
        } else {
            System.out.println("Insufficient funds.");
            return 2;
        }
    }

    public void sortedItems() {
        Collections.sort(items);
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
