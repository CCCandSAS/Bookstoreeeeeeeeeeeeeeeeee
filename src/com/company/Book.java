package com.company;

public class Book {
    private String title;
    private Author author;
    private BookType type;
    private int available;
    private double originalPrice;


    // constructors
    public Book() {
        this.title = "";
        this.author = new Author();
        this.type = BookType.BOOK;
        this.available = 0;
        this.originalPrice = 0;
    }

    public Book(String title, Author author, BookType type, int available, double originalPrice) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.available = available;
        this.originalPrice = originalPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", type=" + type +
                ", available=" + available +
                ", originalPrice=" + originalPrice +
                '}';
    }


    // getters and setters
    public double getPrice() {
        System.out.println("Книгата " + toString() + " се продава на първоначална цена: " + originalPrice);
        return originalPrice;
    }

    public double getPrice(double ots) {
        System.out.println("Книгата  " + toString() + " се продава на цена: " + originalPrice + " след отстъпката");
        return originalPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
}
