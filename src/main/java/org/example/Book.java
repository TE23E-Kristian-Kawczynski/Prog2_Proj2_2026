package org.example;

public class Book extends Basklass{
    private String author;
    private String genre;
    private int pages;

    public Book(int id, String title, boolean isAvailable, String author, String genre, int pages){
        super(id, title, isAvailable);
        this.author = author;
        this.genre = genre;
        this.pages = pages;

    }
}