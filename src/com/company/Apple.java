package com.company;

public class Apple {
    private String type;
    private String colour;
    private double price;

    public Apple(String _type, String _colour, double _price) {
        colour = _colour;
        type = _type;
        price = _price;
        System.out.println("Apple has been created.");
    }

    @Override
    public String toString() {
        return String.format("Apple details: " + type + " | Colour: " + colour + " | Price: " + price);
    }
}
