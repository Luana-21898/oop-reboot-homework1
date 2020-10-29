package com.company;

public class Bag {
    private String type;
    private String colour;
    private int price;

    public Bag(String _type, String _colour, int _price) {
        colour = _colour;
        type = _type;
        price = _price;
        System.out.println("Bag has been created.");
    }

    @Override
    public String toString() {
        return String.format("Bag details: " + type + " | Colour: " + colour + " | Price: " + price);
    }
}
