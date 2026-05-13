package org.example;

public class Basklass {
    private int id;
    private String title;
    private boolean isAvailable;


    public Basklass(int id, String title, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }

}
