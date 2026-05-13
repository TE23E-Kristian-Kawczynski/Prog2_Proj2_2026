package org.example;
import java.util.ArrayList;


public class Library {

    ArrayList<String> Books = new ArrayList<String>();
    ArrayList<String> Magazine = new ArrayList<String>();

    public void addBook(String book) {
        Books.add(book);
    }
}
