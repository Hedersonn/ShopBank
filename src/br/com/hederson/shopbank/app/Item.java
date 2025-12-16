package br.com.hederson.shopbank.app;


public class Item implements Comparable<Item> {
    private String name;
    private Double price;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "$" + this.getPrice() + " | " + this.getName();
    }

    @Override
    public int compareTo(Item otherItem) {
        return this.getPrice().compareTo(otherItem.getPrice());
    }
}
