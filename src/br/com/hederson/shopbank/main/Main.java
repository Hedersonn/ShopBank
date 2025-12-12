package br.com.hederson.shopbank.main;

import br.com.hederson.shopbank.app.Account;
import br.com.hederson.shopbank.app.Item;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(700);
        Item phone = new Item("rog phone", 700);
        myAccount.addItem(phone);
        Item item2 = new Item("ola", 33);
        myAccount.addItem(item2);
    }
}