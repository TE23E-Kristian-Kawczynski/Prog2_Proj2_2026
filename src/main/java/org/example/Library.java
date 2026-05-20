package org.example;
import java.util.ArrayList;
import com.google.gson.*;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.google.gson.Gson;

public class Library {

    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Magazine> magazines = new ArrayList<Magazine>();

    public void addBook(String books_json) {

        Gson gson = new Gson();
        Type typ = new TypeToken<ArrayList<Book>>(){}.getType();
        books = gson.fromJson(books_json,typ);

    }

    public void addMagazine(String magazines_json) {
        Gson gson = new Gson();
        Type typ2 = new TypeToken<ArrayList<Magazine>>(){}.getType();
        magazines = gson.fromJson(magazines_json,typ2);
    }

    public void addOwnBook(Book book) {
        books.add(book);
    }

    public void addOwnMagazine(Magazine magazine) {
        magazines.add(magazine);
    }

}
