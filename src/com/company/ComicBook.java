package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ComicBook extends Book {
    private String characterName;

    public ComicBook() {
        super();
        this.characterName = "";
    }

    public ComicBook(String title, Author author, BookType type, int available, double price, String characterName) {
        super(title, author, type, available, price);
        this.characterName = characterName;
    }
    @Override
    public double getPrice(){
        double newPrice= super.getOriginalPrice()*0.4;
        System.out.println("Книгата" + toString()+ " е намалена с 60% и е на цена " + newPrice);
        return newPrice;
    }
    @Override
    public double getPrice(double ots){
        double newPrice=super.getOriginalPrice()*(1-ots/100);
        return newPrice;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

}
