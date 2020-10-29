package com.company;

public class Pencil {
    private String type;
    private String colour;
    private int price;

    public Pencil(String _type, String _colour, int _price) {
        colour = _colour;
        type = _type;
        price = _price;
        System.out.println("Pencil has been created.");
    }

    @Override
    public String toString() {
        return String.format("Pencil details: " + type + " | Colour: " + colour + " | Price: " + price);
    }
}
