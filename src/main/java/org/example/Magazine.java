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

    public int getIssueNumber(){
        return issueNumber;
    }
    public String getCategory(){
        return category;
    }
    public int getPublishedYear(){
        return publishedYear;
    }

    @Override
    public String toString(){
        return "Magazine{" +
                "id=" + getId()+
                "\n title=" + getTitle() +
                "\n Issuenumber=" + getIssueNumber() +
                "\n Category=" + getCategory() +
                "\n Published year=" + getPublishedYear() +
                "\n isAvailable=" + getIsAvailable() +
                "\n }" + "\n";
    }
}
