package com.company;
import java.util.Scanner;
public class publisher_runner {
    public static void main(String[] args) {
        Scanner xyz=new Scanner(System.in);
        book book1=new book();
        System.out.println("enter the name of the book :-");
        String a= xyz.nextLine();
        book1.setTitle(a);
        System.out.println("enter the price of the book :-");
        int b=xyz.nextInt();
        book1.setPrices(b);
        System.out.println("enter the page count of the  book :-");
        int c=xyz.nextInt();
        book1.setPage_count(c);
        book1.display();
        tap tap1=new tap();
        System.out.println("enter the name of the tap :-");
        String d=xyz.nextLine();
        tap1.setTitle(d);
        System.out.println("enter the price of the Tap :-");
        int e=xyz.nextInt();
        tap1.setPrices(e);
        System.out.println("enter the minutes tap was played :-");
        int f=xyz.nextInt();
        tap1.setMinutes_tap_played( f );
        tap1.display();
    }



}
