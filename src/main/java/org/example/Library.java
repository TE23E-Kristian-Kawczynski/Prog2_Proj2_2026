package org.example;
import java.util.ArrayList;


public class Library {

    ArrayList<String> Books = new ArrayList<String>();
    ArrayList<String> Magazines = new ArrayList<String>();

    public void addBook(String book) {
        Books.add(book);
    }

    public void addMagazine(String magazine) {
        Magazines.add(magazine);
    }
}
