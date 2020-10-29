package com.company;

public class Book {
    private String genre;
    private String pages;
    private int price;

    public Book(String _genre, String _pages, int _price) {
        genre = _genre;
        pages = _pages;
        price = _price;
        System.out.println("Book has been created.");
    }

    @Override
    public String toString() {
        return String.format("Book details: " + genre + " | Colour: " + pages + " | Price: " + price);
    }
}
