package br.com.hederson.shopbank.main;

import br.com.hederson.shopbank.app.Account;
import br.com.hederson.shopbank.app.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Credit Limit: ");
        double limit = scan.nextDouble();
        Account myAccount = new Account(limit);

        int chooseContinue = 1;
        while(chooseContinue != 0) {

            System.out.print("Product name: ");
            String productName = scan.next();
            System.out.print("Product price: ");
            double productPrice = scan.nextDouble();
            Item item = new Item(productName, productPrice);
            myAccount.addItem(item);

            System.out.println("Continue?\n0 to Stop\n1 to Continue");
            chooseContinue = scan.nextInt();
        }

        myAccount.sortedItems();
        for(Item item : myAccount.getItems()) {
            System.out.println(item);
        }
    }
}