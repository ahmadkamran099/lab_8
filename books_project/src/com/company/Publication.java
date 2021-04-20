package com.company;

public class Publication {
    protected String title;
    protected int prices;
    Publication(){
        System.out.println();
    }
    Publication(String title,int prices){
        this.title=title;
        this.prices=prices;
        
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display(){
        System.out.println("the title of the book/tap is :"+getTitle());
        System.out.println("the price of the book/tap is :"+getPrices()+"RS");
    }
}
class book extends Publication{
   protected int page_count;
    book(){
        System.out.println();
    }
    book(int page_count){
        this.page_count=page_count;
    }

    public int getPage_count( ) {
        return page_count;
    }

    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }
    public void display(){
        super.display();
        System.out.println("the page count is  :"+getPage_count()+" pages");

    }
    
}
class tap extends Publication{
    protected int minutes_tap_played;
    tap(){
        System.out.println();
    }
    tap(int minutes_tap_played){
        this.minutes_tap_played=minutes_tap_played;
    }

    public int getMinutes_tap_played() {
        return minutes_tap_played;
    }

    public void setMinutes_tap_played(int minutes_tap_played) {
        this.minutes_tap_played = minutes_tap_played;
    }
    public void display(){
        super.display();
        System.out.println("the minutes  tap is played are  :"+getMinutes_tap_played()+" Minutes");

    }
}
