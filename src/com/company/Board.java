package com.company;

public class Board {
    private String type;
    private String colour;
    private int price;

    public Board(String _type, String _colour, int _price) {
        colour = _colour;
        type = _type;
        price = _price;
        System.out.println("Board has been created.");
    }

    @Override
    public String toString() {
        return String.format("Board details: " + type + " | Colour: " + colour + " | Price: " + price);
    }
}
