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

    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public int getPages(){
        return pages;
    }

    @Override
    public String toString(){
        return "Book{" +
            "id=" + getId()+
                "\n title=" + getTitle() +
                "\n author=" + getAuthor() +
                "\n genre=" + getGenre() +
                "\n pages=" + getPages() +
                "\n isAvailable=" + getIsAvailable() +
                "\n }" + "\n";
        }
    }
