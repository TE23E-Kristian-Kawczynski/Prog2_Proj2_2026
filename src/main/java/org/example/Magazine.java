package org.example;

public class Magazine extends Basklass{
    private int issueNumber;
    private String category;
    private int publishedYear;

    public Magazine(int id, String title, boolean isAvailable, int issueNumber, String category, int publishedYear){
        super(id, title, isAvailable);
        this.issueNumber = issueNumber;
        this.category = category;
        this.publishedYear = publishedYear;
    }
}
