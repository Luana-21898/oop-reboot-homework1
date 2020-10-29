package com.company;

public class RealWorldExamples {
    public static void run() {

        testPencil();
        testApple();
        testBook();
        testBag();
        testBoard();
    }

    public static void testPencil() {
        Pencil p = new Pencil("Charcoal", "Blue", 2);
        System.out.println(p.toString());
    }

    public static void testApple() {
        Apple a = new Apple("Granny Smith", "Green", 0.20);
        System.out.println(a.toString());
    }

    public static void testBook() {
        Book bk = new Book("Horror", "125", 70);
        System.out.println(bk.toString());
    }

    public static void testBag() {
        Bag bg = new Bag("HandBag","Black",100);
        System.out.println(bg.toString());
    }

    public static void testBoard() {
        Board bd = new Board("Freestanding","White", 50);
        System.out.println(bd.toString());
    }


}
