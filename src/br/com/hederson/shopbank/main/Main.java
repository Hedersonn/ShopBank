package br.com.hederson.shopbank.main;

import br.com.hederson.shopbank.app.Account;
import br.com.hederson.shopbank.app.Item;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(7060);
        Item phone = new Item("rog phone", (double) 700);
        myAccount.addItem(phone);
        Item item2 = new Item("ola", (double) 33);
        myAccount.addItem(item2);
        myAccount.sortedItems();
        System.out.println(myAccount.getItems());
    }
}